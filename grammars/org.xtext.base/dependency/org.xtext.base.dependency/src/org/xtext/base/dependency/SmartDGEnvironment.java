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

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DGEnvironment")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGEnvironment {
	@XmlElement(name = "Name")
	public String Name;

	@XmlElement(name = "Wiki")
	public String Wiki;

	@XmlElement(name = "DGObject")
	public List<SmartDGObject> DGObjects = null;

	@XmlElement(name = "DGComponent")
	public List<SmartDGComponent> DGComponents = null;

	@XmlElement(name = "DGConnector")
	public List<SmartDGConnector> DGConnectors = null;

	@XmlElement(name = "BoxLocation")
	public List<String> BoxLocations;

	SmartDGEnvironment() {
		DGObjects = new ArrayList<SmartDGObject>();
		DGComponents = new ArrayList<SmartDGComponent>();
		BoxLocations = new ArrayList<String>();
		DGConnectors = new ArrayList<SmartDGConnector>();
	}
}
