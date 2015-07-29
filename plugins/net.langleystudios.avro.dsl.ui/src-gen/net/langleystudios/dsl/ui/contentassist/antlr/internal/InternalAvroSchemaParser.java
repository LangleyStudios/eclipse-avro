package net.langleystudios.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'['", "']'", "','", "'\"'", "'{'", "'type'", "':'", "'}'", "'record'", "'fields'", "'namespace'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalAvroSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAvroSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAvroSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g"; }


     
     	private AvroSchemaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAvroSchema"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:60:1: entryRuleAvroSchema : ruleAvroSchema EOF ;
    public final void entryRuleAvroSchema() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:61:1: ( ruleAvroSchema EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:62:1: ruleAvroSchema EOF
            {
             before(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema61);
            ruleAvroSchema();

            state._fsp--;

             after(grammarAccess.getAvroSchemaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroSchema68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:69:1: ruleAvroSchema : ( ( rule__AvroSchema__TypesAssignment ) ) ;
    public final void ruleAvroSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:73:2: ( ( ( rule__AvroSchema__TypesAssignment ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:74:1: ( ( rule__AvroSchema__TypesAssignment ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:74:1: ( ( rule__AvroSchema__TypesAssignment ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:75:1: ( rule__AvroSchema__TypesAssignment )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:76:1: ( rule__AvroSchema__TypesAssignment )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:76:2: rule__AvroSchema__TypesAssignment
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAssignment_in_ruleAvroSchema94);
            rule__AvroSchema__TypesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:88:1: entryRuleUnionType : ruleUnionType EOF ;
    public final void entryRuleUnionType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:89:1: ( ruleUnionType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:90:1: ruleUnionType EOF
            {
             before(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_ruleUnionType_in_entryRuleUnionType121);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getUnionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:97:1: ruleUnionType : ( ( rule__UnionType__Group__0 ) ) ;
    public final void ruleUnionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:101:2: ( ( ( rule__UnionType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:102:1: ( ( rule__UnionType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:102:1: ( ( rule__UnionType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:103:1: ( rule__UnionType__Group__0 )
            {
             before(grammarAccess.getUnionTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:104:1: ( rule__UnionType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:104:2: rule__UnionType__Group__0
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0_in_ruleUnionType154);
            rule__UnionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:116:1: entryRuleUnionMember : ruleUnionMember EOF ;
    public final void entryRuleUnionMember() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:117:1: ( ruleUnionMember EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:118:1: ruleUnionMember EOF
            {
             before(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_ruleUnionMember_in_entryRuleUnionMember181);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionMember188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:125:1: ruleUnionMember : ( ( rule__UnionMember__Alternatives ) ) ;
    public final void ruleUnionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:129:2: ( ( ( rule__UnionMember__Alternatives ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:130:1: ( ( rule__UnionMember__Alternatives ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:130:1: ( ( rule__UnionMember__Alternatives ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:131:1: ( rule__UnionMember__Alternatives )
            {
             before(grammarAccess.getUnionMemberAccess().getAlternatives()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:132:1: ( rule__UnionMember__Alternatives )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:132:2: rule__UnionMember__Alternatives
            {
            pushFollow(FOLLOW_rule__UnionMember__Alternatives_in_ruleUnionMember214);
            rule__UnionMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:144:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:145:1: ( ruleJsonType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:146:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType241);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:153:1: ruleJsonType : ( ( rule__JsonType__Group__0 ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:157:2: ( ( ( rule__JsonType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:158:1: ( ( rule__JsonType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:158:1: ( ( rule__JsonType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:159:1: ( rule__JsonType__Group__0 )
            {
             before(grammarAccess.getJsonTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:160:1: ( rule__JsonType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:160:2: rule__JsonType__Group__0
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0_in_ruleJsonType274);
            rule__JsonType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:172:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:173:1: ( ruleRecordType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:174:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType301);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:181:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:185:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:186:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:186:1: ( ( rule__RecordType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:187:1: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:188:1: ( rule__RecordType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:188:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType334);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleFieldList"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:200:1: entryRuleFieldList : ruleFieldList EOF ;
    public final void entryRuleFieldList() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:201:1: ( ruleFieldList EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:202:1: ruleFieldList EOF
            {
             before(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_ruleFieldList_in_entryRuleFieldList361);
            ruleFieldList();

            state._fsp--;

             after(grammarAccess.getFieldListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldList368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldList"


    // $ANTLR start "ruleFieldList"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:209:1: ruleFieldList : ( ( rule__FieldList__Group__0 ) ) ;
    public final void ruleFieldList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:213:2: ( ( ( rule__FieldList__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__FieldList__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__FieldList__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:215:1: ( rule__FieldList__Group__0 )
            {
             before(grammarAccess.getFieldListAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:1: ( rule__FieldList__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:2: rule__FieldList__Group__0
            {
            pushFollow(FOLLOW_rule__FieldList__Group__0_in_ruleFieldList394);
            rule__FieldList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldList"


    // $ANTLR start "entryRuleField"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:228:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:229:1: ( ruleField EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:230:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField421);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:237:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:241:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__Field__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__Field__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:243:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:1: ( rule__Field__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField454);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:256:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:257:1: ( ruleEnumType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:258:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType481);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:265:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:269:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__EnumType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:271:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:1: ( rule__EnumType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType514);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:284:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:285:1: ( ruleArrayType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:286:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType541);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:293:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:297:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__ArrayType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:299:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:1: ( rule__ArrayType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType574);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:312:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:313:1: ( ruleMapType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:314:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType601);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:321:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:325:2: ( ( ( rule__MapType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__MapType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__MapType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:327:1: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:1: ( rule__MapType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_rule__MapType__Group__0_in_ruleMapType634);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:340:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:341:1: ( ruleFixedType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:342:1: ruleFixedType EOF
            {
             before(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType661);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFixedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:349:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:353:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__FixedType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__FixedType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:355:1: ( rule__FixedType__Group__0 )
            {
             before(grammarAccess.getFixedTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:1: ( rule__FixedType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:2: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0_in_ruleFixedType694);
            rule__FixedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:368:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:369:1: ( rulePrimitive EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:370:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive721);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:377:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:381:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Primitive__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:383:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:1: ( rule__Primitive__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive754);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:396:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:397:1: ( ruleNamespace EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:398:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace781);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:405:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:409:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:410:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:410:1: ( ( rule__Namespace__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:411:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:412:1: ( rule__Namespace__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:412:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace814);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "rule__AvroSchema__TypesAlternatives_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:424:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );
    public final void rule__AvroSchema__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:428:1: ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleJsonType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleJsonType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:430:1: ruleJsonType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0850);
                    ruleJsonType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:436:1: ruleRecordType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0867);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( ruleUnionType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( ruleUnionType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:442:1: ruleUnionType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0884);
                    ruleUnionType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroSchema__TypesAlternatives_0"


    // $ANTLR start "rule__UnionMember__Alternatives"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:452:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );
    public final void rule__UnionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:456:1: ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:457:1: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:457:1: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:458:1: ruleRecordType
                    {
                     before(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives916);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:463:6: ( ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:463:6: ( ruleArrayType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:464:1: ruleArrayType
                    {
                     before(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives933);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:469:6: ( rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:469:6: ( rulePrimitive )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:470:1: rulePrimitive
                    {
                     before(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives950);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:6: ( ruleMapType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:6: ( ruleMapType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:476:1: ruleMapType
                    {
                     before(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives967);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:481:6: ( ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:481:6: ( ruleEnumType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:482:1: ruleEnumType
                    {
                     before(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives984);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:487:6: ( ruleFixedType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:487:6: ( ruleFixedType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:488:1: ruleFixedType
                    {
                     before(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives1001);
                    ruleFixedType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:493:6: ( ( rule__UnionMember__Group_6__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:493:6: ( ( rule__UnionMember__Group_6__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:494:1: ( rule__UnionMember__Group_6__0 )
                    {
                     before(grammarAccess.getUnionMemberAccess().getGroup_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:495:1: ( rule__UnionMember__Group_6__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:495:2: rule__UnionMember__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__UnionMember__Group_6__0_in_rule__UnionMember__Alternatives1018);
                    rule__UnionMember__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnionMemberAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Alternatives"


    // $ANTLR start "rule__Field__NameAlternatives_6_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:504:1: rule__Field__NameAlternatives_6_0 : ( ( 'name' ) | ( RULE_ID ) );
    public final void rule__Field__NameAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:508:1: ( ( 'name' ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:509:1: ( 'name' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:509:1: ( 'name' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:510:1: 'name'
                    {
                     before(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__Field__NameAlternatives_6_01052); 
                     after(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( RULE_ID )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:518:1: RULE_ID
                    {
                     before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_01071); 
                     after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAlternatives_6_0"


    // $ANTLR start "rule__Field__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:528:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );
    public final void rule__Field__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:532:1: ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:533:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:533:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:534:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:2: rule__Field__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131103);
                    rule__Field__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:539:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:539:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:540:1: ( rule__Field__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:1: ( rule__Field__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:541:2: rule__Field__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131121);
                    rule__Field__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:545:6: ( ( rule__Field__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:545:6: ( ( rule__Field__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:546:1: ( rule__Field__Group_13_2__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:547:1: ( rule__Field__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:547:2: rule__Field__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131139);
                    rule__Field__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:551:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:551:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:552:1: ( rule__Field__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:553:1: ( rule__Field__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:553:2: rule__Field__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131157);
                    rule__Field__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:558:1: ( rule__Field__ArrayAssignment_13_4 )
                    {
                     before(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:1: ( rule__Field__ArrayAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:2: rule__Field__ArrayAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131175);
                    rule__Field__ArrayAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:564:1: ( rule__Field__MapAssignment_13_5 )
                    {
                     before(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:1: ( rule__Field__MapAssignment_13_5 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:2: rule__Field__MapAssignment_13_5
                    {
                    pushFollow(FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131193);
                    rule__Field__MapAssignment_13_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:570:1: ( rule__Field__FixedAssignment_13_6 )
                    {
                     before(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:1: ( rule__Field__FixedAssignment_13_6 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:2: rule__Field__FixedAssignment_13_6
                    {
                    pushFollow(FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131211);
                    rule__Field__FixedAssignment_13_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:575:6: ( ( rule__Field__UnionAssignment_13_7 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:576:1: ( rule__Field__UnionAssignment_13_7 )
                    {
                     before(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:1: ( rule__Field__UnionAssignment_13_7 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:577:2: rule__Field__UnionAssignment_13_7
                    {
                    pushFollow(FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131229);
                    rule__Field__UnionAssignment_13_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_13"


    // $ANTLR start "rule__ArrayType__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:586:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );
    public final void rule__ArrayType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:590:1: ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:592:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:2: rule__ArrayType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131262);
                    rule__ArrayType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:598:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:2: rule__ArrayType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131280);
                    rule__ArrayType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:604:1: ( rule__ArrayType__Group_13_2__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:1: ( rule__ArrayType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:2: rule__ArrayType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131298);
                    rule__ArrayType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:610:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:2: rule__ArrayType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131316);
                    rule__ArrayType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Alternatives_13"


    // $ANTLR start "rule__MapType__Alternatives_13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:620:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );
    public final void rule__MapType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:624:1: ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:625:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:625:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:626:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:627:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:627:2: rule__MapType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131349);
                    rule__MapType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:631:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:631:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:632:1: ( rule__MapType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:633:1: ( rule__MapType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:633:2: rule__MapType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131367);
                    rule__MapType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:637:6: ( ( rule__MapType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:637:6: ( ( rule__MapType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:638:1: ( rule__MapType__Group_13_2__0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:639:1: ( rule__MapType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:639:2: rule__MapType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131385);
                    rule__MapType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:643:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:643:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:644:1: ( rule__MapType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:645:1: ( rule__MapType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:645:2: rule__MapType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131403);
                    rule__MapType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:649:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:649:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:650:1: ( rule__MapType__AtypeAssignment_13_4 )
                    {
                     before(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:651:1: ( rule__MapType__AtypeAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:651:2: rule__MapType__AtypeAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131421);
                    rule__MapType__AtypeAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Alternatives_13"


    // $ANTLR start "rule__Primitive__TypeAlternatives_1_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:660:1: rule__Primitive__TypeAlternatives_1_0 : ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__Primitive__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:664:1: ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:665:1: ( 'null' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:665:1: ( 'null' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:666:1: 'null'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01455); 
                     after(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:673:6: ( 'boolean' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:673:6: ( 'boolean' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:674:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01475); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:681:6: ( 'int' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:681:6: ( 'int' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:682:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01495); 
                     after(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:689:6: ( 'long' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:689:6: ( 'long' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:690:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01515); 
                     after(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:697:6: ( 'float' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:697:6: ( 'float' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:698:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01535); 
                     after(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:705:6: ( 'double' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:705:6: ( 'double' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:706:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01555); 
                     after(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:713:6: ( 'bytes' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:713:6: ( 'bytes' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:714:1: 'bytes'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01575); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:721:6: ( 'string' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:721:6: ( 'string' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:722:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 
                    match(input,18,FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01595); 
                     after(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__TypeAlternatives_1_0"


    // $ANTLR start "rule__UnionType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:736:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:740:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:741:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01627);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01630);
            rule__UnionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__0"


    // $ANTLR start "rule__UnionType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:748:1: rule__UnionType__Group__0__Impl : ( '[' ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:752:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:753:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:753:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:754:1: '['
            {
             before(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__UnionType__Group__0__Impl1658); 
             after(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__0__Impl"


    // $ANTLR start "rule__UnionType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:767:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl rule__UnionType__Group__2 ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:771:1: ( rule__UnionType__Group__1__Impl rule__UnionType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:772:2: rule__UnionType__Group__1__Impl rule__UnionType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11689);
            rule__UnionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11692);
            rule__UnionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__1"


    // $ANTLR start "rule__UnionType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:779:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__TypesAssignment_1 ) ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:783:1: ( ( ( rule__UnionType__TypesAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:784:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:784:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:785:1: ( rule__UnionType__TypesAssignment_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:786:1: ( rule__UnionType__TypesAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:786:2: rule__UnionType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1719);
            rule__UnionType__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__1__Impl"


    // $ANTLR start "rule__UnionType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:796:1: rule__UnionType__Group__2 : rule__UnionType__Group__2__Impl rule__UnionType__Group__3 ;
    public final void rule__UnionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:800:1: ( rule__UnionType__Group__2__Impl rule__UnionType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:801:2: rule__UnionType__Group__2__Impl rule__UnionType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21749);
            rule__UnionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21752);
            rule__UnionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__2"


    // $ANTLR start "rule__UnionType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:808:1: rule__UnionType__Group__2__Impl : ( ( rule__UnionType__Group_2__0 )* ) ;
    public final void rule__UnionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:812:1: ( ( ( rule__UnionType__Group_2__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:813:1: ( ( rule__UnionType__Group_2__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:813:1: ( ( rule__UnionType__Group_2__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:814:1: ( rule__UnionType__Group_2__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:815:1: ( rule__UnionType__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:815:2: rule__UnionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1779);
            	    rule__UnionType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUnionTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__2__Impl"


    // $ANTLR start "rule__UnionType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:825:1: rule__UnionType__Group__3 : rule__UnionType__Group__3__Impl ;
    public final void rule__UnionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:829:1: ( rule__UnionType__Group__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:830:2: rule__UnionType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31810);
            rule__UnionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__3"


    // $ANTLR start "rule__UnionType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:836:1: rule__UnionType__Group__3__Impl : ( ']' ) ;
    public final void rule__UnionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:840:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:841:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:841:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:842:1: ']'
            {
             before(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__UnionType__Group__3__Impl1838); 
             after(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group__3__Impl"


    // $ANTLR start "rule__UnionType__Group_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:863:1: rule__UnionType__Group_2__0 : rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 ;
    public final void rule__UnionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:867:1: ( rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:868:2: rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01877);
            rule__UnionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01880);
            rule__UnionType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__0"


    // $ANTLR start "rule__UnionType__Group_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:875:1: rule__UnionType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:879:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:880:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:880:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:881:1: ','
            {
             before(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1908); 
             after(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__0__Impl"


    // $ANTLR start "rule__UnionType__Group_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:894:1: rule__UnionType__Group_2__1 : rule__UnionType__Group_2__1__Impl ;
    public final void rule__UnionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:898:1: ( rule__UnionType__Group_2__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:899:2: rule__UnionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11939);
            rule__UnionType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__1"


    // $ANTLR start "rule__UnionType__Group_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:905:1: rule__UnionType__Group_2__1__Impl : ( ( rule__UnionType__TypesAssignment_2_1 ) ) ;
    public final void rule__UnionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:909:1: ( ( ( rule__UnionType__TypesAssignment_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:910:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:910:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:911:1: ( rule__UnionType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:912:1: ( rule__UnionType__TypesAssignment_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:912:2: rule__UnionType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1966);
            rule__UnionType__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__Group_2__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:926:1: rule__UnionMember__Group_6__0 : rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 ;
    public final void rule__UnionMember__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:930:1: ( rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:931:2: rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__0__Impl_in_rule__UnionMember__Group_6__02000);
            rule__UnionMember__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionMember__Group_6__1_in_rule__UnionMember__Group_6__02003);
            rule__UnionMember__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__0"


    // $ANTLR start "rule__UnionMember__Group_6__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:938:1: rule__UnionMember__Group_6__0__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:942:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:943:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:943:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:944:1: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__UnionMember__Group_6__0__Impl2031); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__0__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:957:1: rule__UnionMember__Group_6__1 : rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 ;
    public final void rule__UnionMember__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:961:1: ( rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:962:2: rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__1__Impl_in_rule__UnionMember__Group_6__12062);
            rule__UnionMember__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionMember__Group_6__2_in_rule__UnionMember__Group_6__12065);
            rule__UnionMember__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__1"


    // $ANTLR start "rule__UnionMember__Group_6__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:969:1: rule__UnionMember__Group_6__1__Impl : ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) ;
    public final void rule__UnionMember__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:973:1: ( ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:974:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:974:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:975:1: ( rule__UnionMember__RecordRefAssignment_6_1 )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:976:1: ( rule__UnionMember__RecordRefAssignment_6_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:976:2: rule__UnionMember__RecordRefAssignment_6_1
            {
            pushFollow(FOLLOW_rule__UnionMember__RecordRefAssignment_6_1_in_rule__UnionMember__Group_6__1__Impl2092);
            rule__UnionMember__RecordRefAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:986:1: rule__UnionMember__Group_6__2 : rule__UnionMember__Group_6__2__Impl ;
    public final void rule__UnionMember__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:990:1: ( rule__UnionMember__Group_6__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:991:2: rule__UnionMember__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__UnionMember__Group_6__2__Impl_in_rule__UnionMember__Group_6__22122);
            rule__UnionMember__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__2"


    // $ANTLR start "rule__UnionMember__Group_6__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:997:1: rule__UnionMember__Group_6__2__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1001:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1002:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1002:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1003:1: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 
            match(input,22,FOLLOW_22_in_rule__UnionMember__Group_6__2__Impl2150); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__Group_6__2__Impl"


    // $ANTLR start "rule__JsonType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1022:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1026:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1027:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__02187);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__02190);
            rule__JsonType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0"


    // $ANTLR start "rule__JsonType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1034:1: rule__JsonType__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1038:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1039:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1039:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1040:1: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__0__Impl2218); 
             after(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0__Impl"


    // $ANTLR start "rule__JsonType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1053:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1057:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1058:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__12249);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__12252);
            rule__JsonType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1"


    // $ANTLR start "rule__JsonType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1065:1: rule__JsonType__Group__1__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1069:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1070:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1070:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1071:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__1__Impl2280); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1__Impl"


    // $ANTLR start "rule__JsonType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1084:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl rule__JsonType__Group__3 ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1088:1: ( rule__JsonType__Group__2__Impl rule__JsonType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1089:2: rule__JsonType__Group__2__Impl rule__JsonType__Group__3
            {
            pushFollow(FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22311);
            rule__JsonType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22314);
            rule__JsonType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2"


    // $ANTLR start "rule__JsonType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1096:1: rule__JsonType__Group__2__Impl : ( 'type' ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1100:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1101:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1101:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1102:1: 'type'
            {
             before(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__JsonType__Group__2__Impl2342); 
             after(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2__Impl"


    // $ANTLR start "rule__JsonType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1115:1: rule__JsonType__Group__3 : rule__JsonType__Group__3__Impl rule__JsonType__Group__4 ;
    public final void rule__JsonType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1119:1: ( rule__JsonType__Group__3__Impl rule__JsonType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1120:2: rule__JsonType__Group__3__Impl rule__JsonType__Group__4
            {
            pushFollow(FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32373);
            rule__JsonType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32376);
            rule__JsonType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__3"


    // $ANTLR start "rule__JsonType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1127:1: rule__JsonType__Group__3__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1131:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1132:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1132:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1133:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__3__Impl2404); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__3__Impl"


    // $ANTLR start "rule__JsonType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1146:1: rule__JsonType__Group__4 : rule__JsonType__Group__4__Impl rule__JsonType__Group__5 ;
    public final void rule__JsonType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1150:1: ( rule__JsonType__Group__4__Impl rule__JsonType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1151:2: rule__JsonType__Group__4__Impl rule__JsonType__Group__5
            {
            pushFollow(FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42435);
            rule__JsonType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42438);
            rule__JsonType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__4"


    // $ANTLR start "rule__JsonType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1158:1: rule__JsonType__Group__4__Impl : ( ':' ) ;
    public final void rule__JsonType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1162:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1163:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1163:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1164:1: ':'
            {
             before(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__JsonType__Group__4__Impl2466); 
             after(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__4__Impl"


    // $ANTLR start "rule__JsonType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1177:1: rule__JsonType__Group__5 : rule__JsonType__Group__5__Impl rule__JsonType__Group__6 ;
    public final void rule__JsonType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1181:1: ( rule__JsonType__Group__5__Impl rule__JsonType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1182:2: rule__JsonType__Group__5__Impl rule__JsonType__Group__6
            {
            pushFollow(FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52497);
            rule__JsonType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52500);
            rule__JsonType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__5"


    // $ANTLR start "rule__JsonType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1189:1: rule__JsonType__Group__5__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1193:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1194:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1194:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1195:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__5__Impl2528); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__5__Impl"


    // $ANTLR start "rule__JsonType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1208:1: rule__JsonType__Group__6 : rule__JsonType__Group__6__Impl rule__JsonType__Group__7 ;
    public final void rule__JsonType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1212:1: ( rule__JsonType__Group__6__Impl rule__JsonType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1213:2: rule__JsonType__Group__6__Impl rule__JsonType__Group__7
            {
            pushFollow(FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62559);
            rule__JsonType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62562);
            rule__JsonType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__6"


    // $ANTLR start "rule__JsonType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1220:1: rule__JsonType__Group__6__Impl : ( ( rule__JsonType__TypeAssignment_6 ) ) ;
    public final void rule__JsonType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1224:1: ( ( ( rule__JsonType__TypeAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1225:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1225:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1226:1: ( rule__JsonType__TypeAssignment_6 )
            {
             before(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1227:1: ( rule__JsonType__TypeAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1227:2: rule__JsonType__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2589);
            rule__JsonType__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__6__Impl"


    // $ANTLR start "rule__JsonType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1237:1: rule__JsonType__Group__7 : rule__JsonType__Group__7__Impl rule__JsonType__Group__8 ;
    public final void rule__JsonType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1241:1: ( rule__JsonType__Group__7__Impl rule__JsonType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1242:2: rule__JsonType__Group__7__Impl rule__JsonType__Group__8
            {
            pushFollow(FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72619);
            rule__JsonType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72622);
            rule__JsonType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__7"


    // $ANTLR start "rule__JsonType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1249:1: rule__JsonType__Group__7__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1253:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1254:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1254:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1255:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__7__Impl2650); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__7__Impl"


    // $ANTLR start "rule__JsonType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1268:1: rule__JsonType__Group__8 : rule__JsonType__Group__8__Impl ;
    public final void rule__JsonType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1272:1: ( rule__JsonType__Group__8__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1273:2: rule__JsonType__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82681);
            rule__JsonType__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__8"


    // $ANTLR start "rule__JsonType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1279:1: rule__JsonType__Group__8__Impl : ( '}' ) ;
    public final void rule__JsonType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1283:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1284:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1284:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1285:1: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__JsonType__Group__8__Impl2709); 
             after(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1316:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1320:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1321:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02758);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02761);
            rule__RecordType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1328:1: rule__RecordType__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1332:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1333:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1333:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1334:1: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__0__Impl2789); 
             after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1347:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1351:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1352:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12820);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12823);
            rule__RecordType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1359:1: rule__RecordType__Group__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1363:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1364:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1364:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1365:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__1__Impl2851); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1378:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1382:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1383:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22882);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22885);
            rule__RecordType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1390:1: rule__RecordType__Group__2__Impl : ( 'type' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1394:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1395:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1395:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1396:1: 'type'
            {
             before(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__2__Impl2913); 
             after(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1409:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1413:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1414:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32944);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32947);
            rule__RecordType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1421:1: rule__RecordType__Group__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1425:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1426:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1426:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1427:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__3__Impl2975); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1440:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1444:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1445:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43006);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43009);
            rule__RecordType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1452:1: rule__RecordType__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1456:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1457:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1457:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1458:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__4__Impl3037); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1471:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1475:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1476:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53068);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53071);
            rule__RecordType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5"


    // $ANTLR start "rule__RecordType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1483:1: rule__RecordType__Group__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1487:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1488:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1488:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1489:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__5__Impl3099); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5__Impl"


    // $ANTLR start "rule__RecordType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1502:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1506:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1507:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63130);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63133);
            rule__RecordType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6"


    // $ANTLR start "rule__RecordType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1514:1: rule__RecordType__Group__6__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1518:1: ( ( 'record' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1519:1: ( 'record' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1519:1: ( 'record' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1520:1: 'record'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__RecordType__Group__6__Impl3161); 
             after(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6__Impl"


    // $ANTLR start "rule__RecordType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1533:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1537:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1538:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73192);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__73195);
            rule__RecordType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7"


    // $ANTLR start "rule__RecordType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1545:1: rule__RecordType__Group__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1549:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1550:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1550:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1551:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__7__Impl3223); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7__Impl"


    // $ANTLR start "rule__RecordType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1564:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1568:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1569:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__83254);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__83257);
            rule__RecordType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8"


    // $ANTLR start "rule__RecordType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1576:1: rule__RecordType__Group__8__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1580:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1581:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1581:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1582:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__8__Impl3285); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1595:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl rule__RecordType__Group__10 ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1599:1: ( rule__RecordType__Group__9__Impl rule__RecordType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1600:2: rule__RecordType__Group__9__Impl rule__RecordType__Group__10
            {
            pushFollow(FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93316);
            rule__RecordType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93319);
            rule__RecordType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9"


    // $ANTLR start "rule__RecordType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1607:1: rule__RecordType__Group__9__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1611:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1612:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1612:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1613:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__9__Impl3347); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9__Impl"


    // $ANTLR start "rule__RecordType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1626:1: rule__RecordType__Group__10 : rule__RecordType__Group__10__Impl rule__RecordType__Group__11 ;
    public final void rule__RecordType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1630:1: ( rule__RecordType__Group__10__Impl rule__RecordType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1631:2: rule__RecordType__Group__10__Impl rule__RecordType__Group__11
            {
            pushFollow(FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103378);
            rule__RecordType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103381);
            rule__RecordType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__10"


    // $ANTLR start "rule__RecordType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1638:1: rule__RecordType__Group__10__Impl : ( 'name' ) ;
    public final void rule__RecordType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1642:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1643:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1643:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1644:1: 'name'
            {
             before(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__RecordType__Group__10__Impl3409); 
             after(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__10__Impl"


    // $ANTLR start "rule__RecordType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1657:1: rule__RecordType__Group__11 : rule__RecordType__Group__11__Impl rule__RecordType__Group__12 ;
    public final void rule__RecordType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1661:1: ( rule__RecordType__Group__11__Impl rule__RecordType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1662:2: rule__RecordType__Group__11__Impl rule__RecordType__Group__12
            {
            pushFollow(FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113440);
            rule__RecordType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113443);
            rule__RecordType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__11"


    // $ANTLR start "rule__RecordType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1669:1: rule__RecordType__Group__11__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1673:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1674:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1674:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1675:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__11__Impl3471); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__11__Impl"


    // $ANTLR start "rule__RecordType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1688:1: rule__RecordType__Group__12 : rule__RecordType__Group__12__Impl rule__RecordType__Group__13 ;
    public final void rule__RecordType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1692:1: ( rule__RecordType__Group__12__Impl rule__RecordType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1693:2: rule__RecordType__Group__12__Impl rule__RecordType__Group__13
            {
            pushFollow(FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123502);
            rule__RecordType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123505);
            rule__RecordType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__12"


    // $ANTLR start "rule__RecordType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1700:1: rule__RecordType__Group__12__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1704:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1705:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1705:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1706:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__12__Impl3533); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__12__Impl"


    // $ANTLR start "rule__RecordType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1719:1: rule__RecordType__Group__13 : rule__RecordType__Group__13__Impl rule__RecordType__Group__14 ;
    public final void rule__RecordType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1723:1: ( rule__RecordType__Group__13__Impl rule__RecordType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1724:2: rule__RecordType__Group__13__Impl rule__RecordType__Group__14
            {
            pushFollow(FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133564);
            rule__RecordType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133567);
            rule__RecordType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__13"


    // $ANTLR start "rule__RecordType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1731:1: rule__RecordType__Group__13__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1735:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1736:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1736:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1737:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__13__Impl3595); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__13__Impl"


    // $ANTLR start "rule__RecordType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1750:1: rule__RecordType__Group__14 : rule__RecordType__Group__14__Impl rule__RecordType__Group__15 ;
    public final void rule__RecordType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1754:1: ( rule__RecordType__Group__14__Impl rule__RecordType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1755:2: rule__RecordType__Group__14__Impl rule__RecordType__Group__15
            {
            pushFollow(FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143626);
            rule__RecordType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143629);
            rule__RecordType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__14"


    // $ANTLR start "rule__RecordType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1762:1: rule__RecordType__Group__14__Impl : ( ( rule__RecordType__NameAssignment_14 ) ) ;
    public final void rule__RecordType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1766:1: ( ( ( rule__RecordType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1767:1: ( ( rule__RecordType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1767:1: ( ( rule__RecordType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1768:1: ( rule__RecordType__NameAssignment_14 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1769:1: ( rule__RecordType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1769:2: rule__RecordType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3656);
            rule__RecordType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__14__Impl"


    // $ANTLR start "rule__RecordType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1779:1: rule__RecordType__Group__15 : rule__RecordType__Group__15__Impl rule__RecordType__Group__16 ;
    public final void rule__RecordType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1783:1: ( rule__RecordType__Group__15__Impl rule__RecordType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1784:2: rule__RecordType__Group__15__Impl rule__RecordType__Group__16
            {
            pushFollow(FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153686);
            rule__RecordType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153689);
            rule__RecordType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__15"


    // $ANTLR start "rule__RecordType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1791:1: rule__RecordType__Group__15__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1795:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1796:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1796:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1797:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__15__Impl3717); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__15__Impl"


    // $ANTLR start "rule__RecordType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1810:1: rule__RecordType__Group__16 : rule__RecordType__Group__16__Impl rule__RecordType__Group__17 ;
    public final void rule__RecordType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1814:1: ( rule__RecordType__Group__16__Impl rule__RecordType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1815:2: rule__RecordType__Group__16__Impl rule__RecordType__Group__17
            {
            pushFollow(FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163748);
            rule__RecordType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163751);
            rule__RecordType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__16"


    // $ANTLR start "rule__RecordType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1822:1: rule__RecordType__Group__16__Impl : ( ( rule__RecordType__Group_16__0 )? ) ;
    public final void rule__RecordType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1826:1: ( ( ( rule__RecordType__Group_16__0 )? ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1827:1: ( ( rule__RecordType__Group_16__0 )? )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1827:1: ( ( rule__RecordType__Group_16__0 )? )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1828:1: ( rule__RecordType__Group_16__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_16()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1829:1: ( rule__RecordType__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1829:2: rule__RecordType__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3778);
                    rule__RecordType__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordTypeAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__16__Impl"


    // $ANTLR start "rule__RecordType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1839:1: rule__RecordType__Group__17 : rule__RecordType__Group__17__Impl rule__RecordType__Group__18 ;
    public final void rule__RecordType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1843:1: ( rule__RecordType__Group__17__Impl rule__RecordType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1844:2: rule__RecordType__Group__17__Impl rule__RecordType__Group__18
            {
            pushFollow(FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173809);
            rule__RecordType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173812);
            rule__RecordType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__17"


    // $ANTLR start "rule__RecordType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1851:1: rule__RecordType__Group__17__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1855:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1856:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1856:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1857:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__17__Impl3840); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__17__Impl"


    // $ANTLR start "rule__RecordType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1870:1: rule__RecordType__Group__18 : rule__RecordType__Group__18__Impl rule__RecordType__Group__19 ;
    public final void rule__RecordType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1874:1: ( rule__RecordType__Group__18__Impl rule__RecordType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1875:2: rule__RecordType__Group__18__Impl rule__RecordType__Group__19
            {
            pushFollow(FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183871);
            rule__RecordType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183874);
            rule__RecordType__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__18"


    // $ANTLR start "rule__RecordType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1882:1: rule__RecordType__Group__18__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1886:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1887:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1887:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1888:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__18__Impl3902); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__18__Impl"


    // $ANTLR start "rule__RecordType__Group__19"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1901:1: rule__RecordType__Group__19 : rule__RecordType__Group__19__Impl rule__RecordType__Group__20 ;
    public final void rule__RecordType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1905:1: ( rule__RecordType__Group__19__Impl rule__RecordType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1906:2: rule__RecordType__Group__19__Impl rule__RecordType__Group__20
            {
            pushFollow(FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193933);
            rule__RecordType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193936);
            rule__RecordType__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__19"


    // $ANTLR start "rule__RecordType__Group__19__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1913:1: rule__RecordType__Group__19__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1917:1: ( ( 'fields' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1918:1: ( 'fields' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1918:1: ( 'fields' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1919:1: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 
            match(input,28,FOLLOW_28_in_rule__RecordType__Group__19__Impl3964); 
             after(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__19__Impl"


    // $ANTLR start "rule__RecordType__Group__20"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1932:1: rule__RecordType__Group__20 : rule__RecordType__Group__20__Impl rule__RecordType__Group__21 ;
    public final void rule__RecordType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1936:1: ( rule__RecordType__Group__20__Impl rule__RecordType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1937:2: rule__RecordType__Group__20__Impl rule__RecordType__Group__21
            {
            pushFollow(FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203995);
            rule__RecordType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203998);
            rule__RecordType__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__20"


    // $ANTLR start "rule__RecordType__Group__20__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1944:1: rule__RecordType__Group__20__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1948:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1949:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1949:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1950:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__20__Impl4026); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__20__Impl"


    // $ANTLR start "rule__RecordType__Group__21"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1963:1: rule__RecordType__Group__21 : rule__RecordType__Group__21__Impl rule__RecordType__Group__22 ;
    public final void rule__RecordType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1967:1: ( rule__RecordType__Group__21__Impl rule__RecordType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1968:2: rule__RecordType__Group__21__Impl rule__RecordType__Group__22
            {
            pushFollow(FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__214057);
            rule__RecordType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__214060);
            rule__RecordType__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__21"


    // $ANTLR start "rule__RecordType__Group__21__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1975:1: rule__RecordType__Group__21__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1979:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1980:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1980:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1981:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__21__Impl4088); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__21__Impl"


    // $ANTLR start "rule__RecordType__Group__22"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1994:1: rule__RecordType__Group__22 : rule__RecordType__Group__22__Impl rule__RecordType__Group__23 ;
    public final void rule__RecordType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1998:1: ( rule__RecordType__Group__22__Impl rule__RecordType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1999:2: rule__RecordType__Group__22__Impl rule__RecordType__Group__23
            {
            pushFollow(FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__224119);
            rule__RecordType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__224122);
            rule__RecordType__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__22"


    // $ANTLR start "rule__RecordType__Group__22__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2006:1: rule__RecordType__Group__22__Impl : ( '[' ) ;
    public final void rule__RecordType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2010:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2011:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2011:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2012:1: '['
            {
             before(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 
            match(input,19,FOLLOW_19_in_rule__RecordType__Group__22__Impl4150); 
             after(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__22__Impl"


    // $ANTLR start "rule__RecordType__Group__23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2025:1: rule__RecordType__Group__23 : rule__RecordType__Group__23__Impl rule__RecordType__Group__24 ;
    public final void rule__RecordType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2029:1: ( rule__RecordType__Group__23__Impl rule__RecordType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2030:2: rule__RecordType__Group__23__Impl rule__RecordType__Group__24
            {
            pushFollow(FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__234181);
            rule__RecordType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__234184);
            rule__RecordType__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__23"


    // $ANTLR start "rule__RecordType__Group__23__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2037:1: rule__RecordType__Group__23__Impl : ( ( rule__RecordType__FieldListAssignment_23 ) ) ;
    public final void rule__RecordType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2041:1: ( ( ( rule__RecordType__FieldListAssignment_23 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2042:1: ( ( rule__RecordType__FieldListAssignment_23 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2042:1: ( ( rule__RecordType__FieldListAssignment_23 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2043:1: ( rule__RecordType__FieldListAssignment_23 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldListAssignment_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2044:1: ( rule__RecordType__FieldListAssignment_23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2044:2: rule__RecordType__FieldListAssignment_23
            {
            pushFollow(FOLLOW_rule__RecordType__FieldListAssignment_23_in_rule__RecordType__Group__23__Impl4211);
            rule__RecordType__FieldListAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldListAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__23__Impl"


    // $ANTLR start "rule__RecordType__Group__24"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2054:1: rule__RecordType__Group__24 : rule__RecordType__Group__24__Impl rule__RecordType__Group__25 ;
    public final void rule__RecordType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2058:1: ( rule__RecordType__Group__24__Impl rule__RecordType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2059:2: rule__RecordType__Group__24__Impl rule__RecordType__Group__25
            {
            pushFollow(FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__244241);
            rule__RecordType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__244244);
            rule__RecordType__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__24"


    // $ANTLR start "rule__RecordType__Group__24__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2066:1: rule__RecordType__Group__24__Impl : ( ']' ) ;
    public final void rule__RecordType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2070:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2071:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2071:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2072:1: ']'
            {
             before(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_20_in_rule__RecordType__Group__24__Impl4272); 
             after(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__24__Impl"


    // $ANTLR start "rule__RecordType__Group__25"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2085:1: rule__RecordType__Group__25 : rule__RecordType__Group__25__Impl ;
    public final void rule__RecordType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2089:1: ( rule__RecordType__Group__25__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2090:2: rule__RecordType__Group__25__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254303);
            rule__RecordType__Group__25__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__25"


    // $ANTLR start "rule__RecordType__Group__25__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2096:1: rule__RecordType__Group__25__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2100:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2101:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2101:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2102:1: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_26_in_rule__RecordType__Group__25__Impl4331); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__25__Impl"


    // $ANTLR start "rule__RecordType__Group_16__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2167:1: rule__RecordType__Group_16__0 : rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 ;
    public final void rule__RecordType__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2171:1: ( rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2172:2: rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04414);
            rule__RecordType__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04417);
            rule__RecordType__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__0"


    // $ANTLR start "rule__RecordType__Group_16__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2179:1: rule__RecordType__Group_16__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2183:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2184:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2184:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2185:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4445); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__0__Impl"


    // $ANTLR start "rule__RecordType__Group_16__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2198:1: rule__RecordType__Group_16__1 : rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 ;
    public final void rule__RecordType__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2202:1: ( rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2203:2: rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14476);
            rule__RecordType__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14479);
            rule__RecordType__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__1"


    // $ANTLR start "rule__RecordType__Group_16__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2210:1: rule__RecordType__Group_16__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2214:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2215:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2215:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2216:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__1__Impl4507); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__1__Impl"


    // $ANTLR start "rule__RecordType__Group_16__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2229:1: rule__RecordType__Group_16__2 : rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 ;
    public final void rule__RecordType__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2233:1: ( rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2234:2: rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24538);
            rule__RecordType__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24541);
            rule__RecordType__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__2"


    // $ANTLR start "rule__RecordType__Group_16__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2241:1: rule__RecordType__Group_16__2__Impl : ( 'namespace' ) ;
    public final void rule__RecordType__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2245:1: ( ( 'namespace' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2246:1: ( 'namespace' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2246:1: ( 'namespace' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2247:1: 'namespace'
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 
            match(input,29,FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4569); 
             after(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__2__Impl"


    // $ANTLR start "rule__RecordType__Group_16__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2260:1: rule__RecordType__Group_16__3 : rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 ;
    public final void rule__RecordType__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2264:1: ( rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2265:2: rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34600);
            rule__RecordType__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34603);
            rule__RecordType__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__3"


    // $ANTLR start "rule__RecordType__Group_16__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2272:1: rule__RecordType__Group_16__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2276:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2277:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2277:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2278:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__3__Impl4631); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__3__Impl"


    // $ANTLR start "rule__RecordType__Group_16__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2291:1: rule__RecordType__Group_16__4 : rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 ;
    public final void rule__RecordType__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2295:1: ( rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2296:2: rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44662);
            rule__RecordType__Group_16__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44665);
            rule__RecordType__Group_16__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__4"


    // $ANTLR start "rule__RecordType__Group_16__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2303:1: rule__RecordType__Group_16__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2307:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2308:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2308:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2309:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4693); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__4__Impl"


    // $ANTLR start "rule__RecordType__Group_16__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2322:1: rule__RecordType__Group_16__5 : rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 ;
    public final void rule__RecordType__Group_16__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2326:1: ( rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2327:2: rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54724);
            rule__RecordType__Group_16__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54727);
            rule__RecordType__Group_16__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__5"


    // $ANTLR start "rule__RecordType__Group_16__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2334:1: rule__RecordType__Group_16__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2338:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2339:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2339:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2340:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__5__Impl4755); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__5__Impl"


    // $ANTLR start "rule__RecordType__Group_16__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2353:1: rule__RecordType__Group_16__6 : rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 ;
    public final void rule__RecordType__Group_16__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2357:1: ( rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2358:2: rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64786);
            rule__RecordType__Group_16__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64789);
            rule__RecordType__Group_16__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__6"


    // $ANTLR start "rule__RecordType__Group_16__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2365:1: rule__RecordType__Group_16__6__Impl : ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) ;
    public final void rule__RecordType__Group_16__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2369:1: ( ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2370:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2370:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2371:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2372:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2372:2: rule__RecordType__NamespaceAssignment_16_6
            {
            pushFollow(FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4816);
            rule__RecordType__NamespaceAssignment_16_6();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__6__Impl"


    // $ANTLR start "rule__RecordType__Group_16__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2382:1: rule__RecordType__Group_16__7 : rule__RecordType__Group_16__7__Impl ;
    public final void rule__RecordType__Group_16__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2386:1: ( rule__RecordType__Group_16__7__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2387:2: rule__RecordType__Group_16__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74846);
            rule__RecordType__Group_16__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__7"


    // $ANTLR start "rule__RecordType__Group_16__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2393:1: rule__RecordType__Group_16__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2397:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2398:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2398:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2399:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_16__7__Impl4874); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_16__7__Impl"


    // $ANTLR start "rule__FieldList__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2428:1: rule__FieldList__Group__0 : rule__FieldList__Group__0__Impl rule__FieldList__Group__1 ;
    public final void rule__FieldList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2432:1: ( rule__FieldList__Group__0__Impl rule__FieldList__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2433:2: rule__FieldList__Group__0__Impl rule__FieldList__Group__1
            {
            pushFollow(FOLLOW_rule__FieldList__Group__0__Impl_in_rule__FieldList__Group__04921);
            rule__FieldList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldList__Group__1_in_rule__FieldList__Group__04924);
            rule__FieldList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group__0"


    // $ANTLR start "rule__FieldList__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2440:1: rule__FieldList__Group__0__Impl : ( ( rule__FieldList__FieldsAssignment_0 ) ) ;
    public final void rule__FieldList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2444:1: ( ( ( rule__FieldList__FieldsAssignment_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2445:1: ( ( rule__FieldList__FieldsAssignment_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2445:1: ( ( rule__FieldList__FieldsAssignment_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2446:1: ( rule__FieldList__FieldsAssignment_0 )
            {
             before(grammarAccess.getFieldListAccess().getFieldsAssignment_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2447:1: ( rule__FieldList__FieldsAssignment_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2447:2: rule__FieldList__FieldsAssignment_0
            {
            pushFollow(FOLLOW_rule__FieldList__FieldsAssignment_0_in_rule__FieldList__Group__0__Impl4951);
            rule__FieldList__FieldsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getFieldsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group__0__Impl"


    // $ANTLR start "rule__FieldList__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2457:1: rule__FieldList__Group__1 : rule__FieldList__Group__1__Impl ;
    public final void rule__FieldList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2461:1: ( rule__FieldList__Group__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2462:2: rule__FieldList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldList__Group__1__Impl_in_rule__FieldList__Group__14981);
            rule__FieldList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group__1"


    // $ANTLR start "rule__FieldList__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2468:1: rule__FieldList__Group__1__Impl : ( ( rule__FieldList__Group_1__0 )* ) ;
    public final void rule__FieldList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2472:1: ( ( ( rule__FieldList__Group_1__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2473:1: ( ( rule__FieldList__Group_1__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2473:1: ( ( rule__FieldList__Group_1__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2474:1: ( rule__FieldList__Group_1__0 )*
            {
             before(grammarAccess.getFieldListAccess().getGroup_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2475:1: ( rule__FieldList__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2475:2: rule__FieldList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldList__Group_1__0_in_rule__FieldList__Group__1__Impl5008);
            	    rule__FieldList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFieldListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group__1__Impl"


    // $ANTLR start "rule__FieldList__Group_1__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2489:1: rule__FieldList__Group_1__0 : rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1 ;
    public final void rule__FieldList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2493:1: ( rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2494:2: rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1
            {
            pushFollow(FOLLOW_rule__FieldList__Group_1__0__Impl_in_rule__FieldList__Group_1__05043);
            rule__FieldList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldList__Group_1__1_in_rule__FieldList__Group_1__05046);
            rule__FieldList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group_1__0"


    // $ANTLR start "rule__FieldList__Group_1__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2501:1: rule__FieldList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FieldList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2505:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2506:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2506:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2507:1: ','
            {
             before(grammarAccess.getFieldListAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__FieldList__Group_1__0__Impl5074); 
             after(grammarAccess.getFieldListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group_1__0__Impl"


    // $ANTLR start "rule__FieldList__Group_1__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2520:1: rule__FieldList__Group_1__1 : rule__FieldList__Group_1__1__Impl ;
    public final void rule__FieldList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2524:1: ( rule__FieldList__Group_1__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2525:2: rule__FieldList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldList__Group_1__1__Impl_in_rule__FieldList__Group_1__15105);
            rule__FieldList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group_1__1"


    // $ANTLR start "rule__FieldList__Group_1__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2531:1: rule__FieldList__Group_1__1__Impl : ( ( rule__FieldList__FieldsAssignment_1_1 ) ) ;
    public final void rule__FieldList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2535:1: ( ( ( rule__FieldList__FieldsAssignment_1_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2536:1: ( ( rule__FieldList__FieldsAssignment_1_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2536:1: ( ( rule__FieldList__FieldsAssignment_1_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2537:1: ( rule__FieldList__FieldsAssignment_1_1 )
            {
             before(grammarAccess.getFieldListAccess().getFieldsAssignment_1_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2538:1: ( rule__FieldList__FieldsAssignment_1_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2538:2: rule__FieldList__FieldsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FieldList__FieldsAssignment_1_1_in_rule__FieldList__Group_1__1__Impl5132);
            rule__FieldList__FieldsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getFieldsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__Group_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2552:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2556:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2557:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05166);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05169);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2564:1: rule__Field__Group__0__Impl : ( '{' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2568:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2569:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2569:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2570:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__0__Impl5197); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2583:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2587:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2588:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15228);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15231);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2595:1: rule__Field__Group__1__Impl : ( '\"' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2599:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2600:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2600:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2601:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__1__Impl5259); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2614:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2618:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2619:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25290);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25293);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2626:1: rule__Field__Group__2__Impl : ( 'name' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2630:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2631:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2631:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2632:1: 'name'
            {
             before(grammarAccess.getFieldAccess().getNameKeyword_2()); 
            match(input,10,FOLLOW_10_in_rule__Field__Group__2__Impl5321); 
             after(grammarAccess.getFieldAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2645:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2649:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2650:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35352);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35355);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2657:1: rule__Field__Group__3__Impl : ( '\"' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2661:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2662:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2662:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2663:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__3__Impl5383); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2676:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2680:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2681:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45414);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45417);
            rule__Field__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2688:1: rule__Field__Group__4__Impl : ( ':' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2692:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2693:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2693:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2694:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__4__Impl5445); 
             after(grammarAccess.getFieldAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2707:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2711:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2712:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55476);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55479);
            rule__Field__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2719:1: rule__Field__Group__5__Impl : ( '\"' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2723:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2724:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2724:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2725:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__5__Impl5507); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2738:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2742:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2743:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65538);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65541);
            rule__Field__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2750:1: rule__Field__Group__6__Impl : ( ( rule__Field__NameAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2754:1: ( ( ( rule__Field__NameAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2755:1: ( ( rule__Field__NameAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2755:1: ( ( rule__Field__NameAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2756:1: ( rule__Field__NameAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2757:1: ( rule__Field__NameAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2757:2: rule__Field__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5568);
            rule__Field__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2767:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2771:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2772:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75598);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75601);
            rule__Field__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2779:1: rule__Field__Group__7__Impl : ( '\"' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2783:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2784:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2784:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2785:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__7__Impl5629); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2798:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2802:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2803:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85660);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85663);
            rule__Field__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2810:1: rule__Field__Group__8__Impl : ( ',' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2814:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2815:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2815:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2816:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group__8__Impl5691); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2829:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2833:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2834:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95722);
            rule__Field__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95725);
            rule__Field__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2841:1: rule__Field__Group__9__Impl : ( '\"' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2845:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2846:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2846:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2847:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__9__Impl5753); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9__Impl"


    // $ANTLR start "rule__Field__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2860:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2864:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2865:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105784);
            rule__Field__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105787);
            rule__Field__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10"


    // $ANTLR start "rule__Field__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2872:1: rule__Field__Group__10__Impl : ( 'type' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2876:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2877:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2877:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2878:1: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_10()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group__10__Impl5815); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10__Impl"


    // $ANTLR start "rule__Field__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2891:1: rule__Field__Group__11 : rule__Field__Group__11__Impl rule__Field__Group__12 ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2895:1: ( rule__Field__Group__11__Impl rule__Field__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2896:2: rule__Field__Group__11__Impl rule__Field__Group__12
            {
            pushFollow(FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115846);
            rule__Field__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115849);
            rule__Field__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__11"


    // $ANTLR start "rule__Field__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2903:1: rule__Field__Group__11__Impl : ( '\"' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2907:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2908:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2908:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2909:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__11__Impl5877); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__11__Impl"


    // $ANTLR start "rule__Field__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2922:1: rule__Field__Group__12 : rule__Field__Group__12__Impl rule__Field__Group__13 ;
    public final void rule__Field__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2926:1: ( rule__Field__Group__12__Impl rule__Field__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2927:2: rule__Field__Group__12__Impl rule__Field__Group__13
            {
            pushFollow(FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125908);
            rule__Field__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125911);
            rule__Field__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__12"


    // $ANTLR start "rule__Field__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2934:1: rule__Field__Group__12__Impl : ( ':' ) ;
    public final void rule__Field__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2938:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2939:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2939:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2940:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__12__Impl5939); 
             after(grammarAccess.getFieldAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__12__Impl"


    // $ANTLR start "rule__Field__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2953:1: rule__Field__Group__13 : rule__Field__Group__13__Impl rule__Field__Group__14 ;
    public final void rule__Field__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2957:1: ( rule__Field__Group__13__Impl rule__Field__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2958:2: rule__Field__Group__13__Impl rule__Field__Group__14
            {
            pushFollow(FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135970);
            rule__Field__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135973);
            rule__Field__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__13"


    // $ANTLR start "rule__Field__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2965:1: rule__Field__Group__13__Impl : ( ( rule__Field__Alternatives_13 ) ) ;
    public final void rule__Field__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2969:1: ( ( ( rule__Field__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2970:1: ( ( rule__Field__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2970:1: ( ( rule__Field__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2971:1: ( rule__Field__Alternatives_13 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2972:1: ( rule__Field__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2972:2: rule__Field__Alternatives_13
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl6000);
            rule__Field__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__13__Impl"


    // $ANTLR start "rule__Field__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2982:1: rule__Field__Group__14 : rule__Field__Group__14__Impl ;
    public final void rule__Field__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2986:1: ( rule__Field__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2987:2: rule__Field__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__146030);
            rule__Field__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__14"


    // $ANTLR start "rule__Field__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2993:1: rule__Field__Group__14__Impl : ( '}' ) ;
    public final void rule__Field__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2997:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2998:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2998:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2999:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__14__Impl6058); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__14__Impl"


    // $ANTLR start "rule__Field__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3042:1: rule__Field__Group_13_2__0 : rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 ;
    public final void rule__Field__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3046:1: ( rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3047:2: rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__06119);
            rule__Field__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__06122);
            rule__Field__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__0"


    // $ANTLR start "rule__Field__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3054:1: rule__Field__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3058:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3059:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3059:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3060:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_13_2__0__Impl6150); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__0__Impl"


    // $ANTLR start "rule__Field__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3073:1: rule__Field__Group_13_2__1 : rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 ;
    public final void rule__Field__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3077:1: ( rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3078:2: rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__16181);
            rule__Field__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__16184);
            rule__Field__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__1"


    // $ANTLR start "rule__Field__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3085:1: rule__Field__Group_13_2__1__Impl : ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__Field__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3089:1: ( ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3090:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3090:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3091:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3092:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3092:2: rule__Field__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl6211);
            rule__Field__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__1__Impl"


    // $ANTLR start "rule__Field__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3102:1: rule__Field__Group_13_2__2 : rule__Field__Group_13_2__2__Impl ;
    public final void rule__Field__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3106:1: ( rule__Field__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3107:2: rule__Field__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__26241);
            rule__Field__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__2"


    // $ANTLR start "rule__Field__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3113:1: rule__Field__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3117:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3118:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3118:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3119:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group_13_2__2__Impl6269); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_13_2__2__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3138:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3142:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3143:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__06306);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__06309);
            rule__EnumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3150:1: rule__EnumType__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3154:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3155:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3155:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3156:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__0__Impl6337); 
             after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3169:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3173:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3174:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16368);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16371);
            rule__EnumType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3181:1: rule__EnumType__Group__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3185:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3186:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3186:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3187:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__1__Impl6399); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3200:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3204:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3205:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26430);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26433);
            rule__EnumType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3212:1: rule__EnumType__Group__2__Impl : ( 'type' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3216:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3217:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3217:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3218:1: 'type'
            {
             before(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__EnumType__Group__2__Impl6461); 
             after(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3231:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3235:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3236:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36492);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36495);
            rule__EnumType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3243:1: rule__EnumType__Group__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3247:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3248:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3248:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3249:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__3__Impl6523); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3262:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3266:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3267:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46554);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46557);
            rule__EnumType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3274:1: rule__EnumType__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3278:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3279:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3279:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3280:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__4__Impl6585); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3293:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3297:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3298:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56616);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56619);
            rule__EnumType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3305:1: rule__EnumType__Group__5__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3309:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3310:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3310:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3311:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__5__Impl6647); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3324:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3328:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3329:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66678);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66681);
            rule__EnumType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6"


    // $ANTLR start "rule__EnumType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3336:1: rule__EnumType__Group__6__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3340:1: ( ( 'enum' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3341:1: ( 'enum' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3341:1: ( 'enum' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3342:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EnumType__Group__6__Impl6709); 
             after(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6__Impl"


    // $ANTLR start "rule__EnumType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3355:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3359:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3360:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76740);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76743);
            rule__EnumType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7"


    // $ANTLR start "rule__EnumType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3367:1: rule__EnumType__Group__7__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3371:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3372:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3372:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3373:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__7__Impl6771); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7__Impl"


    // $ANTLR start "rule__EnumType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3386:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3390:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3391:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86802);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86805);
            rule__EnumType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8"


    // $ANTLR start "rule__EnumType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3398:1: rule__EnumType__Group__8__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3402:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3403:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3403:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3404:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__8__Impl6833); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8__Impl"


    // $ANTLR start "rule__EnumType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3417:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3421:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3422:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96864);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96867);
            rule__EnumType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9"


    // $ANTLR start "rule__EnumType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3429:1: rule__EnumType__Group__9__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3433:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3434:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3434:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3435:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__9__Impl6895); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9__Impl"


    // $ANTLR start "rule__EnumType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3448:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3452:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3453:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106926);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106929);
            rule__EnumType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10"


    // $ANTLR start "rule__EnumType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3460:1: rule__EnumType__Group__10__Impl : ( 'name' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3464:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3465:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3465:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3466:1: 'name'
            {
             before(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__EnumType__Group__10__Impl6957); 
             after(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10__Impl"


    // $ANTLR start "rule__EnumType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3479:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3483:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3484:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116988);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116991);
            rule__EnumType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11"


    // $ANTLR start "rule__EnumType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3491:1: rule__EnumType__Group__11__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3495:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3496:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3496:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3497:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__11__Impl7019); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11__Impl"


    // $ANTLR start "rule__EnumType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3510:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3514:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3515:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__127050);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__127053);
            rule__EnumType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12"


    // $ANTLR start "rule__EnumType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3522:1: rule__EnumType__Group__12__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3526:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3527:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3527:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3528:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__12__Impl7081); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12__Impl"


    // $ANTLR start "rule__EnumType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3541:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl rule__EnumType__Group__14 ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3545:1: ( rule__EnumType__Group__13__Impl rule__EnumType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3546:2: rule__EnumType__Group__13__Impl rule__EnumType__Group__14
            {
            pushFollow(FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__137112);
            rule__EnumType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__137115);
            rule__EnumType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13"


    // $ANTLR start "rule__EnumType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3553:1: rule__EnumType__Group__13__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3557:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3558:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3558:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3559:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__13__Impl7143); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13__Impl"


    // $ANTLR start "rule__EnumType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3572:1: rule__EnumType__Group__14 : rule__EnumType__Group__14__Impl rule__EnumType__Group__15 ;
    public final void rule__EnumType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3576:1: ( rule__EnumType__Group__14__Impl rule__EnumType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3577:2: rule__EnumType__Group__14__Impl rule__EnumType__Group__15
            {
            pushFollow(FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__147174);
            rule__EnumType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__147177);
            rule__EnumType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__14"


    // $ANTLR start "rule__EnumType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3584:1: rule__EnumType__Group__14__Impl : ( ( rule__EnumType__NameAssignment_14 ) ) ;
    public final void rule__EnumType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3588:1: ( ( ( rule__EnumType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3589:1: ( ( rule__EnumType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3589:1: ( ( rule__EnumType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3590:1: ( rule__EnumType__NameAssignment_14 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3591:1: ( rule__EnumType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3591:2: rule__EnumType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl7204);
            rule__EnumType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__14__Impl"


    // $ANTLR start "rule__EnumType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3601:1: rule__EnumType__Group__15 : rule__EnumType__Group__15__Impl rule__EnumType__Group__16 ;
    public final void rule__EnumType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3605:1: ( rule__EnumType__Group__15__Impl rule__EnumType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3606:2: rule__EnumType__Group__15__Impl rule__EnumType__Group__16
            {
            pushFollow(FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__157234);
            rule__EnumType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__157237);
            rule__EnumType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__15"


    // $ANTLR start "rule__EnumType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3613:1: rule__EnumType__Group__15__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3617:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3618:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3618:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3619:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__15__Impl7265); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__15__Impl"


    // $ANTLR start "rule__EnumType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3632:1: rule__EnumType__Group__16 : rule__EnumType__Group__16__Impl rule__EnumType__Group__17 ;
    public final void rule__EnumType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3636:1: ( rule__EnumType__Group__16__Impl rule__EnumType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3637:2: rule__EnumType__Group__16__Impl rule__EnumType__Group__17
            {
            pushFollow(FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__167296);
            rule__EnumType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__167299);
            rule__EnumType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__16"


    // $ANTLR start "rule__EnumType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3644:1: rule__EnumType__Group__16__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3648:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3649:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3649:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3650:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__16__Impl7327); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__16__Impl"


    // $ANTLR start "rule__EnumType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3663:1: rule__EnumType__Group__17 : rule__EnumType__Group__17__Impl rule__EnumType__Group__18 ;
    public final void rule__EnumType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3667:1: ( rule__EnumType__Group__17__Impl rule__EnumType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3668:2: rule__EnumType__Group__17__Impl rule__EnumType__Group__18
            {
            pushFollow(FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177358);
            rule__EnumType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177361);
            rule__EnumType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__17"


    // $ANTLR start "rule__EnumType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3675:1: rule__EnumType__Group__17__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3679:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3680:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3680:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3681:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__17__Impl7389); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__17__Impl"


    // $ANTLR start "rule__EnumType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3694:1: rule__EnumType__Group__18 : rule__EnumType__Group__18__Impl rule__EnumType__Group__19 ;
    public final void rule__EnumType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3698:1: ( rule__EnumType__Group__18__Impl rule__EnumType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3699:2: rule__EnumType__Group__18__Impl rule__EnumType__Group__19
            {
            pushFollow(FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187420);
            rule__EnumType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187423);
            rule__EnumType__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__18"


    // $ANTLR start "rule__EnumType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3706:1: rule__EnumType__Group__18__Impl : ( 'symbols' ) ;
    public final void rule__EnumType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3710:1: ( ( 'symbols' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3711:1: ( 'symbols' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3711:1: ( 'symbols' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3712:1: 'symbols'
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 
            match(input,31,FOLLOW_31_in_rule__EnumType__Group__18__Impl7451); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__18__Impl"


    // $ANTLR start "rule__EnumType__Group__19"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3725:1: rule__EnumType__Group__19 : rule__EnumType__Group__19__Impl rule__EnumType__Group__20 ;
    public final void rule__EnumType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3729:1: ( rule__EnumType__Group__19__Impl rule__EnumType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3730:2: rule__EnumType__Group__19__Impl rule__EnumType__Group__20
            {
            pushFollow(FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197482);
            rule__EnumType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197485);
            rule__EnumType__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__19"


    // $ANTLR start "rule__EnumType__Group__19__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3737:1: rule__EnumType__Group__19__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3741:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3742:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3742:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3743:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__19__Impl7513); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__19__Impl"


    // $ANTLR start "rule__EnumType__Group__20"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3756:1: rule__EnumType__Group__20 : rule__EnumType__Group__20__Impl rule__EnumType__Group__21 ;
    public final void rule__EnumType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3760:1: ( rule__EnumType__Group__20__Impl rule__EnumType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3761:2: rule__EnumType__Group__20__Impl rule__EnumType__Group__21
            {
            pushFollow(FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207544);
            rule__EnumType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207547);
            rule__EnumType__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__20"


    // $ANTLR start "rule__EnumType__Group__20__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3768:1: rule__EnumType__Group__20__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3772:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3773:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3773:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3774:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__20__Impl7575); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__20__Impl"


    // $ANTLR start "rule__EnumType__Group__21"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3787:1: rule__EnumType__Group__21 : rule__EnumType__Group__21__Impl rule__EnumType__Group__22 ;
    public final void rule__EnumType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3791:1: ( rule__EnumType__Group__21__Impl rule__EnumType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3792:2: rule__EnumType__Group__21__Impl rule__EnumType__Group__22
            {
            pushFollow(FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217606);
            rule__EnumType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217609);
            rule__EnumType__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__21"


    // $ANTLR start "rule__EnumType__Group__21__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3799:1: rule__EnumType__Group__21__Impl : ( '[' ) ;
    public final void rule__EnumType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3803:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3804:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3804:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3805:1: '['
            {
             before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 
            match(input,19,FOLLOW_19_in_rule__EnumType__Group__21__Impl7637); 
             after(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__21__Impl"


    // $ANTLR start "rule__EnumType__Group__22"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3818:1: rule__EnumType__Group__22 : rule__EnumType__Group__22__Impl rule__EnumType__Group__23 ;
    public final void rule__EnumType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3822:1: ( rule__EnumType__Group__22__Impl rule__EnumType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3823:2: rule__EnumType__Group__22__Impl rule__EnumType__Group__23
            {
            pushFollow(FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227668);
            rule__EnumType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227671);
            rule__EnumType__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__22"


    // $ANTLR start "rule__EnumType__Group__22__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3830:1: rule__EnumType__Group__22__Impl : ( ( rule__EnumType__Group_22__0 ) ) ;
    public final void rule__EnumType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3834:1: ( ( ( rule__EnumType__Group_22__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3835:1: ( ( rule__EnumType__Group_22__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3835:1: ( ( rule__EnumType__Group_22__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3836:1: ( rule__EnumType__Group_22__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_22()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3837:1: ( rule__EnumType__Group_22__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3837:2: rule__EnumType__Group_22__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7698);
            rule__EnumType__Group_22__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__22__Impl"


    // $ANTLR start "rule__EnumType__Group__23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3847:1: rule__EnumType__Group__23 : rule__EnumType__Group__23__Impl rule__EnumType__Group__24 ;
    public final void rule__EnumType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3851:1: ( rule__EnumType__Group__23__Impl rule__EnumType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3852:2: rule__EnumType__Group__23__Impl rule__EnumType__Group__24
            {
            pushFollow(FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237728);
            rule__EnumType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237731);
            rule__EnumType__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__23"


    // $ANTLR start "rule__EnumType__Group__23__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3859:1: rule__EnumType__Group__23__Impl : ( ( rule__EnumType__Group_23__0 )* ) ;
    public final void rule__EnumType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3863:1: ( ( ( rule__EnumType__Group_23__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3864:1: ( ( rule__EnumType__Group_23__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3864:1: ( ( rule__EnumType__Group_23__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3865:1: ( rule__EnumType__Group_23__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3866:1: ( rule__EnumType__Group_23__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3866:2: rule__EnumType__Group_23__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7758);
            	    rule__EnumType__Group_23__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__23__Impl"


    // $ANTLR start "rule__EnumType__Group__24"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3876:1: rule__EnumType__Group__24 : rule__EnumType__Group__24__Impl rule__EnumType__Group__25 ;
    public final void rule__EnumType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3880:1: ( rule__EnumType__Group__24__Impl rule__EnumType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3881:2: rule__EnumType__Group__24__Impl rule__EnumType__Group__25
            {
            pushFollow(FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247789);
            rule__EnumType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247792);
            rule__EnumType__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__24"


    // $ANTLR start "rule__EnumType__Group__24__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3888:1: rule__EnumType__Group__24__Impl : ( ']' ) ;
    public final void rule__EnumType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3892:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3893:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3893:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3894:1: ']'
            {
             before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_20_in_rule__EnumType__Group__24__Impl7820); 
             after(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__24__Impl"


    // $ANTLR start "rule__EnumType__Group__25"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3907:1: rule__EnumType__Group__25 : rule__EnumType__Group__25__Impl ;
    public final void rule__EnumType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3911:1: ( rule__EnumType__Group__25__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3912:2: rule__EnumType__Group__25__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257851);
            rule__EnumType__Group__25__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__25"


    // $ANTLR start "rule__EnumType__Group__25__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3918:1: rule__EnumType__Group__25__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3922:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3923:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3923:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3924:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_26_in_rule__EnumType__Group__25__Impl7879); 
             after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__25__Impl"


    // $ANTLR start "rule__EnumType__Group_22__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3989:1: rule__EnumType__Group_22__0 : rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 ;
    public final void rule__EnumType__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3993:1: ( rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3994:2: rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07962);
            rule__EnumType__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07965);
            rule__EnumType__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__0"


    // $ANTLR start "rule__EnumType__Group_22__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4001:1: rule__EnumType__Group_22__0__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4005:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4006:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4006:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4007:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_22__0__Impl7993); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__0__Impl"


    // $ANTLR start "rule__EnumType__Group_22__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4020:1: rule__EnumType__Group_22__1 : rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 ;
    public final void rule__EnumType__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4024:1: ( rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4025:2: rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__18024);
            rule__EnumType__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__18027);
            rule__EnumType__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__1"


    // $ANTLR start "rule__EnumType__Group_22__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4032:1: rule__EnumType__Group_22__1__Impl : ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) ;
    public final void rule__EnumType__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4036:1: ( ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4037:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4037:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4038:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4039:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4039:2: rule__EnumType__SymbolsAssignment_22_1
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl8054);
            rule__EnumType__SymbolsAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__1__Impl"


    // $ANTLR start "rule__EnumType__Group_22__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4049:1: rule__EnumType__Group_22__2 : rule__EnumType__Group_22__2__Impl ;
    public final void rule__EnumType__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4053:1: ( rule__EnumType__Group_22__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4054:2: rule__EnumType__Group_22__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__28084);
            rule__EnumType__Group_22__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__2"


    // $ANTLR start "rule__EnumType__Group_22__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4060:1: rule__EnumType__Group_22__2__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4064:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4065:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4065:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4066:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_22__2__Impl8112); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_22__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4085:1: rule__EnumType__Group_23__0 : rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 ;
    public final void rule__EnumType__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4089:1: ( rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4090:2: rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__08149);
            rule__EnumType__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__08152);
            rule__EnumType__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__0"


    // $ANTLR start "rule__EnumType__Group_23__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4097:1: rule__EnumType__Group_23__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4101:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4102:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4102:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4103:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group_23__0__Impl8180); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__0__Impl"


    // $ANTLR start "rule__EnumType__Group_23__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4116:1: rule__EnumType__Group_23__1 : rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 ;
    public final void rule__EnumType__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4120:1: ( rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4121:2: rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__18211);
            rule__EnumType__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__18214);
            rule__EnumType__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__1"


    // $ANTLR start "rule__EnumType__Group_23__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4128:1: rule__EnumType__Group_23__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4132:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4133:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4133:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4134:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_23__1__Impl8242); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__1__Impl"


    // $ANTLR start "rule__EnumType__Group_23__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4147:1: rule__EnumType__Group_23__2 : rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 ;
    public final void rule__EnumType__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4151:1: ( rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4152:2: rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__28273);
            rule__EnumType__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__28276);
            rule__EnumType__Group_23__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__2"


    // $ANTLR start "rule__EnumType__Group_23__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4159:1: rule__EnumType__Group_23__2__Impl : ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) ;
    public final void rule__EnumType__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4163:1: ( ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4164:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4164:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4165:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4166:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4166:2: rule__EnumType__SymbolsAssignment_23_2
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl8303);
            rule__EnumType__SymbolsAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4176:1: rule__EnumType__Group_23__3 : rule__EnumType__Group_23__3__Impl ;
    public final void rule__EnumType__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4180:1: ( rule__EnumType__Group_23__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4181:2: rule__EnumType__Group_23__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38333);
            rule__EnumType__Group_23__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__3"


    // $ANTLR start "rule__EnumType__Group_23__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4187:1: rule__EnumType__Group_23__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4191:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4192:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4192:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4193:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group_23__3__Impl8361); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group_23__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4214:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4218:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4219:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08400);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08403);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4226:1: rule__ArrayType__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4230:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4231:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4231:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4232:1: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__0__Impl8431); 
             after(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4245:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4249:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4250:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18462);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18465);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4257:1: rule__ArrayType__Group__1__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4261:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4262:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4262:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4263:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__1__Impl8493); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4276:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4280:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4281:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28524);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28527);
            rule__ArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4288:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4292:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4293:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4293:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4294:1: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ArrayType__Group__2__Impl8555); 
             after(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4307:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4311:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4312:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38586);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38589);
            rule__ArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4319:1: rule__ArrayType__Group__3__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4323:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4324:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4324:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4325:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__3__Impl8617); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4338:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4342:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4343:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48648);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48651);
            rule__ArrayType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4"


    // $ANTLR start "rule__ArrayType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4350:1: rule__ArrayType__Group__4__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4354:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4355:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4355:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4356:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__4__Impl8679); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4369:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4373:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4374:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58710);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58713);
            rule__ArrayType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5"


    // $ANTLR start "rule__ArrayType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4381:1: rule__ArrayType__Group__5__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4385:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4386:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4386:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4387:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__5__Impl8741); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5__Impl"


    // $ANTLR start "rule__ArrayType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4400:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4404:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4405:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68772);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68775);
            rule__ArrayType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6"


    // $ANTLR start "rule__ArrayType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4412:1: rule__ArrayType__Group__6__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4416:1: ( ( 'array' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4417:1: ( 'array' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4417:1: ( 'array' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4418:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__Group__6__Impl8803); 
             after(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6__Impl"


    // $ANTLR start "rule__ArrayType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4431:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4435:1: ( rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4436:2: rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78834);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78837);
            rule__ArrayType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7"


    // $ANTLR start "rule__ArrayType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4443:1: rule__ArrayType__Group__7__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4447:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4448:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4448:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4449:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__7__Impl8865); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7__Impl"


    // $ANTLR start "rule__ArrayType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4462:1: rule__ArrayType__Group__8 : rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 ;
    public final void rule__ArrayType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4466:1: ( rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4467:2: rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88896);
            rule__ArrayType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88899);
            rule__ArrayType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__8"


    // $ANTLR start "rule__ArrayType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4474:1: rule__ArrayType__Group__8__Impl : ( ',' ) ;
    public final void rule__ArrayType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4478:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4479:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4479:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4480:1: ','
            {
             before(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__ArrayType__Group__8__Impl8927); 
             after(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__8__Impl"


    // $ANTLR start "rule__ArrayType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4493:1: rule__ArrayType__Group__9 : rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 ;
    public final void rule__ArrayType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4497:1: ( rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4498:2: rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98958);
            rule__ArrayType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98961);
            rule__ArrayType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__9"


    // $ANTLR start "rule__ArrayType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4505:1: rule__ArrayType__Group__9__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4509:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4510:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4510:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4511:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__9__Impl8989); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__9__Impl"


    // $ANTLR start "rule__ArrayType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4524:1: rule__ArrayType__Group__10 : rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 ;
    public final void rule__ArrayType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4528:1: ( rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4529:2: rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__109020);
            rule__ArrayType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__109023);
            rule__ArrayType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__10"


    // $ANTLR start "rule__ArrayType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4536:1: rule__ArrayType__Group__10__Impl : ( 'items' ) ;
    public final void rule__ArrayType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4540:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4541:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4541:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4542:1: 'items'
            {
             before(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__ArrayType__Group__10__Impl9051); 
             after(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__10__Impl"


    // $ANTLR start "rule__ArrayType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4555:1: rule__ArrayType__Group__11 : rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 ;
    public final void rule__ArrayType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4559:1: ( rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4560:2: rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__119082);
            rule__ArrayType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__119085);
            rule__ArrayType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__11"


    // $ANTLR start "rule__ArrayType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4567:1: rule__ArrayType__Group__11__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4571:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4572:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4572:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4573:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__11__Impl9113); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__11__Impl"


    // $ANTLR start "rule__ArrayType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4586:1: rule__ArrayType__Group__12 : rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 ;
    public final void rule__ArrayType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4590:1: ( rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4591:2: rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__129144);
            rule__ArrayType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__129147);
            rule__ArrayType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__12"


    // $ANTLR start "rule__ArrayType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4598:1: rule__ArrayType__Group__12__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4602:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4603:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4603:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4604:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__12__Impl9175); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__12__Impl"


    // $ANTLR start "rule__ArrayType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4617:1: rule__ArrayType__Group__13 : rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 ;
    public final void rule__ArrayType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4621:1: ( rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4622:2: rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__139206);
            rule__ArrayType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__139209);
            rule__ArrayType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__13"


    // $ANTLR start "rule__ArrayType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4629:1: rule__ArrayType__Group__13__Impl : ( ( rule__ArrayType__Alternatives_13 ) ) ;
    public final void rule__ArrayType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4633:1: ( ( ( rule__ArrayType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4634:1: ( ( rule__ArrayType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4634:1: ( ( rule__ArrayType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4635:1: ( rule__ArrayType__Alternatives_13 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4636:1: ( rule__ArrayType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4636:2: rule__ArrayType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl9236);
            rule__ArrayType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__13__Impl"


    // $ANTLR start "rule__ArrayType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4646:1: rule__ArrayType__Group__14 : rule__ArrayType__Group__14__Impl ;
    public final void rule__ArrayType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4650:1: ( rule__ArrayType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4651:2: rule__ArrayType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__149266);
            rule__ArrayType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__14"


    // $ANTLR start "rule__ArrayType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4657:1: rule__ArrayType__Group__14__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4661:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4662:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4662:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4663:1: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__ArrayType__Group__14__Impl9294); 
             after(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__14__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4706:1: rule__ArrayType__Group_13_2__0 : rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 ;
    public final void rule__ArrayType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4710:1: ( rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4711:2: rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09355);
            rule__ArrayType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09358);
            rule__ArrayType__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__0"


    // $ANTLR start "rule__ArrayType__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4718:1: rule__ArrayType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4722:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4723:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4723:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4724:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group_13_2__0__Impl9386); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4737:1: rule__ArrayType__Group_13_2__1 : rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 ;
    public final void rule__ArrayType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4741:1: ( rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4742:2: rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19417);
            rule__ArrayType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19420);
            rule__ArrayType__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__1"


    // $ANTLR start "rule__ArrayType__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4749:1: rule__ArrayType__Group_13_2__1__Impl : ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__ArrayType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4753:1: ( ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4754:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4754:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4755:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4756:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4756:2: rule__ArrayType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9447);
            rule__ArrayType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4766:1: rule__ArrayType__Group_13_2__2 : rule__ArrayType__Group_13_2__2__Impl ;
    public final void rule__ArrayType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4770:1: ( rule__ArrayType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4771:2: rule__ArrayType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29477);
            rule__ArrayType__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__2"


    // $ANTLR start "rule__ArrayType__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4777:1: rule__ArrayType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4781:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4782:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4782:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4783:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group_13_2__2__Impl9505); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_13_2__2__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4802:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4806:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4807:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09542);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09545);
            rule__MapType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4814:1: rule__MapType__Group__0__Impl : ( '{' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4818:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4819:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4819:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4820:1: '{'
            {
             before(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__0__Impl9573); 
             after(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4833:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4837:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4838:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19604);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19607);
            rule__MapType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4845:1: rule__MapType__Group__1__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4849:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4850:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4850:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4851:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__1__Impl9635); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4864:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4868:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4869:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29666);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29669);
            rule__MapType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4876:1: rule__MapType__Group__2__Impl : ( 'type' ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4880:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4881:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4881:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4882:1: 'type'
            {
             before(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__MapType__Group__2__Impl9697); 
             after(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4895:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4899:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4900:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39728);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39731);
            rule__MapType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3"


    // $ANTLR start "rule__MapType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4907:1: rule__MapType__Group__3__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4911:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4912:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4912:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4913:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__3__Impl9759); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4926:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4930:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4931:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49790);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49793);
            rule__MapType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4"


    // $ANTLR start "rule__MapType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4938:1: rule__MapType__Group__4__Impl : ( ':' ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4942:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4943:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4943:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4944:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__4__Impl9821); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4__Impl"


    // $ANTLR start "rule__MapType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4957:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl rule__MapType__Group__6 ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4961:1: ( rule__MapType__Group__5__Impl rule__MapType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4962:2: rule__MapType__Group__5__Impl rule__MapType__Group__6
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59852);
            rule__MapType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59855);
            rule__MapType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5"


    // $ANTLR start "rule__MapType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4969:1: rule__MapType__Group__5__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4973:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4974:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4974:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4975:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__5__Impl9883); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5__Impl"


    // $ANTLR start "rule__MapType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4988:1: rule__MapType__Group__6 : rule__MapType__Group__6__Impl rule__MapType__Group__7 ;
    public final void rule__MapType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4992:1: ( rule__MapType__Group__6__Impl rule__MapType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4993:2: rule__MapType__Group__6__Impl rule__MapType__Group__7
            {
            pushFollow(FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69914);
            rule__MapType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69917);
            rule__MapType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__6"


    // $ANTLR start "rule__MapType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5000:1: rule__MapType__Group__6__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5004:1: ( ( 'map' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5005:1: ( 'map' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5005:1: ( 'map' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5006:1: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__MapType__Group__6__Impl9945); 
             after(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__6__Impl"


    // $ANTLR start "rule__MapType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5019:1: rule__MapType__Group__7 : rule__MapType__Group__7__Impl rule__MapType__Group__8 ;
    public final void rule__MapType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5023:1: ( rule__MapType__Group__7__Impl rule__MapType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5024:2: rule__MapType__Group__7__Impl rule__MapType__Group__8
            {
            pushFollow(FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79976);
            rule__MapType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79979);
            rule__MapType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__7"


    // $ANTLR start "rule__MapType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5031:1: rule__MapType__Group__7__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5035:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5036:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5036:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5037:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__7__Impl10007); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__7__Impl"


    // $ANTLR start "rule__MapType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5050:1: rule__MapType__Group__8 : rule__MapType__Group__8__Impl rule__MapType__Group__9 ;
    public final void rule__MapType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5054:1: ( rule__MapType__Group__8__Impl rule__MapType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5055:2: rule__MapType__Group__8__Impl rule__MapType__Group__9
            {
            pushFollow(FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__810038);
            rule__MapType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__810041);
            rule__MapType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__8"


    // $ANTLR start "rule__MapType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5062:1: rule__MapType__Group__8__Impl : ( ',' ) ;
    public final void rule__MapType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5066:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5067:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5067:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5068:1: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__MapType__Group__8__Impl10069); 
             after(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__8__Impl"


    // $ANTLR start "rule__MapType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5081:1: rule__MapType__Group__9 : rule__MapType__Group__9__Impl rule__MapType__Group__10 ;
    public final void rule__MapType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5085:1: ( rule__MapType__Group__9__Impl rule__MapType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5086:2: rule__MapType__Group__9__Impl rule__MapType__Group__10
            {
            pushFollow(FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__910100);
            rule__MapType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__910103);
            rule__MapType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__9"


    // $ANTLR start "rule__MapType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5093:1: rule__MapType__Group__9__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5097:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5098:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5098:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5099:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__9__Impl10131); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__9__Impl"


    // $ANTLR start "rule__MapType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5112:1: rule__MapType__Group__10 : rule__MapType__Group__10__Impl rule__MapType__Group__11 ;
    public final void rule__MapType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5116:1: ( rule__MapType__Group__10__Impl rule__MapType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5117:2: rule__MapType__Group__10__Impl rule__MapType__Group__11
            {
            pushFollow(FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__1010162);
            rule__MapType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__1010165);
            rule__MapType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__10"


    // $ANTLR start "rule__MapType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5124:1: rule__MapType__Group__10__Impl : ( 'items' ) ;
    public final void rule__MapType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5128:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5129:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5129:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5130:1: 'items'
            {
             before(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__MapType__Group__10__Impl10193); 
             after(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__10__Impl"


    // $ANTLR start "rule__MapType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5143:1: rule__MapType__Group__11 : rule__MapType__Group__11__Impl rule__MapType__Group__12 ;
    public final void rule__MapType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5147:1: ( rule__MapType__Group__11__Impl rule__MapType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5148:2: rule__MapType__Group__11__Impl rule__MapType__Group__12
            {
            pushFollow(FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__1110224);
            rule__MapType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__1110227);
            rule__MapType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__11"


    // $ANTLR start "rule__MapType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5155:1: rule__MapType__Group__11__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5159:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5160:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5160:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5161:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__11__Impl10255); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__11__Impl"


    // $ANTLR start "rule__MapType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5174:1: rule__MapType__Group__12 : rule__MapType__Group__12__Impl rule__MapType__Group__13 ;
    public final void rule__MapType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5178:1: ( rule__MapType__Group__12__Impl rule__MapType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5179:2: rule__MapType__Group__12__Impl rule__MapType__Group__13
            {
            pushFollow(FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__1210286);
            rule__MapType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__1210289);
            rule__MapType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__12"


    // $ANTLR start "rule__MapType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5186:1: rule__MapType__Group__12__Impl : ( ':' ) ;
    public final void rule__MapType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5190:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5191:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5191:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5192:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__12__Impl10317); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__12__Impl"


    // $ANTLR start "rule__MapType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5205:1: rule__MapType__Group__13 : rule__MapType__Group__13__Impl rule__MapType__Group__14 ;
    public final void rule__MapType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5209:1: ( rule__MapType__Group__13__Impl rule__MapType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5210:2: rule__MapType__Group__13__Impl rule__MapType__Group__14
            {
            pushFollow(FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310348);
            rule__MapType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310351);
            rule__MapType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__13"


    // $ANTLR start "rule__MapType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5217:1: rule__MapType__Group__13__Impl : ( ( rule__MapType__Alternatives_13 ) ) ;
    public final void rule__MapType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5221:1: ( ( ( rule__MapType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5222:1: ( ( rule__MapType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5222:1: ( ( rule__MapType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5223:1: ( rule__MapType__Alternatives_13 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5224:1: ( rule__MapType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5224:2: rule__MapType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10378);
            rule__MapType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getAlternatives_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__13__Impl"


    // $ANTLR start "rule__MapType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5234:1: rule__MapType__Group__14 : rule__MapType__Group__14__Impl ;
    public final void rule__MapType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5238:1: ( rule__MapType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5239:2: rule__MapType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410408);
            rule__MapType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__14"


    // $ANTLR start "rule__MapType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5245:1: rule__MapType__Group__14__Impl : ( '}' ) ;
    public final void rule__MapType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5249:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5250:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5250:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5251:1: '}'
            {
             before(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__MapType__Group__14__Impl10436); 
             after(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__14__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5294:1: rule__MapType__Group_13_2__0 : rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 ;
    public final void rule__MapType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5298:1: ( rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5299:2: rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010497);
            rule__MapType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010500);
            rule__MapType__Group_13_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__0"


    // $ANTLR start "rule__MapType__Group_13_2__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5306:1: rule__MapType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5310:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5311:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5311:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5312:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group_13_2__0__Impl10528); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__0__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5325:1: rule__MapType__Group_13_2__1 : rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 ;
    public final void rule__MapType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5329:1: ( rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5330:2: rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110559);
            rule__MapType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110562);
            rule__MapType__Group_13_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__1"


    // $ANTLR start "rule__MapType__Group_13_2__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5337:1: rule__MapType__Group_13_2__1__Impl : ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__MapType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5341:1: ( ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5342:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5342:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5343:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5344:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5344:2: rule__MapType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10589);
            rule__MapType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__1__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5354:1: rule__MapType__Group_13_2__2 : rule__MapType__Group_13_2__2__Impl ;
    public final void rule__MapType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5358:1: ( rule__MapType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5359:2: rule__MapType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210619);
            rule__MapType__Group_13_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__2"


    // $ANTLR start "rule__MapType__Group_13_2__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5365:1: rule__MapType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5369:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5370:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5370:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5371:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group_13_2__2__Impl10647); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_13_2__2__Impl"


    // $ANTLR start "rule__FixedType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5390:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5394:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5395:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010684);
            rule__FixedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010687);
            rule__FixedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0"


    // $ANTLR start "rule__FixedType__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5402:1: rule__FixedType__Group__0__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5406:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5407:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5407:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5408:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__0__Impl10715); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__0__Impl"


    // $ANTLR start "rule__FixedType__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5421:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5425:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5426:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110746);
            rule__FixedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110749);
            rule__FixedType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1"


    // $ANTLR start "rule__FixedType__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5433:1: rule__FixedType__Group__1__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5437:1: ( ( 'fixed' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5438:1: ( 'fixed' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5438:1: ( 'fixed' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5439:1: 'fixed'
            {
             before(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FixedType__Group__1__Impl10777); 
             after(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__1__Impl"


    // $ANTLR start "rule__FixedType__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5452:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5456:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5457:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210808);
            rule__FixedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210811);
            rule__FixedType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2"


    // $ANTLR start "rule__FixedType__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5464:1: rule__FixedType__Group__2__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5468:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5469:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5469:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5470:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__2__Impl10839); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__2__Impl"


    // $ANTLR start "rule__FixedType__Group__3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5483:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5487:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5488:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310870);
            rule__FixedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310873);
            rule__FixedType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3"


    // $ANTLR start "rule__FixedType__Group__3__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5495:1: rule__FixedType__Group__3__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5499:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5500:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5500:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5501:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__3__Impl10901); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__3__Impl"


    // $ANTLR start "rule__FixedType__Group__4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5514:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5518:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5519:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410932);
            rule__FixedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410935);
            rule__FixedType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4"


    // $ANTLR start "rule__FixedType__Group__4__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5526:1: rule__FixedType__Group__4__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5530:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5531:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5531:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5532:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__4__Impl10963); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__4__Impl"


    // $ANTLR start "rule__FixedType__Group__5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5545:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl rule__FixedType__Group__6 ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5549:1: ( rule__FixedType__Group__5__Impl rule__FixedType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5550:2: rule__FixedType__Group__5__Impl rule__FixedType__Group__6
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510994);
            rule__FixedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510997);
            rule__FixedType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5"


    // $ANTLR start "rule__FixedType__Group__5__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5557:1: rule__FixedType__Group__5__Impl : ( 'name' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5561:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5562:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5562:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5563:1: 'name'
            {
             before(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 
            match(input,10,FOLLOW_10_in_rule__FixedType__Group__5__Impl11025); 
             after(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__5__Impl"


    // $ANTLR start "rule__FixedType__Group__6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5576:1: rule__FixedType__Group__6 : rule__FixedType__Group__6__Impl rule__FixedType__Group__7 ;
    public final void rule__FixedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5580:1: ( rule__FixedType__Group__6__Impl rule__FixedType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5581:2: rule__FixedType__Group__6__Impl rule__FixedType__Group__7
            {
            pushFollow(FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__611056);
            rule__FixedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__611059);
            rule__FixedType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__6"


    // $ANTLR start "rule__FixedType__Group__6__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5588:1: rule__FixedType__Group__6__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5592:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5593:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5593:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5594:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__6__Impl11087); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__6__Impl"


    // $ANTLR start "rule__FixedType__Group__7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5607:1: rule__FixedType__Group__7 : rule__FixedType__Group__7__Impl rule__FixedType__Group__8 ;
    public final void rule__FixedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5611:1: ( rule__FixedType__Group__7__Impl rule__FixedType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5612:2: rule__FixedType__Group__7__Impl rule__FixedType__Group__8
            {
            pushFollow(FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__711118);
            rule__FixedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__711121);
            rule__FixedType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__7"


    // $ANTLR start "rule__FixedType__Group__7__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5619:1: rule__FixedType__Group__7__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5623:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5624:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5624:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5625:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__7__Impl11149); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__7__Impl"


    // $ANTLR start "rule__FixedType__Group__8"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5638:1: rule__FixedType__Group__8 : rule__FixedType__Group__8__Impl rule__FixedType__Group__9 ;
    public final void rule__FixedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5642:1: ( rule__FixedType__Group__8__Impl rule__FixedType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5643:2: rule__FixedType__Group__8__Impl rule__FixedType__Group__9
            {
            pushFollow(FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__811180);
            rule__FixedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__811183);
            rule__FixedType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__8"


    // $ANTLR start "rule__FixedType__Group__8__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5650:1: rule__FixedType__Group__8__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5654:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5655:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5655:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5656:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__8__Impl11211); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__8__Impl"


    // $ANTLR start "rule__FixedType__Group__9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5669:1: rule__FixedType__Group__9 : rule__FixedType__Group__9__Impl rule__FixedType__Group__10 ;
    public final void rule__FixedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5673:1: ( rule__FixedType__Group__9__Impl rule__FixedType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5674:2: rule__FixedType__Group__9__Impl rule__FixedType__Group__10
            {
            pushFollow(FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__911242);
            rule__FixedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__911245);
            rule__FixedType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__9"


    // $ANTLR start "rule__FixedType__Group__9__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5681:1: rule__FixedType__Group__9__Impl : ( ( rule__FixedType__NameAssignment_9 ) ) ;
    public final void rule__FixedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5685:1: ( ( ( rule__FixedType__NameAssignment_9 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5686:1: ( ( rule__FixedType__NameAssignment_9 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5686:1: ( ( rule__FixedType__NameAssignment_9 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5687:1: ( rule__FixedType__NameAssignment_9 )
            {
             before(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5688:1: ( rule__FixedType__NameAssignment_9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5688:2: rule__FixedType__NameAssignment_9
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl11272);
            rule__FixedType__NameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__9__Impl"


    // $ANTLR start "rule__FixedType__Group__10"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5698:1: rule__FixedType__Group__10 : rule__FixedType__Group__10__Impl rule__FixedType__Group__11 ;
    public final void rule__FixedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5702:1: ( rule__FixedType__Group__10__Impl rule__FixedType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5703:2: rule__FixedType__Group__10__Impl rule__FixedType__Group__11
            {
            pushFollow(FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1011302);
            rule__FixedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1011305);
            rule__FixedType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__10"


    // $ANTLR start "rule__FixedType__Group__10__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5710:1: rule__FixedType__Group__10__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5714:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5715:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5715:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5716:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__10__Impl11333); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__10__Impl"


    // $ANTLR start "rule__FixedType__Group__11"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5729:1: rule__FixedType__Group__11 : rule__FixedType__Group__11__Impl rule__FixedType__Group__12 ;
    public final void rule__FixedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5733:1: ( rule__FixedType__Group__11__Impl rule__FixedType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5734:2: rule__FixedType__Group__11__Impl rule__FixedType__Group__12
            {
            pushFollow(FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111364);
            rule__FixedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111367);
            rule__FixedType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__11"


    // $ANTLR start "rule__FixedType__Group__11__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5741:1: rule__FixedType__Group__11__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5745:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5746:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5746:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5747:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__11__Impl11395); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__11__Impl"


    // $ANTLR start "rule__FixedType__Group__12"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5760:1: rule__FixedType__Group__12 : rule__FixedType__Group__12__Impl rule__FixedType__Group__13 ;
    public final void rule__FixedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5764:1: ( rule__FixedType__Group__12__Impl rule__FixedType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5765:2: rule__FixedType__Group__12__Impl rule__FixedType__Group__13
            {
            pushFollow(FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211426);
            rule__FixedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211429);
            rule__FixedType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__12"


    // $ANTLR start "rule__FixedType__Group__12__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5772:1: rule__FixedType__Group__12__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5776:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5777:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5777:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5778:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__12__Impl11457); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__12__Impl"


    // $ANTLR start "rule__FixedType__Group__13"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5791:1: rule__FixedType__Group__13 : rule__FixedType__Group__13__Impl rule__FixedType__Group__14 ;
    public final void rule__FixedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5795:1: ( rule__FixedType__Group__13__Impl rule__FixedType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5796:2: rule__FixedType__Group__13__Impl rule__FixedType__Group__14
            {
            pushFollow(FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311488);
            rule__FixedType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311491);
            rule__FixedType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__13"


    // $ANTLR start "rule__FixedType__Group__13__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5803:1: rule__FixedType__Group__13__Impl : ( 'size' ) ;
    public final void rule__FixedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5807:1: ( ( 'size' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5808:1: ( 'size' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5808:1: ( 'size' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5809:1: 'size'
            {
             before(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 
            match(input,36,FOLLOW_36_in_rule__FixedType__Group__13__Impl11519); 
             after(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__13__Impl"


    // $ANTLR start "rule__FixedType__Group__14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5822:1: rule__FixedType__Group__14 : rule__FixedType__Group__14__Impl rule__FixedType__Group__15 ;
    public final void rule__FixedType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5826:1: ( rule__FixedType__Group__14__Impl rule__FixedType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5827:2: rule__FixedType__Group__14__Impl rule__FixedType__Group__15
            {
            pushFollow(FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411550);
            rule__FixedType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411553);
            rule__FixedType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__14"


    // $ANTLR start "rule__FixedType__Group__14__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5834:1: rule__FixedType__Group__14__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5838:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5839:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5839:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5840:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__14__Impl11581); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__14__Impl"


    // $ANTLR start "rule__FixedType__Group__15"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5853:1: rule__FixedType__Group__15 : rule__FixedType__Group__15__Impl rule__FixedType__Group__16 ;
    public final void rule__FixedType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5857:1: ( rule__FixedType__Group__15__Impl rule__FixedType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5858:2: rule__FixedType__Group__15__Impl rule__FixedType__Group__16
            {
            pushFollow(FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511612);
            rule__FixedType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511615);
            rule__FixedType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__15"


    // $ANTLR start "rule__FixedType__Group__15__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5865:1: rule__FixedType__Group__15__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5869:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5870:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5870:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5871:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__15__Impl11643); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__15__Impl"


    // $ANTLR start "rule__FixedType__Group__16"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5884:1: rule__FixedType__Group__16 : rule__FixedType__Group__16__Impl rule__FixedType__Group__17 ;
    public final void rule__FixedType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5888:1: ( rule__FixedType__Group__16__Impl rule__FixedType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5889:2: rule__FixedType__Group__16__Impl rule__FixedType__Group__17
            {
            pushFollow(FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611674);
            rule__FixedType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611677);
            rule__FixedType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__16"


    // $ANTLR start "rule__FixedType__Group__16__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5896:1: rule__FixedType__Group__16__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5900:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5901:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5901:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5902:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__16__Impl11705); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__16__Impl"


    // $ANTLR start "rule__FixedType__Group__17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5915:1: rule__FixedType__Group__17 : rule__FixedType__Group__17__Impl rule__FixedType__Group__18 ;
    public final void rule__FixedType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5919:1: ( rule__FixedType__Group__17__Impl rule__FixedType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5920:2: rule__FixedType__Group__17__Impl rule__FixedType__Group__18
            {
            pushFollow(FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711736);
            rule__FixedType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711739);
            rule__FixedType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__17"


    // $ANTLR start "rule__FixedType__Group__17__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5927:1: rule__FixedType__Group__17__Impl : ( ( rule__FixedType__SizeAssignment_17 ) ) ;
    public final void rule__FixedType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5931:1: ( ( ( rule__FixedType__SizeAssignment_17 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5932:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5932:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5933:1: ( rule__FixedType__SizeAssignment_17 )
            {
             before(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5934:1: ( rule__FixedType__SizeAssignment_17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5934:2: rule__FixedType__SizeAssignment_17
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11766);
            rule__FixedType__SizeAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__17__Impl"


    // $ANTLR start "rule__FixedType__Group__18"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5944:1: rule__FixedType__Group__18 : rule__FixedType__Group__18__Impl ;
    public final void rule__FixedType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5948:1: ( rule__FixedType__Group__18__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5949:2: rule__FixedType__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811796);
            rule__FixedType__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__18"


    // $ANTLR start "rule__FixedType__Group__18__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5955:1: rule__FixedType__Group__18__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5959:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5960:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5960:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5961:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_22_in_rule__FixedType__Group__18__Impl11824); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__Group__18__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6012:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6016:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6017:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011893);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011896);
            rule__Primitive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6024:1: rule__Primitive__Group__0__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6028:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6029:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6029:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6030:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__0__Impl11924); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6043:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6047:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6048:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111955);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111958);
            rule__Primitive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6055:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__TypeAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6059:1: ( ( ( rule__Primitive__TypeAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6060:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6060:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6061:1: ( rule__Primitive__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6062:1: ( rule__Primitive__TypeAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6062:2: rule__Primitive__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11985);
            rule__Primitive__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6072:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6076:1: ( rule__Primitive__Group__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6077:2: rule__Primitive__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__212015);
            rule__Primitive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2"


    // $ANTLR start "rule__Primitive__Group__2__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6083:1: rule__Primitive__Group__2__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6087:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6088:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6088:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6089:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__2__Impl12043); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6108:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6112:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6113:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__012080);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__012083);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6120:1: rule__Namespace__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6124:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6125:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6125:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6126:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl12110); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6137:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6141:1: ( rule__Namespace__Group__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6142:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__112139);
            rule__Namespace__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6148:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__Group_1__0 )* ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6152:1: ( ( ( rule__Namespace__Group_1__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6153:1: ( ( rule__Namespace__Group_1__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6153:1: ( ( rule__Namespace__Group_1__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6154:1: ( rule__Namespace__Group_1__0 )*
            {
             before(grammarAccess.getNamespaceAccess().getGroup_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6155:1: ( rule__Namespace__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6155:2: rule__Namespace__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl12166);
            	    rule__Namespace__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group_1__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6169:1: rule__Namespace__Group_1__0 : rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 ;
    public final void rule__Namespace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6173:1: ( rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6174:2: rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__012201);
            rule__Namespace__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__012204);
            rule__Namespace__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__0"


    // $ANTLR start "rule__Namespace__Group_1__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6181:1: rule__Namespace__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Namespace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6185:1: ( ( '.' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6186:1: ( '.' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6186:1: ( '.' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6187:1: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Namespace__Group_1__0__Impl12232); 
             after(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__0__Impl"


    // $ANTLR start "rule__Namespace__Group_1__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6200:1: rule__Namespace__Group_1__1 : rule__Namespace__Group_1__1__Impl ;
    public final void rule__Namespace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6204:1: ( rule__Namespace__Group_1__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6205:2: rule__Namespace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__112263);
            rule__Namespace__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__1"


    // $ANTLR start "rule__Namespace__Group_1__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6211:1: rule__Namespace__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6215:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6216:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6216:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6217:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl12290); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group_1__1__Impl"


    // $ANTLR start "rule__AvroSchema__TypesAssignment"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6233:1: rule__AvroSchema__TypesAssignment : ( ( rule__AvroSchema__TypesAlternatives_0 ) ) ;
    public final void rule__AvroSchema__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6237:1: ( ( ( rule__AvroSchema__TypesAlternatives_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6238:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6238:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6239:1: ( rule__AvroSchema__TypesAlternatives_0 )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6240:1: ( rule__AvroSchema__TypesAlternatives_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6240:2: rule__AvroSchema__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12328);
            rule__AvroSchema__TypesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvroSchema__TypesAssignment"


    // $ANTLR start "rule__UnionType__TypesAssignment_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6249:1: rule__UnionType__TypesAssignment_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6253:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6254:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6254:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6255:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112361);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__TypesAssignment_1"


    // $ANTLR start "rule__UnionType__TypesAssignment_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6264:1: rule__UnionType__TypesAssignment_2_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6268:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6269:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6269:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6270:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112392);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionType__TypesAssignment_2_1"


    // $ANTLR start "rule__UnionMember__RecordRefAssignment_6_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6279:1: rule__UnionMember__RecordRefAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnionMember__RecordRefAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6283:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6284:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6284:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6285:1: ( RULE_ID )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6286:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6287:1: RULE_ID
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UnionMember__RecordRefAssignment_6_112427); 
             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionMember__RecordRefAssignment_6_1"


    // $ANTLR start "rule__JsonType__TypeAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6298:1: rule__JsonType__TypeAssignment_6 : ( rulePrimitive ) ;
    public final void rule__JsonType__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6302:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6303:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6303:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6304:1: rulePrimitive
            {
             before(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612462);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__TypeAssignment_6"


    // $ANTLR start "rule__RecordType__NameAssignment_14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6313:1: rule__RecordType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6317:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6318:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6318:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6319:1: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412493); 
             after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_14"


    // $ANTLR start "rule__RecordType__NamespaceAssignment_16_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6328:1: rule__RecordType__NamespaceAssignment_16_6 : ( ruleNamespace ) ;
    public final void rule__RecordType__NamespaceAssignment_16_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6332:1: ( ( ruleNamespace ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6333:1: ( ruleNamespace )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6333:1: ( ruleNamespace )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6334:1: ruleNamespace
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612524);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NamespaceAssignment_16_6"


    // $ANTLR start "rule__RecordType__FieldListAssignment_23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6343:1: rule__RecordType__FieldListAssignment_23 : ( ruleFieldList ) ;
    public final void rule__RecordType__FieldListAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6347:1: ( ( ruleFieldList ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6348:1: ( ruleFieldList )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6348:1: ( ruleFieldList )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6349:1: ruleFieldList
            {
             before(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0()); 
            pushFollow(FOLLOW_ruleFieldList_in_rule__RecordType__FieldListAssignment_2312555);
            ruleFieldList();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__FieldListAssignment_23"


    // $ANTLR start "rule__FieldList__FieldsAssignment_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6358:1: rule__FieldList__FieldsAssignment_0 : ( ruleField ) ;
    public final void rule__FieldList__FieldsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6362:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6363:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6363:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6364:1: ruleField
            {
             before(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldList__FieldsAssignment_012586);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__FieldsAssignment_0"


    // $ANTLR start "rule__FieldList__FieldsAssignment_1_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6373:1: rule__FieldList__FieldsAssignment_1_1 : ( ruleField ) ;
    public final void rule__FieldList__FieldsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6377:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6378:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6378:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6379:1: ruleField
            {
             before(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldList__FieldsAssignment_1_112617);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldList__FieldsAssignment_1_1"


    // $ANTLR start "rule__Field__NameAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6388:1: rule__Field__NameAssignment_6 : ( ( rule__Field__NameAlternatives_6_0 ) ) ;
    public final void rule__Field__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6392:1: ( ( ( rule__Field__NameAlternatives_6_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6393:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6393:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6394:1: ( rule__Field__NameAlternatives_6_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6395:1: ( rule__Field__NameAlternatives_6_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6395:2: rule__Field__NameAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612648);
            rule__Field__NameAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_6"


    // $ANTLR start "rule__Field__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6404:1: rule__Field__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__Field__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6408:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6409:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6409:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6410:1: rulePrimitive
            {
             before(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012681);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__Field__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6419:1: rule__Field__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__Field__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6423:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6424:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6424:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6425:1: ruleRecordType
            {
             before(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112712);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RecordAssignment_13_1"


    // $ANTLR start "rule__Field__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6434:1: rule__Field__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6438:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6439:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6439:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6440:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6441:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6442:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112747); 
             after(grammarAccess.getFieldAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__Field__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6453:1: rule__Field__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__Field__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6457:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6458:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6458:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6459:1: ruleEnumType
            {
             before(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312782);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__EtypeAssignment_13_3"


    // $ANTLR start "rule__Field__ArrayAssignment_13_4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6468:1: rule__Field__ArrayAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__Field__ArrayAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6472:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6473:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6473:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6474:1: ruleArrayType
            {
             before(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412813);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ArrayAssignment_13_4"


    // $ANTLR start "rule__Field__MapAssignment_13_5"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6483:1: rule__Field__MapAssignment_13_5 : ( ruleMapType ) ;
    public final void rule__Field__MapAssignment_13_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6487:1: ( ( ruleMapType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6488:1: ( ruleMapType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6488:1: ( ruleMapType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6489:1: ruleMapType
            {
             before(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
            pushFollow(FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512844);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MapAssignment_13_5"


    // $ANTLR start "rule__Field__FixedAssignment_13_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6498:1: rule__Field__FixedAssignment_13_6 : ( ruleFixedType ) ;
    public final void rule__Field__FixedAssignment_13_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6502:1: ( ( ruleFixedType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6503:1: ( ruleFixedType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6503:1: ( ruleFixedType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6504:1: ruleFixedType
            {
             before(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
            pushFollow(FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612875);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FixedAssignment_13_6"


    // $ANTLR start "rule__Field__UnionAssignment_13_7"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6513:1: rule__Field__UnionAssignment_13_7 : ( ruleUnionType ) ;
    public final void rule__Field__UnionAssignment_13_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6517:1: ( ( ruleUnionType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6518:1: ( ruleUnionType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6518:1: ( ruleUnionType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6519:1: ruleUnionType
            {
             before(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 
            pushFollow(FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712906);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__UnionAssignment_13_7"


    // $ANTLR start "rule__EnumType__NameAssignment_14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6528:1: rule__EnumType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6532:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6533:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6533:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6534:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412937); 
             after(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__NameAssignment_14"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_22_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6543:1: rule__EnumType__SymbolsAssignment_22_1 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6547:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6548:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6548:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6549:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112968); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__SymbolsAssignment_22_1"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_23_2"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6558:1: rule__EnumType__SymbolsAssignment_23_2 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6562:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6563:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6563:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6564:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212999); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__SymbolsAssignment_23_2"


    // $ANTLR start "rule__ArrayType__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6573:1: rule__ArrayType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__ArrayType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6577:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6578:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6578:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6579:1: rulePrimitive
            {
             before(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_013030);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__ArrayType__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6588:1: rule__ArrayType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__ArrayType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6592:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6593:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6593:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6594:1: ruleRecordType
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_113061);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__RecordAssignment_13_1"


    // $ANTLR start "rule__ArrayType__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6603:1: rule__ArrayType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6607:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6608:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6608:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6609:1: ( RULE_ID )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6610:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6611:1: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_113096); 
             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__ArrayType__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6622:1: rule__ArrayType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__ArrayType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6626:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6627:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6627:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6628:1: ruleEnumType
            {
             before(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_313131);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__PrimitiveAssignment_13_0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6637:1: rule__MapType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__MapType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6641:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6642:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6642:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6643:1: rulePrimitive
            {
             before(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_013162);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__MapType__RecordAssignment_13_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6652:1: rule__MapType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__MapType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6656:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6657:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6657:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6658:1: ruleRecordType
            {
             before(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_113193);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__RecordAssignment_13_1"


    // $ANTLR start "rule__MapType__RecordRefAssignment_13_2_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6667:1: rule__MapType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6671:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6672:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6672:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6673:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6674:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6675:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_113228); 
             after(grammarAccess.getMapTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__MapType__EtypeAssignment_13_3"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6686:1: rule__MapType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__MapType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6690:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6691:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6691:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6692:1: ruleEnumType
            {
             before(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_313263);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__AtypeAssignment_13_4"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6701:1: rule__MapType__AtypeAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__MapType__AtypeAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6705:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6706:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6706:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6707:1: ruleArrayType
            {
             before(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_413294);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__AtypeAssignment_13_4"


    // $ANTLR start "rule__FixedType__NameAssignment_9"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6716:1: rule__FixedType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__FixedType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6720:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6721:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6721:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6722:1: RULE_ID
            {
             before(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_913325); 
             after(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__NameAssignment_9"


    // $ANTLR start "rule__FixedType__SizeAssignment_17"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6731:1: rule__FixedType__SizeAssignment_17 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6735:1: ( ( RULE_INT ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6736:1: ( RULE_INT )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6736:1: ( RULE_INT )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6737:1: RULE_INT
            {
             before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1713356); 
             after(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedType__SizeAssignment_17"


    // $ANTLR start "rule__Primitive__TypeAssignment_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6746:1: rule__Primitive__TypeAssignment_1 : ( ( rule__Primitive__TypeAlternatives_1_0 ) ) ;
    public final void rule__Primitive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6750:1: ( ( ( rule__Primitive__TypeAlternatives_1_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6751:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6751:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6752:1: ( rule__Primitive__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6753:1: ( rule__Primitive__TypeAlternatives_1_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6753:2: rule__Primitive__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_113387);
            rule__Primitive__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\23\1\26\1\uffff\1\30\1\26\1\31\2\26\2\uffff";
    static final String DFA1_maxS =
        "\1\27\1\26\1\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\4\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "424:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );";
        }
    }
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\2\26\1\4\1\30\3\uffff\1\26\1\31\1\26\1\33\4\uffff";
    static final String DFA2_maxS =
        "\1\27\1\26\1\43\1\30\3\uffff\1\26\1\31\1\26\1\42\4\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\6\1\3\1\7\4\uffff\1\1\1\5\1\4\1\2";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1",
            "\1\3",
            "\1\6\6\uffff\10\5\20\uffff\1\4",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\2\uffff\1\14\1\uffff\1\16\1\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "452:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\23\1\4\1\26\4\uffff\1\30\1\26\1\31\1\26\1\33\4\uffff";
    static final String DFA4_maxS =
        "\1\27\1\43\1\26\4\uffff\1\30\1\26\1\31\1\26\1\42\4\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\10\1\3\1\1\1\7\5\uffff\1\2\1\5\1\6\1\4";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\1\1\2",
            "\1\4\6\uffff\10\5\20\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\2\uffff\1\17\1\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "528:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );";
        }
    }
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
    static final String DFA5_maxS =
        "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\36\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\4\1\2";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2",
            "\1\4\6\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\2\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "586:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\3\uffff";
    static final String DFA6_maxS =
        "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\1\1\5\uffff\1\4\1\5\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\2",
            "\1\3\6\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\14\2\uffff\1\12\1\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "620:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroSchema68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAssignment_in_ruleAvroSchema94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_entryRuleUnionType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0_in_ruleUnionType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_entryRuleUnionMember181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionMember188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Alternatives_in_ruleUnionMember214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0_in_ruleJsonType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldList_in_entryRuleFieldList361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldList368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__Group__0_in_ruleFieldList394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0_in_ruleMapType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0_in_ruleFixedType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__0_in_rule__UnionMember__Alternatives1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__NameAlternatives_6_01052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_01071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UnionAssignment_13_7_in_rule__Field__Alternatives_131229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01627 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnionType__Group__0__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11689 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21749 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1779 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UnionType__Group__3__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01877 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__0__Impl_in_rule__UnionMember__Group_6__02000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__1_in_rule__UnionMember__Group_6__02003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnionMember__Group_6__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__1__Impl_in_rule__UnionMember__Group_6__12062 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__2_in_rule__UnionMember__Group_6__12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__RecordRefAssignment_6_1_in_rule__UnionMember__Group_6__1__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionMember__Group_6__2__Impl_in_rule__UnionMember__Group_6__22122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnionMember__Group_6__2__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__02187 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__02190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__0__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__12249 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__1__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonType__Group__2__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32373 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__3__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42435 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonType__Group__4__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52497 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__5__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72619 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__7__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonType__Group__8__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02758 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12820 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22882 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__2__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__3__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43006 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__4__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53068 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__5__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordType__Group__6__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73192 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__73195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__7__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__83254 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__83257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__8__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93316 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__9__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103378 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RecordType__Group__10__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113440 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__11__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123502 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__12__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__13__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143626 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153686 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__15__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163748 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173809 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__17__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183871 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__18__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193933 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecordType__Group__19__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203995 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__20__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__214057 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__214060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__21__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__224119 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__224122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group__22__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__234181 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__234184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldListAssignment_23_in_rule__RecordType__Group__23__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__244241 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__244244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group__24__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group__25__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04414 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14476 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24538 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34600 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__3__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__5__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64786 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_16__7__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__Group__0__Impl_in_rule__FieldList__Group__04921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FieldList__Group__1_in_rule__FieldList__Group__04924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__FieldsAssignment_0_in_rule__FieldList__Group__0__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__Group__1__Impl_in_rule__FieldList__Group__14981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__Group_1__0_in_rule__FieldList__Group__1__Impl5008 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FieldList__Group_1__0__Impl_in_rule__FieldList__Group_1__05043 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FieldList__Group_1__1_in_rule__FieldList__Group_1__05046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FieldList__Group_1__0__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__Group_1__1__Impl_in_rule__FieldList__Group_1__15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldList__FieldsAssignment_1_1_in_rule__FieldList__Group_1__1__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05166 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__0__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15228 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__1__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25290 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__Group__2__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35352 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__3__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45414 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__4__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55476 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__5__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65538 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75598 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__7__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85660 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__8__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95722 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__9__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105784 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__10__Impl5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115846 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__11__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125908 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__12__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135970 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__146030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__14__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__06119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__06122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_13_2__0__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__16181 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__16184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__26241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group_13_2__2__Impl6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__06306 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__06309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__0__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16368 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__1__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26430 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumType__Group__2__Impl6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__3__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46554 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__4__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56616 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__5__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66678 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumType__Group__6__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76740 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__7__Impl6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86802 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__8__Impl6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96864 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__9__Impl6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106926 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EnumType__Group__10__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116988 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__11__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__127050 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__127053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__12__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__137112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__137115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__13__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__147174 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__147177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__157234 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__157237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__15__Impl7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__167296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__167299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__16__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__17__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187420 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumType__Group__18__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__19__Impl7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207544 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__20__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217606 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumType__Group__21__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227668 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237728 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7758 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247789 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumType__Group__24__Impl7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumType__Group__25__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_22__0__Impl7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__18024 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__18027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__28084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_22__2__Impl8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__08149 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__08152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group_23__0__Impl8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__18211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_23__1__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__28273 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__28276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__38333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group_23__3__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08400 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__0__Impl8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18462 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__1__Impl8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28524 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArrayType__Group__2__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38586 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__3__Impl8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48648 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__4__Impl8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58710 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__5__Impl8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68772 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__Group__6__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78834 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__7__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayType__Group__8__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__9__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__109020 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__109023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ArrayType__Group__10__Impl9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__119082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__119085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__11__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__129144 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__129147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__12__Impl9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__139206 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__139209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__149266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ArrayType__Group__14__Impl9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group_13_2__0__Impl9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19417 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group_13_2__2__Impl9505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09542 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__0__Impl9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19604 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__1__Impl9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29666 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapType__Group__2__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39728 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__3__Impl9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49790 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__4__Impl9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59852 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__5__Impl9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69914 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapType__Group__6__Impl9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__7__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__810038 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__810041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapType__Group__8__Impl10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__910100 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__910103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__9__Impl10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__1010162 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__1010165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MapType__Group__10__Impl10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__1110224 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__1110227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__11__Impl10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__1210286 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__1210289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__12__Impl10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310348 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapType__Group__14__Impl10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group_13_2__0__Impl10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group_13_2__2__Impl10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010684 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__0__Impl10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110746 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FixedType__Group__1__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210808 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__2__Impl10839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310870 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__3__Impl10901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410932 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__4__Impl10963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510994 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__FixedType__Group__5__Impl11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__611056 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__611059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__6__Impl11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__711118 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__711121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__7__Impl11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__811180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__811183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__8__Impl11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__911242 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__911245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl11272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1011302 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1011305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__10__Impl11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111364 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__11__Impl11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211426 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__12__Impl11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311488 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FixedType__Group__13__Impl11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411550 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__14__Impl11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511612 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__15__Impl11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__16__Impl11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711736 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FixedType__Group__18__Impl11824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011893 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__0__Impl11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111955 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__212015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__2__Impl12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__012080 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__012083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__112139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl12166 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__012201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__012204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Namespace__Group_1__0__Impl12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__112263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl12290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UnionMember__RecordRefAssignment_6_112427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldList_in_rule__RecordType__FieldListAssignment_2312555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldList__FieldsAssignment_012586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldList__FieldsAssignment_1_112617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__Field__UnionAssignment_13_712906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_013030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_113061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_113096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_313131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_013162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_113193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_113228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_313263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_413294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_913325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1713356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_113387 = new BitSet(new long[]{0x0000000000000002L});

}