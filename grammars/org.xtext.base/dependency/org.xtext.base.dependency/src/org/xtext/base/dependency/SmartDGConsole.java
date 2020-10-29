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
	
	// https://wiki.eclipse.org/FAQ_How_do_I_write_to_the_console_from_a_plug-in%3F  START
	private MessageConsole findConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
	// https://wiki.eclipse.org/FAQ_How_do_I_write_to_the_console_from_a_plug-in%3F  END
	
	public SmartDGConsole(String in_name)	{
		name = in_name;
		console = findConsole();
		out = console.newMessageStream();
	}
	
	public void println(String text)	{
		out.println(text);
	}
	
	public void print(String text)	{
		out.print(text);
	}	
}
