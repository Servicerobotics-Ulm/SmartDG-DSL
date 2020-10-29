package org.smartdg.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xtext.base.dependency.SmartDGConsole;
import org.xtext.base.dependency.SmartDGdefaultModels;

public class CreateNewDGModelHandler extends AbstractHandler {
	public IResource getSelectedResource(IWorkbenchWindow window) {
		ISelection selection = window.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IResource) {
				return (IResource) firstElement;
			} else if (firstElement instanceof IProjectNature) {
				IProjectNature projNature = (IProjectNature) firstElement;
				return projNature.getProject();
			}
		}
		return null;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
		SmartDGout.println("SmartDG | Create New DGModel Handler | IN");

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = getSelectedResource(window);
		IProject project = resource.getProject();

		boolean yescreate = MessageDialog.openConfirm(window.getShell(), "SmartDG",
				"Do you want to create SmartDG model files with default contents for project \n" + project.getName());

		if (yescreate) {
			List<String> ModelTypes = new ArrayList<>();
			List<String> ModelTypesWiki = new ArrayList<>();
			List<String> ModelTypesDefaultContents = new ArrayList<>();

			ModelTypes.add("DE"); // SmartDG Environment Model
			ModelTypesWiki.add("SmartDG Environment Model");
			ModelTypesDefaultContents.add("");

			String componentmodelfilename = "model/" + project.getName() + ".component";
			IFile componentmodelfile = project.getFile(componentmodelfilename);
			if (componentmodelfile.exists()) {
				ModelTypes.add("DO"); // SmartDG Component Model
				ModelTypesWiki.add("SmartDG Component Model");
				ModelTypesDefaultContents.add(SmartDGdefaultModels.doDefault());
			}

			String systemmodelfilename = "model/" + project.getName() + ".componentArch";
			IFile systemmodelfile = project.getFile(systemmodelfilename);
			if (systemmodelfile.exists()) {
				ModelTypes.add("DG"); // SmartDG System Model
				ModelTypesWiki.add("SmartDG System Model");
				ModelTypesDefaultContents.add(SmartDGdefaultModels.dgDefault());
			}
			for (int i = 0; i < ModelTypes.size(); i++) {
				System.out.println(ModelTypes.get(i));
			}
			for (int i = 0; i < ModelTypes.size(); i++) {
				String ModelType = ModelTypes.get(i);
				String ModelTypeWiki = ModelTypesWiki.get(i);
				String ModelTypeDefaultContents = ModelTypesDefaultContents.get(i);

				boolean yesoverwrite = false;
				String modelfilename = "model/" + project.getName() + "." + ModelType.toLowerCase();
				IFile file = project.getFile(modelfilename);
				if (file.exists()) {
					yesoverwrite = MessageDialog.openConfirm(window.getShell(), "SmartDG", "Overwrite existing "
							+ ModelTypeWiki + " " + modelfilename + " in " + project.getName() + " ?");
				}
				if (!file.exists() || yesoverwrite) {
					try {
						if (file.exists())
							file.delete(true, null);
						file.create(new ByteArrayInputStream((ModelTypeDefaultContents).getBytes()), true, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
					SmartDGout.println("SmartDG | Create New DGModel Handler | " + ModelTypeWiki + " " + modelfilename
							+ " was created.");
				}
			}
		}
		SmartDGout.println("SmartDG | Create New DGModel Handler | OUT");
		return null;
	}
}
