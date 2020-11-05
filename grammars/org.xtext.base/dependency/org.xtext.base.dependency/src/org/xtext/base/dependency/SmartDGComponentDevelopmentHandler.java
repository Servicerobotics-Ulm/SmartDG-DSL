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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

public class SmartDGComponentDevelopmentHandler {
	SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
	public String ComponentDevelopmentFileLocation;
	public String ComponentDevelopmentFileName;
	public static final String extension = "dgcom";
	public String Target;
	public File TargetFile;
	SmartDGdslGen Gene;

	public SmartDGComponentDevelopment DGComponentDevelopment;

	public boolean importflag;
	public boolean buildflag;
	public boolean launchflag;
	public boolean detachflag;
	public String CurrentBoxLocation;

	public SmartDGComponentDevelopmentHandler() {
		DGComponentDevelopment = new SmartDGComponentDevelopment();
		Gene = new SmartDGdslGen();
		ResetFlags();
	}

	public void ResetFlags() {
		ResetFlags(false);
	}

	public void ResetFlags(boolean b) {
		importflag = b;
		buildflag = b;
		launchflag = b;
		detachflag = b;
		CurrentBoxLocation = "";
	}

	public void Init(String filename) {
		Init(".", filename);
	}

	public void Init(String filelocation, String filename) {
		CurrentBoxLocation = filelocation;
		ComponentDevelopmentFileLocation = filelocation + "/SmartDGbox/SmartDG_ComponentDevelopment/" + filename;
		File directory = new File(ComponentDevelopmentFileLocation);
		if (!directory.exists()) {
			directory.mkdirs();
			SmartDGout.print(" [New Directory created: " + directory + "]");
		}
		File directorysrcgen = new File(ComponentDevelopmentFileLocation + "/src-gen");
		if (!directorysrcgen.exists()) {
			directorysrcgen.mkdirs();
			SmartDGout.println(" [New Directory created: " + directorysrcgen + "]");
		}
		ComponentDevelopmentFileName = filename;
		Target = ComponentDevelopmentFileLocation + "/" + ComponentDevelopmentFileName + "." + extension;
		TargetFile = new File(Target);
	}

	public void Display() {
		SmartDGout.println("DGComponentDevelopment: " + DGComponentDevelopment.Name);
		SmartDGout.println("Environment           : " + DGComponentDevelopment.Environment);
		SmartDGout.println("EnvironmentBoxLocation: " + DGComponentDevelopment.EnvironmentBoxLocation);
		SmartDGout.println("FunctionsBoxLocation  : " + DGComponentDevelopment.FunctionsBoxLocation);
		SmartDGout.println("Wiki: " + DGComponentDevelopment.Wiki);
		SmartDGout.println("DGComponentDevelopment.DGComponent: " + DGComponentDevelopment.DGComponent.Name);
		SmartDGout.print("                InputPorts:");
		for (int j = 0; j < DGComponentDevelopment.DGComponent.InputPorts.size(); j++)
			SmartDGout.print("\t" + DGComponentDevelopment.DGComponent.InputPorts.get(j).Name);
		SmartDGout.println(" ");
		SmartDGout.print("                OutputPorts:");
		for (int j = 0; j < DGComponentDevelopment.DGComponent.OutputPorts.size(); j++)
			SmartDGout.print("\t" + DGComponentDevelopment.DGComponent.OutputPorts.get(j).Name);
		SmartDGout.println(" ");
		SmartDGout.println("                     Wiki:" + DGComponentDevelopment.DGComponent.Wiki);
		for (int i = 0; i < DGComponentDevelopment.BoxLocations.size(); i++)
			SmartDGout.println(
					"DGComponentDevelopment.BoxLocations: \"" + DGComponentDevelopment.BoxLocations.get(i) + "\"");
	}

	public void Fill(SmartDGComponentDevelopment e) {
		DGComponentDevelopment = e;
	}

	public void Fill(SmartDGComponent c) {
		DGComponentDevelopment.DGComponent = c;
	}

	public void Fill(String f) {
		DGComponentDevelopment.BoxLocations.add(f);
	}

