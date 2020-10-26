package org.xtext.component.dependency.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UserName'", "':'", "'import'", "'from'", "'Save'", "'@'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDependencyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDependencyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDependencyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDependency.g"; }



     	private DependencyGrammarAccess grammarAccess;

        public InternalDependencyParser(TokenStream input, DependencyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDependencyObjects";
       	}

       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDependencyObjects"
    // InternalDependency.g:64:1: entryRuleComponentDependencyObjects returns [EObject current=null] : iv_ruleComponentDependencyObjects= ruleComponentDependencyObjects EOF ;
    public final EObject entryRuleComponentDependencyObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDependencyObjects = null;


        try {
            // InternalDependency.g:64:67: (iv_ruleComponentDependencyObjects= ruleComponentDependencyObjects EOF )
            // InternalDependency.g:65:2: iv_ruleComponentDependencyObjects= ruleComponentDependencyObjects EOF
            {
             newCompositeNode(grammarAccess.getComponentDependencyObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDependencyObjects=ruleComponentDependencyObjects();

            state._fsp--;

             current =iv_ruleComponentDependencyObjects; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentDependencyObjects"


    // $ANTLR start "ruleComponentDependencyObjects"
    // InternalDependency.g:71:1: ruleComponentDependencyObjects returns [EObject current=null] : ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ) ;
    public final EObject ruleComponentDependencyObjects() throws RecognitionException {
        EObject current = null;

        EObject lv_username_0_0 = null;

        EObject lv_userimport_1_0 = null;

        EObject lv_at_2_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:77:2: ( ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) ) )
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) )
            {
            // InternalDependency.g:78:2: ( ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) ) )
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) ) ( (lv_userimport_1_0= ruleUserImport ) ) ( (lv_at_2_0= ruleAt ) )
            {
            // InternalDependency.g:79:3: ( (lv_username_0_0= ruleUserName ) )
            // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
            {
            // InternalDependency.g:80:4: (lv_username_0_0= ruleUserName )
            // InternalDependency.g:81:5: lv_username_0_0= ruleUserName
            {

            					newCompositeNode(grammarAccess.getComponentDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_username_0_0=ruleUserName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDependencyObjectsRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_0_0,
            						"org.xtext.component.dependency.Dependency.UserName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:98:3: ( (lv_userimport_1_0= ruleUserImport ) )
            // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
            {
            // InternalDependency.g:99:4: (lv_userimport_1_0= ruleUserImport )
            // InternalDependency.g:100:5: lv_userimport_1_0= ruleUserImport
            {

            					newCompositeNode(grammarAccess.getComponentDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_userimport_1_0=ruleUserImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDependencyObjectsRule());
            					}
            					set(
            						current,
            						"userimport",
            						lv_userimport_1_0,
            						"org.xtext.component.dependency.Dependency.UserImport");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:117:3: ( (lv_at_2_0= ruleAt ) )
            // InternalDependency.g:118:4: (lv_at_2_0= ruleAt )
            {
            // InternalDependency.g:118:4: (lv_at_2_0= ruleAt )
            // InternalDependency.g:119:5: lv_at_2_0= ruleAt
            {

            					newCompositeNode(grammarAccess.getComponentDependencyObjectsAccess().getAtAtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_at_2_0=ruleAt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDependencyObjectsRule());
            					}
            					set(
            						current,
            						"at",
            						lv_at_2_0,
            						"org.xtext.component.dependency.Dependency.At");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleComponentDependencyObjects"


    // $ANTLR start "entryRuleUserName"
    // InternalDependency.g:140:1: entryRuleUserName returns [EObject current=null] : iv_ruleUserName= ruleUserName EOF ;
    public final EObject entryRuleUserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserName = null;


        try {
            // InternalDependency.g:140:49: (iv_ruleUserName= ruleUserName EOF )
            // InternalDependency.g:141:2: iv_ruleUserName= ruleUserName EOF
            {
             newCompositeNode(grammarAccess.getUserNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserName=ruleUserName();

            state._fsp--;

             current =iv_ruleUserName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserName"


    // $ANTLR start "ruleUserName"
    // InternalDependency.g:147:1: ruleUserName returns [EObject current=null] : (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDependency.g:153:2: ( (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalDependency.g:154:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:154:2: (otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalDependency.g:155:3: otherlv_0= 'UserName' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUserNameAccess().getUserNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUserNameAccess().getColonKeyword_1());
            		
            // InternalDependency.g:163:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDependency.g:164:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDependency.g:164:4: (lv_name_2_0= RULE_STRING )
            // InternalDependency.g:165:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUserNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUserName"


    // $ANTLR start "entryRuleUserImport"
    // InternalDependency.g:185:1: entryRuleUserImport returns [EObject current=null] : iv_ruleUserImport= ruleUserImport EOF ;
    public final EObject entryRuleUserImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserImport = null;


        try {
            // InternalDependency.g:185:51: (iv_ruleUserImport= ruleUserImport EOF )
            // InternalDependency.g:186:2: iv_ruleUserImport= ruleUserImport EOF
            {
             newCompositeNode(grammarAccess.getUserImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserImport=ruleUserImport();

            state._fsp--;

             current =iv_ruleUserImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserImport"


    // $ANTLR start "ruleUserImport"
    // InternalDependency.g:192:1: ruleUserImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_environment_1_0=null;
        Token otherlv_2=null;
        Token lv_boxpath_3_0=null;


        	enterRule();

        try {
            // InternalDependency.g:198:2: ( (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) ) )
            // InternalDependency.g:199:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:199:2: (otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) ) )
            // InternalDependency.g:200:3: otherlv_0= 'import' ( (lv_environment_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_boxpath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUserImportAccess().getImportKeyword_0());
            		
            // InternalDependency.g:204:3: ( (lv_environment_1_0= RULE_STRING ) )
            // InternalDependency.g:205:4: (lv_environment_1_0= RULE_STRING )
            {
            // InternalDependency.g:205:4: (lv_environment_1_0= RULE_STRING )
            // InternalDependency.g:206:5: lv_environment_1_0= RULE_STRING
            {
            lv_environment_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_environment_1_0, grammarAccess.getUserImportAccess().getEnvironmentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"environment",
            						lv_environment_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUserImportAccess().getFromKeyword_2());
            		
            // InternalDependency.g:226:3: ( (lv_boxpath_3_0= RULE_STRING ) )
            // InternalDependency.g:227:4: (lv_boxpath_3_0= RULE_STRING )
            {
            // InternalDependency.g:227:4: (lv_boxpath_3_0= RULE_STRING )
            // InternalDependency.g:228:5: lv_boxpath_3_0= RULE_STRING
            {
            lv_boxpath_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_boxpath_3_0, grammarAccess.getUserImportAccess().getBoxpathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boxpath",
            						lv_boxpath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUserImport"


    // $ANTLR start "entryRuleAt"
    // InternalDependency.g:248:1: entryRuleAt returns [EObject current=null] : iv_ruleAt= ruleAt EOF ;
    public final EObject entryRuleAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAt = null;


        try {
            // InternalDependency.g:248:43: (iv_ruleAt= ruleAt EOF )
            // InternalDependency.g:249:2: iv_ruleAt= ruleAt EOF
            {
             newCompositeNode(grammarAccess.getAtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAt=ruleAt();

            state._fsp--;

             current =iv_ruleAt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAt"


    // $ANTLR start "ruleAt"
    // InternalDependency.g:255:1: ruleAt returns [EObject current=null] : (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDependency.g:261:2: ( (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalDependency.g:262:2: (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalDependency.g:262:2: (otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalDependency.g:263:3: otherlv_0= 'Save' otherlv_1= '@' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAtAccess().getCommercialAtKeyword_1());
            		
            // InternalDependency.g:271:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDependency.g:272:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDependency.g:272:4: (lv_name_2_0= RULE_STRING )
            // InternalDependency.g:273:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}