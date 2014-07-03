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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'['", "']'", "','", "'{'", "'\"'", "'type'", "':'", "'}'", "'record'", "'fields'", "'namespace'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'.'"
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


    // $ANTLR start "entryRuleField"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:201:1: ( ruleField EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField361);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField368); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:1: ( rule__Field__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:216:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField394);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:228:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:229:1: ( ruleEnumType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:230:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType421);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType428); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:237:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:241:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:242:1: ( ( rule__EnumType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:243:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:1: ( rule__EnumType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:244:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType454);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:256:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:257:1: ( ruleArrayType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:258:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType481);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType488); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:265:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:269:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:271:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:1: ( rule__ArrayType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:272:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:284:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:285:1: ( ruleMapType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:286:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType541);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType548); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:293:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:297:2: ( ( ( rule__MapType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__MapType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:298:1: ( ( rule__MapType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:299:1: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:1: ( rule__MapType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:300:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_rule__MapType__Group__0_in_ruleMapType574);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:312:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:313:1: ( ruleFixedType EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:314:1: ruleFixedType EOF
            {
             before(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType601);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFixedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType608); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:321:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:325:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__FixedType__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:326:1: ( ( rule__FixedType__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:327:1: ( rule__FixedType__Group__0 )
            {
             before(grammarAccess.getFixedTypeAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:1: ( rule__FixedType__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:328:2: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0_in_ruleFixedType634);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:340:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:341:1: ( rulePrimitive EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:342:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive661);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive668); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:349:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:353:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:354:1: ( ( rule__Primitive__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:355:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:1: ( rule__Primitive__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:356:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive694);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:368:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:369:1: ( ruleNamespace EOF )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:370:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace721);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace728); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:377:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:381:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:382:1: ( ( rule__Namespace__Group__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:383:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:1: ( rule__Namespace__Group__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:384:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace754);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:396:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );
    public final void rule__AvroSchema__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:400:1: ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:401:1: ( ruleJsonType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:401:1: ( ruleJsonType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:402:1: ruleJsonType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0790);
                    ruleJsonType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:407:6: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:407:6: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:408:1: ruleRecordType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0807);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:413:6: ( ruleUnionType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:413:6: ( ruleUnionType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:414:1: ruleUnionType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0824);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) );
    public final void rule__UnionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:428:1: ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) )
            int alt2=6;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:429:1: ( ruleRecordType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:430:1: ruleRecordType
                    {
                     before(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives856);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:435:6: ( ruleArrayType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:436:1: ruleArrayType
                    {
                     before(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives873);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:441:6: ( rulePrimitive )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:442:1: rulePrimitive
                    {
                     before(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives890);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:447:6: ( ruleMapType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:447:6: ( ruleMapType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:448:1: ruleMapType
                    {
                     before(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives907);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:453:6: ( ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:453:6: ( ruleEnumType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:454:1: ruleEnumType
                    {
                     before(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives924);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:459:6: ( ruleFixedType )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:459:6: ( ruleFixedType )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:460:1: ruleFixedType
                    {
                     before(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives941);
                    ruleFixedType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:470:1: rule__Field__NameAlternatives_6_0 : ( ( 'name' ) | ( RULE_ID ) );
    public final void rule__Field__NameAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:474:1: ( ( 'name' ) | ( RULE_ID ) )
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
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:1: ( 'name' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:475:1: ( 'name' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:476:1: 'name'
                    {
                     before(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__Field__NameAlternatives_6_0974); 
                     after(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:483:6: ( RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:483:6: ( RULE_ID )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:484:1: RULE_ID
                    {
                     before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_0993); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:494:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) );
    public final void rule__Field__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:498:1: ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:499:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:499:1: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:500:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:501:1: ( rule__Field__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:501:2: rule__Field__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131025);
                    rule__Field__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:505:6: ( ( rule__Field__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:506:1: ( rule__Field__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:1: ( rule__Field__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:507:2: rule__Field__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131043);
                    rule__Field__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:511:6: ( ( rule__Field__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:512:1: ( rule__Field__Group_13_2__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:1: ( rule__Field__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:513:2: rule__Field__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131061);
                    rule__Field__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:517:6: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:518:1: ( rule__Field__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:1: ( rule__Field__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:519:2: rule__Field__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131079);
                    rule__Field__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:523:6: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:524:1: ( rule__Field__ArrayAssignment_13_4 )
                    {
                     before(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:1: ( rule__Field__ArrayAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:525:2: rule__Field__ArrayAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131097);
                    rule__Field__ArrayAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:529:6: ( ( rule__Field__MapAssignment_13_5 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:530:1: ( rule__Field__MapAssignment_13_5 )
                    {
                     before(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:1: ( rule__Field__MapAssignment_13_5 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:531:2: rule__Field__MapAssignment_13_5
                    {
                    pushFollow(FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131115);
                    rule__Field__MapAssignment_13_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:535:6: ( ( rule__Field__FixedAssignment_13_6 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:536:1: ( rule__Field__FixedAssignment_13_6 )
                    {
                     before(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:1: ( rule__Field__FixedAssignment_13_6 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:537:2: rule__Field__FixedAssignment_13_6
                    {
                    pushFollow(FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131133);
                    rule__Field__FixedAssignment_13_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:546:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );
    public final void rule__ArrayType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:550:1: ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:551:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:551:1: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:552:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:553:1: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:553:2: rule__ArrayType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131166);
                    rule__ArrayType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:557:6: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:558:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:1: ( rule__ArrayType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:559:2: rule__ArrayType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131184);
                    rule__ArrayType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:563:6: ( ( rule__ArrayType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:564:1: ( rule__ArrayType__Group_13_2__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:1: ( rule__ArrayType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:565:2: rule__ArrayType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131202);
                    rule__ArrayType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:569:6: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:570:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:1: ( rule__ArrayType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:571:2: rule__ArrayType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131220);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:580:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );
    public final void rule__MapType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:584:1: ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:585:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:585:1: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:586:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:587:1: ( rule__MapType__PrimitiveAssignment_13_0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:587:2: rule__MapType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131253);
                    rule__MapType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:591:6: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:592:1: ( rule__MapType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:1: ( rule__MapType__RecordAssignment_13_1 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:593:2: rule__MapType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131271);
                    rule__MapType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__MapType__Group_13_2__0 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:597:6: ( ( rule__MapType__Group_13_2__0 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:598:1: ( rule__MapType__Group_13_2__0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getGroup_13_2()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:1: ( rule__MapType__Group_13_2__0 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:599:2: rule__MapType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131289);
                    rule__MapType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:603:6: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:604:1: ( rule__MapType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:1: ( rule__MapType__EtypeAssignment_13_3 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:605:2: rule__MapType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131307);
                    rule__MapType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:609:6: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:610:1: ( rule__MapType__AtypeAssignment_13_4 )
                    {
                     before(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:1: ( rule__MapType__AtypeAssignment_13_4 )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:611:2: rule__MapType__AtypeAssignment_13_4
                    {
                    pushFollow(FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131325);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:620:1: rule__Primitive__TypeAlternatives_1_0 : ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__Primitive__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:624:1: ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
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
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:625:1: ( 'null' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:625:1: ( 'null' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:626:1: 'null'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01359); 
                     after(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:633:6: ( 'boolean' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:633:6: ( 'boolean' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:634:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01379); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:641:6: ( 'int' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:641:6: ( 'int' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:642:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01399); 
                     after(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:649:6: ( 'long' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:649:6: ( 'long' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:650:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01419); 
                     after(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:657:6: ( 'float' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:657:6: ( 'float' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:658:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01439); 
                     after(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:665:6: ( 'double' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:665:6: ( 'double' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:666:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 
                    match(input,16,FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01459); 
                     after(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:673:6: ( 'bytes' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:673:6: ( 'bytes' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:674:1: 'bytes'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 
                    match(input,17,FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01479); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:681:6: ( 'string' )
                    {
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:681:6: ( 'string' )
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:682:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 
                    match(input,18,FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01499); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:696:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:700:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:701:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01531);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01534);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:708:1: rule__UnionType__Group__0__Impl : ( '[' ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:712:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:713:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:713:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:714:1: '['
            {
             before(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__UnionType__Group__0__Impl1562); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:727:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl rule__UnionType__Group__2 ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:731:1: ( rule__UnionType__Group__1__Impl rule__UnionType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:732:2: rule__UnionType__Group__1__Impl rule__UnionType__Group__2
            {
            pushFollow(FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11593);
            rule__UnionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11596);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:739:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__TypesAssignment_1 ) ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:743:1: ( ( ( rule__UnionType__TypesAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:744:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:744:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:745:1: ( rule__UnionType__TypesAssignment_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:746:1: ( rule__UnionType__TypesAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:746:2: rule__UnionType__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1623);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:756:1: rule__UnionType__Group__2 : rule__UnionType__Group__2__Impl rule__UnionType__Group__3 ;
    public final void rule__UnionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:760:1: ( rule__UnionType__Group__2__Impl rule__UnionType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:761:2: rule__UnionType__Group__2__Impl rule__UnionType__Group__3
            {
            pushFollow(FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21653);
            rule__UnionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21656);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:768:1: rule__UnionType__Group__2__Impl : ( ( rule__UnionType__Group_2__0 )* ) ;
    public final void rule__UnionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:772:1: ( ( ( rule__UnionType__Group_2__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:773:1: ( ( rule__UnionType__Group_2__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:773:1: ( ( rule__UnionType__Group_2__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:774:1: ( rule__UnionType__Group_2__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:775:1: ( rule__UnionType__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:775:2: rule__UnionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1683);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:785:1: rule__UnionType__Group__3 : rule__UnionType__Group__3__Impl ;
    public final void rule__UnionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:789:1: ( rule__UnionType__Group__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:790:2: rule__UnionType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31714);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:796:1: rule__UnionType__Group__3__Impl : ( ']' ) ;
    public final void rule__UnionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:800:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:801:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:801:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:802:1: ']'
            {
             before(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__UnionType__Group__3__Impl1742); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:823:1: rule__UnionType__Group_2__0 : rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 ;
    public final void rule__UnionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:827:1: ( rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:828:2: rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01781);
            rule__UnionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01784);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:835:1: rule__UnionType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:839:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:840:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:840:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:841:1: ','
            {
             before(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1812); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:854:1: rule__UnionType__Group_2__1 : rule__UnionType__Group_2__1__Impl ;
    public final void rule__UnionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:858:1: ( rule__UnionType__Group_2__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:859:2: rule__UnionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11843);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:865:1: rule__UnionType__Group_2__1__Impl : ( ( rule__UnionType__TypesAssignment_2_1 ) ) ;
    public final void rule__UnionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:869:1: ( ( ( rule__UnionType__TypesAssignment_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:870:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:870:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:871:1: ( rule__UnionType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:872:1: ( rule__UnionType__TypesAssignment_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:872:2: rule__UnionType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1870);
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


    // $ANTLR start "rule__JsonType__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:886:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:890:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:891:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__01904);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__01907);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:898:1: rule__JsonType__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:902:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:903:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:903:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:904:1: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__JsonType__Group__0__Impl1935); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:917:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:921:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:922:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__11966);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__11969);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:929:1: rule__JsonType__Group__1__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:933:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:934:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:934:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:935:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__1__Impl1997); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:948:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl rule__JsonType__Group__3 ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:952:1: ( rule__JsonType__Group__2__Impl rule__JsonType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:953:2: rule__JsonType__Group__2__Impl rule__JsonType__Group__3
            {
            pushFollow(FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22028);
            rule__JsonType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22031);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:960:1: rule__JsonType__Group__2__Impl : ( 'type' ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:964:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:965:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:965:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:966:1: 'type'
            {
             before(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__JsonType__Group__2__Impl2059); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:979:1: rule__JsonType__Group__3 : rule__JsonType__Group__3__Impl rule__JsonType__Group__4 ;
    public final void rule__JsonType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:983:1: ( rule__JsonType__Group__3__Impl rule__JsonType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:984:2: rule__JsonType__Group__3__Impl rule__JsonType__Group__4
            {
            pushFollow(FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32090);
            rule__JsonType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32093);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:991:1: rule__JsonType__Group__3__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:995:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:996:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:996:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:997:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__3__Impl2121); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1010:1: rule__JsonType__Group__4 : rule__JsonType__Group__4__Impl rule__JsonType__Group__5 ;
    public final void rule__JsonType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1014:1: ( rule__JsonType__Group__4__Impl rule__JsonType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1015:2: rule__JsonType__Group__4__Impl rule__JsonType__Group__5
            {
            pushFollow(FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42152);
            rule__JsonType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42155);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1022:1: rule__JsonType__Group__4__Impl : ( ':' ) ;
    public final void rule__JsonType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1026:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1027:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1027:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1028:1: ':'
            {
             before(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__JsonType__Group__4__Impl2183); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1041:1: rule__JsonType__Group__5 : rule__JsonType__Group__5__Impl rule__JsonType__Group__6 ;
    public final void rule__JsonType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1045:1: ( rule__JsonType__Group__5__Impl rule__JsonType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1046:2: rule__JsonType__Group__5__Impl rule__JsonType__Group__6
            {
            pushFollow(FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52214);
            rule__JsonType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52217);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1053:1: rule__JsonType__Group__5__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1057:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1058:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1058:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1059:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__5__Impl2245); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1072:1: rule__JsonType__Group__6 : rule__JsonType__Group__6__Impl rule__JsonType__Group__7 ;
    public final void rule__JsonType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1076:1: ( rule__JsonType__Group__6__Impl rule__JsonType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1077:2: rule__JsonType__Group__6__Impl rule__JsonType__Group__7
            {
            pushFollow(FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62276);
            rule__JsonType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62279);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1084:1: rule__JsonType__Group__6__Impl : ( ( rule__JsonType__TypeAssignment_6 ) ) ;
    public final void rule__JsonType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1088:1: ( ( ( rule__JsonType__TypeAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1089:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1089:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1090:1: ( rule__JsonType__TypeAssignment_6 )
            {
             before(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1091:1: ( rule__JsonType__TypeAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1091:2: rule__JsonType__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2306);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1101:1: rule__JsonType__Group__7 : rule__JsonType__Group__7__Impl rule__JsonType__Group__8 ;
    public final void rule__JsonType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1105:1: ( rule__JsonType__Group__7__Impl rule__JsonType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1106:2: rule__JsonType__Group__7__Impl rule__JsonType__Group__8
            {
            pushFollow(FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72336);
            rule__JsonType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72339);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1113:1: rule__JsonType__Group__7__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1117:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1118:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1118:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1119:1: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__JsonType__Group__7__Impl2367); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1132:1: rule__JsonType__Group__8 : rule__JsonType__Group__8__Impl ;
    public final void rule__JsonType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1136:1: ( rule__JsonType__Group__8__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1137:2: rule__JsonType__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82398);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1143:1: rule__JsonType__Group__8__Impl : ( '}' ) ;
    public final void rule__JsonType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1147:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1148:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1148:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1149:1: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__JsonType__Group__8__Impl2426); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1180:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1184:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1185:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02475);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02478);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1192:1: rule__RecordType__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1196:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1197:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1197:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1198:1: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RecordType__Group__0__Impl2506); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1211:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1215:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1216:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12537);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12540);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1223:1: rule__RecordType__Group__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1227:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1228:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1228:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1229:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__1__Impl2568); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1242:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1246:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1247:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22599);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22602);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1254:1: rule__RecordType__Group__2__Impl : ( 'type' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1258:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1259:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1259:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1260:1: 'type'
            {
             before(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__2__Impl2630); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1273:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1277:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1278:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32661);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32664);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1285:1: rule__RecordType__Group__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1289:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1290:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1290:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1291:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__3__Impl2692); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1304:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1308:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1309:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42723);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42726);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1316:1: rule__RecordType__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1320:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1321:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1321:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1322:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__4__Impl2754); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1335:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1339:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1340:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__52785);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__52788);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1347:1: rule__RecordType__Group__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1351:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1352:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1352:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1353:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__5__Impl2816); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1366:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1370:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1371:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__62847);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__62850);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1378:1: rule__RecordType__Group__6__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1382:1: ( ( 'record' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1383:1: ( 'record' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1383:1: ( 'record' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1384:1: 'record'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__RecordType__Group__6__Impl2878); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1397:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1401:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1402:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__72909);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__72912);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1409:1: rule__RecordType__Group__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1413:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1414:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1414:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1415:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__7__Impl2940); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1428:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1432:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1433:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__82971);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__82974);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1440:1: rule__RecordType__Group__8__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1444:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1445:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1445:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1446:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__8__Impl3002); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1459:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl rule__RecordType__Group__10 ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1463:1: ( rule__RecordType__Group__9__Impl rule__RecordType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1464:2: rule__RecordType__Group__9__Impl rule__RecordType__Group__10
            {
            pushFollow(FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93033);
            rule__RecordType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93036);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1471:1: rule__RecordType__Group__9__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1475:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1476:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1476:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1477:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__9__Impl3064); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1490:1: rule__RecordType__Group__10 : rule__RecordType__Group__10__Impl rule__RecordType__Group__11 ;
    public final void rule__RecordType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1494:1: ( rule__RecordType__Group__10__Impl rule__RecordType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1495:2: rule__RecordType__Group__10__Impl rule__RecordType__Group__11
            {
            pushFollow(FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103095);
            rule__RecordType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103098);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1502:1: rule__RecordType__Group__10__Impl : ( 'name' ) ;
    public final void rule__RecordType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1506:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1507:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1507:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1508:1: 'name'
            {
             before(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__RecordType__Group__10__Impl3126); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1521:1: rule__RecordType__Group__11 : rule__RecordType__Group__11__Impl rule__RecordType__Group__12 ;
    public final void rule__RecordType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1525:1: ( rule__RecordType__Group__11__Impl rule__RecordType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1526:2: rule__RecordType__Group__11__Impl rule__RecordType__Group__12
            {
            pushFollow(FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113157);
            rule__RecordType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113160);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1533:1: rule__RecordType__Group__11__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1537:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1538:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1538:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1539:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__11__Impl3188); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1552:1: rule__RecordType__Group__12 : rule__RecordType__Group__12__Impl rule__RecordType__Group__13 ;
    public final void rule__RecordType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1556:1: ( rule__RecordType__Group__12__Impl rule__RecordType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1557:2: rule__RecordType__Group__12__Impl rule__RecordType__Group__13
            {
            pushFollow(FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123219);
            rule__RecordType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123222);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1564:1: rule__RecordType__Group__12__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1568:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1569:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1569:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1570:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__12__Impl3250); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1583:1: rule__RecordType__Group__13 : rule__RecordType__Group__13__Impl rule__RecordType__Group__14 ;
    public final void rule__RecordType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1587:1: ( rule__RecordType__Group__13__Impl rule__RecordType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1588:2: rule__RecordType__Group__13__Impl rule__RecordType__Group__14
            {
            pushFollow(FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133281);
            rule__RecordType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133284);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1595:1: rule__RecordType__Group__13__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1599:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1600:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1600:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1601:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__13__Impl3312); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1614:1: rule__RecordType__Group__14 : rule__RecordType__Group__14__Impl rule__RecordType__Group__15 ;
    public final void rule__RecordType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1618:1: ( rule__RecordType__Group__14__Impl rule__RecordType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1619:2: rule__RecordType__Group__14__Impl rule__RecordType__Group__15
            {
            pushFollow(FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143343);
            rule__RecordType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143346);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1626:1: rule__RecordType__Group__14__Impl : ( ( rule__RecordType__NameAssignment_14 ) ) ;
    public final void rule__RecordType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1630:1: ( ( ( rule__RecordType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1631:1: ( ( rule__RecordType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1631:1: ( ( rule__RecordType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1632:1: ( rule__RecordType__NameAssignment_14 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1633:1: ( rule__RecordType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1633:2: rule__RecordType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3373);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1643:1: rule__RecordType__Group__15 : rule__RecordType__Group__15__Impl rule__RecordType__Group__16 ;
    public final void rule__RecordType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1647:1: ( rule__RecordType__Group__15__Impl rule__RecordType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1648:2: rule__RecordType__Group__15__Impl rule__RecordType__Group__16
            {
            pushFollow(FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153403);
            rule__RecordType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153406);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1655:1: rule__RecordType__Group__15__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1659:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1660:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1660:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1661:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__15__Impl3434); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1674:1: rule__RecordType__Group__16 : rule__RecordType__Group__16__Impl rule__RecordType__Group__17 ;
    public final void rule__RecordType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1678:1: ( rule__RecordType__Group__16__Impl rule__RecordType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1679:2: rule__RecordType__Group__16__Impl rule__RecordType__Group__17
            {
            pushFollow(FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163465);
            rule__RecordType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163468);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1686:1: rule__RecordType__Group__16__Impl : ( ( rule__RecordType__Group_16__0 )? ) ;
    public final void rule__RecordType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1690:1: ( ( ( rule__RecordType__Group_16__0 )? ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1691:1: ( ( rule__RecordType__Group_16__0 )? )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1691:1: ( ( rule__RecordType__Group_16__0 )? )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1692:1: ( rule__RecordType__Group_16__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_16()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1693:1: ( rule__RecordType__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1693:2: rule__RecordType__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3495);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1703:1: rule__RecordType__Group__17 : rule__RecordType__Group__17__Impl rule__RecordType__Group__18 ;
    public final void rule__RecordType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1707:1: ( rule__RecordType__Group__17__Impl rule__RecordType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1708:2: rule__RecordType__Group__17__Impl rule__RecordType__Group__18
            {
            pushFollow(FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173526);
            rule__RecordType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173529);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1715:1: rule__RecordType__Group__17__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1719:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1720:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1720:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1721:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__17__Impl3557); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1734:1: rule__RecordType__Group__18 : rule__RecordType__Group__18__Impl rule__RecordType__Group__19 ;
    public final void rule__RecordType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1738:1: ( rule__RecordType__Group__18__Impl rule__RecordType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1739:2: rule__RecordType__Group__18__Impl rule__RecordType__Group__19
            {
            pushFollow(FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183588);
            rule__RecordType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183591);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1746:1: rule__RecordType__Group__18__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1750:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1751:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1751:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1752:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__18__Impl3619); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1765:1: rule__RecordType__Group__19 : rule__RecordType__Group__19__Impl rule__RecordType__Group__20 ;
    public final void rule__RecordType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1769:1: ( rule__RecordType__Group__19__Impl rule__RecordType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1770:2: rule__RecordType__Group__19__Impl rule__RecordType__Group__20
            {
            pushFollow(FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193650);
            rule__RecordType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193653);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1777:1: rule__RecordType__Group__19__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1781:1: ( ( 'fields' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1782:1: ( 'fields' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1782:1: ( 'fields' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1783:1: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 
            match(input,28,FOLLOW_28_in_rule__RecordType__Group__19__Impl3681); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1796:1: rule__RecordType__Group__20 : rule__RecordType__Group__20__Impl rule__RecordType__Group__21 ;
    public final void rule__RecordType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1800:1: ( rule__RecordType__Group__20__Impl rule__RecordType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1801:2: rule__RecordType__Group__20__Impl rule__RecordType__Group__21
            {
            pushFollow(FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203712);
            rule__RecordType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203715);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1808:1: rule__RecordType__Group__20__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1812:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1813:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1813:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1814:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group__20__Impl3743); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1827:1: rule__RecordType__Group__21 : rule__RecordType__Group__21__Impl rule__RecordType__Group__22 ;
    public final void rule__RecordType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1831:1: ( rule__RecordType__Group__21__Impl rule__RecordType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1832:2: rule__RecordType__Group__21__Impl rule__RecordType__Group__22
            {
            pushFollow(FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213774);
            rule__RecordType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__213777);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1839:1: rule__RecordType__Group__21__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1843:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1844:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1844:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1845:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__21__Impl3805); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1858:1: rule__RecordType__Group__22 : rule__RecordType__Group__22__Impl rule__RecordType__Group__23 ;
    public final void rule__RecordType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1862:1: ( rule__RecordType__Group__22__Impl rule__RecordType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1863:2: rule__RecordType__Group__22__Impl rule__RecordType__Group__23
            {
            pushFollow(FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__223836);
            rule__RecordType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__223839);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1870:1: rule__RecordType__Group__22__Impl : ( '[' ) ;
    public final void rule__RecordType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1874:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1875:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1875:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1876:1: '['
            {
             before(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 
            match(input,19,FOLLOW_19_in_rule__RecordType__Group__22__Impl3867); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1889:1: rule__RecordType__Group__23 : rule__RecordType__Group__23__Impl rule__RecordType__Group__24 ;
    public final void rule__RecordType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1893:1: ( rule__RecordType__Group__23__Impl rule__RecordType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1894:2: rule__RecordType__Group__23__Impl rule__RecordType__Group__24
            {
            pushFollow(FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__233898);
            rule__RecordType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__233901);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1901:1: rule__RecordType__Group__23__Impl : ( ( rule__RecordType__FieldsAssignment_23 ) ) ;
    public final void rule__RecordType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1905:1: ( ( ( rule__RecordType__FieldsAssignment_23 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1906:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1906:1: ( ( rule__RecordType__FieldsAssignment_23 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1907:1: ( rule__RecordType__FieldsAssignment_23 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1908:1: ( rule__RecordType__FieldsAssignment_23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1908:2: rule__RecordType__FieldsAssignment_23
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl3928);
            rule__RecordType__FieldsAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_23()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1918:1: rule__RecordType__Group__24 : rule__RecordType__Group__24__Impl rule__RecordType__Group__25 ;
    public final void rule__RecordType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1922:1: ( rule__RecordType__Group__24__Impl rule__RecordType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1923:2: rule__RecordType__Group__24__Impl rule__RecordType__Group__25
            {
            pushFollow(FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__243958);
            rule__RecordType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__243961);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1930:1: rule__RecordType__Group__24__Impl : ( ( rule__RecordType__Group_24__0 )* ) ;
    public final void rule__RecordType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1934:1: ( ( ( rule__RecordType__Group_24__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1935:1: ( ( rule__RecordType__Group_24__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1935:1: ( ( rule__RecordType__Group_24__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1936:1: ( rule__RecordType__Group_24__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_24()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1937:1: ( rule__RecordType__Group_24__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1937:2: rule__RecordType__Group_24__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl3988);
            	    rule__RecordType__Group_24__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRecordTypeAccess().getGroup_24()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1947:1: rule__RecordType__Group__25 : rule__RecordType__Group__25__Impl rule__RecordType__Group__26 ;
    public final void rule__RecordType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1951:1: ( rule__RecordType__Group__25__Impl rule__RecordType__Group__26 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1952:2: rule__RecordType__Group__25__Impl rule__RecordType__Group__26
            {
            pushFollow(FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254019);
            rule__RecordType__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254022);
            rule__RecordType__Group__26();

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1959:1: rule__RecordType__Group__25__Impl : ( ']' ) ;
    public final void rule__RecordType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1963:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1964:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1964:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1965:1: ']'
            {
             before(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25()); 
            match(input,20,FOLLOW_20_in_rule__RecordType__Group__25__Impl4050); 
             after(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25()); 

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


    // $ANTLR start "rule__RecordType__Group__26"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1978:1: rule__RecordType__Group__26 : rule__RecordType__Group__26__Impl ;
    public final void rule__RecordType__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1982:1: ( rule__RecordType__Group__26__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1983:2: rule__RecordType__Group__26__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264081);
            rule__RecordType__Group__26__Impl();

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
    // $ANTLR end "rule__RecordType__Group__26"


    // $ANTLR start "rule__RecordType__Group__26__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1989:1: rule__RecordType__Group__26__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1993:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1994:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1994:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:1995:1: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26()); 
            match(input,26,FOLLOW_26_in_rule__RecordType__Group__26__Impl4109); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26()); 

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
    // $ANTLR end "rule__RecordType__Group__26__Impl"


    // $ANTLR start "rule__RecordType__Group_16__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2062:1: rule__RecordType__Group_16__0 : rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 ;
    public final void rule__RecordType__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2066:1: ( rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2067:2: rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04194);
            rule__RecordType__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04197);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2074:1: rule__RecordType__Group_16__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2078:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2079:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2079:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2080:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4225); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2093:1: rule__RecordType__Group_16__1 : rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 ;
    public final void rule__RecordType__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2097:1: ( rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2098:2: rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14256);
            rule__RecordType__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14259);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2105:1: rule__RecordType__Group_16__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2109:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2110:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2110:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2111:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__1__Impl4287); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2124:1: rule__RecordType__Group_16__2 : rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 ;
    public final void rule__RecordType__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2128:1: ( rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2129:2: rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24318);
            rule__RecordType__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24321);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2136:1: rule__RecordType__Group_16__2__Impl : ( 'namespace' ) ;
    public final void rule__RecordType__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2140:1: ( ( 'namespace' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2141:1: ( 'namespace' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2141:1: ( 'namespace' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2142:1: 'namespace'
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 
            match(input,29,FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4349); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2155:1: rule__RecordType__Group_16__3 : rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 ;
    public final void rule__RecordType__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2159:1: ( rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2160:2: rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34380);
            rule__RecordType__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34383);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2167:1: rule__RecordType__Group_16__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2171:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2172:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2172:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2173:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__3__Impl4411); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2186:1: rule__RecordType__Group_16__4 : rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 ;
    public final void rule__RecordType__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2190:1: ( rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2191:2: rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44442);
            rule__RecordType__Group_16__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44445);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2198:1: rule__RecordType__Group_16__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2202:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2203:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2203:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2204:1: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4473); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2217:1: rule__RecordType__Group_16__5 : rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 ;
    public final void rule__RecordType__Group_16__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2221:1: ( rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2222:2: rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54504);
            rule__RecordType__Group_16__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54507);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2229:1: rule__RecordType__Group_16__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2233:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2234:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2234:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2235:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__5__Impl4535); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2248:1: rule__RecordType__Group_16__6 : rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 ;
    public final void rule__RecordType__Group_16__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2252:1: ( rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2253:2: rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64566);
            rule__RecordType__Group_16__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64569);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2260:1: rule__RecordType__Group_16__6__Impl : ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) ;
    public final void rule__RecordType__Group_16__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2264:1: ( ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2265:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2265:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2266:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2267:1: ( rule__RecordType__NamespaceAssignment_16_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2267:2: rule__RecordType__NamespaceAssignment_16_6
            {
            pushFollow(FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4596);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2277:1: rule__RecordType__Group_16__7 : rule__RecordType__Group_16__7__Impl ;
    public final void rule__RecordType__Group_16__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2281:1: ( rule__RecordType__Group_16__7__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2282:2: rule__RecordType__Group_16__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74626);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2288:1: rule__RecordType__Group_16__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2292:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2293:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2293:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2294:1: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_16__7__Impl4654); 
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


    // $ANTLR start "rule__RecordType__Group_24__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2323:1: rule__RecordType__Group_24__0 : rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 ;
    public final void rule__RecordType__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2327:1: ( rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2328:2: rule__RecordType__Group_24__0__Impl rule__RecordType__Group_24__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04701);
            rule__RecordType__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04704);
            rule__RecordType__Group_24__1();

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
    // $ANTLR end "rule__RecordType__Group_24__0"


    // $ANTLR start "rule__RecordType__Group_24__0__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2335:1: rule__RecordType__Group_24__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2339:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2340:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2340:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2341:1: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4732); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0()); 

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
    // $ANTLR end "rule__RecordType__Group_24__0__Impl"


    // $ANTLR start "rule__RecordType__Group_24__1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2354:1: rule__RecordType__Group_24__1 : rule__RecordType__Group_24__1__Impl ;
    public final void rule__RecordType__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2358:1: ( rule__RecordType__Group_24__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2359:2: rule__RecordType__Group_24__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14763);
            rule__RecordType__Group_24__1__Impl();

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
    // $ANTLR end "rule__RecordType__Group_24__1"


    // $ANTLR start "rule__RecordType__Group_24__1__Impl"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2365:1: rule__RecordType__Group_24__1__Impl : ( ( rule__RecordType__FieldsAssignment_24_1 ) ) ;
    public final void rule__RecordType__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2369:1: ( ( ( rule__RecordType__FieldsAssignment_24_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2370:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2370:1: ( ( rule__RecordType__FieldsAssignment_24_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2371:1: ( rule__RecordType__FieldsAssignment_24_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2372:1: ( rule__RecordType__FieldsAssignment_24_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2372:2: rule__RecordType__FieldsAssignment_24_1
            {
            pushFollow(FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl4790);
            rule__RecordType__FieldsAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldsAssignment_24_1()); 

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
    // $ANTLR end "rule__RecordType__Group_24__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2386:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2390:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2391:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04824);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04827);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2398:1: rule__Field__Group__0__Impl : ( '{' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2402:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2403:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2403:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2404:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__0__Impl4855); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2417:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2421:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2422:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14886);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14889);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2429:1: rule__Field__Group__1__Impl : ( '\"' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2433:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2434:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2434:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2435:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__1__Impl4917); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2448:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2452:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2453:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24948);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24951);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2460:1: rule__Field__Group__2__Impl : ( 'name' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2464:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2465:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2465:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2466:1: 'name'
            {
             before(grammarAccess.getFieldAccess().getNameKeyword_2()); 
            match(input,10,FOLLOW_10_in_rule__Field__Group__2__Impl4979); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2479:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2483:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2484:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35010);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35013);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2491:1: rule__Field__Group__3__Impl : ( '\"' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2495:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2496:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2496:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2497:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__3__Impl5041); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2510:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2514:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2515:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45072);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45075);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2522:1: rule__Field__Group__4__Impl : ( ':' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2526:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2527:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2527:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2528:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__4__Impl5103); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2541:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2545:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2546:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55134);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55137);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2553:1: rule__Field__Group__5__Impl : ( '\"' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2557:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2558:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2558:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2559:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__5__Impl5165); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2572:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2576:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2577:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65196);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65199);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2584:1: rule__Field__Group__6__Impl : ( ( rule__Field__NameAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2588:1: ( ( ( rule__Field__NameAssignment_6 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2589:1: ( ( rule__Field__NameAssignment_6 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2589:1: ( ( rule__Field__NameAssignment_6 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2590:1: ( rule__Field__NameAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_6()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2591:1: ( rule__Field__NameAssignment_6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2591:2: rule__Field__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5226);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2601:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2605:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2606:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75256);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75259);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2613:1: rule__Field__Group__7__Impl : ( '\"' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2617:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2618:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2618:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2619:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__7__Impl5287); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2632:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2636:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2637:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85318);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85321);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2644:1: rule__Field__Group__8__Impl : ( ',' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2648:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2649:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2649:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2650:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Field__Group__8__Impl5349); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2663:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2667:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2668:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95380);
            rule__Field__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95383);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2675:1: rule__Field__Group__9__Impl : ( '\"' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2679:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2680:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2680:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2681:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__9__Impl5411); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2694:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2698:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2699:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105442);
            rule__Field__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105445);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2706:1: rule__Field__Group__10__Impl : ( 'type' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2710:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2711:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2711:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2712:1: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_10()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group__10__Impl5473); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2725:1: rule__Field__Group__11 : rule__Field__Group__11__Impl rule__Field__Group__12 ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2729:1: ( rule__Field__Group__11__Impl rule__Field__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2730:2: rule__Field__Group__11__Impl rule__Field__Group__12
            {
            pushFollow(FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115504);
            rule__Field__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115507);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2737:1: rule__Field__Group__11__Impl : ( '\"' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2741:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2742:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2742:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2743:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__11__Impl5535); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2756:1: rule__Field__Group__12 : rule__Field__Group__12__Impl rule__Field__Group__13 ;
    public final void rule__Field__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2760:1: ( rule__Field__Group__12__Impl rule__Field__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2761:2: rule__Field__Group__12__Impl rule__Field__Group__13
            {
            pushFollow(FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125566);
            rule__Field__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125569);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2768:1: rule__Field__Group__12__Impl : ( ':' ) ;
    public final void rule__Field__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2772:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2773:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2773:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2774:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group__12__Impl5597); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2787:1: rule__Field__Group__13 : rule__Field__Group__13__Impl rule__Field__Group__14 ;
    public final void rule__Field__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2791:1: ( rule__Field__Group__13__Impl rule__Field__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2792:2: rule__Field__Group__13__Impl rule__Field__Group__14
            {
            pushFollow(FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135628);
            rule__Field__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135631);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2799:1: rule__Field__Group__13__Impl : ( ( rule__Field__Alternatives_13 ) ) ;
    public final void rule__Field__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2803:1: ( ( ( rule__Field__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2804:1: ( ( rule__Field__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2804:1: ( ( rule__Field__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2805:1: ( rule__Field__Alternatives_13 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2806:1: ( rule__Field__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2806:2: rule__Field__Alternatives_13
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5658);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2816:1: rule__Field__Group__14 : rule__Field__Group__14__Impl ;
    public final void rule__Field__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2820:1: ( rule__Field__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2821:2: rule__Field__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145688);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2827:1: rule__Field__Group__14__Impl : ( '}' ) ;
    public final void rule__Field__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2831:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2832:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2832:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2833:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__14__Impl5716); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2876:1: rule__Field__Group_13_2__0 : rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 ;
    public final void rule__Field__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2880:1: ( rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2881:2: rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__05777);
            rule__Field__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__05780);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2888:1: rule__Field__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2892:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2893:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2893:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2894:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_13_2__0__Impl5808); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2907:1: rule__Field__Group_13_2__1 : rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 ;
    public final void rule__Field__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2911:1: ( rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2912:2: rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__15839);
            rule__Field__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__15842);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2919:1: rule__Field__Group_13_2__1__Impl : ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__Field__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2923:1: ( ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2924:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2924:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2925:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2926:1: ( rule__Field__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2926:2: rule__Field__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl5869);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2936:1: rule__Field__Group_13_2__2 : rule__Field__Group_13_2__2__Impl ;
    public final void rule__Field__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2940:1: ( rule__Field__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2941:2: rule__Field__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__25899);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2947:1: rule__Field__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2951:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2952:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2952:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2953:1: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_13_2__2__Impl5927); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2972:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2976:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2977:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05964);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05967);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2984:1: rule__EnumType__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2988:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2989:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2989:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:2990:1: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumType__Group__0__Impl5995); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3003:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3007:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3008:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16026);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16029);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3015:1: rule__EnumType__Group__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3019:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3020:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3020:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3021:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__1__Impl6057); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3034:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3038:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3039:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26088);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26091);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3046:1: rule__EnumType__Group__2__Impl : ( 'type' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3050:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3051:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3051:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3052:1: 'type'
            {
             before(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__EnumType__Group__2__Impl6119); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3065:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3069:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3070:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36150);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36153);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3077:1: rule__EnumType__Group__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3081:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3082:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3082:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3083:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__3__Impl6181); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3096:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3100:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3101:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46212);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46215);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3108:1: rule__EnumType__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3112:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3113:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3113:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3114:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__4__Impl6243); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3127:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3131:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3132:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56274);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56277);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3139:1: rule__EnumType__Group__5__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3143:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3144:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3144:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3145:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__5__Impl6305); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3158:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3162:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3163:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66336);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66339);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3170:1: rule__EnumType__Group__6__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3174:1: ( ( 'enum' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3175:1: ( 'enum' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3175:1: ( 'enum' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3176:1: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EnumType__Group__6__Impl6367); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3189:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3193:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3194:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76398);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76401);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3201:1: rule__EnumType__Group__7__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3205:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3206:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3206:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3207:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__7__Impl6429); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3220:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3224:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3225:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86460);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86463);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3232:1: rule__EnumType__Group__8__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3236:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3237:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3237:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3238:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__8__Impl6491); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3251:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3255:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3256:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96522);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96525);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3263:1: rule__EnumType__Group__9__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3267:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3268:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3268:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3269:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__9__Impl6553); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3282:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3286:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3287:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106584);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106587);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3294:1: rule__EnumType__Group__10__Impl : ( 'name' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3298:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3299:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3299:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3300:1: 'name'
            {
             before(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_10_in_rule__EnumType__Group__10__Impl6615); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3313:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3317:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3318:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116646);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116649);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3325:1: rule__EnumType__Group__11__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3329:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3330:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3330:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3331:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__11__Impl6677); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3344:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3348:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3349:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126708);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126711);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3356:1: rule__EnumType__Group__12__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3360:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3361:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3361:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3362:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__12__Impl6739); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3375:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl rule__EnumType__Group__14 ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3379:1: ( rule__EnumType__Group__13__Impl rule__EnumType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3380:2: rule__EnumType__Group__13__Impl rule__EnumType__Group__14
            {
            pushFollow(FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136770);
            rule__EnumType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136773);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3387:1: rule__EnumType__Group__13__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3391:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3392:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3392:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3393:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__13__Impl6801); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3406:1: rule__EnumType__Group__14 : rule__EnumType__Group__14__Impl rule__EnumType__Group__15 ;
    public final void rule__EnumType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3410:1: ( rule__EnumType__Group__14__Impl rule__EnumType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3411:2: rule__EnumType__Group__14__Impl rule__EnumType__Group__15
            {
            pushFollow(FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__146832);
            rule__EnumType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__146835);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3418:1: rule__EnumType__Group__14__Impl : ( ( rule__EnumType__NameAssignment_14 ) ) ;
    public final void rule__EnumType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3422:1: ( ( ( rule__EnumType__NameAssignment_14 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3423:1: ( ( rule__EnumType__NameAssignment_14 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3423:1: ( ( rule__EnumType__NameAssignment_14 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3424:1: ( rule__EnumType__NameAssignment_14 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3425:1: ( rule__EnumType__NameAssignment_14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3425:2: rule__EnumType__NameAssignment_14
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl6862);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3435:1: rule__EnumType__Group__15 : rule__EnumType__Group__15__Impl rule__EnumType__Group__16 ;
    public final void rule__EnumType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3439:1: ( rule__EnumType__Group__15__Impl rule__EnumType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3440:2: rule__EnumType__Group__15__Impl rule__EnumType__Group__16
            {
            pushFollow(FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__156892);
            rule__EnumType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__156895);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3447:1: rule__EnumType__Group__15__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3451:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3452:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3452:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3453:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__15__Impl6923); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3466:1: rule__EnumType__Group__16 : rule__EnumType__Group__16__Impl rule__EnumType__Group__17 ;
    public final void rule__EnumType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3470:1: ( rule__EnumType__Group__16__Impl rule__EnumType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3471:2: rule__EnumType__Group__16__Impl rule__EnumType__Group__17
            {
            pushFollow(FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__166954);
            rule__EnumType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__166957);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3478:1: rule__EnumType__Group__16__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3482:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3483:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3483:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3484:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group__16__Impl6985); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3497:1: rule__EnumType__Group__17 : rule__EnumType__Group__17__Impl rule__EnumType__Group__18 ;
    public final void rule__EnumType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3501:1: ( rule__EnumType__Group__17__Impl rule__EnumType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3502:2: rule__EnumType__Group__17__Impl rule__EnumType__Group__18
            {
            pushFollow(FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177016);
            rule__EnumType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177019);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3509:1: rule__EnumType__Group__17__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3513:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3514:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3514:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3515:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__17__Impl7047); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3528:1: rule__EnumType__Group__18 : rule__EnumType__Group__18__Impl rule__EnumType__Group__19 ;
    public final void rule__EnumType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3532:1: ( rule__EnumType__Group__18__Impl rule__EnumType__Group__19 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3533:2: rule__EnumType__Group__18__Impl rule__EnumType__Group__19
            {
            pushFollow(FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187078);
            rule__EnumType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187081);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3540:1: rule__EnumType__Group__18__Impl : ( 'symbols' ) ;
    public final void rule__EnumType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3544:1: ( ( 'symbols' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3545:1: ( 'symbols' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3545:1: ( 'symbols' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3546:1: 'symbols'
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 
            match(input,31,FOLLOW_31_in_rule__EnumType__Group__18__Impl7109); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3559:1: rule__EnumType__Group__19 : rule__EnumType__Group__19__Impl rule__EnumType__Group__20 ;
    public final void rule__EnumType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3563:1: ( rule__EnumType__Group__19__Impl rule__EnumType__Group__20 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3564:2: rule__EnumType__Group__19__Impl rule__EnumType__Group__20
            {
            pushFollow(FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197140);
            rule__EnumType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197143);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3571:1: rule__EnumType__Group__19__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3575:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3576:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3576:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3577:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group__19__Impl7171); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3590:1: rule__EnumType__Group__20 : rule__EnumType__Group__20__Impl rule__EnumType__Group__21 ;
    public final void rule__EnumType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3594:1: ( rule__EnumType__Group__20__Impl rule__EnumType__Group__21 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3595:2: rule__EnumType__Group__20__Impl rule__EnumType__Group__21
            {
            pushFollow(FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207202);
            rule__EnumType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207205);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3602:1: rule__EnumType__Group__20__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3606:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3607:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3607:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3608:1: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__EnumType__Group__20__Impl7233); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3621:1: rule__EnumType__Group__21 : rule__EnumType__Group__21__Impl rule__EnumType__Group__22 ;
    public final void rule__EnumType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3625:1: ( rule__EnumType__Group__21__Impl rule__EnumType__Group__22 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3626:2: rule__EnumType__Group__21__Impl rule__EnumType__Group__22
            {
            pushFollow(FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217264);
            rule__EnumType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217267);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3633:1: rule__EnumType__Group__21__Impl : ( '[' ) ;
    public final void rule__EnumType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3637:1: ( ( '[' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3638:1: ( '[' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3638:1: ( '[' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3639:1: '['
            {
             before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 
            match(input,19,FOLLOW_19_in_rule__EnumType__Group__21__Impl7295); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3652:1: rule__EnumType__Group__22 : rule__EnumType__Group__22__Impl rule__EnumType__Group__23 ;
    public final void rule__EnumType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3656:1: ( rule__EnumType__Group__22__Impl rule__EnumType__Group__23 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3657:2: rule__EnumType__Group__22__Impl rule__EnumType__Group__23
            {
            pushFollow(FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227326);
            rule__EnumType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227329);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3664:1: rule__EnumType__Group__22__Impl : ( ( rule__EnumType__Group_22__0 ) ) ;
    public final void rule__EnumType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3668:1: ( ( ( rule__EnumType__Group_22__0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3669:1: ( ( rule__EnumType__Group_22__0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3669:1: ( ( rule__EnumType__Group_22__0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3670:1: ( rule__EnumType__Group_22__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_22()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3671:1: ( rule__EnumType__Group_22__0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3671:2: rule__EnumType__Group_22__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7356);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3681:1: rule__EnumType__Group__23 : rule__EnumType__Group__23__Impl rule__EnumType__Group__24 ;
    public final void rule__EnumType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3685:1: ( rule__EnumType__Group__23__Impl rule__EnumType__Group__24 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3686:2: rule__EnumType__Group__23__Impl rule__EnumType__Group__24
            {
            pushFollow(FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237386);
            rule__EnumType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237389);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3693:1: rule__EnumType__Group__23__Impl : ( ( rule__EnumType__Group_23__0 )* ) ;
    public final void rule__EnumType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3697:1: ( ( ( rule__EnumType__Group_23__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3698:1: ( ( rule__EnumType__Group_23__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3698:1: ( ( rule__EnumType__Group_23__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3699:1: ( rule__EnumType__Group_23__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_23()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3700:1: ( rule__EnumType__Group_23__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3700:2: rule__EnumType__Group_23__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7416);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3710:1: rule__EnumType__Group__24 : rule__EnumType__Group__24__Impl rule__EnumType__Group__25 ;
    public final void rule__EnumType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3714:1: ( rule__EnumType__Group__24__Impl rule__EnumType__Group__25 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3715:2: rule__EnumType__Group__24__Impl rule__EnumType__Group__25
            {
            pushFollow(FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247447);
            rule__EnumType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247450);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3722:1: rule__EnumType__Group__24__Impl : ( ']' ) ;
    public final void rule__EnumType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3726:1: ( ( ']' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3727:1: ( ']' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3727:1: ( ']' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3728:1: ']'
            {
             before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_20_in_rule__EnumType__Group__24__Impl7478); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3741:1: rule__EnumType__Group__25 : rule__EnumType__Group__25__Impl ;
    public final void rule__EnumType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3745:1: ( rule__EnumType__Group__25__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3746:2: rule__EnumType__Group__25__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257509);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3752:1: rule__EnumType__Group__25__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3756:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3757:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3757:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3758:1: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_26_in_rule__EnumType__Group__25__Impl7537); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3823:1: rule__EnumType__Group_22__0 : rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 ;
    public final void rule__EnumType__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3827:1: ( rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3828:2: rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07620);
            rule__EnumType__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07623);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3835:1: rule__EnumType__Group_22__0__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3839:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3840:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3840:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3841:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_22__0__Impl7651); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3854:1: rule__EnumType__Group_22__1 : rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 ;
    public final void rule__EnumType__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3858:1: ( rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3859:2: rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17682);
            rule__EnumType__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17685);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3866:1: rule__EnumType__Group_22__1__Impl : ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) ;
    public final void rule__EnumType__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3870:1: ( ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3871:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3871:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3872:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3873:1: ( rule__EnumType__SymbolsAssignment_22_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3873:2: rule__EnumType__SymbolsAssignment_22_1
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7712);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3883:1: rule__EnumType__Group_22__2 : rule__EnumType__Group_22__2__Impl ;
    public final void rule__EnumType__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3887:1: ( rule__EnumType__Group_22__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3888:2: rule__EnumType__Group_22__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27742);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3894:1: rule__EnumType__Group_22__2__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3898:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3899:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3899:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3900:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_22__2__Impl7770); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3919:1: rule__EnumType__Group_23__0 : rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 ;
    public final void rule__EnumType__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3923:1: ( rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3924:2: rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__07807);
            rule__EnumType__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__07810);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3931:1: rule__EnumType__Group_23__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3935:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3936:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3936:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3937:1: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 
            match(input,21,FOLLOW_21_in_rule__EnumType__Group_23__0__Impl7838); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3950:1: rule__EnumType__Group_23__1 : rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 ;
    public final void rule__EnumType__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3954:1: ( rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3955:2: rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__17869);
            rule__EnumType__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__17872);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3962:1: rule__EnumType__Group_23__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3966:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3967:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3967:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3968:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_23__1__Impl7900); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3981:1: rule__EnumType__Group_23__2 : rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 ;
    public final void rule__EnumType__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3985:1: ( rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3986:2: rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__27931);
            rule__EnumType__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__27934);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3993:1: rule__EnumType__Group_23__2__Impl : ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) ;
    public final void rule__EnumType__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3997:1: ( ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3998:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3998:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:3999:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4000:1: ( rule__EnumType__SymbolsAssignment_23_2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4000:2: rule__EnumType__SymbolsAssignment_23_2
            {
            pushFollow(FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl7961);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4010:1: rule__EnumType__Group_23__3 : rule__EnumType__Group_23__3__Impl ;
    public final void rule__EnumType__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4014:1: ( rule__EnumType__Group_23__3__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4015:2: rule__EnumType__Group_23__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__37991);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4021:1: rule__EnumType__Group_23__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4025:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4026:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4026:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4027:1: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumType__Group_23__3__Impl8019); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4048:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4052:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4053:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08058);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08061);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4060:1: rule__ArrayType__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4064:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4065:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4065:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4066:1: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__0__Impl8089); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4079:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4083:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4084:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18120);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18123);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4091:1: rule__ArrayType__Group__1__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4095:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4096:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4096:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4097:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__1__Impl8151); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4110:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4114:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4115:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28182);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28185);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4122:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4126:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4127:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4127:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4128:1: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ArrayType__Group__2__Impl8213); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4141:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4145:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4146:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38244);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38247);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4153:1: rule__ArrayType__Group__3__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4157:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4158:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4158:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4159:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__3__Impl8275); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4172:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4176:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4177:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48306);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48309);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4184:1: rule__ArrayType__Group__4__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4188:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4189:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4189:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4190:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__4__Impl8337); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4203:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4207:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4208:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58368);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58371);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4215:1: rule__ArrayType__Group__5__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4219:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4220:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4220:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4221:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__5__Impl8399); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4234:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4238:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4239:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68430);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68433);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4246:1: rule__ArrayType__Group__6__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4250:1: ( ( 'array' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4251:1: ( 'array' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4251:1: ( 'array' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4252:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__Group__6__Impl8461); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4265:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4269:1: ( rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4270:2: rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78492);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78495);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4277:1: rule__ArrayType__Group__7__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4281:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4282:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4282:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4283:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__7__Impl8523); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4296:1: rule__ArrayType__Group__8 : rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 ;
    public final void rule__ArrayType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4300:1: ( rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4301:2: rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88554);
            rule__ArrayType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88557);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4308:1: rule__ArrayType__Group__8__Impl : ( ',' ) ;
    public final void rule__ArrayType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4312:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4313:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4313:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4314:1: ','
            {
             before(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__ArrayType__Group__8__Impl8585); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4327:1: rule__ArrayType__Group__9 : rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 ;
    public final void rule__ArrayType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4331:1: ( rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4332:2: rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98616);
            rule__ArrayType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98619);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4339:1: rule__ArrayType__Group__9__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4343:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4344:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4344:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4345:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__9__Impl8647); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4358:1: rule__ArrayType__Group__10 : rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 ;
    public final void rule__ArrayType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4362:1: ( rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4363:2: rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108678);
            rule__ArrayType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108681);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4370:1: rule__ArrayType__Group__10__Impl : ( 'items' ) ;
    public final void rule__ArrayType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4374:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4375:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4375:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4376:1: 'items'
            {
             before(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__ArrayType__Group__10__Impl8709); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4389:1: rule__ArrayType__Group__11 : rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 ;
    public final void rule__ArrayType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4393:1: ( rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4394:2: rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118740);
            rule__ArrayType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118743);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4401:1: rule__ArrayType__Group__11__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4405:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4406:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4406:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4407:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group__11__Impl8771); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4420:1: rule__ArrayType__Group__12 : rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 ;
    public final void rule__ArrayType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4424:1: ( rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4425:2: rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__128802);
            rule__ArrayType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__128805);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4432:1: rule__ArrayType__Group__12__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4436:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4437:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4437:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4438:1: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__ArrayType__Group__12__Impl8833); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4451:1: rule__ArrayType__Group__13 : rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 ;
    public final void rule__ArrayType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4455:1: ( rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4456:2: rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__138864);
            rule__ArrayType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__138867);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4463:1: rule__ArrayType__Group__13__Impl : ( ( rule__ArrayType__Alternatives_13 ) ) ;
    public final void rule__ArrayType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4467:1: ( ( ( rule__ArrayType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4468:1: ( ( rule__ArrayType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4468:1: ( ( rule__ArrayType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4469:1: ( rule__ArrayType__Alternatives_13 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4470:1: ( rule__ArrayType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4470:2: rule__ArrayType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl8894);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4480:1: rule__ArrayType__Group__14 : rule__ArrayType__Group__14__Impl ;
    public final void rule__ArrayType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4484:1: ( rule__ArrayType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4485:2: rule__ArrayType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__148924);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4491:1: rule__ArrayType__Group__14__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4495:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4496:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4496:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4497:1: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__ArrayType__Group__14__Impl8952); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4540:1: rule__ArrayType__Group_13_2__0 : rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 ;
    public final void rule__ArrayType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4544:1: ( rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4545:2: rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09013);
            rule__ArrayType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09016);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4552:1: rule__ArrayType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4556:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4557:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4557:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4558:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group_13_2__0__Impl9044); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4571:1: rule__ArrayType__Group_13_2__1 : rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 ;
    public final void rule__ArrayType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4575:1: ( rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4576:2: rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19075);
            rule__ArrayType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19078);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4583:1: rule__ArrayType__Group_13_2__1__Impl : ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__ArrayType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4587:1: ( ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4588:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4588:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4589:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4590:1: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4590:2: rule__ArrayType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9105);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4600:1: rule__ArrayType__Group_13_2__2 : rule__ArrayType__Group_13_2__2__Impl ;
    public final void rule__ArrayType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4604:1: ( rule__ArrayType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4605:2: rule__ArrayType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29135);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4611:1: rule__ArrayType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4615:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4616:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4616:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4617:1: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__ArrayType__Group_13_2__2__Impl9163); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4636:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4640:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4641:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09200);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09203);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4648:1: rule__MapType__Group__0__Impl : ( '{' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4652:1: ( ( '{' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4653:1: ( '{' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4653:1: ( '{' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4654:1: '{'
            {
             before(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__MapType__Group__0__Impl9231); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4667:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4671:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4672:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19262);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19265);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4679:1: rule__MapType__Group__1__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4683:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4684:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4684:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4685:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__1__Impl9293); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4698:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4702:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4703:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29324);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29327);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4710:1: rule__MapType__Group__2__Impl : ( 'type' ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4714:1: ( ( 'type' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4715:1: ( 'type' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4715:1: ( 'type' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4716:1: 'type'
            {
             before(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__MapType__Group__2__Impl9355); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4729:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4733:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4734:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39386);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39389);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4741:1: rule__MapType__Group__3__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4745:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4746:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4746:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4747:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__3__Impl9417); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4760:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4764:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4765:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49448);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49451);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4772:1: rule__MapType__Group__4__Impl : ( ':' ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4776:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4777:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4777:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4778:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__4__Impl9479); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4791:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl rule__MapType__Group__6 ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4795:1: ( rule__MapType__Group__5__Impl rule__MapType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4796:2: rule__MapType__Group__5__Impl rule__MapType__Group__6
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59510);
            rule__MapType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59513);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4803:1: rule__MapType__Group__5__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4807:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4808:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4808:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4809:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__5__Impl9541); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4822:1: rule__MapType__Group__6 : rule__MapType__Group__6__Impl rule__MapType__Group__7 ;
    public final void rule__MapType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4826:1: ( rule__MapType__Group__6__Impl rule__MapType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4827:2: rule__MapType__Group__6__Impl rule__MapType__Group__7
            {
            pushFollow(FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69572);
            rule__MapType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69575);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4834:1: rule__MapType__Group__6__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4838:1: ( ( 'map' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4839:1: ( 'map' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4839:1: ( 'map' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4840:1: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__MapType__Group__6__Impl9603); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4853:1: rule__MapType__Group__7 : rule__MapType__Group__7__Impl rule__MapType__Group__8 ;
    public final void rule__MapType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4857:1: ( rule__MapType__Group__7__Impl rule__MapType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4858:2: rule__MapType__Group__7__Impl rule__MapType__Group__8
            {
            pushFollow(FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79634);
            rule__MapType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79637);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4865:1: rule__MapType__Group__7__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4869:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4870:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4870:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4871:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__7__Impl9665); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4884:1: rule__MapType__Group__8 : rule__MapType__Group__8__Impl rule__MapType__Group__9 ;
    public final void rule__MapType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4888:1: ( rule__MapType__Group__8__Impl rule__MapType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4889:2: rule__MapType__Group__8__Impl rule__MapType__Group__9
            {
            pushFollow(FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89696);
            rule__MapType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89699);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4896:1: rule__MapType__Group__8__Impl : ( ',' ) ;
    public final void rule__MapType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4900:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4901:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4901:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4902:1: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__MapType__Group__8__Impl9727); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4915:1: rule__MapType__Group__9 : rule__MapType__Group__9__Impl rule__MapType__Group__10 ;
    public final void rule__MapType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4919:1: ( rule__MapType__Group__9__Impl rule__MapType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4920:2: rule__MapType__Group__9__Impl rule__MapType__Group__10
            {
            pushFollow(FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99758);
            rule__MapType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99761);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4927:1: rule__MapType__Group__9__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4931:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4932:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4932:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4933:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__9__Impl9789); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4946:1: rule__MapType__Group__10 : rule__MapType__Group__10__Impl rule__MapType__Group__11 ;
    public final void rule__MapType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4950:1: ( rule__MapType__Group__10__Impl rule__MapType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4951:2: rule__MapType__Group__10__Impl rule__MapType__Group__11
            {
            pushFollow(FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__109820);
            rule__MapType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__109823);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4958:1: rule__MapType__Group__10__Impl : ( 'items' ) ;
    public final void rule__MapType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4962:1: ( ( 'items' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4963:1: ( 'items' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4963:1: ( 'items' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4964:1: 'items'
            {
             before(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_33_in_rule__MapType__Group__10__Impl9851); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4977:1: rule__MapType__Group__11 : rule__MapType__Group__11__Impl rule__MapType__Group__12 ;
    public final void rule__MapType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4981:1: ( rule__MapType__Group__11__Impl rule__MapType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4982:2: rule__MapType__Group__11__Impl rule__MapType__Group__12
            {
            pushFollow(FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__119882);
            rule__MapType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__119885);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4989:1: rule__MapType__Group__11__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4993:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4994:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4994:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:4995:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group__11__Impl9913); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5008:1: rule__MapType__Group__12 : rule__MapType__Group__12__Impl rule__MapType__Group__13 ;
    public final void rule__MapType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5012:1: ( rule__MapType__Group__12__Impl rule__MapType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5013:2: rule__MapType__Group__12__Impl rule__MapType__Group__13
            {
            pushFollow(FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__129944);
            rule__MapType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__129947);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5020:1: rule__MapType__Group__12__Impl : ( ':' ) ;
    public final void rule__MapType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5024:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5025:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5025:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5026:1: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__MapType__Group__12__Impl9975); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5039:1: rule__MapType__Group__13 : rule__MapType__Group__13__Impl rule__MapType__Group__14 ;
    public final void rule__MapType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5043:1: ( rule__MapType__Group__13__Impl rule__MapType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5044:2: rule__MapType__Group__13__Impl rule__MapType__Group__14
            {
            pushFollow(FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310006);
            rule__MapType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310009);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5051:1: rule__MapType__Group__13__Impl : ( ( rule__MapType__Alternatives_13 ) ) ;
    public final void rule__MapType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5055:1: ( ( ( rule__MapType__Alternatives_13 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5056:1: ( ( rule__MapType__Alternatives_13 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5056:1: ( ( rule__MapType__Alternatives_13 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5057:1: ( rule__MapType__Alternatives_13 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_13()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5058:1: ( rule__MapType__Alternatives_13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5058:2: rule__MapType__Alternatives_13
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10036);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5068:1: rule__MapType__Group__14 : rule__MapType__Group__14__Impl ;
    public final void rule__MapType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5072:1: ( rule__MapType__Group__14__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5073:2: rule__MapType__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410066);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5079:1: rule__MapType__Group__14__Impl : ( '}' ) ;
    public final void rule__MapType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5083:1: ( ( '}' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5084:1: ( '}' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5084:1: ( '}' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5085:1: '}'
            {
             before(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__MapType__Group__14__Impl10094); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5128:1: rule__MapType__Group_13_2__0 : rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 ;
    public final void rule__MapType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5132:1: ( rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5133:2: rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010155);
            rule__MapType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010158);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5140:1: rule__MapType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5144:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5145:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5145:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5146:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group_13_2__0__Impl10186); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5159:1: rule__MapType__Group_13_2__1 : rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 ;
    public final void rule__MapType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5163:1: ( rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5164:2: rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110217);
            rule__MapType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110220);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5171:1: rule__MapType__Group_13_2__1__Impl : ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__MapType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5175:1: ( ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5176:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5176:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5177:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5178:1: ( rule__MapType__RecordRefAssignment_13_2_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5178:2: rule__MapType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10247);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5188:1: rule__MapType__Group_13_2__2 : rule__MapType__Group_13_2__2__Impl ;
    public final void rule__MapType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5192:1: ( rule__MapType__Group_13_2__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5193:2: rule__MapType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210277);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5199:1: rule__MapType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5203:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5204:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5204:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5205:1: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,23,FOLLOW_23_in_rule__MapType__Group_13_2__2__Impl10305); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5224:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5228:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5229:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010342);
            rule__FixedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010345);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5236:1: rule__FixedType__Group__0__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5240:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5241:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5241:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5242:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__0__Impl10373); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5255:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5259:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5260:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110404);
            rule__FixedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110407);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5267:1: rule__FixedType__Group__1__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5271:1: ( ( 'fixed' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5272:1: ( 'fixed' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5272:1: ( 'fixed' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5273:1: 'fixed'
            {
             before(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FixedType__Group__1__Impl10435); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5286:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5290:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5291:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210466);
            rule__FixedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210469);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5298:1: rule__FixedType__Group__2__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5302:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5303:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5303:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5304:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__2__Impl10497); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5317:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5321:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5322:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310528);
            rule__FixedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310531);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5329:1: rule__FixedType__Group__3__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5333:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5334:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5334:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5335:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__3__Impl10559); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5348:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5352:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5353:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410590);
            rule__FixedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410593);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5360:1: rule__FixedType__Group__4__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5364:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5365:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5365:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5366:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__4__Impl10621); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5379:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl rule__FixedType__Group__6 ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5383:1: ( rule__FixedType__Group__5__Impl rule__FixedType__Group__6 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5384:2: rule__FixedType__Group__5__Impl rule__FixedType__Group__6
            {
            pushFollow(FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510652);
            rule__FixedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510655);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5391:1: rule__FixedType__Group__5__Impl : ( 'name' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5395:1: ( ( 'name' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5396:1: ( 'name' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5396:1: ( 'name' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5397:1: 'name'
            {
             before(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 
            match(input,10,FOLLOW_10_in_rule__FixedType__Group__5__Impl10683); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5410:1: rule__FixedType__Group__6 : rule__FixedType__Group__6__Impl rule__FixedType__Group__7 ;
    public final void rule__FixedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5414:1: ( rule__FixedType__Group__6__Impl rule__FixedType__Group__7 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5415:2: rule__FixedType__Group__6__Impl rule__FixedType__Group__7
            {
            pushFollow(FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610714);
            rule__FixedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610717);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5422:1: rule__FixedType__Group__6__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5426:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5427:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5427:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5428:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__6__Impl10745); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5441:1: rule__FixedType__Group__7 : rule__FixedType__Group__7__Impl rule__FixedType__Group__8 ;
    public final void rule__FixedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5445:1: ( rule__FixedType__Group__7__Impl rule__FixedType__Group__8 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5446:2: rule__FixedType__Group__7__Impl rule__FixedType__Group__8
            {
            pushFollow(FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710776);
            rule__FixedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__710779);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5453:1: rule__FixedType__Group__7__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5457:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5458:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5458:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5459:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__7__Impl10807); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5472:1: rule__FixedType__Group__8 : rule__FixedType__Group__8__Impl rule__FixedType__Group__9 ;
    public final void rule__FixedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5476:1: ( rule__FixedType__Group__8__Impl rule__FixedType__Group__9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5477:2: rule__FixedType__Group__8__Impl rule__FixedType__Group__9
            {
            pushFollow(FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__810838);
            rule__FixedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__810841);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5484:1: rule__FixedType__Group__8__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5488:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5489:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5489:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5490:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__8__Impl10869); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5503:1: rule__FixedType__Group__9 : rule__FixedType__Group__9__Impl rule__FixedType__Group__10 ;
    public final void rule__FixedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5507:1: ( rule__FixedType__Group__9__Impl rule__FixedType__Group__10 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5508:2: rule__FixedType__Group__9__Impl rule__FixedType__Group__10
            {
            pushFollow(FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__910900);
            rule__FixedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__910903);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5515:1: rule__FixedType__Group__9__Impl : ( ( rule__FixedType__NameAssignment_9 ) ) ;
    public final void rule__FixedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5519:1: ( ( ( rule__FixedType__NameAssignment_9 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5520:1: ( ( rule__FixedType__NameAssignment_9 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5520:1: ( ( rule__FixedType__NameAssignment_9 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5521:1: ( rule__FixedType__NameAssignment_9 )
            {
             before(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5522:1: ( rule__FixedType__NameAssignment_9 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5522:2: rule__FixedType__NameAssignment_9
            {
            pushFollow(FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl10930);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5532:1: rule__FixedType__Group__10 : rule__FixedType__Group__10__Impl rule__FixedType__Group__11 ;
    public final void rule__FixedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5536:1: ( rule__FixedType__Group__10__Impl rule__FixedType__Group__11 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5537:2: rule__FixedType__Group__10__Impl rule__FixedType__Group__11
            {
            pushFollow(FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1010960);
            rule__FixedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1010963);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5544:1: rule__FixedType__Group__10__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5548:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5549:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5549:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5550:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__10__Impl10991); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5563:1: rule__FixedType__Group__11 : rule__FixedType__Group__11__Impl rule__FixedType__Group__12 ;
    public final void rule__FixedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5567:1: ( rule__FixedType__Group__11__Impl rule__FixedType__Group__12 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5568:2: rule__FixedType__Group__11__Impl rule__FixedType__Group__12
            {
            pushFollow(FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111022);
            rule__FixedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111025);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5575:1: rule__FixedType__Group__11__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5579:1: ( ( ',' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5580:1: ( ',' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5580:1: ( ',' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5581:1: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 
            match(input,21,FOLLOW_21_in_rule__FixedType__Group__11__Impl11053); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5594:1: rule__FixedType__Group__12 : rule__FixedType__Group__12__Impl rule__FixedType__Group__13 ;
    public final void rule__FixedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5598:1: ( rule__FixedType__Group__12__Impl rule__FixedType__Group__13 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5599:2: rule__FixedType__Group__12__Impl rule__FixedType__Group__13
            {
            pushFollow(FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211084);
            rule__FixedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211087);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5606:1: rule__FixedType__Group__12__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5610:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5611:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5611:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5612:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__12__Impl11115); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5625:1: rule__FixedType__Group__13 : rule__FixedType__Group__13__Impl rule__FixedType__Group__14 ;
    public final void rule__FixedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5629:1: ( rule__FixedType__Group__13__Impl rule__FixedType__Group__14 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5630:2: rule__FixedType__Group__13__Impl rule__FixedType__Group__14
            {
            pushFollow(FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311146);
            rule__FixedType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311149);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5637:1: rule__FixedType__Group__13__Impl : ( 'size' ) ;
    public final void rule__FixedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5641:1: ( ( 'size' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5642:1: ( 'size' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5642:1: ( 'size' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5643:1: 'size'
            {
             before(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 
            match(input,36,FOLLOW_36_in_rule__FixedType__Group__13__Impl11177); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5656:1: rule__FixedType__Group__14 : rule__FixedType__Group__14__Impl rule__FixedType__Group__15 ;
    public final void rule__FixedType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5660:1: ( rule__FixedType__Group__14__Impl rule__FixedType__Group__15 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5661:2: rule__FixedType__Group__14__Impl rule__FixedType__Group__15
            {
            pushFollow(FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411208);
            rule__FixedType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411211);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5668:1: rule__FixedType__Group__14__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5672:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5673:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5673:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5674:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__14__Impl11239); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5687:1: rule__FixedType__Group__15 : rule__FixedType__Group__15__Impl rule__FixedType__Group__16 ;
    public final void rule__FixedType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5691:1: ( rule__FixedType__Group__15__Impl rule__FixedType__Group__16 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5692:2: rule__FixedType__Group__15__Impl rule__FixedType__Group__16
            {
            pushFollow(FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511270);
            rule__FixedType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511273);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5699:1: rule__FixedType__Group__15__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5703:1: ( ( ':' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5704:1: ( ':' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5704:1: ( ':' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5705:1: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__FixedType__Group__15__Impl11301); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5718:1: rule__FixedType__Group__16 : rule__FixedType__Group__16__Impl rule__FixedType__Group__17 ;
    public final void rule__FixedType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5722:1: ( rule__FixedType__Group__16__Impl rule__FixedType__Group__17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5723:2: rule__FixedType__Group__16__Impl rule__FixedType__Group__17
            {
            pushFollow(FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611332);
            rule__FixedType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611335);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5730:1: rule__FixedType__Group__16__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5734:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5735:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5735:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5736:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__16__Impl11363); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5749:1: rule__FixedType__Group__17 : rule__FixedType__Group__17__Impl rule__FixedType__Group__18 ;
    public final void rule__FixedType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5753:1: ( rule__FixedType__Group__17__Impl rule__FixedType__Group__18 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5754:2: rule__FixedType__Group__17__Impl rule__FixedType__Group__18
            {
            pushFollow(FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711394);
            rule__FixedType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711397);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5761:1: rule__FixedType__Group__17__Impl : ( ( rule__FixedType__SizeAssignment_17 ) ) ;
    public final void rule__FixedType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5765:1: ( ( ( rule__FixedType__SizeAssignment_17 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5766:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5766:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5767:1: ( rule__FixedType__SizeAssignment_17 )
            {
             before(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5768:1: ( rule__FixedType__SizeAssignment_17 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5768:2: rule__FixedType__SizeAssignment_17
            {
            pushFollow(FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11424);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5778:1: rule__FixedType__Group__18 : rule__FixedType__Group__18__Impl ;
    public final void rule__FixedType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5782:1: ( rule__FixedType__Group__18__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5783:2: rule__FixedType__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811454);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5789:1: rule__FixedType__Group__18__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5793:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5794:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5794:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5795:1: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,23,FOLLOW_23_in_rule__FixedType__Group__18__Impl11482); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5846:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5850:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5851:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011551);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011554);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5858:1: rule__Primitive__Group__0__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5862:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5863:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5863:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5864:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Primitive__Group__0__Impl11582); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5877:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5881:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5882:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111613);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111616);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5889:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__TypeAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5893:1: ( ( ( rule__Primitive__TypeAssignment_1 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5894:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5894:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5895:1: ( rule__Primitive__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5896:1: ( rule__Primitive__TypeAssignment_1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5896:2: rule__Primitive__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11643);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5906:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5910:1: ( rule__Primitive__Group__2__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5911:2: rule__Primitive__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211673);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5917:1: rule__Primitive__Group__2__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5921:1: ( ( '\"' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5922:1: ( '\"' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5922:1: ( '\"' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5923:1: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Primitive__Group__2__Impl11701); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5942:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5946:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5947:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011738);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011741);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5954:1: rule__Namespace__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5958:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5959:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5959:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5960:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11768); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5971:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5975:1: ( rule__Namespace__Group__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5976:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__111797);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5982:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__Group_1__0 )* ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5986:1: ( ( ( rule__Namespace__Group_1__0 )* ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5987:1: ( ( rule__Namespace__Group_1__0 )* )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5987:1: ( ( rule__Namespace__Group_1__0 )* )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5988:1: ( rule__Namespace__Group_1__0 )*
            {
             before(grammarAccess.getNamespaceAccess().getGroup_1()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5989:1: ( rule__Namespace__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:5989:2: rule__Namespace__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl11824);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6003:1: rule__Namespace__Group_1__0 : rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 ;
    public final void rule__Namespace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6007:1: ( rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6008:2: rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__011859);
            rule__Namespace__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__011862);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6015:1: rule__Namespace__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Namespace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6019:1: ( ( '.' ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6020:1: ( '.' )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6020:1: ( '.' )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6021:1: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Namespace__Group_1__0__Impl11890); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6034:1: rule__Namespace__Group_1__1 : rule__Namespace__Group_1__1__Impl ;
    public final void rule__Namespace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6038:1: ( rule__Namespace__Group_1__1__Impl )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6039:2: rule__Namespace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__111921);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6045:1: rule__Namespace__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6049:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6050:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6050:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6051:1: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl11948); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6067:1: rule__AvroSchema__TypesAssignment : ( ( rule__AvroSchema__TypesAlternatives_0 ) ) ;
    public final void rule__AvroSchema__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6071:1: ( ( ( rule__AvroSchema__TypesAlternatives_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6072:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6072:1: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6073:1: ( rule__AvroSchema__TypesAlternatives_0 )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6074:1: ( rule__AvroSchema__TypesAlternatives_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6074:2: rule__AvroSchema__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment11986);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6083:1: rule__UnionType__TypesAssignment_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6087:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6088:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6088:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6089:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112019);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6098:1: rule__UnionType__TypesAssignment_2_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6102:1: ( ( ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6103:1: ( ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6103:1: ( ruleUnionMember )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6104:1: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112050);
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


    // $ANTLR start "rule__JsonType__TypeAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6113:1: rule__JsonType__TypeAssignment_6 : ( rulePrimitive ) ;
    public final void rule__JsonType__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6117:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6118:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6118:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6119:1: rulePrimitive
            {
             before(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612081);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6128:1: rule__RecordType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6132:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6133:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6133:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6134:1: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412112); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6143:1: rule__RecordType__NamespaceAssignment_16_6 : ( ruleNamespace ) ;
    public final void rule__RecordType__NamespaceAssignment_16_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6147:1: ( ( ruleNamespace ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6148:1: ( ruleNamespace )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6148:1: ( ruleNamespace )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6149:1: ruleNamespace
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612143);
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


    // $ANTLR start "rule__RecordType__FieldsAssignment_23"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6158:1: rule__RecordType__FieldsAssignment_23 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6162:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6163:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6163:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6164:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312174);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 

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
    // $ANTLR end "rule__RecordType__FieldsAssignment_23"


    // $ANTLR start "rule__RecordType__FieldsAssignment_24_1"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6173:1: rule__RecordType__FieldsAssignment_24_1 : ( ruleField ) ;
    public final void rule__RecordType__FieldsAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6177:1: ( ( ruleField ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6178:1: ( ruleField )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6178:1: ( ruleField )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6179:1: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112205);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 

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
    // $ANTLR end "rule__RecordType__FieldsAssignment_24_1"


    // $ANTLR start "rule__Field__NameAssignment_6"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6188:1: rule__Field__NameAssignment_6 : ( ( rule__Field__NameAlternatives_6_0 ) ) ;
    public final void rule__Field__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6192:1: ( ( ( rule__Field__NameAlternatives_6_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6193:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6193:1: ( ( rule__Field__NameAlternatives_6_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6194:1: ( rule__Field__NameAlternatives_6_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6195:1: ( rule__Field__NameAlternatives_6_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6195:2: rule__Field__NameAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612236);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6204:1: rule__Field__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__Field__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6208:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6209:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6209:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6210:1: rulePrimitive
            {
             before(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012269);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6219:1: rule__Field__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__Field__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6223:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6224:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6224:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6225:1: ruleRecordType
            {
             before(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112300);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6234:1: rule__Field__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6238:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6239:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6239:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6240:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6241:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6242:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112335); 
             after(grammarAccess.getFieldAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6253:1: rule__Field__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__Field__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6257:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6258:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6258:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6259:1: ruleEnumType
            {
             before(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312370);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6268:1: rule__Field__ArrayAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__Field__ArrayAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6272:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6273:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6273:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6274:1: ruleArrayType
            {
             before(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412401);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6283:1: rule__Field__MapAssignment_13_5 : ( ruleMapType ) ;
    public final void rule__Field__MapAssignment_13_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6287:1: ( ( ruleMapType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6288:1: ( ruleMapType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6288:1: ( ruleMapType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6289:1: ruleMapType
            {
             before(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
            pushFollow(FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512432);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6298:1: rule__Field__FixedAssignment_13_6 : ( ruleFixedType ) ;
    public final void rule__Field__FixedAssignment_13_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6302:1: ( ( ruleFixedType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6303:1: ( ruleFixedType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6303:1: ( ruleFixedType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6304:1: ruleFixedType
            {
             before(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
            pushFollow(FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612463);
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


    // $ANTLR start "rule__EnumType__NameAssignment_14"
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6313:1: rule__EnumType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6317:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6318:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6318:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6319:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412494); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6328:1: rule__EnumType__SymbolsAssignment_22_1 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6332:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6333:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6333:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6334:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112525); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6343:1: rule__EnumType__SymbolsAssignment_23_2 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6347:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6348:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6348:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6349:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212556); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6358:1: rule__ArrayType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__ArrayType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6362:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6363:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6363:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6364:1: rulePrimitive
            {
             before(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012587);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6373:1: rule__ArrayType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__ArrayType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6377:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6378:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6378:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6379:1: ruleRecordType
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112618);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6388:1: rule__ArrayType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6392:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6393:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6393:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6394:1: ( RULE_ID )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6395:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6396:1: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112653); 
             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6407:1: rule__ArrayType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__ArrayType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6411:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6412:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6412:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6413:1: ruleEnumType
            {
             before(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312688);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6422:1: rule__MapType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__MapType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6426:1: ( ( rulePrimitive ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6427:1: ( rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6427:1: ( rulePrimitive )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6428:1: rulePrimitive
            {
             before(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_012719);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6437:1: rule__MapType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__MapType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6441:1: ( ( ruleRecordType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6442:1: ( ruleRecordType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6442:1: ( ruleRecordType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6443:1: ruleRecordType
            {
             before(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_112750);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6452:1: rule__MapType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6456:1: ( ( ( RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6457:1: ( ( RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6457:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6458:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6459:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6460:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_112785); 
             after(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 

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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6471:1: rule__MapType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__MapType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6475:1: ( ( ruleEnumType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6476:1: ( ruleEnumType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6476:1: ( ruleEnumType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6477:1: ruleEnumType
            {
             before(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_312820);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6486:1: rule__MapType__AtypeAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__MapType__AtypeAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6490:1: ( ( ruleArrayType ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6491:1: ( ruleArrayType )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6491:1: ( ruleArrayType )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6492:1: ruleArrayType
            {
             before(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_412851);
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6501:1: rule__FixedType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__FixedType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6505:1: ( ( RULE_ID ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6506:1: ( RULE_ID )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6506:1: ( RULE_ID )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6507:1: RULE_ID
            {
             before(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_912882); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6516:1: rule__FixedType__SizeAssignment_17 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6520:1: ( ( RULE_INT ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6521:1: ( RULE_INT )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6521:1: ( RULE_INT )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6522:1: RULE_INT
            {
             before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1712913); 
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
    // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6531:1: rule__Primitive__TypeAssignment_1 : ( ( rule__Primitive__TypeAlternatives_1_0 ) ) ;
    public final void rule__Primitive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6535:1: ( ( ( rule__Primitive__TypeAlternatives_1_0 ) ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6536:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            {
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6536:1: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6537:1: ( rule__Primitive__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6538:1: ( rule__Primitive__TypeAlternatives_1_0 )
            // ../net.langleystudios.avro.dsl.ui/src-gen/net/langleystudios/dsl/ui/contentassist/antlr/internal/InternalAvroSchema.g:6538:2: rule__Primitive__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_112944);
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
        "\1\23\1\27\1\uffff\1\30\1\27\1\31\2\27\2\uffff";
    static final String DFA1_maxS =
        "\1\26\1\27\1\uffff\1\30\1\27\1\31\1\27\1\33\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\5\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\3\uffff\1\11",
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
            return "396:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );";
        }
    }
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\26\1\27\1\13\1\30\2\uffff\1\27\1\31\1\27\1\33\4\uffff";
    static final String DFA2_maxS =
        "\2\27\1\43\1\30\2\uffff\1\27\1\31\1\27\1\42\4\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\3\1\6\4\uffff\1\5\1\4\1\2\1\1";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\10\4\20\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\15\2\uffff\1\12\1\uffff\1\14\1\uffff\1\13",
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
            return "424:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) );";
        }
    }
    static final String DFA4_eotS =
        "\17\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\1\26\1\4\1\27\3\uffff\1\30\1\27\1\31\1\27\1\33\4\uffff";
    static final String DFA4_maxS =
        "\1\27\1\43\1\27\3\uffff\1\30\1\27\1\31\1\27\1\42\4\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\1\1\1\7\5\uffff\1\2\1\5\1\4\1\6";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\1",
            "\1\3\6\uffff\10\4\20\uffff\1\5",
            "\1\6",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\2\uffff\1\15\1\uffff\1\14\1\uffff\1\16",
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
            return "494:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) );";
        }
    }
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\14\uffff";
    static final String DFA5_minS =
        "\1\26\1\4\1\27\2\uffff\1\30\1\27\1\31\1\27\1\33\2\uffff";
    static final String DFA5_maxS =
        "\1\27\1\22\1\27\2\uffff\1\30\1\27\1\31\1\27\1\36\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\4\1\2";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\1\1",
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
            return "546:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\26\1\4\1\27\2\uffff\1\30\1\27\1\31\1\27\1\33\3\uffff";
    static final String DFA6_maxS =
        "\1\27\1\22\1\27\2\uffff\1\30\1\27\1\31\1\27\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\3\5\uffff\1\5\1\4\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\1",
            "\1\4\6\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\14\2\uffff\1\13\1\uffff\1\12",
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
            return "580:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );";
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
    public static final BitSet FOLLOW_ruleField_in_entryRuleField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0_in_ruleMapType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0_in_ruleFixedType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__AvroSchema__TypesAlternatives_0790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__AvroSchema__TypesAlternatives_0807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_rule__AvroSchema__TypesAlternatives_0824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__UnionMember__Alternatives856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__UnionMember__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__UnionMember__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__UnionMember__Alternatives907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__UnionMember__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__UnionMember__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__NameAlternatives_6_0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAlternatives_6_0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PrimitiveAssignment_13_0_in_rule__Field__Alternatives_131025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordAssignment_13_1_in_rule__Field__Alternatives_131043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0_in_rule__Field__Alternatives_131061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__EtypeAssignment_13_3_in_rule__Field__Alternatives_131079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ArrayAssignment_13_4_in_rule__Field__Alternatives_131097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MapAssignment_13_5_in_rule__Field__Alternatives_131115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FixedAssignment_13_6_in_rule__Field__Alternatives_131133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimitiveAssignment_13_0_in_rule__ArrayType__Alternatives_131166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordAssignment_13_1_in_rule__ArrayType__Alternatives_131184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0_in_rule__ArrayType__Alternatives_131202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__EtypeAssignment_13_3_in_rule__ArrayType__Alternatives_131220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__PrimitiveAssignment_13_0_in_rule__MapType__Alternatives_131253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordAssignment_13_1_in_rule__MapType__Alternatives_131271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0_in_rule__MapType__Alternatives_131289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__EtypeAssignment_13_3_in_rule__MapType__Alternatives_131307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__AtypeAssignment_13_4_in_rule__MapType__Alternatives_131325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Primitive__TypeAlternatives_1_01359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Primitive__TypeAlternatives_1_01379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primitive__TypeAlternatives_1_01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primitive__TypeAlternatives_1_01419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primitive__TypeAlternatives_1_01439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__TypeAlternatives_1_01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__TypeAlternatives_1_01479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__TypeAlternatives_1_01499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__0__Impl_in_rule__UnionType__Group__01531 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1_in_rule__UnionType__Group__01534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnionType__Group__0__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__1__Impl_in_rule__UnionType__Group__11593 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2_in_rule__UnionType__Group__11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_1_in_rule__UnionType__Group__1__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__2__Impl_in_rule__UnionType__Group__21653 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3_in_rule__UnionType__Group__21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0_in_rule__UnionType__Group__2__Impl1683 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__UnionType__Group__3__Impl_in_rule__UnionType__Group__31714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UnionType__Group__3__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__0__Impl_in_rule__UnionType__Group_2__01781 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1_in_rule__UnionType__Group_2__01784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UnionType__Group_2__0__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__Group_2__1__Impl_in_rule__UnionType__Group_2__11843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionType__TypesAssignment_2_1_in_rule__UnionType__Group_2__1__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__0__Impl_in_rule__JsonType__Group__01904 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1_in_rule__JsonType__Group__01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonType__Group__0__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__1__Impl_in_rule__JsonType__Group__11966 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2_in_rule__JsonType__Group__11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__1__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__2__Impl_in_rule__JsonType__Group__22028 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3_in_rule__JsonType__Group__22031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonType__Group__2__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__3__Impl_in_rule__JsonType__Group__32090 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4_in_rule__JsonType__Group__32093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__3__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__4__Impl_in_rule__JsonType__Group__42152 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5_in_rule__JsonType__Group__42155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonType__Group__4__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__5__Impl_in_rule__JsonType__Group__52214 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6_in_rule__JsonType__Group__52217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__5__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__6__Impl_in_rule__JsonType__Group__62276 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7_in_rule__JsonType__Group__62279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__TypeAssignment_6_in_rule__JsonType__Group__6__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__7__Impl_in_rule__JsonType__Group__72336 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8_in_rule__JsonType__Group__72339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonType__Group__7__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Group__8__Impl_in_rule__JsonType__Group__82398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonType__Group__8__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__02475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__02478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group__0__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__12537 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__22599 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__32661 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__32664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__42723 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__42726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__4__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__52785 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__52788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__5__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__62847 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__62850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordType__Group__6__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__72909 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8_in_rule__RecordType__Group__72912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__7__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__8__Impl_in_rule__RecordType__Group__82971 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9_in_rule__RecordType__Group__82974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__8__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__9__Impl_in_rule__RecordType__Group__93033 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10_in_rule__RecordType__Group__93036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__9__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__10__Impl_in_rule__RecordType__Group__103095 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11_in_rule__RecordType__Group__103098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RecordType__Group__10__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__11__Impl_in_rule__RecordType__Group__113157 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12_in_rule__RecordType__Group__113160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__11__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__12__Impl_in_rule__RecordType__Group__123219 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13_in_rule__RecordType__Group__123222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__12__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__13__Impl_in_rule__RecordType__Group__133281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14_in_rule__RecordType__Group__133284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__13__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__14__Impl_in_rule__RecordType__Group__143343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15_in_rule__RecordType__Group__143346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_14_in_rule__RecordType__Group__14__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__15__Impl_in_rule__RecordType__Group__153403 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16_in_rule__RecordType__Group__153406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__15__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__16__Impl_in_rule__RecordType__Group__163465 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17_in_rule__RecordType__Group__163468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0_in_rule__RecordType__Group__16__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__17__Impl_in_rule__RecordType__Group__173526 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18_in_rule__RecordType__Group__173529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__17__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__18__Impl_in_rule__RecordType__Group__183588 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19_in_rule__RecordType__Group__183591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__18__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__19__Impl_in_rule__RecordType__Group__193650 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20_in_rule__RecordType__Group__193653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecordType__Group__19__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__20__Impl_in_rule__RecordType__Group__203712 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21_in_rule__RecordType__Group__203715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group__20__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__21__Impl_in_rule__RecordType__Group__213774 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22_in_rule__RecordType__Group__213777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__21__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__22__Impl_in_rule__RecordType__Group__223836 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23_in_rule__RecordType__Group__223839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group__22__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__23__Impl_in_rule__RecordType__Group__233898 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24_in_rule__RecordType__Group__233901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_23_in_rule__RecordType__Group__23__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__24__Impl_in_rule__RecordType__Group__243958 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25_in_rule__RecordType__Group__243961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0_in_rule__RecordType__Group__24__Impl3988 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__25__Impl_in_rule__RecordType__Group__254019 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26_in_rule__RecordType__Group__254022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group__25__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__26__Impl_in_rule__RecordType__Group__264081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group__26__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__0__Impl_in_rule__RecordType__Group_16__04194 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1_in_rule__RecordType__Group_16__04197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_16__0__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__1__Impl_in_rule__RecordType__Group_16__14256 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2_in_rule__RecordType__Group_16__14259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__1__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__2__Impl_in_rule__RecordType__Group_16__24318 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3_in_rule__RecordType__Group_16__24321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordType__Group_16__2__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__3__Impl_in_rule__RecordType__Group_16__34380 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4_in_rule__RecordType__Group_16__34383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__3__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__4__Impl_in_rule__RecordType__Group_16__44442 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5_in_rule__RecordType__Group_16__44445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_16__4__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__5__Impl_in_rule__RecordType__Group_16__54504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6_in_rule__RecordType__Group_16__54507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__5__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__6__Impl_in_rule__RecordType__Group_16__64566 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7_in_rule__RecordType__Group_16__64569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NamespaceAssignment_16_6_in_rule__RecordType__Group_16__6__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_16__7__Impl_in_rule__RecordType__Group_16__74626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_16__7__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__0__Impl_in_rule__RecordType__Group_24__04701 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1_in_rule__RecordType__Group_24__04704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_24__0__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_24__1__Impl_in_rule__RecordType__Group_24__14763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__FieldsAssignment_24_1_in_rule__RecordType__Group_24__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04824 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__0__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14886 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__1__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Field__Group__2__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35010 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__35013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__3__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__45072 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__45075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__4__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__55134 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__55137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__5__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__65196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__65199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_6_in_rule__Field__Group__6__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__75256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__75259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__7__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__85318 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__85321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__8__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__95380 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__95383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__9__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__105442 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__11_in_rule__Field__Group__105445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__10__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__115504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__12_in_rule__Field__Group__115507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__11__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__12__Impl_in_rule__Field__Group__125566 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Field__Group__13_in_rule__Field__Group__125569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__12__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__13__Impl_in_rule__Field__Group__135628 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__14_in_rule__Field__Group__135631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_13_in_rule__Field__Group__13__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__14__Impl_in_rule__Field__Group__145688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__14__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__0__Impl_in_rule__Field__Group_13_2__05777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1_in_rule__Field__Group_13_2__05780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_13_2__0__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__1__Impl_in_rule__Field__Group_13_2__15839 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2_in_rule__Field__Group_13_2__15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RecordRefAssignment_13_2_1_in_rule__Field__Group_13_2__1__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_13_2__2__Impl_in_rule__Field__Group_13_2__25899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_13_2__2__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05964 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumType__Group__0__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__16026 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__16029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__1__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__26088 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__26091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumType__Group__2__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__36150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__36153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__3__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__46212 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__46215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__4__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__56274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6_in_rule__EnumType__Group__56277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__5__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__6__Impl_in_rule__EnumType__Group__66336 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7_in_rule__EnumType__Group__66339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumType__Group__6__Impl6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__7__Impl_in_rule__EnumType__Group__76398 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8_in_rule__EnumType__Group__76401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__7__Impl6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__8__Impl_in_rule__EnumType__Group__86460 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9_in_rule__EnumType__Group__86463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__8__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__9__Impl_in_rule__EnumType__Group__96522 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10_in_rule__EnumType__Group__96525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__9__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__10__Impl_in_rule__EnumType__Group__106584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11_in_rule__EnumType__Group__106587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EnumType__Group__10__Impl6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__11__Impl_in_rule__EnumType__Group__116646 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12_in_rule__EnumType__Group__116649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__11__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__12__Impl_in_rule__EnumType__Group__126708 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13_in_rule__EnumType__Group__126711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__12__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__13__Impl_in_rule__EnumType__Group__136770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14_in_rule__EnumType__Group__136773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__13__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__14__Impl_in_rule__EnumType__Group__146832 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15_in_rule__EnumType__Group__146835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_14_in_rule__EnumType__Group__14__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__15__Impl_in_rule__EnumType__Group__156892 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16_in_rule__EnumType__Group__156895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__15__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__16__Impl_in_rule__EnumType__Group__166954 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17_in_rule__EnumType__Group__166957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group__16__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__17__Impl_in_rule__EnumType__Group__177016 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18_in_rule__EnumType__Group__177019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__17__Impl7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__18__Impl_in_rule__EnumType__Group__187078 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19_in_rule__EnumType__Group__187081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumType__Group__18__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__19__Impl_in_rule__EnumType__Group__197140 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20_in_rule__EnumType__Group__197143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group__19__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__20__Impl_in_rule__EnumType__Group__207202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21_in_rule__EnumType__Group__207205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumType__Group__20__Impl7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__21__Impl_in_rule__EnumType__Group__217264 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22_in_rule__EnumType__Group__217267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumType__Group__21__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__22__Impl_in_rule__EnumType__Group__227326 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23_in_rule__EnumType__Group__227329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0_in_rule__EnumType__Group__22__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__23__Impl_in_rule__EnumType__Group__237386 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24_in_rule__EnumType__Group__237389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0_in_rule__EnumType__Group__23__Impl7416 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__24__Impl_in_rule__EnumType__Group__247447 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25_in_rule__EnumType__Group__247450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumType__Group__24__Impl7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__25__Impl_in_rule__EnumType__Group__257509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumType__Group__25__Impl7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__0__Impl_in_rule__EnumType__Group_22__07620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1_in_rule__EnumType__Group_22__07623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_22__0__Impl7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__1__Impl_in_rule__EnumType__Group_22__17682 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2_in_rule__EnumType__Group_22__17685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_22_1_in_rule__EnumType__Group_22__1__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_22__2__Impl_in_rule__EnumType__Group_22__27742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_22__2__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__0__Impl_in_rule__EnumType__Group_23__07807 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1_in_rule__EnumType__Group_23__07810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumType__Group_23__0__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__1__Impl_in_rule__EnumType__Group_23__17869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2_in_rule__EnumType__Group_23__17872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_23__1__Impl7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__2__Impl_in_rule__EnumType__Group_23__27931 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3_in_rule__EnumType__Group_23__27934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__SymbolsAssignment_23_2_in_rule__EnumType__Group_23__2__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group_23__3__Impl_in_rule__EnumType__Group_23__37991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumType__Group_23__3__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__08058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__08061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__0__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__18120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__18123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__1__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__28182 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__28185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArrayType__Group__2__Impl8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__38244 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__38247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__3__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__48306 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__48309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__4__Impl8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__58368 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__58371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__5__Impl8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__68430 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__68433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__Group__6__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__78492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8_in_rule__ArrayType__Group__78495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__7__Impl8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__8__Impl_in_rule__ArrayType__Group__88554 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9_in_rule__ArrayType__Group__88557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayType__Group__8__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__9__Impl_in_rule__ArrayType__Group__98616 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10_in_rule__ArrayType__Group__98619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__9__Impl8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__10__Impl_in_rule__ArrayType__Group__108678 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11_in_rule__ArrayType__Group__108681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ArrayType__Group__10__Impl8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__11__Impl_in_rule__ArrayType__Group__118740 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12_in_rule__ArrayType__Group__118743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group__11__Impl8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__12__Impl_in_rule__ArrayType__Group__128802 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13_in_rule__ArrayType__Group__128805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayType__Group__12__Impl8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__13__Impl_in_rule__ArrayType__Group__138864 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14_in_rule__ArrayType__Group__138867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_13_in_rule__ArrayType__Group__13__Impl8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__14__Impl_in_rule__ArrayType__Group__148924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ArrayType__Group__14__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__0__Impl_in_rule__ArrayType__Group_13_2__09013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1_in_rule__ArrayType__Group_13_2__09016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group_13_2__0__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__1__Impl_in_rule__ArrayType__Group_13_2__19075 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2_in_rule__ArrayType__Group_13_2__19078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__RecordRefAssignment_13_2_1_in_rule__ArrayType__Group_13_2__1__Impl9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_13_2__2__Impl_in_rule__ArrayType__Group_13_2__29135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayType__Group_13_2__2__Impl9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__09200 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__09203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapType__Group__0__Impl9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__19262 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__19265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__1__Impl9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__29324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__29327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapType__Group__2__Impl9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__39386 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__39389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__3__Impl9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__49448 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__49451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__4__Impl9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__59510 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__6_in_rule__MapType__Group__59513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__5__Impl9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__6__Impl_in_rule__MapType__Group__69572 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__7_in_rule__MapType__Group__69575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapType__Group__6__Impl9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__7__Impl_in_rule__MapType__Group__79634 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MapType__Group__8_in_rule__MapType__Group__79637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__7__Impl9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__8__Impl_in_rule__MapType__Group__89696 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__9_in_rule__MapType__Group__89699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapType__Group__8__Impl9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__9__Impl_in_rule__MapType__Group__99758 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__10_in_rule__MapType__Group__99761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__9__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__10__Impl_in_rule__MapType__Group__109820 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group__11_in_rule__MapType__Group__109823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MapType__Group__10__Impl9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__11__Impl_in_rule__MapType__Group__119882 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__12_in_rule__MapType__Group__119885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group__11__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__12__Impl_in_rule__MapType__Group__129944 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__MapType__Group__13_in_rule__MapType__Group__129947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapType__Group__12__Impl9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__13__Impl_in_rule__MapType__Group__1310006 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__14_in_rule__MapType__Group__1310009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_13_in_rule__MapType__Group__13__Impl10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__14__Impl_in_rule__MapType__Group__1410066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapType__Group__14__Impl10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__0__Impl_in_rule__MapType__Group_13_2__010155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1_in_rule__MapType__Group_13_2__010158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group_13_2__0__Impl10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__1__Impl_in_rule__MapType__Group_13_2__110217 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2_in_rule__MapType__Group_13_2__110220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__RecordRefAssignment_13_2_1_in_rule__MapType__Group_13_2__1__Impl10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group_13_2__2__Impl_in_rule__MapType__Group_13_2__210277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapType__Group_13_2__2__Impl10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__0__Impl_in_rule__FixedType__Group__010342 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1_in_rule__FixedType__Group__010345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__0__Impl10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__1__Impl_in_rule__FixedType__Group__110404 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2_in_rule__FixedType__Group__110407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FixedType__Group__1__Impl10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__2__Impl_in_rule__FixedType__Group__210466 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3_in_rule__FixedType__Group__210469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__2__Impl10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__3__Impl_in_rule__FixedType__Group__310528 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4_in_rule__FixedType__Group__310531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__3__Impl10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__4__Impl_in_rule__FixedType__Group__410590 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5_in_rule__FixedType__Group__410593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__4__Impl10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__5__Impl_in_rule__FixedType__Group__510652 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6_in_rule__FixedType__Group__510655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__FixedType__Group__5__Impl10683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__6__Impl_in_rule__FixedType__Group__610714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7_in_rule__FixedType__Group__610717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__6__Impl10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__7__Impl_in_rule__FixedType__Group__710776 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8_in_rule__FixedType__Group__710779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__7__Impl10807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__8__Impl_in_rule__FixedType__Group__810838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9_in_rule__FixedType__Group__810841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__8__Impl10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__9__Impl_in_rule__FixedType__Group__910900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10_in_rule__FixedType__Group__910903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__NameAssignment_9_in_rule__FixedType__Group__9__Impl10930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__10__Impl_in_rule__FixedType__Group__1010960 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11_in_rule__FixedType__Group__1010963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__10__Impl10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__11__Impl_in_rule__FixedType__Group__1111022 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12_in_rule__FixedType__Group__1111025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FixedType__Group__11__Impl11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__12__Impl_in_rule__FixedType__Group__1211084 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13_in_rule__FixedType__Group__1211087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__12__Impl11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__13__Impl_in_rule__FixedType__Group__1311146 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14_in_rule__FixedType__Group__1311149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FixedType__Group__13__Impl11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__14__Impl_in_rule__FixedType__Group__1411208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15_in_rule__FixedType__Group__1411211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__14__Impl11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__15__Impl_in_rule__FixedType__Group__1511270 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16_in_rule__FixedType__Group__1511273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FixedType__Group__15__Impl11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__16__Impl_in_rule__FixedType__Group__1611332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17_in_rule__FixedType__Group__1611335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__16__Impl11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__17__Impl_in_rule__FixedType__Group__1711394 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18_in_rule__FixedType__Group__1711397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__SizeAssignment_17_in_rule__FixedType__Group__17__Impl11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FixedType__Group__18__Impl_in_rule__FixedType__Group__1811454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FixedType__Group__18__Impl11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__011551 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__011554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primitive__Group__0__Impl11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__111613 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__111616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_1_in_rule__Primitive__Group__1__Impl11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__211673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primitive__Group__2__Impl11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__011738 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__011741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group__0__Impl11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__111797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0_in_rule__Namespace__Group__1__Impl11824 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__0__Impl_in_rule__Namespace__Group_1__011859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1_in_rule__Namespace__Group_1__011862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Namespace__Group_1__0__Impl11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group_1__1__Impl_in_rule__Namespace__Group_1__111921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Namespace__Group_1__1__Impl11948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AvroSchema__TypesAlternatives_0_in_rule__AvroSchema__TypesAssignment11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_112019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_rule__UnionType__TypesAssignment_2_112050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__JsonType__TypeAssignment_612081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_1412112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__RecordType__NamespaceAssignment_16_612143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_2312174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__RecordType__FieldsAssignment_24_112205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAlternatives_6_0_in_rule__Field__NameAssignment_612236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Field__PrimitiveAssignment_13_012269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Field__RecordAssignment_13_112300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__RecordRefAssignment_13_2_112335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Field__EtypeAssignment_13_312370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Field__ArrayAssignment_13_412401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__Field__MapAssignment_13_512432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_rule__Field__FixedAssignment_13_612463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__NameAssignment_1412494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_22_112525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__SymbolsAssignment_23_212556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__ArrayType__PrimitiveAssignment_13_012587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__ArrayType__RecordAssignment_13_112618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayType__RecordRefAssignment_13_2_112653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__ArrayType__EtypeAssignment_13_312688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__MapType__PrimitiveAssignment_13_012719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__MapType__RecordAssignment_13_112750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__RecordRefAssignment_13_2_112785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__MapType__EtypeAssignment_13_312820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__MapType__AtypeAssignment_13_412851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FixedType__NameAssignment_912882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FixedType__SizeAssignment_1712913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__TypeAlternatives_1_0_in_rule__Primitive__TypeAssignment_112944 = new BitSet(new long[]{0x0000000000000002L});

}