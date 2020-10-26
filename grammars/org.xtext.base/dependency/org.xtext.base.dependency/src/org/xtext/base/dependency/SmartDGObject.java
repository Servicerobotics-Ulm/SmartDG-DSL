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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DGObject")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGObject {
	public String Name;
	public String Type;
	public boolean isMulti;
	@XmlElement(name = "Wiki")
	public String Wiki;

	public void Name(String string) {
		Name = string;
	}

	public void isMulti(boolean b) {
		isMulti = b;
	}

	public void Type(String string) {
		Type = string;
	}

	public boolean contains(SmartDGObject chk) {
		return (chk.Name.equals(Name) && (chk.Type.equals(Type)));
	}
}
