package org.smartdg.dsl.view.parts;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class MainConsole implements IConsoleFactory {
	@Override
	public void openConsole() {
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		MessageConsole console = new MessageConsole("SmartDG", null);
		consoleManager.addConsoles(new IConsole[] { console });
		consoleManager.showConsoleView(console);
	}
}
