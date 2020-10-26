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

@XmlRootElement(name = "DGPort")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartDGPort {
	public String Name;
	@XmlElement(name = "DGObjectCandidate")
	public List<String> DGObjectCandidates = null;

	public void Name(String string) {
		Name = string;
	}

	public SmartDGPort() {
		DGObjectCandidates = new ArrayList<String>();
	}

	public boolean contains(SmartDGPort chk) {
		return chk.Name.equals(Name);
	}
}
