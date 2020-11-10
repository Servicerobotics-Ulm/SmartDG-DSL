/*
 * generated by Xtext 2.23.0
 */
package org.xtext.component.dependency.serializer;

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
import org.xtext.component.dependency.dependency.At;
import org.xtext.component.dependency.dependency.ComponentDependencyObjects;
import org.xtext.component.dependency.dependency.DependencyPackage;
import org.xtext.component.dependency.dependency.UserImport;
import org.xtext.component.dependency.dependency.UserName;
import org.xtext.component.dependency.services.DependencyGrammarAccess;

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
			case DependencyPackage.COMPONENT_DEPENDENCY_OBJECTS:
				sequence_ComponentDependencyObjects(context, (ComponentDependencyObjects) semanticObject); 
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
		feeder.accept(grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDependencyObjects returns ComponentDependencyObjects
	 *
	 * Constraint:
	 *     (username=UserName userimport=UserImport at=At)
	 */
	protected void sequence_ComponentDependencyObjects(ISerializationContext context, ComponentDependencyObjects semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__USERNAME));
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__USERIMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__USERIMPORT));
			if (transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__AT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.COMPONENT_DEPENDENCY_OBJECTS__AT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getComponentDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0(), semanticObject.getUserimport());
		feeder.accept(grammarAccess.getComponentDependencyObjectsAccess().getAtAtParserRuleCall_2_0(), semanticObject.getAt());
		feeder.finish();
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
