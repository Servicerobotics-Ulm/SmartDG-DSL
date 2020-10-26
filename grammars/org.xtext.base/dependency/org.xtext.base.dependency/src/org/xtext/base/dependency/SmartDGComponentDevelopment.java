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

@XmlRootElement(name = "DGComponentDevelopment")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGComponentDevelopment {
	@XmlElement(name = "Name")
	public String Name;

	@XmlElement(name = "Environment")
	public String Environment;

	@XmlElement(name = "EnvironmentBoxLocation")
	public String EnvironmentBoxLocation;

	@XmlElement(name = "FunctionsBoxLocation")
	public String FunctionsBoxLocation;

	@XmlElement(name = "Wiki")
	public String Wiki;

	@XmlElement(name = "DGComponent")
	public SmartDGComponent DGComponent;

	@XmlElement(name = "BoxLocation")
	public List<String> BoxLocations;

	SmartDGComponentDevelopment() {
		DGComponent = new SmartDGComponent();
		BoxLocations = new ArrayList<String>();
	}
}
