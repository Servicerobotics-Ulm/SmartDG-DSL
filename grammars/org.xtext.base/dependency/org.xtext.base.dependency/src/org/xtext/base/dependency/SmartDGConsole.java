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
