package net.langleystudios.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.langleystudios.dsl.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "'{'", "'\"'", "'type'", "':'", "'}'", "'record'", "'name'", "'namespace'", "'fields'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'.'"
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
    public String getGrammarFileName() { return "../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g"; }



     	private AvroSchemaGrammarAccess grammarAccess;
     	
        public InternalAvroSchemaParser(TokenStream input, AvroSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AvroSchema";	
       	}
       	
       	@Override
       	protected AvroSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAvroSchema"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:67:1: entryRuleAvroSchema returns [EObject current=null] : iv_ruleAvroSchema= ruleAvroSchema EOF ;
    public final EObject entryRuleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvroSchema = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:68:2: (iv_ruleAvroSchema= ruleAvroSchema EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:69:2: iv_ruleAvroSchema= ruleAvroSchema EOF
            {
             newCompositeNode(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema75);
            iv_ruleAvroSchema=ruleAvroSchema();

            state._fsp--;

             current =iv_ruleAvroSchema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvroSchema85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:76:1: ruleAvroSchema returns [EObject current=null] : ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) ;
    public final EObject ruleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_1 = null;

        EObject lv_types_0_2 = null;

        EObject lv_types_0_3 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:79:28: ( ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:80:1: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:80:1: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:81:1: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:81:1: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:83:3: lv_types_0_1= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleAvroSchema132);
                    lv_types_0_1=ruleJsonType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_1, 
                            		"JsonType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:98:8: lv_types_0_2= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleAvroSchema151);
                    lv_types_0_2=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_2, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:113:8: lv_types_0_3= ruleUnionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleUnionType_in_ruleAvroSchema170);
                    lv_types_0_3=ruleUnionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_0_3, 
                            		"UnionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:139:1: entryRuleUnionType returns [EObject current=null] : iv_ruleUnionType= ruleUnionType EOF ;
    public final EObject entryRuleUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:140:2: (iv_ruleUnionType= ruleUnionType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:141:2: iv_ruleUnionType= ruleUnionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_ruleUnionType_in_entryRuleUnionType208);
            iv_ruleUnionType=ruleUnionType();

            state._fsp--;

             current =iv_ruleUnionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionType218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:148:1: ruleUnionType returns [EObject current=null] : (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleUnionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:151:28: ( (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:1: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:1: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:152:3: otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleUnionType255); 

                	newLeafNode(otherlv_0, grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:156:1: ( (lv_types_1_0= ruleUnionMember ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:157:1: (lv_types_1_0= ruleUnionMember )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:157:1: (lv_types_1_0= ruleUnionMember )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:158:3: lv_types_1_0= ruleUnionMember
            {
             
            	        newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnionMember_in_ruleUnionType276);
            lv_types_1_0=ruleUnionMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_1_0, 
                    		"UnionMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:174:2: (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:174:4: otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleUnionType289); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:178:1: ( (lv_types_3_0= ruleUnionMember ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:179:1: (lv_types_3_0= ruleUnionMember )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:179:1: (lv_types_3_0= ruleUnionMember )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:180:3: lv_types_3_0= ruleUnionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnionMember_in_ruleUnionType310);
            	    lv_types_3_0=ruleUnionMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"UnionMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleUnionType324); 

                	newLeafNode(otherlv_4, grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:208:1: entryRuleUnionMember returns [EObject current=null] : iv_ruleUnionMember= ruleUnionMember EOF ;
    public final EObject entryRuleUnionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionMember = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:209:2: (iv_ruleUnionMember= ruleUnionMember EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:210:2: iv_ruleUnionMember= ruleUnionMember EOF
            {
             newCompositeNode(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_ruleUnionMember_in_entryRuleUnionMember360);
            iv_ruleUnionMember=ruleUnionMember();

            state._fsp--;

             current =iv_ruleUnionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionMember370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:217:1: ruleUnionMember returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType ) ;
    public final EObject ruleUnionMember() throws RecognitionException {
        EObject current = null;

        EObject this_RecordType_0 = null;

        EObject this_ArrayType_1 = null;

        EObject this_Primitive_2 = null;

        EObject this_MapType_3 = null;

        EObject this_EnumType_4 = null;

        EObject this_FixedType_5 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:220:28: ( (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:222:5: this_RecordType_0= ruleRecordType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRecordType_in_ruleUnionMember417);
                    this_RecordType_0=ruleRecordType();

                    state._fsp--;

                     
                            current = this_RecordType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:232:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleUnionMember444);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:242:5: this_Primitive_2= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleUnionMember471);
                    this_Primitive_2=rulePrimitive();

                    state._fsp--;

                     
                            current = this_Primitive_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:252:5: this_MapType_3= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleUnionMember498);
                    this_MapType_3=ruleMapType();

                    state._fsp--;

                     
                            current = this_MapType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:262:5: this_EnumType_4= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleUnionMember525);
                    this_EnumType_4=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:272:5: this_FixedType_5= ruleFixedType
                    {
                     
                            newCompositeNode(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFixedType_in_ruleUnionMember552);
                    this_FixedType_5=ruleFixedType();

                    state._fsp--;

                     
                            current = this_FixedType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:288:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:289:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:290:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType587);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:297:1: ruleJsonType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:300:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:301:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:301:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:301:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleJsonType634); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleJsonType646); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJsonType658); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleJsonType670); 

                	newLeafNode(otherlv_3, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleJsonType682); 

                	newLeafNode(otherlv_4, grammarAccess.getJsonTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleJsonType694); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:325:1: ( (lv_type_6_0= rulePrimitive ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:326:1: (lv_type_6_0= rulePrimitive )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:326:1: (lv_type_6_0= rulePrimitive )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:327:3: lv_type_6_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleJsonType715);
            lv_type_6_0=rulePrimitive();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"Primitive");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleJsonType727); 

                	newLeafNode(otherlv_7, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleJsonType739); 

                	newLeafNode(otherlv_8, grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:359:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:360:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:361:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType775);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:368:1: ruleRecordType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fields_30_0= ruleField ) ) (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )* otherlv_33= ']' otherlv_34= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_namespace_22_0 = null;

        EObject lv_fields_30_0 = null;

        EObject lv_fields_32_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:371:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fields_30_0= ruleField ) ) (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )* otherlv_33= ']' otherlv_34= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:372:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fields_30_0= ruleField ) ) (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )* otherlv_33= ']' otherlv_34= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:372:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fields_30_0= ruleField ) ) (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )* otherlv_33= ']' otherlv_34= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:372:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fields_30_0= ruleField ) ) (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )* otherlv_33= ']' otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRecordType822); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRecordType834); 

                	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRecordType846); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRecordType858); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRecordType870); 

                	newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRecordType882); 

                	newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRecordType894); 

                	newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRecordKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRecordType906); 

                	newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleRecordType918); 

                	newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRecordType930); 

                	newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleRecordType942); 

                	newLeafNode(otherlv_10, grammarAccess.getRecordTypeAccess().getNameKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleRecordType954); 

                	newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleRecordType966); 

                	newLeafNode(otherlv_12, grammarAccess.getRecordTypeAccess().getColonKeyword_12());
                
            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleRecordType978); 

                	newLeafNode(otherlv_13, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:428:1: ( (lv_name_14_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:429:1: (lv_name_14_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:429:1: (lv_name_14_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:430:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType995); 

            			newLeafNode(lv_name_14_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1012); 

                	newLeafNode(otherlv_15, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:450:1: (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==20) ) {
                        alt4=1;
                    }
                }
            }
            switch (alt4) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:450:3: otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"'
                    {
                    otherlv_16=(Token)match(input,11,FOLLOW_11_in_ruleRecordType1025); 

                        	newLeafNode(otherlv_16, grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0());
                        
                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1037); 

                        	newLeafNode(otherlv_17, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1());
                        
                    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleRecordType1049); 

                        	newLeafNode(otherlv_18, grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2());
                        
                    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1061); 

                        	newLeafNode(otherlv_19, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3());
                        
                    otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleRecordType1073); 

                        	newLeafNode(otherlv_20, grammarAccess.getRecordTypeAccess().getColonKeyword_16_4());
                        
                    otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1085); 

                        	newLeafNode(otherlv_21, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:474:1: ( (lv_namespace_22_0= ruleNamespace ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:475:1: (lv_namespace_22_0= ruleNamespace )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:475:1: (lv_namespace_22_0= ruleNamespace )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:476:3: lv_namespace_22_0= ruleNamespace
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespace_in_ruleRecordType1106);
                    lv_namespace_22_0=ruleNamespace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_22_0, 
                            		"Namespace");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1118); 

                        	newLeafNode(otherlv_23, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,11,FOLLOW_11_in_ruleRecordType1132); 

                	newLeafNode(otherlv_24, grammarAccess.getRecordTypeAccess().getCommaKeyword_17());
                
            otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1144); 

                	newLeafNode(otherlv_25, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18());
                
            otherlv_26=(Token)match(input,21,FOLLOW_21_in_ruleRecordType1156); 

                	newLeafNode(otherlv_26, grammarAccess.getRecordTypeAccess().getFieldsKeyword_19());
                
            otherlv_27=(Token)match(input,14,FOLLOW_14_in_ruleRecordType1168); 

                	newLeafNode(otherlv_27, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20());
                
            otherlv_28=(Token)match(input,16,FOLLOW_16_in_ruleRecordType1180); 

                	newLeafNode(otherlv_28, grammarAccess.getRecordTypeAccess().getColonKeyword_21());
                
            otherlv_29=(Token)match(input,10,FOLLOW_10_in_ruleRecordType1192); 

                	newLeafNode(otherlv_29, grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:520:1: ( (lv_fields_30_0= ruleField ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:521:1: (lv_fields_30_0= ruleField )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:521:1: (lv_fields_30_0= ruleField )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:522:3: lv_fields_30_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_23_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleRecordType1213);
            lv_fields_30_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_30_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:538:2: (otherlv_31= ',' ( (lv_fields_32_0= ruleField ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:538:4: otherlv_31= ',' ( (lv_fields_32_0= ruleField ) )
            	    {
            	    otherlv_31=(Token)match(input,11,FOLLOW_11_in_ruleRecordType1226); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRecordTypeAccess().getCommaKeyword_24_0());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:542:1: ( (lv_fields_32_0= ruleField ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:543:1: (lv_fields_32_0= ruleField )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:543:1: (lv_fields_32_0= ruleField )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:544:3: lv_fields_32_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldsFieldParserRuleCall_24_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleRecordType1247);
            	    lv_fields_32_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_32_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_33=(Token)match(input,12,FOLLOW_12_in_ruleRecordType1261); 

                	newLeafNode(otherlv_33, grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_25());
                
            otherlv_34=(Token)match(input,17,FOLLOW_17_in_ruleRecordType1273); 

                	newLeafNode(otherlv_34, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_26());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:576:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:577:2: (iv_ruleField= ruleField EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:578:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1309);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:585:1: ruleField returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) ) otherlv_22= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_1=null;
        Token lv_name_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_array_19_0 = null;

        EObject lv_map_20_0 = null;

        EObject lv_fixed_21_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:588:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) ) otherlv_22= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) ) otherlv_22= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) ) otherlv_22= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:589:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleField1356); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleField1368); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleField1380); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleField1392); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleField1404); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleField1416); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getQuotationMarkKeyword_5());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:613:1: ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:614:1: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:614:1: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:615:1: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:615:1: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:616:3: lv_name_6_1= 'name'
                    {
                    lv_name_6_1=(Token)match(input,19,FOLLOW_19_in_ruleField1436); 

                            newLeafNode(lv_name_6_1, grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:628:8: lv_name_6_2= RULE_ID
                    {
                    lv_name_6_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1464); 

                    			newLeafNode(lv_name_6_2, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_2, 
                            		"ID");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleField1484); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleField1496); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleField1508); 

                	newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleField1520); 

                	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getTypeKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleField1532); 

                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleField1544); 

                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:670:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:670:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:670:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:671:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:671:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:672:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleField1566);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:689:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:689:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:690:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:690:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:691:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleField1593);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:708:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:708:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:708:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleField1612); 

                        	newLeafNode(otherlv_15, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:712:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:713:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:713:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:714:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1632); 

                    		newLeafNode(otherlv_16, grammarAccess.getFieldAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleField1644); 

                        	newLeafNode(otherlv_17, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:730:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:730:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:731:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:731:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:732:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleField1672);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:749:6: ( (lv_array_19_0= ruleArrayType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:749:6: ( (lv_array_19_0= ruleArrayType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:750:1: (lv_array_19_0= ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:750:1: (lv_array_19_0= ruleArrayType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:751:3: lv_array_19_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleField1699);
                    lv_array_19_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_19_0, 
                            		"ArrayType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:768:6: ( (lv_map_20_0= ruleMapType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:768:6: ( (lv_map_20_0= ruleMapType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:769:1: (lv_map_20_0= ruleMapType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:769:1: (lv_map_20_0= ruleMapType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:770:3: lv_map_20_0= ruleMapType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapType_in_ruleField1726);
                    lv_map_20_0=ruleMapType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"map",
                            		lv_map_20_0, 
                            		"MapType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:787:6: ( (lv_fixed_21_0= ruleFixedType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:787:6: ( (lv_fixed_21_0= ruleFixedType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:788:1: (lv_fixed_21_0= ruleFixedType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:788:1: (lv_fixed_21_0= ruleFixedType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:789:3: lv_fixed_21_0= ruleFixedType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFixedType_in_ruleField1753);
                    lv_fixed_21_0=ruleFixedType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"fixed",
                            		lv_fixed_21_0, 
                            		"FixedType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleField1766); 

                	newLeafNode(otherlv_22, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:817:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:818:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:819:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1802);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:826:1: ruleEnumType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_symbols_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_symbols_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:829:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:830:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:830:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:830:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEnumType1849); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1861); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEnumType1873); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1885); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnumType1897); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1909); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleEnumType1921); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getEnumKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1933); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleEnumType1945); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1957); 

                	newLeafNode(otherlv_9, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEnumType1969); 

                	newLeafNode(otherlv_10, grammarAccess.getEnumTypeAccess().getNameKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEnumType1981); 

                	newLeafNode(otherlv_11, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleEnumType1993); 

                	newLeafNode(otherlv_12, grammarAccess.getEnumTypeAccess().getColonKeyword_12());
                
            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2005); 

                	newLeafNode(otherlv_13, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:886:1: ( (lv_name_14_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:887:1: (lv_name_14_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:887:1: (lv_name_14_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:888:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2022); 

            			newLeafNode(lv_name_14_0, grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2039); 

                	newLeafNode(otherlv_15, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15());
                
            otherlv_16=(Token)match(input,11,FOLLOW_11_in_ruleEnumType2051); 

                	newLeafNode(otherlv_16, grammarAccess.getEnumTypeAccess().getCommaKeyword_16());
                
            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2063); 

                	newLeafNode(otherlv_17, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17());
                
            otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleEnumType2075); 

                	newLeafNode(otherlv_18, grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18());
                
            otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2087); 

                	newLeafNode(otherlv_19, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19());
                
            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleEnumType2099); 

                	newLeafNode(otherlv_20, grammarAccess.getEnumTypeAccess().getColonKeyword_20());
                
            otherlv_21=(Token)match(input,10,FOLLOW_10_in_ruleEnumType2111); 

                	newLeafNode(otherlv_21, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:932:1: (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:932:3: otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"'
            {
            otherlv_22=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2124); 

                	newLeafNode(otherlv_22, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:936:1: ( (lv_symbols_23_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:937:1: (lv_symbols_23_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:937:1: (lv_symbols_23_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:938:3: lv_symbols_23_0= RULE_ID
            {
            lv_symbols_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2141); 

            			newLeafNode(lv_symbols_23_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"symbols",
                    		lv_symbols_23_0, 
                    		"ID");
            	    

            }


            }

            otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2158); 

                	newLeafNode(otherlv_24, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2());
                

            }

            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:958:2: (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:958:4: otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"'
            	    {
            	    otherlv_25=(Token)match(input,11,FOLLOW_11_in_ruleEnumType2172); 

            	        	newLeafNode(otherlv_25, grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0());
            	        
            	    otherlv_26=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2184); 

            	        	newLeafNode(otherlv_26, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1());
            	        
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:966:1: ( (lv_symbols_27_0= RULE_ID ) )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:967:1: (lv_symbols_27_0= RULE_ID )
            	    {
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:967:1: (lv_symbols_27_0= RULE_ID )
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:968:3: lv_symbols_27_0= RULE_ID
            	    {
            	    lv_symbols_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2201); 

            	    			newLeafNode(lv_symbols_27_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"symbols",
            	            		lv_symbols_27_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleEnumType2218); 

            	        	newLeafNode(otherlv_28, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_29=(Token)match(input,12,FOLLOW_12_in_ruleEnumType2232); 

                	newLeafNode(otherlv_29, grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24());
                
            otherlv_30=(Token)match(input,17,FOLLOW_17_in_ruleEnumType2244); 

                	newLeafNode(otherlv_30, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1004:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1005:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1006:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2280);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1013:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1016:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1017:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1017:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1017:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleArrayType2327); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2339); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleArrayType2351); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2363); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleArrayType2375); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2387); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleArrayType2399); 

                	newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getArrayKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2411); 

                	newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleArrayType2423); 

                	newLeafNode(otherlv_8, grammarAccess.getArrayTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2435); 

                	newLeafNode(otherlv_9, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleArrayType2447); 

                	newLeafNode(otherlv_10, grammarAccess.getArrayTypeAccess().getItemsKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2459); 

                	newLeafNode(otherlv_11, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleArrayType2471); 

                	newLeafNode(otherlv_12, grammarAccess.getArrayTypeAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1069:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1069:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1069:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1070:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1070:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1071:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleArrayType2493);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1088:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1088:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1089:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1089:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1090:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleArrayType2520);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1107:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1107:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1107:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2539); 

                        	newLeafNode(otherlv_15, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1111:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1112:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1112:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1113:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrayTypeRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrayType2559); 

                    		newLeafNode(otherlv_16, grammarAccess.getArrayTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleArrayType2571); 

                        	newLeafNode(otherlv_17, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1129:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1129:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1130:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1130:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1131:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleArrayType2599);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleArrayType2612); 

                	newLeafNode(otherlv_19, grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1159:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1160:2: (iv_ruleMapType= ruleMapType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1161:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType2648);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType2658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1168:1: ruleMapType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_atype_19_0 = null;


         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1171:28: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1172:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1172:1: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1172:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMapType2695); 

                	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMapType2707); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMapType2719); 

                	newLeafNode(otherlv_2, grammarAccess.getMapTypeAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMapType2731); 

                	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMapType2743); 

                	newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getColonKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMapType2755); 

                	newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5());
                
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleMapType2767); 

                	newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getMapKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleMapType2779); 

                	newLeafNode(otherlv_7, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleMapType2791); 

                	newLeafNode(otherlv_8, grammarAccess.getMapTypeAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleMapType2803); 

                	newLeafNode(otherlv_9, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9());
                
            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleMapType2815); 

                	newLeafNode(otherlv_10, grammarAccess.getMapTypeAccess().getItemsKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleMapType2827); 

                	newLeafNode(otherlv_11, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11());
                
            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleMapType2839); 

                	newLeafNode(otherlv_12, grammarAccess.getMapTypeAccess().getColonKeyword_12());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1224:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1224:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1224:2: ( (lv_primitive_13_0= rulePrimitive ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1225:1: (lv_primitive_13_0= rulePrimitive )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1225:1: (lv_primitive_13_0= rulePrimitive )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1226:3: lv_primitive_13_0= rulePrimitive
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitive_in_ruleMapType2861);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_13_0, 
                            		"Primitive");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1243:6: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1243:6: ( (lv_record_14_0= ruleRecordType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1244:1: (lv_record_14_0= ruleRecordType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1244:1: (lv_record_14_0= ruleRecordType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1245:3: lv_record_14_0= ruleRecordType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordType_in_ruleMapType2888);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_14_0, 
                            		"RecordType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1262:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1262:6: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1262:8: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleMapType2907); 

                        	newLeafNode(otherlv_15, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0());
                        
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1266:1: ( (otherlv_16= RULE_ID ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1267:1: (otherlv_16= RULE_ID )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1267:1: (otherlv_16= RULE_ID )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1268:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapTypeRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapType2927); 

                    		newLeafNode(otherlv_16, grammarAccess.getMapTypeAccess().getRecordRefRecordTypeCrossReference_13_2_1_0()); 
                    	

                    }


                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleMapType2939); 

                        	newLeafNode(otherlv_17, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1284:6: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1284:6: ( (lv_etype_18_0= ruleEnumType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1285:1: (lv_etype_18_0= ruleEnumType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1285:1: (lv_etype_18_0= ruleEnumType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1286:3: lv_etype_18_0= ruleEnumType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumType_in_ruleMapType2967);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"etype",
                            		lv_etype_18_0, 
                            		"EnumType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1303:6: ( (lv_atype_19_0= ruleArrayType ) )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1303:6: ( (lv_atype_19_0= ruleArrayType ) )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1304:1: (lv_atype_19_0= ruleArrayType )
                    {
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1304:1: (lv_atype_19_0= ruleArrayType )
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1305:3: lv_atype_19_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleMapType2994);
                    lv_atype_19_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"atype",
                            		lv_atype_19_0, 
                            		"ArrayType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleMapType3007); 

                	newLeafNode(otherlv_20, grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1333:1: entryRuleFixedType returns [EObject current=null] : iv_ruleFixedType= ruleFixedType EOF ;
    public final EObject entryRuleFixedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedType = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1334:2: (iv_ruleFixedType= ruleFixedType EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1335:2: iv_ruleFixedType= ruleFixedType EOF
            {
             newCompositeNode(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_ruleFixedType_in_entryRuleFixedType3043);
            iv_ruleFixedType=ruleFixedType();

            state._fsp--;

             current =iv_ruleFixedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixedType3053); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1342:1: ruleFixedType returns [EObject current=null] : (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) ;
    public final EObject ruleFixedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_size_17_0=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1345:28: ( (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1346:1: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1346:1: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1346:3: otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3090); 

                	newLeafNode(otherlv_0, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFixedType3102); 

                	newLeafNode(otherlv_1, grammarAccess.getFixedTypeAccess().getFixedKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3114); 

                	newLeafNode(otherlv_2, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2());
                
            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleFixedType3126); 

                	newLeafNode(otherlv_3, grammarAccess.getFixedTypeAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3138); 

                	newLeafNode(otherlv_4, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFixedType3150); 

                	newLeafNode(otherlv_5, grammarAccess.getFixedTypeAccess().getNameKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3162); 

                	newLeafNode(otherlv_6, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3174); 

                	newLeafNode(otherlv_7, grammarAccess.getFixedTypeAccess().getColonKeyword_7());
                
            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3186); 

                	newLeafNode(otherlv_8, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1382:1: ( (lv_name_9_0= RULE_ID ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1383:1: (lv_name_9_0= RULE_ID )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1383:1: (lv_name_9_0= RULE_ID )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1384:3: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFixedType3203); 

            			newLeafNode(lv_name_9_0, grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFixedTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_9_0, 
                    		"ID");
            	    

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3220); 

                	newLeafNode(otherlv_10, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10());
                
            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleFixedType3232); 

                	newLeafNode(otherlv_11, grammarAccess.getFixedTypeAccess().getCommaKeyword_11());
                
            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3244); 

                	newLeafNode(otherlv_12, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleFixedType3256); 

                	newLeafNode(otherlv_13, grammarAccess.getFixedTypeAccess().getSizeKeyword_13());
                
            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3268); 

                	newLeafNode(otherlv_14, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14());
                
            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleFixedType3280); 

                	newLeafNode(otherlv_15, grammarAccess.getFixedTypeAccess().getColonKeyword_15());
                
            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3292); 

                	newLeafNode(otherlv_16, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1428:1: ( (lv_size_17_0= RULE_INT ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1429:1: (lv_size_17_0= RULE_INT )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1429:1: (lv_size_17_0= RULE_INT )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1430:3: lv_size_17_0= RULE_INT
            {
            lv_size_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFixedType3309); 

            			newLeafNode(lv_size_17_0, grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFixedTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_17_0, 
                    		"INT");
            	    

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleFixedType3326); 

                	newLeafNode(otherlv_18, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1458:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1459:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1460:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive3362);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive3372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1467:1: rulePrimitive returns [EObject current=null] : (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_type_1_5=null;
        Token lv_type_1_6=null;
        Token lv_type_1_7=null;
        Token lv_type_1_8=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1470:28: ( (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1471:1: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1471:1: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1471:3: otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrimitive3409); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0());
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1475:1: ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1476:1: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1476:1: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1477:1: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1477:1: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            case 35:
                {
                alt11=7;
                }
                break;
            case 36:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1478:3: lv_type_1_1= 'null'
                    {
                    lv_type_1_1=(Token)match(input,29,FOLLOW_29_in_rulePrimitive3429); 

                            newLeafNode(lv_type_1_1, grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1490:8: lv_type_1_2= 'boolean'
                    {
                    lv_type_1_2=(Token)match(input,30,FOLLOW_30_in_rulePrimitive3458); 

                            newLeafNode(lv_type_1_2, grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1502:8: lv_type_1_3= 'int'
                    {
                    lv_type_1_3=(Token)match(input,31,FOLLOW_31_in_rulePrimitive3487); 

                            newLeafNode(lv_type_1_3, grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1514:8: lv_type_1_4= 'long'
                    {
                    lv_type_1_4=(Token)match(input,32,FOLLOW_32_in_rulePrimitive3516); 

                            newLeafNode(lv_type_1_4, grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1526:8: lv_type_1_5= 'float'
                    {
                    lv_type_1_5=(Token)match(input,33,FOLLOW_33_in_rulePrimitive3545); 

                            newLeafNode(lv_type_1_5, grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1538:8: lv_type_1_6= 'double'
                    {
                    lv_type_1_6=(Token)match(input,34,FOLLOW_34_in_rulePrimitive3574); 

                            newLeafNode(lv_type_1_6, grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1550:8: lv_type_1_7= 'bytes'
                    {
                    lv_type_1_7=(Token)match(input,35,FOLLOW_35_in_rulePrimitive3603); 

                            newLeafNode(lv_type_1_7, grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1562:8: lv_type_1_8= 'string'
                    {
                    lv_type_1_8=(Token)match(input,36,FOLLOW_36_in_rulePrimitive3632); 

                            newLeafNode(lv_type_1_8, grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePrimitive3660); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1589:1: entryRuleNamespace returns [String current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final String entryRuleNamespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespace = null;


        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1590:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1591:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace3697);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace3708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1598:1: ruleNamespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1601:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1602:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1602:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1602:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespace3748); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1609:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.langleystudios.avro.dsl/src-gen/net/langleystudios/dsl/parser/antlr/internal/InternalAvroSchema.g:1610:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleNamespace3767); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespace3782); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\12\1\16\1\uffff\1\17\1\16\1\20\2\16\2\uffff";
    static final String DFA1_maxS =
        "\1\15\1\16\1\uffff\1\17\1\16\1\20\1\16\1\22\2\uffff";
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
            return "82:1: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )";
        }
    }
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\15\1\16\1\33\1\17\2\uffff\1\16\1\20\1\16\1\22\4\uffff";
    static final String DFA3_maxS =
        "\2\16\1\44\1\17\2\uffff\1\16\1\20\1\16\1\32\4\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\6\1\3\4\uffff\1\4\1\5\1\2\1\1";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4\1\uffff\10\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\15\3\uffff\1\13\1\uffff\1\14\1\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "221:1: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType )";
        }
    }
    static final String DFA7_eotS =
        "\17\uffff";
    static final String DFA7_eofS =
        "\17\uffff";
    static final String DFA7_minS =
        "\1\15\1\4\1\16\3\uffff\1\17\1\16\1\20\1\16\1\22\4\uffff";
    static final String DFA7_maxS =
        "\1\16\1\44\1\16\3\uffff\1\17\1\16\1\20\1\16\1\32\4\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\3\1\1\1\7\5\uffff\1\5\1\4\1\2\1\6";
    static final String DFA7_specialS =
        "\17\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\1",
            "\1\3\26\uffff\1\5\1\uffff\10\4",
            "\1\6",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\15\3\uffff\1\14\1\uffff\1\13\1\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "670:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) )";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\15\1\4\1\16\2\uffff\1\17\1\16\1\20\1\16\1\22\2\uffff";
    static final String DFA9_maxS =
        "\1\16\1\44\1\16\2\uffff\1\17\1\16\1\20\1\16\1\26\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\1\5\uffff\1\2\1\4";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\1",
            "\1\3\30\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1069:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\15\1\4\1\16\2\uffff\1\17\1\16\1\20\1\16\1\22\3\uffff";
    static final String DFA10_maxS =
        "\1\16\1\44\1\16\2\uffff\1\17\1\16\1\20\1\16\1\30\3\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\1\1\5\uffff\1\4\1\5\1\2";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\1",
            "\1\3\30\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\14\3\uffff\1\12\1\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1224:1: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAvroSchema_in_entryRuleAvroSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvroSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleAvroSchema132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleAvroSchema151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_ruleAvroSchema170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionType_in_entryRuleUnionType208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionType218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleUnionType255 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleUnionMember_in_ruleUnionType276 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleUnionType289 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleUnionMember_in_ruleUnionType310 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_ruleUnionType324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionMember_in_entryRuleUnionMember360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionMember370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleUnionMember417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleUnionMember444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleUnionMember471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleUnionMember498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleUnionMember525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleUnionMember552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleJsonType634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonType646 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJsonType658 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonType670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonType682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonType694 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleJsonType715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJsonType727 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleJsonType739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRecordType822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType834 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRecordType846 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType858 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType870 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType882 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecordType894 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType906 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType930 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecordType942 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType954 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType966 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1012 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType1025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1037 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecordType1049 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1061 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType1073 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleRecordType1106 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1118 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType1132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1144 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRecordType1156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordType1168 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordType1180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleRecordType1192 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleField_in_ruleRecordType1213 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleRecordType1226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleField_in_ruleRecordType1247 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_ruleRecordType1261 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRecordType1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleField1356 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField1404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1416 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleField1436 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1484 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleField1496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleField1520 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1532 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField1544 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleField1566 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleField1593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleField1612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1644 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleField1672 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleField1699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleField1726 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleFixedType_in_ruleField1753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleField1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEnumType1849 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1861 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumType1873 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1885 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType1897 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1909 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumType1921 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1933 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType1945 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1957 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumType1969 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType1981 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType1993 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2022 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2039 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType2051 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2063 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumType2075 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2087 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumType2099 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleEnumType2111 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2158 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleEnumType2172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2201 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumType2218 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_ruleEnumType2232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumType2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleArrayType2327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2339 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArrayType2351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2363 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayType2375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2387 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArrayType2399 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2411 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleArrayType2423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2435 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArrayType2447 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2459 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayType2471 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleArrayType2493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleArrayType2520 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrayType2559 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArrayType2571 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleArrayType2599 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArrayType2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType2648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMapType2695 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMapType2719 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapType2743 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMapType2767 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2779 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMapType2791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2803 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMapType2815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2827 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapType2839 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleMapType2861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRecordType_in_ruleMapType2888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapType2927 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMapType2939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleMapType2967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleMapType2994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFixedType_in_entryRuleFixedType3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixedType3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3090 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFixedType3102 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3114 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFixedType3126 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3138 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFixedType3150 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3162 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFixedType3203 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFixedType3232 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3244 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFixedType3256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3268 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFixedType3280 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFixedType3309 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixedType3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitive3409 = new BitSet(new long[]{0x0000001FE0000000L});
    public static final BitSet FOLLOW_29_in_rulePrimitive3429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30_in_rulePrimitive3458 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31_in_rulePrimitive3487 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32_in_rulePrimitive3516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_33_in_rulePrimitive3545 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_34_in_rulePrimitive3574 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_35_in_rulePrimitive3603 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_36_in_rulePrimitive3632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimitive3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace3697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespace3748 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleNamespace3767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespace3782 = new BitSet(new long[]{0x0000002000000002L});

}