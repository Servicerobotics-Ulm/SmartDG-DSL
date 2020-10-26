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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DGSystemProject")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGSystemProject {
	@XmlElement(name = "Name")
	public String Name;

	@XmlElement(name = "Environment")
	public String Environment;

	@XmlElement(name = "EnvironmentBoxLocation")
	public String EnvironmentBoxLocation;

	@XmlElement(name = "Wiki")
	public String Wiki;

	@XmlElement(name = "DGDependency")
	public List<SmartDGDependency> DGDependency = null;

	@XmlElement(name = "DGGUI")
	public List<SmartDGGUI> DGGUI = null;

	@XmlElement(name = "ComponentInstanceMap")
	public Map<String, String> CIM = null;

	@XmlElement(name = "BoxLocation")
	public List<String> BoxLocations;

	SmartDGSystemProject() {
		DGDependency = new ArrayList<SmartDGDependency>();
		DGGUI = new ArrayList<SmartDGGUI>();
		CIM = new HashMap<String, String>();
		BoxLocations = new ArrayList<String>();
	}
}
