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
import org.xtext.base.dependency.SmartDGdslGen;

public class SmartDGEnvironmentHandler {

	// #TODO Feature to import more than one Environments
	// #TODO TF like import for Solvers

	SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
	public String EnvironmentFileLocation;
	public String EnvironmentFileName;
	public static final String extension = "dgenv";
	public String Target;
	public File TargetFile;
	SmartDGdslGen Gene;
	public boolean creatormode;

	public SmartDGEnvironment DGEnvironment;

	public SmartDGEnvironmentHandler() {
		DGEnvironment = new SmartDGEnvironment();
		Gene = new SmartDGdslGen();
		creatormode = false;
	}

	public String gengetEnvironmentFileLocation(String filelocation, String filename) {
		return filelocation + "/SmartDGbox/SmartDG_Environments/" + filename;
	}

	public void Init(String filename) {
		Init(".", filename);
	}

	public void Init(String filelocation, String filename) {
		EnvironmentFileLocation = gengetEnvironmentFileLocation(filelocation, filename);
		File directory = new File(EnvironmentFileLocation);
		if (!directory.exists()) {
			directory.mkdirs();
			SmartDGout.println(" [New Directory created: " + directory + "]");
		}
		File directorysrcgen = new File(EnvironmentFileLocation + "/src-gen");
		if (!directorysrcgen.exists()) {
			directorysrcgen.mkdirs();
			SmartDGout.println(" [New Directory created: " + directorysrcgen + "]");
		}
		File directorysrc = new File(EnvironmentFileLocation + "/src");
		if (!directorysrc.exists()) {
			directorysrc.mkdirs();
			SmartDGout.println(" [New Directory created: " + directorysrc + "]");
		}
		EnvironmentFileName = filename;
		Target = EnvironmentFileLocation + "/" + EnvironmentFileName + "." + extension;
		TargetFile = new File(Target);
	}

