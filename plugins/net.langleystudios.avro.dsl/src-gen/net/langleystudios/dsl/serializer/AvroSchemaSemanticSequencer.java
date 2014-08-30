package net.langleystudios.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.langleystudios.dsl.avroSchema.ArrayType;
import net.langleystudios.dsl.avroSchema.AvroSchema;
import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.EnumType;
import net.langleystudios.dsl.avroSchema.Field;
import net.langleystudios.dsl.avroSchema.FixedType;
import net.langleystudios.dsl.avroSchema.JsonType;
import net.langleystudios.dsl.avroSchema.MapType;
import net.langleystudios.dsl.avroSchema.Primitive;
import net.langleystudios.dsl.avroSchema.RecordType;
import net.langleystudios.dsl.avroSchema.UnionType;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AvroSchemaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AvroSchemaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AvroSchemaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AvroSchemaPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.AVRO_SCHEMA:
				if(context == grammarAccess.getAvroSchemaRule()) {
					sequence_AvroSchema(context, (AvroSchema) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.ENUM_TYPE:
				if(context == grammarAccess.getEnumTypeRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_EnumType(context, (EnumType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.FIXED_TYPE:
				if(context == grammarAccess.getFixedTypeRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_FixedType(context, (FixedType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.JSON_TYPE:
				if(context == grammarAccess.getJsonTypeRule()) {
					sequence_JsonType(context, (JsonType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.MAP_TYPE:
				if(context == grammarAccess.getMapTypeRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_MapType(context, (MapType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.PRIMITIVE:
				if(context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_Primitive(context, (Primitive) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.RECORD_TYPE:
				if(context == grammarAccess.getRecordTypeRule() ||
				   context == grammarAccess.getUnionMemberRule()) {
					sequence_RecordType(context, (RecordType) semanticObject); 
					return; 
				}
				else break;
			case AvroSchemaPackage.UNION_TYPE:
				if(context == grammarAccess.getUnionTypeRule()) {
					sequence_UnionType(context, (UnionType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (primitive=Primitive | record=RecordType | recordRef=[RecordType|ID] | etype=EnumType)
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=JsonType | types+=RecordType | types+=UnionType)
	 */
	protected void sequence_AvroSchema(EObject context, AvroSchema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID symbols+=ID symbols+=ID*)
	 */
	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='name' | name=ID) 
	 *         (
	 *             primitive=Primitive | 
	 *             record=RecordType | 
	 *             recordRef=[RecordType|ID] | 
	 *             etype=EnumType | 
	 *             array=ArrayType | 
	 *             map=MapType | 
	 *             fixed=FixedType | 
	 *             union=UnionType
	 *         )
	 *     )
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID size=INT)
	 */
	protected void sequence_FixedType(EObject context, FixedType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.FIXED_TYPE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=Primitive
	 */
	protected void sequence_JsonType(EObject context, JsonType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AvroSchemaPackage.Literals.JSON_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AvroSchemaPackage.Literals.JSON_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (primitive=Primitive | record=RecordType | recordRef=[RecordType|ID] | etype=EnumType | atype=ArrayType)
	 */
	protected void sequence_MapType(EObject context, MapType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type='null' | 
	 *         type='boolean' | 
	 *         type='int' | 
	 *         type='long' | 
	 *         type='float' | 
	 *         type='double' | 
	 *         type='bytes' | 
	 *         type='string'
	 *     )
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID namespace=Namespace? fields+=Field fields+=Field*)
	 */
	protected void sequence_RecordType(EObject context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=UnionMember types+=UnionMember*)
	 */
	protected void sequence_UnionType(EObject context, UnionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
