package org.xtext.base.dependency;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class SmartDGConsole {

	String name;
	private MessageConsole console = null;
	private MessageConsoleStream out = null;

	public boolean PRINT_ON_SYSTEM_CONSOLE = true;
	public boolean PRINT_ON_SMARTDG_CONSOLE = true;

	private MessageConsole init() {
		ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = consolePlugin.getConsoleManager();
		IConsole[] all_consoles = consoleManager.getConsoles();
		for (int i = 0; i < all_consoles.length; i++) {
			if (name.equals(all_consoles[i].getName())) {
				return (MessageConsole) all_consoles[i];
			}
		}
		MessageConsole myConsole = new MessageConsole(name, null);
		consoleManager.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public SmartDGConsole(String in_name) {
		name = in_name;
		console = init();
		out = console.newMessageStream();
	}

	public void println(String text) {
		if (PRINT_ON_SYSTEM_CONSOLE)
			System.out.println(text);
		if (PRINT_ON_SMARTDG_CONSOLE)
			out.println(text);
	}

	public void print(String text) {
		if (PRINT_ON_SYSTEM_CONSOLE)
			System.out.print(text);
		if (PRINT_ON_SMARTDG_CONSOLE)
			out.print(text);
	}
}
