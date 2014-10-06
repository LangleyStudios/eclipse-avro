/*
* generated by Xtext
*/
package net.langleystudios.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;

public class AvroSchemaParser extends AbstractContentAssistParser {
	
	@Inject
	private AvroSchemaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected net.langleystudios.dsl.ui.contentassist.antlr.internal.InternalAvroSchemaParser createParser() {
		net.langleystudios.dsl.ui.contentassist.antlr.internal.InternalAvroSchemaParser result = new net.langleystudios.dsl.ui.contentassist.antlr.internal.InternalAvroSchemaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0(), "rule__AvroSchema__TypesAlternatives_0");
					put(grammarAccess.getUnionMemberAccess().getAlternatives(), "rule__UnionMember__Alternatives");
					put(grammarAccess.getFieldAccess().getNameAlternatives_6_0(), "rule__Field__NameAlternatives_6_0");
					put(grammarAccess.getFieldAccess().getAlternatives_13(), "rule__Field__Alternatives_13");
					put(grammarAccess.getArrayTypeAccess().getAlternatives_13(), "rule__ArrayType__Alternatives_13");
					put(grammarAccess.getMapTypeAccess().getAlternatives_13(), "rule__MapType__Alternatives_13");
					put(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0(), "rule__Primitive__TypeAlternatives_1_0");
					put(grammarAccess.getUnionTypeAccess().getGroup(), "rule__UnionType__Group__0");
					put(grammarAccess.getUnionTypeAccess().getGroup_2(), "rule__UnionType__Group_2__0");
					put(grammarAccess.getUnionMemberAccess().getGroup_6(), "rule__UnionMember__Group_6__0");
					put(grammarAccess.getJsonTypeAccess().getGroup(), "rule__JsonType__Group__0");
					put(grammarAccess.getRecordTypeAccess().getGroup(), "rule__RecordType__Group__0");
					put(grammarAccess.getRecordTypeAccess().getGroup_16(), "rule__RecordType__Group_16__0");
					put(grammarAccess.getRecordTypeAccess().getGroup_24(), "rule__RecordType__Group_24__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getFieldAccess().getGroup_13_2(), "rule__Field__Group_13_2__0");
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_22(), "rule__EnumType__Group_22__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_23(), "rule__EnumType__Group_23__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup_13_2(), "rule__ArrayType__Group_13_2__0");
					put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
					put(grammarAccess.getMapTypeAccess().getGroup_13_2(), "rule__MapType__Group_13_2__0");
					put(grammarAccess.getFixedTypeAccess().getGroup(), "rule__FixedType__Group__0");
					put(grammarAccess.getPrimitiveAccess().getGroup(), "rule__Primitive__Group__0");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getNamespaceAccess().getGroup_1(), "rule__Namespace__Group_1__0");
					put(grammarAccess.getAvroSchemaAccess().getTypesAssignment(), "rule__AvroSchema__TypesAssignment");
					put(grammarAccess.getUnionTypeAccess().getTypesAssignment_1(), "rule__UnionType__TypesAssignment_1");
					put(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1(), "rule__UnionType__TypesAssignment_2_1");
					put(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1(), "rule__UnionMember__RecordRefAssignment_6_1");
					put(grammarAccess.getJsonTypeAccess().getTypeAssignment_6(), "rule__JsonType__TypeAssignment_6");
					put(grammarAccess.getRecordTypeAccess().getNameAssignment_14(), "rule__RecordType__NameAssignment_14");
					put(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6(), "rule__RecordType__NamespaceAssignment_16_6");
					put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23(), "rule__RecordType__FieldsAssignment_23");
					put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1(), "rule__RecordType__FieldsAssignment_24_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_6(), "rule__Field__NameAssignment_6");
					put(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0(), "rule__Field__PrimitiveAssignment_13_0");
					put(grammarAccess.getFieldAccess().getRecordAssignment_13_1(), "rule__Field__RecordAssignment_13_1");
					put(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1(), "rule__Field__RecordRefAssignment_13_2_1");
					put(grammarAccess.getFieldAccess().getEtypeAssignment_13_3(), "rule__Field__EtypeAssignment_13_3");
					put(grammarAccess.getFieldAccess().getArrayAssignment_13_4(), "rule__Field__ArrayAssignment_13_4");
					put(grammarAccess.getFieldAccess().getMapAssignment_13_5(), "rule__Field__MapAssignment_13_5");
					put(grammarAccess.getFieldAccess().getFixedAssignment_13_6(), "rule__Field__FixedAssignment_13_6");
					put(grammarAccess.getFieldAccess().getUnionAssignment_13_7(), "rule__Field__UnionAssignment_13_7");
					put(grammarAccess.getEnumTypeAccess().getNameAssignment_14(), "rule__EnumType__NameAssignment_14");
					put(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1(), "rule__EnumType__SymbolsAssignment_22_1");
					put(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2(), "rule__EnumType__SymbolsAssignment_23_2");
					put(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0(), "rule__ArrayType__PrimitiveAssignment_13_0");
					put(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1(), "rule__ArrayType__RecordAssignment_13_1");
					put(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1(), "rule__ArrayType__RecordRefAssignment_13_2_1");
					put(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3(), "rule__ArrayType__EtypeAssignment_13_3");
					put(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0(), "rule__MapType__PrimitiveAssignment_13_0");
					put(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1(), "rule__MapType__RecordAssignment_13_1");
					put(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1(), "rule__MapType__RecordRefAssignment_13_2_1");
					put(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3(), "rule__MapType__EtypeAssignment_13_3");
					put(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4(), "rule__MapType__AtypeAssignment_13_4");
					put(grammarAccess.getFixedTypeAccess().getNameAssignment_9(), "rule__FixedType__NameAssignment_9");
					put(grammarAccess.getFixedTypeAccess().getSizeAssignment_17(), "rule__FixedType__SizeAssignment_17");
					put(grammarAccess.getPrimitiveAccess().getTypeAssignment_1(), "rule__Primitive__TypeAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			net.langleystudios.dsl.ui.contentassist.antlr.internal.InternalAvroSchemaParser typedParser = (net.langleystudios.dsl.ui.contentassist.antlr.internal.InternalAvroSchemaParser) parser;
			typedParser.entryRuleAvroSchema();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AvroSchemaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
