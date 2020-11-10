/*
 * generated by Xtext 2.23.0
 */
package org.xtext.base.dependency.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.base.dependency.dependency.At;
import org.xtext.base.dependency.dependency.BoxLocation;
import org.xtext.base.dependency.dependency.CIM;
import org.xtext.base.dependency.dependency.ComponentDevelopment;
import org.xtext.base.dependency.dependency.Dependency;
import org.xtext.base.dependency.dependency.DependencyComponent;
import org.xtext.base.dependency.dependency.DependencyConnectors;
import org.xtext.base.dependency.dependency.DependencyObject;
import org.xtext.base.dependency.dependency.DependencyPackage;
import org.xtext.base.dependency.dependency.DependencyPort;
import org.xtext.base.dependency.dependency.Environment;
import org.xtext.base.dependency.dependency.GUI;
import org.xtext.base.dependency.dependency.Model;
import org.xtext.base.dependency.dependency.New;
import org.xtext.base.dependency.dependency.SystemProject;
import org.xtext.base.dependency.dependency.UserImport;
import org.xtext.base.dependency.dependency.UserName;
import org.xtext.base.dependency.services.DependencyGrammarAccess;

@SuppressWarnings("all")
public class DependencySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DependencyGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DependencyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DependencyPackage.AT:
				sequence_At(context, (At) semanticObject); 
				return; 
			case DependencyPackage.BOX_LOCATION:
				sequence_BoxLocation(context, (BoxLocation) semanticObject); 
				return; 
			case DependencyPackage.CIM:
				sequence_CIM(context, (CIM) semanticObject); 
				return; 
			case DependencyPackage.COMPONENT_DEVELOPMENT:
				sequence_ComponentDevelopment(context, (ComponentDevelopment) semanticObject); 
				return; 
			case DependencyPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case DependencyPackage.DEPENDENCY_COMPONENT:
				sequence_DependencyComponent(context, (DependencyComponent) semanticObject); 
				return; 
			case DependencyPackage.DEPENDENCY_CONNECTORS:
				sequence_DependencyConnectors(context, (DependencyConnectors) semanticObject); 
				return; 
			case DependencyPackage.DEPENDENCY_OBJECT:
				sequence_DependencyObject(context, (DependencyObject) semanticObject); 
				return; 
			case DependencyPackage.DEPENDENCY_PORT:
				sequence_DependencyPort(context, (DependencyPort) semanticObject); 
				return; 
			case DependencyPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case DependencyPackage.GUI:
				sequence_GUI(context, (GUI) semanticObject); 
				return; 
			case DependencyPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DependencyPackage.NEW:
				sequence_New(context, (New) semanticObject); 
				return; 
			case DependencyPackage.SYSTEM_PROJECT:
				sequence_SystemProject(context, (SystemProject) semanticObject); 
				return; 
			case DependencyPackage.USER_IMPORT:
				sequence_UserImport(context, (UserImport) semanticObject); 
				return; 
			case DependencyPackage.USER_NAME:
				sequence_UserName(context, (UserName) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     At returns At
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_At(ISerializationContext context, At semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.AT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.AT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BoxLocation returns BoxLocation
	 *
	 * Constraint:
	 *     (name=STRING importflag=STRING? buildflag=STRING? launchflag=STRING? detachflag=STRING?)
	 */
	protected void sequence_BoxLocation(ISerializationContext context, BoxLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CIM returns CIM
	 *
	 * Constraint:
	 *     (name=STRING source=STRING)
	 */
	protected void sequence_CIM(ISerializationContext context, CIM semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.CIM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.CIM__NAME));
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.CIM__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.CIM__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCIMAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCIMAccess().getSourceSTRINGTerminalRuleCall_3_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDevelopment returns ComponentDevelopment
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         wiki=STRING? 
	 *         environment=STRING 
	 *         boxpath=STRING 
	 *         component=STRING 
	 *         location+=BoxLocation+
	 *     )
	 */
	protected void sequence_ComponentDevelopment(ISerializationContext context, ComponentDevelopment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DependencyComponent returns DependencyComponent
	 *
	 * Constraint:
	 *     (name=STRING (inputPorts+=DependencyPort inputPorts+=DependencyPort*)? (outputPorts+=DependencyPort outputPorts+=DependencyPort*)? wiki=STRING?)
	 */
	protected void sequence_DependencyComponent(ISerializationContext context, DependencyComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DependencyConnectors returns DependencyConnectors
	 *
	 * Constraint:
	 *     (name=STRING objinstances+=STRING objinstances+=STRING*)
	 */
	protected void sequence_DependencyConnectors(ISerializationContext context, DependencyConnectors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DependencyObject returns DependencyObject
	 *
	 * Constraint:
	 *     (name=STRING isMulti=STRING? wiki=STRING?)
	 */
	protected void sequence_DependencyObject(ISerializationContext context, DependencyObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DependencyPort returns DependencyPort
	 *
	 * Constraint:
	 *     (name=STRING objinstances+=STRING objinstances+=STRING*)
	 */
	protected void sequence_DependencyPort(ISerializationContext context, DependencyPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         fn=STRING 
	 *         fp=STRING 
	 *         o=STRING 
	 *         tn=STRING 
	 *         tp=STRING 
	 *         wiki=STRING?
	 *     )
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         wiki=STRING? 
	 *         objects+=DependencyObject* 
	 *         components+=DependencyComponent* 
	 *         connectors+=DependencyConnectors* 
	 *         location+=At+
	 *     )
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GUI returns GUI
	 *
	 * Constraint:
	 *     (name=STRING x=INT y=INT wiki=STRING?)
	 */
	protected void sequence_GUI(ISerializationContext context, GUI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             username+=UserName? 
	 *             ((environments+=Environment+ componentDevelopments+=ComponentDevelopment+) | componentDevelopments+=ComponentDevelopment+)
	 *         ) | 
	 *         (
	 *             username+=UserName? 
	 *             userimport+=UserImport 
	 *             ((environments+=Environment+ componentDevelopments+=ComponentDevelopment+) | componentDevelopments+=ComponentDevelopment+)
	 *         ) | 
	 *         (
	 *             ((username+=UserName? new+=New+) | (username+=UserName? userimport+=UserImport new+=New+) | new+=New+) 
	 *             ((environments+=Environment+ componentDevelopments+=ComponentDevelopment+) | componentDevelopments+=ComponentDevelopment+)
	 *         ) | 
	 *         (
	 *             (
	 *                 (username+=UserName? ((new+=New+ environments+=Environment+) | environments+=Environment+)) | 
	 *                 (username+=UserName? userimport+=UserImport ((new+=New+ environments+=Environment+) | environments+=Environment+)) | 
	 *                 (new+=New+ environments+=Environment+) | 
	 *                 environments+=Environment+
	 *             )? 
	 *             systemProjects+=SystemProject+ 
	 *             componentDevelopments+=ComponentDevelopment+
	 *         ) | 
	 *         (environments+=Environment+ componentDevelopments+=ComponentDevelopment+) | 
	 *         componentDevelopments+=ComponentDevelopment+
	 *     )?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     New returns New
	 *
	 * Constraint:
	 *     (name='new' object+=DependencyObject? component+=DependencyComponent? connector+=DependencyConnectors? location=At)
	 */
	protected void sequence_New(ISerializationContext context, New semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemProject returns SystemProject
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         wiki=STRING? 
	 *         environment=STRING 
	 *         boxpath=STRING 
	 *         cims+=CIM* 
	 *         dependencies+=Dependency* 
	 *         gui+=GUI* 
	 *         location+=BoxLocation+
	 *     )
	 */
	protected void sequence_SystemProject(ISerializationContext context, SystemProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserImport returns UserImport
	 *
	 * Constraint:
	 *     (environment=STRING boxpath=STRING)
	 */
	protected void sequence_UserImport(ISerializationContext context, UserImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.USER_IMPORT__ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.USER_IMPORT__ENVIRONMENT));
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.USER_IMPORT__BOXPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.USER_IMPORT__BOXPATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUserImportAccess().getEnvironmentSTRINGTerminalRuleCall_1_0(), semanticObject.getEnvironment());
		feeder.accept(grammarAccess.getUserImportAccess().getBoxpathSTRINGTerminalRuleCall_3_0(), semanticObject.getBoxpath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UserName returns UserName
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_UserName(ISerializationContext context, UserName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.USER_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.USER_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUserNameAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
