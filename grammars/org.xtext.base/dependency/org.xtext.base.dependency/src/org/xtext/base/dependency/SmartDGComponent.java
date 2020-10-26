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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DGComponent")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGComponent {
	public String Name;

	public void Name(String string) {
		Name = string;
	}

	@XmlElement(name = "InputPort")
	public List<SmartDGPort> InputPorts = null;

	@XmlElement(name = "OutputPort")
	public List<SmartDGPort> OutputPorts = null;

	@XmlElement(name = "Wiki")
	public String Wiki;

	public SmartDGComponent() {
		Name = "";
		Wiki = "";
		InputPorts = new ArrayList<SmartDGPort>();
		OutputPorts = new ArrayList<SmartDGPort>();
	}

	public boolean contains(SmartDGComponent chk) {
		if (!chk.Name.equals(Name))
			return false;
		for (SmartDGPort chkip : chk.InputPorts) {
			if (!InputPorts.contains(chkip))
				return false;
		}
		for (SmartDGPort chkop : chk.OutputPorts) {
			if (!OutputPorts.contains(chkop))
				return false;
		}
		return true;
	}
}