	public boolean Check(SmartDGComponent c) {
		if (c.Name.equals(DGComponentDevelopment.DGComponent.Name)) {
			for (int j = 0; j < c.InputPorts.size(); j++) {
				boolean found = false;
				for (int k = 0; k < DGComponentDevelopment.DGComponent.InputPorts.size(); k++) {
					if (DGComponentDevelopment.DGComponent.InputPorts.get(k).Name.equals(c.InputPorts.get(j).Name)) {
						found = true;
						continue;
					}
				}
				if (!found)
					return false;
			}
			for (int j = 0; j < c.OutputPorts.size(); j++) {
				boolean found = false;
				for (int k = 0; k < DGComponentDevelopment.DGComponent.OutputPorts.size(); k++) {
					if (DGComponentDevelopment.DGComponent.OutputPorts.get(k).Name.equals(c.OutputPorts.get(j).Name)) {
						found = true;
						continue;
					}
				}
				if (!found)
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean Read(String filename) {
		return Read(".", filename);
	}

	public boolean Read(String filelocation, String filename) {
		Init(filelocation, filename);
		return Read();
	}

	public boolean Read() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGComponentDevelopment.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DGComponentDevelopment = (SmartDGComponentDevelopment) jaxbUnmarshaller.unmarshal(TargetFile);
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGComponentDevelopment Read:" + Target);
			return false;
		}
		return true;
	}

	public boolean Save(String filename) {
		return Save(".", filename);
	}

	public boolean Save(String filelocation, String filename) {
		Init(filelocation, filename);
		return Save();
	}

	public boolean Save(String filename, SmartDGComponentDevelopment e) {
		return Save(".", filename, e);
	}

	public boolean Save(String filelocation, String filename, SmartDGComponentDevelopment e) {
		Fill(e);
		Init(filelocation, filename);
		return Save();
	}

	public boolean Save() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGComponentDevelopment.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(DGComponentDevelopment, TargetFile);
			try {
				PrintWriter srcout;
				srcout = new PrintWriter(ComponentDevelopmentFileLocation + "/src-gen/SmartDGComponentDevelopment_"
						+ ComponentDevelopmentFileName + ".cpp");
				srcout.println(Gene.gen(DGComponentDevelopment));
				srcout.close();
				PrintWriter cmakeoutgen;
				cmakeoutgen = new PrintWriter(ComponentDevelopmentFileLocation + "/CMakeLists.txt");
				cmakeoutgen.println(Gene.genCMAKE(ComponentDevelopmentFileName));
				cmakeoutgen.close();
				PrintWriter builditoutgen;
				builditoutgen = new PrintWriter(ComponentDevelopmentFileLocation + "/buildit.sh");
				builditoutgen.println(Gene.genBuildit("ComponentDevelopment", ComponentDevelopmentFileName,
						ComponentDevelopmentFileLocation));
				builditoutgen.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGComponentDevelopment Save:" + Target);
			e.printStackTrace();
			return false;
		}
		if (importflag) {
			if (Import()) {
				SmartDGout.println("IMPORT OK");
			} else {
				SmartDGout.println("ERROR @ IMPORT");
				return false;
			}
		} else
			SmartDGout.println("IMPORT SKIPPED");
		if (buildflag) {
			if (Build()) {
				SmartDGout.println("BUILD OK");
			} else {
				SmartDGout.println("ERROR @ BUILD");
				return false;
			}
		} else
			SmartDGout.println("BUILD SKIPPED");
		if (launchflag) {
			if (Launch(!detachflag)) {
				SmartDGout.println("LAUNCH OK");
			} else {
				SmartDGout.println("ERROR @ LAUNCH");
				return false;
			}
		} else
			SmartDGout.println("LAUNCH SKIPPED");
		return true;
	}

	public boolean Import() {
		String envbox = DGComponentDevelopment.EnvironmentBoxLocation;
		String envnam = DGComponentDevelopment.Environment;
		SmartDGEnvironmentHandler tmpEH = new SmartDGEnvironmentHandler();
		String envpath = tmpEH.gengetEnvironmentFileLocation(envbox, envnam);
		String propath = ComponentDevelopmentFileLocation;
		SmartDGout.println("IMPORTING: FROM Environment:\"" + envnam + "\" AT \"" + envbox + "\" TO \""
				+ CurrentBoxLocation + "\"");
		SmartDGout.println("IMPORTING: ORIGIN:\"" + envpath + "\"");

		File sourcegen = new File(envpath + "/src-gen");
		File source = new File(envpath + "/src");
		File destgen = new File(propath + "/src-gen");
		try {
			FileUtils.copyDirectory(sourcegen, destgen);
			FileUtils.copyDirectory(source, destgen); // Overwrites
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean Build() {
		String builditscriptpath = ComponentDevelopmentFileLocation + "/buildit.sh";
		SmartDGout.println("BUILDING: " + builditscriptpath);
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		if (isWindows) {
			SmartDGout.println("Automated Build not supported for Windows !!");
		} else {
			try {
				String command = "cd " + ComponentDevelopmentFileLocation + "; bash buildit.sh";
				SmartDGout.println("COMMAND: " + command);
				String[] cmd = { "/bin/sh", "-c", command };
				SmartDGout.print("BUILDING: ");
				Process process = Runtime.getRuntime().exec(cmd);
				while (process.isAlive()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
						return false;
					}
					SmartDGout.print("|");
				}
				SmartDGout.println(" Done !");
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	public boolean Launch() {
		return Launch(true);
	}

	public boolean Launch(boolean hold) {
		String launchpath = CurrentBoxLocation + "/SmartDGbox/SmartDG_Assortment/ComponentDevelopment/"
				+ ComponentDevelopmentFileName;
		SmartDGout.println("LAUNCHING: " + launchpath);
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		if (isWindows) {
			SmartDGout.println("Automated Launch not supported for Windows !!");
		} else {
			try {
				String command = launchpath;
				SmartDGout.println("COMMAND: " + command);
				String[] cmd = { "/bin/sh", "-c", command };
				SmartDGout.print("LAUNCHED: ");
				Process process = Runtime.getRuntime().exec(cmd);
				while (process.isAlive() && hold) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
						return false;
					}
					SmartDGout.print("|");
				}
				SmartDGout.println(" Done !");
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
