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

public class SmartDGSystemProjectHandler {
	SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
	public String SystemProjectFileLocation;
	public String SystemProjectFileName;
	public static final String extension = "dgsys";
	public String Target;
	public File TargetFile;
	SmartDGdslGen Gene;

	public SmartDGSystemProject DGSystemProject;

	public boolean importflag;
	public boolean buildflag;
	public boolean launchflag;
	public boolean detachflag;
	public String CurrentBoxLocation;

	public SmartDGSystemProjectHandler() {
		DGSystemProject = new SmartDGSystemProject();
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
		SystemProjectFileLocation = filelocation + "/SmartDGbox/SmartDG_Systems/" + filename;
		File directory = new File(SystemProjectFileLocation);
		if (!directory.exists()) {
			directory.mkdirs();
			SmartDGout.print(" [New Directory created: " + directory + "]");
		}
		File directorysrcgen = new File(SystemProjectFileLocation + "/src-gen");
		if (!directorysrcgen.exists()) {
			directorysrcgen.mkdirs();
			SmartDGout.println(" [New Directory created: " + directorysrcgen + "]");
		}
		SystemProjectFileName = filename;
		Target = SystemProjectFileLocation + "/" + SystemProjectFileName + "." + extension;
		TargetFile = new File(Target);
	}

	public void Display() {
		SmartDGout.println("DGSystemProject       : " + DGSystemProject.Name);
		SmartDGout.println("Environment           : " + DGSystemProject.Environment);
		SmartDGout.println("EnvironmentBoxLocation: " + DGSystemProject.EnvironmentBoxLocation);
		SmartDGout.println("Wiki: " + DGSystemProject.Wiki);
		for (int i = 0; i < DGSystemProject.DGDependency.size(); i++)
			SmartDGout.println("DGSystemProject.DGDependency: " + DGSystemProject.DGDependency.get(i).Name + " "
					+ DGSystemProject.DGDependency.get(i).OutputNode + "."
					+ DGSystemProject.DGDependency.get(i).OutputPort + "--" + DGSystemProject.DGDependency.get(i).Object
					+ "-->" + DGSystemProject.DGDependency.get(i).InputNode + "."
					+ DGSystemProject.DGDependency.get(i).InputPort);
		for (int i = 0; i < DGSystemProject.DGGUI.size(); i++)
			SmartDGout.println("DGSystemProject.DGGUI: " + DGSystemProject.DGGUI.get(i).Name + " ("
					+ DGSystemProject.DGGUI.get(i).x + ", " + DGSystemProject.DGGUI.get(i).y + ")");
		for (int i = 0; i < DGSystemProject.BoxLocations.size(); i++)
			SmartDGout.println("DGSystemProject.BoxLocations: \"" + DGSystemProject.BoxLocations.get(i) + "\"");
	}

	public void Fill(SmartDGSystemProject e) {
		DGSystemProject = e;
	}

	public void Fill(SmartDGDependency d) {
		DGSystemProject.DGDependency.add(d);
	}

	public void Fill(SmartDGGUI g) {
		DGSystemProject.DGGUI.add(g);
	}

	public void Fill(String f) {
		DGSystemProject.BoxLocations.add(f);
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
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGSystemProject.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DGSystemProject = (SmartDGSystemProject) jaxbUnmarshaller.unmarshal(TargetFile);
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGSystemProject Read:" + Target);
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

	public boolean Save(String filename, SmartDGSystemProject e) {
		return Save(".", filename, e);
	}

	public boolean Save(String filelocation, String filename, SmartDGSystemProject e) {
		Fill(e);
		Init(filelocation, filename);
		return Save();
	}

	public boolean Save() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGSystemProject.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(DGSystemProject, TargetFile);
			try {
				PrintWriter srcout;
				srcout = new PrintWriter(
						SystemProjectFileLocation + "/src-gen/SmartDGSystemProject_" + SystemProjectFileName + ".cpp");
				srcout.println(Gene.gen(DGSystemProject));
				srcout.close();
				PrintWriter cmakeoutgen;
				cmakeoutgen = new PrintWriter(SystemProjectFileLocation + "/CMakeLists.txt");
				cmakeoutgen.println(Gene.genCMAKE(SystemProjectFileName));
				cmakeoutgen.close();
				PrintWriter builditoutgen;
				builditoutgen = new PrintWriter(SystemProjectFileLocation + "/buildit.sh");
				builditoutgen.println(Gene.genBuildit("Systems", SystemProjectFileName, SystemProjectFileLocation));
				builditoutgen.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGSystemProject Save:" + Target);
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
		String envbox = DGSystemProject.EnvironmentBoxLocation;
		String envnam = DGSystemProject.Environment;
		SmartDGEnvironmentHandler tmpEH = new SmartDGEnvironmentHandler();
		String envpath = tmpEH.gengetEnvironmentFileLocation(envbox, envnam);
		String propath = SystemProjectFileLocation;
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
		String builditscriptpath = SystemProjectFileLocation + "/buildit.sh";
		SmartDGout.println("BUILDING: " + builditscriptpath);
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		if (isWindows) {
			SmartDGout.println("Automated Build not supported for Windows !!");
		} else {
			try {
				String command = "cd " + SystemProjectFileLocation + "; bash buildit.sh";
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
		String launchpath = CurrentBoxLocation + "/SmartDGbox/SmartDG_Assortment/Systems/" + SystemProjectFileName;
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
