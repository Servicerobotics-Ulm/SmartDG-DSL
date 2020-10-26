//================================================================
//
//  Copyright (C) 2017 Vineet Nagrath, Alex Lotz
//
//        nagrath@hs-ulm.de		
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
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
			System.out.print(" [New Directory created: " + directory + "]");
		}
		File directorysrcgen = new File(ComponentDevelopmentFileLocation + "/src-gen");
		if (!directorysrcgen.exists()) {
			directorysrcgen.mkdirs();
			System.out.println(" [New Directory created: " + directorysrcgen + "]");
		}
		ComponentDevelopmentFileName = filename;
		Target = ComponentDevelopmentFileLocation + "/" + ComponentDevelopmentFileName + "." + extension;
		TargetFile = new File(Target);
	}

	public void Display() {
		System.out.println("DGComponentDevelopment: " + DGComponentDevelopment.Name);
		System.out.println("Environment           : " + DGComponentDevelopment.Environment);
		System.out.println("EnvironmentBoxLocation: " + DGComponentDevelopment.EnvironmentBoxLocation);
		System.out.println("FunctionsBoxLocation  : " + DGComponentDevelopment.FunctionsBoxLocation);
		System.out.println("Wiki: " + DGComponentDevelopment.Wiki);
		System.out.println("DGComponentDevelopment.DGComponent: " + DGComponentDevelopment.DGComponent.Name);
		System.out.print("                InputPorts:");
		for (int j = 0; j < DGComponentDevelopment.DGComponent.InputPorts.size(); j++)
			System.out.print("\t" + DGComponentDevelopment.DGComponent.InputPorts.get(j).Name);
		System.out.println(" ");
		System.out.print("                OutputPorts:");
		for (int j = 0; j < DGComponentDevelopment.DGComponent.OutputPorts.size(); j++)
			System.out.print("\t" + DGComponentDevelopment.DGComponent.OutputPorts.get(j).Name);
		System.out.println(" ");
		System.out.println("                     Wiki:" + DGComponentDevelopment.DGComponent.Wiki);
		for (int i = 0; i < DGComponentDevelopment.BoxLocations.size(); i++)
			System.out.println(
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
			System.out.println("ERROR @ SmartDGComponentDevelopment Read:" + Target);
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
			System.out.println("ERROR @ SmartDGComponentDevelopment Save:" + Target);
			e.printStackTrace();
			return false;
		}
		if (importflag) {
			if (Import()) {
				System.out.println("IMPORT OK");
			} else {
				System.out.println("ERROR @ IMPORT");
				return false;
			}
		} else
			System.out.println("IMPORT SKIPPED");
		if (buildflag) {
			if (Build()) {
				System.out.println("BUILD OK");
			} else {
				System.out.println("ERROR @ BUILD");
				return false;
			}
		} else
			System.out.println("BUILD SKIPPED");
		if (launchflag) {
			if (Launch(!detachflag)) {
				System.out.println("LAUNCH OK");
			} else {
				System.out.println("ERROR @ LAUNCH");
				return false;
			}
		} else
			System.out.println("LAUNCH SKIPPED");
		return true;
	}

	public boolean Import() {
		String envbox = DGComponentDevelopment.EnvironmentBoxLocation;
		String envnam = DGComponentDevelopment.Environment;
		SmartDGEnvironmentHandler tmpEH = new SmartDGEnvironmentHandler();
		String envpath = tmpEH.gengetEnvironmentFileLocation(envbox, envnam);
		String propath = ComponentDevelopmentFileLocation;
		System.out.println("IMPORTING: FROM Environment:\"" + envnam + "\" AT \"" + envbox + "\" TO \""
				+ CurrentBoxLocation + "\"");
		System.out.println("IMPORTING: ORIGIN:\"" + envpath + "\"");

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
		System.out.println("BUILDING: " + builditscriptpath);
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		if (isWindows) {
			System.out.println("Automated Build not supported for Windows !!");
		} else {
			try {
				String command = "cd " + ComponentDevelopmentFileLocation + "; bash buildit.sh";
				System.out.println("COMMAND: " + command);
				String[] cmd = { "/bin/sh", "-c", command };
				System.out.print("BUILDING: ");
				Process process = Runtime.getRuntime().exec(cmd);
				while (process.isAlive()) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
						return false;
					}
					System.out.print("|");
				}
				System.out.println(" Done !");
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
		System.out.println("LAUNCHING: " + launchpath);
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		if (isWindows) {
			System.out.println("Automated Launch not supported for Windows !!");
		} else {
			try {
				String command = launchpath;
				System.out.println("COMMAND: " + command);
				String[] cmd = { "/bin/sh", "-c", command };
				System.out.print("LAUNCHED: ");
				Process process = Runtime.getRuntime().exec(cmd);
				while (process.isAlive() && hold) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
						return false;
					}
					System.out.print("|");
				}
				System.out.println(" Done !");
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
