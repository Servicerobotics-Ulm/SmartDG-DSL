//--------------------------------------------------------------------------
// Code generated by the SmartSoft MDSD Toolchain
// The SmartSoft Toolchain has been developed by:
//  
// Service Robotics Research Center
// University of Applied Sciences Ulm
// Prittwitzstr. 10
// 89075 Ulm (Germany)
//
// Information about the SmartSoft MDSD Toolchain is available at:
// www.servicerobotik-ulm.de
//
// Please do not modify this file. It will be re-generated
// running the code generator.
//--------------------------------------------------------------------------
#ifndef DGSERVICE_DGBASICCOMMOBJECT_CORE_H_
#define DGSERVICE_DGBASICCOMMOBJECT_CORE_H_

#include "DGService/DGBasicCommObjectData.hh"

#include <iostream>
#include <string>
#include <list>

namespace DGService {
	
class DGBasicCommObjectCore {
protected:
	// data structure
	DGServiceIDL::DGBasicCommObject idl_DGBasicCommObject;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef DGServiceIDL::DGBasicCommObject DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	DGBasicCommObjectCore();
	DGBasicCommObjectCore(const DATATYPE &data);
	// default destructor
	virtual ~DGBasicCommObjectCore();
	
	const DATATYPE& get() const { return idl_DGBasicCommObject; }
	operator const DATATYPE&() const { return idl_DGBasicCommObject; }
	DATATYPE& set() { return idl_DGBasicCommObject; }

	static inline std::string identifier(void) { return "DGService::DGBasicCommObject"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Data
	inline int getData() const { return idl_DGBasicCommObject.data; }
	inline DGBasicCommObjectCore& setData(const int &data) { idl_DGBasicCommObject.data = data; return *this; }
};

} /* namespace DGService */
#endif /* DGSERVICE_DGBASICCOMMOBJECT_CORE_H_ */