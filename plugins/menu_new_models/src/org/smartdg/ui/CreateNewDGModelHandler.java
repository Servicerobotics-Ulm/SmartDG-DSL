//================================================================
//
//  Copyright (c) 2020 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
//
//        Servicerobotik Ulm 
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//	  http://www.servicerobotik-ulm.de/
//
//  This file is part of the SmartDG Dependency Graph extension for SmartMDSD Toolchain.
//
//  Contributors:
//	Vineet Nagrath	   :	Vineet.Nagrath@thu.de
//	Alex Lotz	   	   :	Alex.Lotz@thu.de
//	Christian Schlegel :	Christian.Schlegel@thu.de
//
//  Licence:
//
//  BSD 3-Clause License
//  
//  Copyright (c) 2019, Servicerobotics Ulm
//  All rights reserved.
//  
//  Redistribution and use in source and binary forms, with or without
//  modification, are permitted provided that the following conditions are met:
//  
//  * Redistributions of source code must retain the above copyright notice, this
//    list of conditions and the following disclaimer.
//  
//  * Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//  
//  * Neither the name of the copyright holder nor the names of its
//    contributors may be used to endorse or promote products derived from
//    this software without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
//  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
//  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
//  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//  https://opensource.org/licenses/BSD-3-Clause
//
//================================================================

package org.smartdg.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
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
			String modelfoldername = "model/";
			IFolder folder = project.getFolder(modelfoldername);
			if (!folder.exists()) {
				try {
					folder.create(true, true, null);
					SmartDGout.println("SmartDG | Create New DGModel Handler | " + "model folder was created.");
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}

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