	public void Display() {
		SmartDGout.println("DGEnvironment: " + DGEnvironment.Name);
		SmartDGout.println("Wiki: " + DGEnvironment.Wiki);
		for (int i = 0; i < DGEnvironment.DGObjects.size(); i++)
			SmartDGout.println("DGEnvironment.DGObject: " + DGEnvironment.DGObjects.get(i).Name + " "
					+ DGEnvironment.DGObjects.get(i).Type + " " + DGEnvironment.DGObjects.get(i).isMulti + " Wiki:"
					+ DGEnvironment.DGObjects.get(i).Wiki);
		for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
			SmartDGout.println("DGEnvironment.DGComponents: " + DGEnvironment.DGComponents.get(i).Name);
			for (int j = 0; j < DGEnvironment.DGComponents.get(i).InputPorts.size(); j++) {
				SmartDGout.print("                InputPort:");
				SmartDGout.print("\t" + DGEnvironment.DGComponents.get(i).InputPorts.get(j).Name);
				for (String dos : DGEnvironment.DGComponents.get(i).InputPorts.get(j).DGObjectCandidates)
					SmartDGout.print("  [" + dos + "]");
				SmartDGout.println("");
			}
			SmartDGout.println(" ");
			for (int j = 0; j < DGEnvironment.DGComponents.get(i).OutputPorts.size(); j++) {
				SmartDGout.print("                OutputPort:");
				SmartDGout.print("\t" + DGEnvironment.DGComponents.get(i).OutputPorts.get(j).Name);
				for (String dos : DGEnvironment.DGComponents.get(i).OutputPorts.get(j).DGObjectCandidates)
					SmartDGout.print("  [" + dos + "]");
				SmartDGout.println("");
			}
			SmartDGout.println(" ");
			SmartDGout.println("                     Wiki:" + DGEnvironment.DGComponents.get(i).Wiki);
		}
		for (int i = 0; i < DGEnvironment.DGConnectors.size(); i++) {
			SmartDGout.print("DGEnvironment.DGConnectors: \"" + DGEnvironment.DGConnectors.get(i).Name + "\"");
			for (int j = 0; j < DGEnvironment.DGConnectors.get(i).DGObjectCandidates.size(); j++) {
				SmartDGout.print("  [ \"" + DGEnvironment.DGConnectors.get(i).DGObjectCandidates.get(j) + "\" ]");
			}
			SmartDGout.println("");
		}
		for (int i = 0; i < DGEnvironment.BoxLocations.size(); i++)
			SmartDGout.println("DGEnvironment.BoxLocations: \"" + DGEnvironment.BoxLocations.get(i) + "\"");
	}

	public void Fill(SmartDGEnvironment e) {
		DGEnvironment = e;
	}

	public void Fill(SmartDGObject o) {
		if (!Check(o))
			DGEnvironment.DGObjects.add(o);
	}

	public void Fill(SmartDGComponent c) {
		if (!Check(c))
			DGEnvironment.DGComponents.add(c);
	}

	public void DisplayComponent(SmartDGComponent c) {
		SmartDGout.println(c.Name);
		SmartDGout.println("InputPorts: ");
		for (int porti = 0; porti < c.InputPorts.size(); porti++) {
			SmartDGout.print(c.InputPorts.get(porti).Name + " : ");
			for (int obji = 0; obji < c.InputPorts.get(porti).DGObjectCandidates.size(); obji++) {
				SmartDGout.print("	" + c.InputPorts.get(porti).DGObjectCandidates.get(obji));
			}
			SmartDGout.println("");
		}
		SmartDGout.println("OutputPorts: ");
		for (int porti = 0; porti < c.OutputPorts.size(); porti++) {
			SmartDGout.print(c.OutputPorts.get(porti).Name + " : ");
			for (int obji = 0; obji < c.OutputPorts.get(porti).DGObjectCandidates.size(); obji++) {
				SmartDGout.print("	" + c.OutputPorts.get(porti).DGObjectCandidates.get(obji));
			}
			SmartDGout.println("");
		}
		SmartDGout.println("");
	}

	public void FillCheck(SmartDGComponent c) {
		for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
			if (c.Name.equals(DGEnvironment.DGComponents.get(i).Name)) {
				SmartDGout.println("");
				SmartDGout.print("=|==|==|==|==|==XXXX Component " + c.Name + " already present in the environment ");
				SmartDGout.println("\"" + EnvironmentFileName + "\" @ " + EnvironmentFileLocation + "!!");
				SmartDGout.println("Replacing existing component " + c.Name + " from \"" + EnvironmentFileName + "\" @ "
						+ EnvironmentFileLocation + "!!");
				SmartDGout.println("Old:");
				DisplayComponent(DGEnvironment.DGComponents.get(i));
				DGEnvironment.DGComponents.set(i, c);
				SmartDGout.println("New:");
				DisplayComponent(DGEnvironment.DGComponents.get(i));
				return;
			}
		}
		SmartDGout.println("");
		SmartDGout.println("Adding new component " + c.Name + " to \"" + EnvironmentFileName + "\" @ "
				+ EnvironmentFileLocation + "!!");
		DGEnvironment.DGComponents.add(c);
		SmartDGout.println("New:");
		DisplayComponent(c);

	}

	public void Fill(SmartDGConnector con) {
		if (!Check(con))
			DGEnvironment.DGConnectors.add(con);
	}

	public void Fill(SmartDGConnector con, SmartDGObject o) {
		if (!Check(con)) {
			DGEnvironment.DGConnectors.add(con);
			return;
		}
		if (!Check(con, o)) {
			for (int i = 0; i < DGEnvironment.DGConnectors.size(); i++) {
				if (con.Name.equals(DGEnvironment.DGConnectors.get(i).Name)) {
					DGEnvironment.DGConnectors.get(i).DGObjectCandidates.add(o.Name);
				}
			}
		}
	}

	public void Fill(String f) {
		if (!Check(f))
			DGEnvironment.BoxLocations.add(f);
	}

	public boolean Check(String f) {
		for (int i = 0; i < DGEnvironment.BoxLocations.size(); i++) {
			if (f.equals(DGEnvironment.BoxLocations.get(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean Check(SmartDGConnector con) {
		for (int i = 0; i < DGEnvironment.DGConnectors.size(); i++) {
			if (con.Name.equals(DGEnvironment.DGConnectors.get(i).Name)) {
				return true;
			}
		}
		return false;
	}

	public boolean Check(SmartDGConnector con, SmartDGObject o) {
		if (Check(con) && Check(o)) {
			for (int i = 0; i < DGEnvironment.DGConnectors.size(); i++) {
				if (con.Name.equals(DGEnvironment.DGConnectors.get(i).Name)) {
					for (int j = 0; j < DGEnvironment.DGConnectors.get(i).DGObjectCandidates.size(); j++) {
						if (o.Name.equals(DGEnvironment.DGConnectors.get(i).DGObjectCandidates.get(j))) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean Check(SmartDGObject o) {
		for (int i = 0; i < DGEnvironment.DGObjects.size(); i++) {
			if (o.Name.equals(DGEnvironment.DGObjects.get(i).Name)) {
				return true;
			}
		}
		return false;
	}

	public boolean Check(SmartDGComponent c) {
		for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
			if (c.Name.equals(DGEnvironment.DGComponents.get(i).Name)) {
				for (int j = 0; j < c.InputPorts.size(); j++) {
					boolean found = false;
					for (int k = 0; k < DGEnvironment.DGComponents.get(i).InputPorts.size(); k++) {
						if (DGEnvironment.DGComponents.get(i).InputPorts.get(k).Name.equals(c.InputPorts.get(j).Name)) {
							found = true;
							continue;
						}
					}
					if (!found)
						return false;
				}
				for (int j = 0; j < c.OutputPorts.size(); j++) {
					boolean found = false;
					for (int k = 0; k < DGEnvironment.DGComponents.get(i).OutputPorts.size(); k++) {
						if (DGEnvironment.DGComponents.get(i).OutputPorts.get(k).Name
								.equals(c.OutputPorts.get(j).Name)) {
							found = true;
							continue;
						}
					}
					if (!found)
						return false;
				}
				return true;
			}
		}
		return false;
	}

	public boolean isComponent(String s) {
		for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
			if (s.equals(DGEnvironment.DGComponents.get(i).Name)) {
				return true;
			}
		}
		return false;
	}

	public SmartDGComponent getComponent(String s) {
		if (isComponent(s)) {
			for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
				if (s.equals(DGEnvironment.DGComponents.get(i).Name)) {
					return DGEnvironment.DGComponents.get(i);
				}
			}
		}
		return null;
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
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGEnvironment.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DGEnvironment = (SmartDGEnvironment) jaxbUnmarshaller.unmarshal(TargetFile);
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGEnvironment Read:" + Target);
			SmartDGout.println(
					"ERROR @ IGNORE above message when UserName is mentioned for the first time in the model.");
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

	public boolean Save(String filename, SmartDGEnvironment e) {
		return Save(".", filename, e);
	}

	public boolean Save(String filelocation, String filename, SmartDGEnvironment e) {
		Fill(e);
		Init(filelocation, filename);
		return Save();
	}

	public boolean Save() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SmartDGEnvironment.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(DGEnvironment, TargetFile);
			SmartDGout.println("SAVED | " + EnvironmentFileName + " XML dgenv File @ " + EnvironmentFileLocation);
			// Environment Header File
			try {
				PrintWriter srcouth;
				srcouth = new PrintWriter(
						EnvironmentFileLocation + "/src-gen/SmartDGEnvironment_" + EnvironmentFileName + ".h");
				srcouth.println(Gene.gen(DGEnvironment));
				srcouth.close();
				SmartDGout.println(
						"SAVED | " + EnvironmentFileName + " Header File @ " + EnvironmentFileLocation + "/src-gen/");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			// Component Header Files
			for (int i = 0; i < DGEnvironment.DGComponents.size(); i++) {
				try {
					PrintWriter srcout_tf;
					srcout_tf = new PrintWriter(EnvironmentFileLocation + "/src-gen/SmartDGTransferFunction_Component_"
							+ DGEnvironment.DGComponents.get(i).Name + ".h");
					srcout_tf.println(Gene.gen(DGEnvironment.DGComponents.get(i)));
					srcout_tf.close();
					SmartDGout.println("SAVED | " + DGEnvironment.DGComponents.get(i).Name + " Header File @ "
							+ EnvironmentFileLocation + "/src-gen/");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (JAXBException e) {
			SmartDGout.println("ERROR @ SmartDGEnvironment Save:" + Target);
			e.printStackTrace();
			return false;
		}
		SmartDGout.println("SAVED | " + EnvironmentFileName + " ALL OK @ " + EnvironmentFileLocation);
		return true;
	}

	public boolean importSrc(String SrcEnvironmentFileLocation, String SrcEnvironmentFileName) {
		SmartDGout.println("IMPORTING | \"src\" folder contents");
		File source = new File(SrcEnvironmentFileLocation + "/src/");
		File destgen = new File(EnvironmentFileLocation + "/src/");
		try {
			FileUtils.copyDirectory(source, destgen);
		} catch (IOException e) {
			SmartDGout.println("IMPORTED | ERROR copyDirectory ");
			SmartDGout.println(
					"IMPORTED | from " + SrcEnvironmentFileName + " @ " + SrcEnvironmentFileLocation + "/src/");
			SmartDGout.println("IMPORTED | to   " + EnvironmentFileName + " @ " + EnvironmentFileLocation + "/src/");

			return false;
		}
		File[] fileList = destgen.listFiles();
		for (File file : fileList) {
			SmartDGout.println("IMPORTED | " + file.getName());
		}
		SmartDGout.println("IMPORTED | from " + SrcEnvironmentFileName + " @ " + SrcEnvironmentFileLocation + "/src/");
		SmartDGout.println("IMPORTED | to   " + EnvironmentFileName + " @ " + EnvironmentFileLocation + "/src/");
		return true;
	}
}
