package org.xtext.system.dependency.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.system.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UserName'", "':'", "'import'", "'from'", "'Save'", "'@'", "'Dependency'", "'.'", "'--'", "'-->'", "'GUI'", "'('", "','", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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

    	public void setGrammarAccess(DependencyGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemDependencyObjects"
    // InternalDependency.g:53:1: entryRuleSystemDependencyObjects : ruleSystemDependencyObjects EOF ;
    public final void entryRuleSystemDependencyObjects() throws RecognitionException {
        try {
            // InternalDependency.g:54:1: ( ruleSystemDependencyObjects EOF )
            // InternalDependency.g:55:1: ruleSystemDependencyObjects EOF
            {
             before(grammarAccess.getSystemDependencyObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemDependencyObjects();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemDependencyObjects"


    // $ANTLR start "ruleSystemDependencyObjects"
    // InternalDependency.g:62:1: ruleSystemDependencyObjects : ( ( rule__SystemDependencyObjects__Group__0 ) ) ;
    public final void ruleSystemDependencyObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:66:2: ( ( ( rule__SystemDependencyObjects__Group__0 ) ) )
            // InternalDependency.g:67:2: ( ( rule__SystemDependencyObjects__Group__0 ) )
            {
            // InternalDependency.g:67:2: ( ( rule__SystemDependencyObjects__Group__0 ) )
            // InternalDependency.g:68:3: ( rule__SystemDependencyObjects__Group__0 )
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getGroup()); 
            // InternalDependency.g:69:3: ( rule__SystemDependencyObjects__Group__0 )
            // InternalDependency.g:69:4: rule__SystemDependencyObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDependencyObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemDependencyObjects"


    // $ANTLR start "entryRuleUserName"
    // InternalDependency.g:78:1: entryRuleUserName : ruleUserName EOF ;
    public final void entryRuleUserName() throws RecognitionException {
        try {
            // InternalDependency.g:79:1: ( ruleUserName EOF )
            // InternalDependency.g:80:1: ruleUserName EOF
            {
             before(grammarAccess.getUserNameRule()); 
            pushFollow(FOLLOW_1);
            ruleUserName();

            state._fsp--;

             after(grammarAccess.getUserNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserName"


    // $ANTLR start "ruleUserName"
    // InternalDependency.g:87:1: ruleUserName : ( ( rule__UserName__Group__0 ) ) ;
    public final void ruleUserName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:91:2: ( ( ( rule__UserName__Group__0 ) ) )
            // InternalDependency.g:92:2: ( ( rule__UserName__Group__0 ) )
            {
            // InternalDependency.g:92:2: ( ( rule__UserName__Group__0 ) )
            // InternalDependency.g:93:3: ( rule__UserName__Group__0 )
            {
             before(grammarAccess.getUserNameAccess().getGroup()); 
            // InternalDependency.g:94:3: ( rule__UserName__Group__0 )
            // InternalDependency.g:94:4: rule__UserName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserName"


    // $ANTLR start "entryRuleUserImport"
    // InternalDependency.g:103:1: entryRuleUserImport : ruleUserImport EOF ;
    public final void entryRuleUserImport() throws RecognitionException {
        try {
            // InternalDependency.g:104:1: ( ruleUserImport EOF )
            // InternalDependency.g:105:1: ruleUserImport EOF
            {
             before(grammarAccess.getUserImportRule()); 
            pushFollow(FOLLOW_1);
            ruleUserImport();

            state._fsp--;

             after(grammarAccess.getUserImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUserImport"


    // $ANTLR start "ruleUserImport"
    // InternalDependency.g:112:1: ruleUserImport : ( ( rule__UserImport__Group__0 ) ) ;
    public final void ruleUserImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:116:2: ( ( ( rule__UserImport__Group__0 ) ) )
            // InternalDependency.g:117:2: ( ( rule__UserImport__Group__0 ) )
            {
            // InternalDependency.g:117:2: ( ( rule__UserImport__Group__0 ) )
            // InternalDependency.g:118:3: ( rule__UserImport__Group__0 )
            {
             before(grammarAccess.getUserImportAccess().getGroup()); 
            // InternalDependency.g:119:3: ( rule__UserImport__Group__0 )
            // InternalDependency.g:119:4: rule__UserImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserImport"


    // $ANTLR start "entryRuleAt"
    // InternalDependency.g:128:1: entryRuleAt : ruleAt EOF ;
    public final void entryRuleAt() throws RecognitionException {
        try {
            // InternalDependency.g:129:1: ( ruleAt EOF )
            // InternalDependency.g:130:1: ruleAt EOF
            {
             before(grammarAccess.getAtRule()); 
            pushFollow(FOLLOW_1);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getAtRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAt"


    // $ANTLR start "ruleAt"
    // InternalDependency.g:137:1: ruleAt : ( ( rule__At__Group__0 ) ) ;
    public final void ruleAt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:141:2: ( ( ( rule__At__Group__0 ) ) )
            // InternalDependency.g:142:2: ( ( rule__At__Group__0 ) )
            {
            // InternalDependency.g:142:2: ( ( rule__At__Group__0 ) )
            // InternalDependency.g:143:3: ( rule__At__Group__0 )
            {
             before(grammarAccess.getAtAccess().getGroup()); 
            // InternalDependency.g:144:3: ( rule__At__Group__0 )
            // InternalDependency.g:144:4: rule__At__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__At__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAt"


    // $ANTLR start "entryRuleDependency"
    // InternalDependency.g:153:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalDependency.g:154:1: ( ruleDependency EOF )
            // InternalDependency.g:155:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDependency.g:162:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:166:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalDependency.g:167:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalDependency.g:167:2: ( ( rule__Dependency__Group__0 ) )
            // InternalDependency.g:168:3: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // InternalDependency.g:169:3: ( rule__Dependency__Group__0 )
            // InternalDependency.g:169:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleGUI"
    // InternalDependency.g:178:1: entryRuleGUI : ruleGUI EOF ;
    public final void entryRuleGUI() throws RecognitionException {
        try {
            // InternalDependency.g:179:1: ( ruleGUI EOF )
            // InternalDependency.g:180:1: ruleGUI EOF
            {
             before(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            ruleGUI();

            state._fsp--;

             after(grammarAccess.getGUIRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalDependency.g:187:1: ruleGUI : ( ( rule__GUI__Group__0 ) ) ;
    public final void ruleGUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:191:2: ( ( ( rule__GUI__Group__0 ) ) )
            // InternalDependency.g:192:2: ( ( rule__GUI__Group__0 ) )
            {
            // InternalDependency.g:192:2: ( ( rule__GUI__Group__0 ) )
            // InternalDependency.g:193:3: ( rule__GUI__Group__0 )
            {
             before(grammarAccess.getGUIAccess().getGroup()); 
            // InternalDependency.g:194:3: ( rule__GUI__Group__0 )
            // InternalDependency.g:194:4: rule__GUI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GUI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGUIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGUI"


    // $ANTLR start "rule__SystemDependencyObjects__Group__0"
    // InternalDependency.g:202:1: rule__SystemDependencyObjects__Group__0 : rule__SystemDependencyObjects__Group__0__Impl rule__SystemDependencyObjects__Group__1 ;
    public final void rule__SystemDependencyObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:206:1: ( rule__SystemDependencyObjects__Group__0__Impl rule__SystemDependencyObjects__Group__1 )
            // InternalDependency.g:207:2: rule__SystemDependencyObjects__Group__0__Impl rule__SystemDependencyObjects__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemDependencyObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__0"


    // $ANTLR start "rule__SystemDependencyObjects__Group__0__Impl"
    // InternalDependency.g:214:1: rule__SystemDependencyObjects__Group__0__Impl : ( ( rule__SystemDependencyObjects__UsernameAssignment_0 ) ) ;
    public final void rule__SystemDependencyObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:218:1: ( ( ( rule__SystemDependencyObjects__UsernameAssignment_0 ) ) )
            // InternalDependency.g:219:1: ( ( rule__SystemDependencyObjects__UsernameAssignment_0 ) )
            {
            // InternalDependency.g:219:1: ( ( rule__SystemDependencyObjects__UsernameAssignment_0 ) )
            // InternalDependency.g:220:2: ( rule__SystemDependencyObjects__UsernameAssignment_0 )
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getUsernameAssignment_0()); 
            // InternalDependency.g:221:2: ( rule__SystemDependencyObjects__UsernameAssignment_0 )
            // InternalDependency.g:221:3: rule__SystemDependencyObjects__UsernameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__UsernameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDependencyObjectsAccess().getUsernameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__0__Impl"


    // $ANTLR start "rule__SystemDependencyObjects__Group__1"
    // InternalDependency.g:229:1: rule__SystemDependencyObjects__Group__1 : rule__SystemDependencyObjects__Group__1__Impl rule__SystemDependencyObjects__Group__2 ;
    public final void rule__SystemDependencyObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:233:1: ( rule__SystemDependencyObjects__Group__1__Impl rule__SystemDependencyObjects__Group__2 )
            // InternalDependency.g:234:2: rule__SystemDependencyObjects__Group__1__Impl rule__SystemDependencyObjects__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemDependencyObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__1"


    // $ANTLR start "rule__SystemDependencyObjects__Group__1__Impl"
    // InternalDependency.g:241:1: rule__SystemDependencyObjects__Group__1__Impl : ( ( rule__SystemDependencyObjects__UserimportAssignment_1 ) ) ;
    public final void rule__SystemDependencyObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:245:1: ( ( ( rule__SystemDependencyObjects__UserimportAssignment_1 ) ) )
            // InternalDependency.g:246:1: ( ( rule__SystemDependencyObjects__UserimportAssignment_1 ) )
            {
            // InternalDependency.g:246:1: ( ( rule__SystemDependencyObjects__UserimportAssignment_1 ) )
            // InternalDependency.g:247:2: ( rule__SystemDependencyObjects__UserimportAssignment_1 )
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getUserimportAssignment_1()); 
            // InternalDependency.g:248:2: ( rule__SystemDependencyObjects__UserimportAssignment_1 )
            // InternalDependency.g:248:3: rule__SystemDependencyObjects__UserimportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__UserimportAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemDependencyObjectsAccess().getUserimportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__1__Impl"


    // $ANTLR start "rule__SystemDependencyObjects__Group__2"
    // InternalDependency.g:256:1: rule__SystemDependencyObjects__Group__2 : rule__SystemDependencyObjects__Group__2__Impl rule__SystemDependencyObjects__Group__3 ;
    public final void rule__SystemDependencyObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:260:1: ( rule__SystemDependencyObjects__Group__2__Impl rule__SystemDependencyObjects__Group__3 )
            // InternalDependency.g:261:2: rule__SystemDependencyObjects__Group__2__Impl rule__SystemDependencyObjects__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SystemDependencyObjects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__2"


    // $ANTLR start "rule__SystemDependencyObjects__Group__2__Impl"
    // InternalDependency.g:268:1: rule__SystemDependencyObjects__Group__2__Impl : ( ( rule__SystemDependencyObjects__AtAssignment_2 ) ) ;
    public final void rule__SystemDependencyObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:272:1: ( ( ( rule__SystemDependencyObjects__AtAssignment_2 ) ) )
            // InternalDependency.g:273:1: ( ( rule__SystemDependencyObjects__AtAssignment_2 ) )
            {
            // InternalDependency.g:273:1: ( ( rule__SystemDependencyObjects__AtAssignment_2 ) )
            // InternalDependency.g:274:2: ( rule__SystemDependencyObjects__AtAssignment_2 )
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getAtAssignment_2()); 
            // InternalDependency.g:275:2: ( rule__SystemDependencyObjects__AtAssignment_2 )
            // InternalDependency.g:275:3: rule__SystemDependencyObjects__AtAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__AtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemDependencyObjectsAccess().getAtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__2__Impl"


    // $ANTLR start "rule__SystemDependencyObjects__Group__3"
    // InternalDependency.g:283:1: rule__SystemDependencyObjects__Group__3 : rule__SystemDependencyObjects__Group__3__Impl rule__SystemDependencyObjects__Group__4 ;
    public final void rule__SystemDependencyObjects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:287:1: ( rule__SystemDependencyObjects__Group__3__Impl rule__SystemDependencyObjects__Group__4 )
            // InternalDependency.g:288:2: rule__SystemDependencyObjects__Group__3__Impl rule__SystemDependencyObjects__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SystemDependencyObjects__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__3"


    // $ANTLR start "rule__SystemDependencyObjects__Group__3__Impl"
    // InternalDependency.g:295:1: rule__SystemDependencyObjects__Group__3__Impl : ( ( rule__SystemDependencyObjects__DependenciesAssignment_3 )* ) ;
    public final void rule__SystemDependencyObjects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:299:1: ( ( ( rule__SystemDependencyObjects__DependenciesAssignment_3 )* ) )
            // InternalDependency.g:300:1: ( ( rule__SystemDependencyObjects__DependenciesAssignment_3 )* )
            {
            // InternalDependency.g:300:1: ( ( rule__SystemDependencyObjects__DependenciesAssignment_3 )* )
            // InternalDependency.g:301:2: ( rule__SystemDependencyObjects__DependenciesAssignment_3 )*
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getDependenciesAssignment_3()); 
            // InternalDependency.g:302:2: ( rule__SystemDependencyObjects__DependenciesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDependency.g:302:3: rule__SystemDependencyObjects__DependenciesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SystemDependencyObjects__DependenciesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemDependencyObjectsAccess().getDependenciesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__3__Impl"


    // $ANTLR start "rule__SystemDependencyObjects__Group__4"
    // InternalDependency.g:310:1: rule__SystemDependencyObjects__Group__4 : rule__SystemDependencyObjects__Group__4__Impl ;
    public final void rule__SystemDependencyObjects__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:314:1: ( rule__SystemDependencyObjects__Group__4__Impl )
            // InternalDependency.g:315:2: rule__SystemDependencyObjects__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDependencyObjects__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__4"


    // $ANTLR start "rule__SystemDependencyObjects__Group__4__Impl"
    // InternalDependency.g:321:1: rule__SystemDependencyObjects__Group__4__Impl : ( ( rule__SystemDependencyObjects__GuisAssignment_4 )* ) ;
    public final void rule__SystemDependencyObjects__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:325:1: ( ( ( rule__SystemDependencyObjects__GuisAssignment_4 )* ) )
            // InternalDependency.g:326:1: ( ( rule__SystemDependencyObjects__GuisAssignment_4 )* )
            {
            // InternalDependency.g:326:1: ( ( rule__SystemDependencyObjects__GuisAssignment_4 )* )
            // InternalDependency.g:327:2: ( rule__SystemDependencyObjects__GuisAssignment_4 )*
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getGuisAssignment_4()); 
            // InternalDependency.g:328:2: ( rule__SystemDependencyObjects__GuisAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDependency.g:328:3: rule__SystemDependencyObjects__GuisAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SystemDependencyObjects__GuisAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSystemDependencyObjectsAccess().getGuisAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__Group__4__Impl"


    // $ANTLR start "rule__UserName__Group__0"
    // InternalDependency.g:337:1: rule__UserName__Group__0 : rule__UserName__Group__0__Impl rule__UserName__Group__1 ;
    public final void rule__UserName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:341:1: ( rule__UserName__Group__0__Impl rule__UserName__Group__1 )
            // InternalDependency.g:342:2: rule__UserName__Group__0__Impl rule__UserName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__UserName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__0"


    // $ANTLR start "rule__UserName__Group__0__Impl"
    // InternalDependency.g:349:1: rule__UserName__Group__0__Impl : ( 'UserName' ) ;
    public final void rule__UserName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:353:1: ( ( 'UserName' ) )
            // InternalDependency.g:354:1: ( 'UserName' )
            {
            // InternalDependency.g:354:1: ( 'UserName' )
            // InternalDependency.g:355:2: 'UserName'
            {
             before(grammarAccess.getUserNameAccess().getUserNameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUserNameAccess().getUserNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__0__Impl"


    // $ANTLR start "rule__UserName__Group__1"
    // InternalDependency.g:364:1: rule__UserName__Group__1 : rule__UserName__Group__1__Impl rule__UserName__Group__2 ;
    public final void rule__UserName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:368:1: ( rule__UserName__Group__1__Impl rule__UserName__Group__2 )
            // InternalDependency.g:369:2: rule__UserName__Group__1__Impl rule__UserName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__UserName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__1"


    // $ANTLR start "rule__UserName__Group__1__Impl"
    // InternalDependency.g:376:1: rule__UserName__Group__1__Impl : ( ':' ) ;
    public final void rule__UserName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:380:1: ( ( ':' ) )
            // InternalDependency.g:381:1: ( ':' )
            {
            // InternalDependency.g:381:1: ( ':' )
            // InternalDependency.g:382:2: ':'
            {
             before(grammarAccess.getUserNameAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUserNameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__1__Impl"


    // $ANTLR start "rule__UserName__Group__2"
    // InternalDependency.g:391:1: rule__UserName__Group__2 : rule__UserName__Group__2__Impl ;
    public final void rule__UserName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:395:1: ( rule__UserName__Group__2__Impl )
            // InternalDependency.g:396:2: rule__UserName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__2"


    // $ANTLR start "rule__UserName__Group__2__Impl"
    // InternalDependency.g:402:1: rule__UserName__Group__2__Impl : ( ( rule__UserName__NameAssignment_2 ) ) ;
    public final void rule__UserName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:406:1: ( ( ( rule__UserName__NameAssignment_2 ) ) )
            // InternalDependency.g:407:1: ( ( rule__UserName__NameAssignment_2 ) )
            {
            // InternalDependency.g:407:1: ( ( rule__UserName__NameAssignment_2 ) )
            // InternalDependency.g:408:2: ( rule__UserName__NameAssignment_2 )
            {
             before(grammarAccess.getUserNameAccess().getNameAssignment_2()); 
            // InternalDependency.g:409:2: ( rule__UserName__NameAssignment_2 )
            // InternalDependency.g:409:3: rule__UserName__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UserName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__Group__2__Impl"


    // $ANTLR start "rule__UserImport__Group__0"
    // InternalDependency.g:418:1: rule__UserImport__Group__0 : rule__UserImport__Group__0__Impl rule__UserImport__Group__1 ;
    public final void rule__UserImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:422:1: ( rule__UserImport__Group__0__Impl rule__UserImport__Group__1 )
            // InternalDependency.g:423:2: rule__UserImport__Group__0__Impl rule__UserImport__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UserImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__0"


    // $ANTLR start "rule__UserImport__Group__0__Impl"
    // InternalDependency.g:430:1: rule__UserImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__UserImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:434:1: ( ( 'import' ) )
            // InternalDependency.g:435:1: ( 'import' )
            {
            // InternalDependency.g:435:1: ( 'import' )
            // InternalDependency.g:436:2: 'import'
            {
             before(grammarAccess.getUserImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUserImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__0__Impl"


    // $ANTLR start "rule__UserImport__Group__1"
    // InternalDependency.g:445:1: rule__UserImport__Group__1 : rule__UserImport__Group__1__Impl rule__UserImport__Group__2 ;
    public final void rule__UserImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:449:1: ( rule__UserImport__Group__1__Impl rule__UserImport__Group__2 )
            // InternalDependency.g:450:2: rule__UserImport__Group__1__Impl rule__UserImport__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UserImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__1"


    // $ANTLR start "rule__UserImport__Group__1__Impl"
    // InternalDependency.g:457:1: rule__UserImport__Group__1__Impl : ( ( rule__UserImport__EnvironmentAssignment_1 ) ) ;
    public final void rule__UserImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:461:1: ( ( ( rule__UserImport__EnvironmentAssignment_1 ) ) )
            // InternalDependency.g:462:1: ( ( rule__UserImport__EnvironmentAssignment_1 ) )
            {
            // InternalDependency.g:462:1: ( ( rule__UserImport__EnvironmentAssignment_1 ) )
            // InternalDependency.g:463:2: ( rule__UserImport__EnvironmentAssignment_1 )
            {
             before(grammarAccess.getUserImportAccess().getEnvironmentAssignment_1()); 
            // InternalDependency.g:464:2: ( rule__UserImport__EnvironmentAssignment_1 )
            // InternalDependency.g:464:3: rule__UserImport__EnvironmentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UserImport__EnvironmentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserImportAccess().getEnvironmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__1__Impl"


    // $ANTLR start "rule__UserImport__Group__2"
    // InternalDependency.g:472:1: rule__UserImport__Group__2 : rule__UserImport__Group__2__Impl rule__UserImport__Group__3 ;
    public final void rule__UserImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:476:1: ( rule__UserImport__Group__2__Impl rule__UserImport__Group__3 )
            // InternalDependency.g:477:2: rule__UserImport__Group__2__Impl rule__UserImport__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__UserImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserImport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__2"


    // $ANTLR start "rule__UserImport__Group__2__Impl"
    // InternalDependency.g:484:1: rule__UserImport__Group__2__Impl : ( 'from' ) ;
    public final void rule__UserImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:488:1: ( ( 'from' ) )
            // InternalDependency.g:489:1: ( 'from' )
            {
            // InternalDependency.g:489:1: ( 'from' )
            // InternalDependency.g:490:2: 'from'
            {
             before(grammarAccess.getUserImportAccess().getFromKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUserImportAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__2__Impl"


    // $ANTLR start "rule__UserImport__Group__3"
    // InternalDependency.g:499:1: rule__UserImport__Group__3 : rule__UserImport__Group__3__Impl ;
    public final void rule__UserImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:503:1: ( rule__UserImport__Group__3__Impl )
            // InternalDependency.g:504:2: rule__UserImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserImport__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__3"


    // $ANTLR start "rule__UserImport__Group__3__Impl"
    // InternalDependency.g:510:1: rule__UserImport__Group__3__Impl : ( ( rule__UserImport__BoxpathAssignment_3 ) ) ;
    public final void rule__UserImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:514:1: ( ( ( rule__UserImport__BoxpathAssignment_3 ) ) )
            // InternalDependency.g:515:1: ( ( rule__UserImport__BoxpathAssignment_3 ) )
            {
            // InternalDependency.g:515:1: ( ( rule__UserImport__BoxpathAssignment_3 ) )
            // InternalDependency.g:516:2: ( rule__UserImport__BoxpathAssignment_3 )
            {
             before(grammarAccess.getUserImportAccess().getBoxpathAssignment_3()); 
            // InternalDependency.g:517:2: ( rule__UserImport__BoxpathAssignment_3 )
            // InternalDependency.g:517:3: rule__UserImport__BoxpathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UserImport__BoxpathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUserImportAccess().getBoxpathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__Group__3__Impl"


    // $ANTLR start "rule__At__Group__0"
    // InternalDependency.g:526:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:530:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalDependency.g:531:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__At__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__0"


    // $ANTLR start "rule__At__Group__0__Impl"
    // InternalDependency.g:538:1: rule__At__Group__0__Impl : ( 'Save' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:542:1: ( ( 'Save' ) )
            // InternalDependency.g:543:1: ( 'Save' )
            {
            // InternalDependency.g:543:1: ( 'Save' )
            // InternalDependency.g:544:2: 'Save'
            {
             before(grammarAccess.getAtAccess().getSaveKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getSaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__0__Impl"


    // $ANTLR start "rule__At__Group__1"
    // InternalDependency.g:553:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:557:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalDependency.g:558:2: rule__At__Group__1__Impl rule__At__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__At__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__1"


    // $ANTLR start "rule__At__Group__1__Impl"
    // InternalDependency.g:565:1: rule__At__Group__1__Impl : ( '@' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:569:1: ( ( '@' ) )
            // InternalDependency.g:570:1: ( '@' )
            {
            // InternalDependency.g:570:1: ( '@' )
            // InternalDependency.g:571:2: '@'
            {
             before(grammarAccess.getAtAccess().getCommercialAtKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__1__Impl"


    // $ANTLR start "rule__At__Group__2"
    // InternalDependency.g:580:1: rule__At__Group__2 : rule__At__Group__2__Impl ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:584:1: ( rule__At__Group__2__Impl )
            // InternalDependency.g:585:2: rule__At__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__2"


    // $ANTLR start "rule__At__Group__2__Impl"
    // InternalDependency.g:591:1: rule__At__Group__2__Impl : ( ( rule__At__NameAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:595:1: ( ( ( rule__At__NameAssignment_2 ) ) )
            // InternalDependency.g:596:1: ( ( rule__At__NameAssignment_2 ) )
            {
            // InternalDependency.g:596:1: ( ( rule__At__NameAssignment_2 ) )
            // InternalDependency.g:597:2: ( rule__At__NameAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getNameAssignment_2()); 
            // InternalDependency.g:598:2: ( rule__At__NameAssignment_2 )
            // InternalDependency.g:598:3: rule__At__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__At__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__2__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalDependency.g:607:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:611:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalDependency.g:612:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalDependency.g:619:1: rule__Dependency__Group__0__Impl : ( 'Dependency' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:623:1: ( ( 'Dependency' ) )
            // InternalDependency.g:624:1: ( 'Dependency' )
            {
            // InternalDependency.g:624:1: ( 'Dependency' )
            // InternalDependency.g:625:2: 'Dependency'
            {
             before(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalDependency.g:634:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:638:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // InternalDependency.g:639:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalDependency.g:646:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__NameAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:650:1: ( ( ( rule__Dependency__NameAssignment_1 ) ) )
            // InternalDependency.g:651:1: ( ( rule__Dependency__NameAssignment_1 ) )
            {
            // InternalDependency.g:651:1: ( ( rule__Dependency__NameAssignment_1 ) )
            // InternalDependency.g:652:2: ( rule__Dependency__NameAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getNameAssignment_1()); 
            // InternalDependency.g:653:2: ( rule__Dependency__NameAssignment_1 )
            // InternalDependency.g:653:3: rule__Dependency__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Dependency__Group__2"
    // InternalDependency.g:661:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl rule__Dependency__Group__3 ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:665:1: ( rule__Dependency__Group__2__Impl rule__Dependency__Group__3 )
            // InternalDependency.g:666:2: rule__Dependency__Group__2__Impl rule__Dependency__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Dependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2"


    // $ANTLR start "rule__Dependency__Group__2__Impl"
    // InternalDependency.g:673:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__FnAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:677:1: ( ( ( rule__Dependency__FnAssignment_2 ) ) )
            // InternalDependency.g:678:1: ( ( rule__Dependency__FnAssignment_2 ) )
            {
            // InternalDependency.g:678:1: ( ( rule__Dependency__FnAssignment_2 ) )
            // InternalDependency.g:679:2: ( rule__Dependency__FnAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getFnAssignment_2()); 
            // InternalDependency.g:680:2: ( rule__Dependency__FnAssignment_2 )
            // InternalDependency.g:680:3: rule__Dependency__FnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__FnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getFnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2__Impl"


    // $ANTLR start "rule__Dependency__Group__3"
    // InternalDependency.g:688:1: rule__Dependency__Group__3 : rule__Dependency__Group__3__Impl rule__Dependency__Group__4 ;
    public final void rule__Dependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:692:1: ( rule__Dependency__Group__3__Impl rule__Dependency__Group__4 )
            // InternalDependency.g:693:2: rule__Dependency__Group__3__Impl rule__Dependency__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__3"


    // $ANTLR start "rule__Dependency__Group__3__Impl"
    // InternalDependency.g:700:1: rule__Dependency__Group__3__Impl : ( '.' ) ;
    public final void rule__Dependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:704:1: ( ( '.' ) )
            // InternalDependency.g:705:1: ( '.' )
            {
            // InternalDependency.g:705:1: ( '.' )
            // InternalDependency.g:706:2: '.'
            {
             before(grammarAccess.getDependencyAccess().getFullStopKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__3__Impl"


    // $ANTLR start "rule__Dependency__Group__4"
    // InternalDependency.g:715:1: rule__Dependency__Group__4 : rule__Dependency__Group__4__Impl rule__Dependency__Group__5 ;
    public final void rule__Dependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:719:1: ( rule__Dependency__Group__4__Impl rule__Dependency__Group__5 )
            // InternalDependency.g:720:2: rule__Dependency__Group__4__Impl rule__Dependency__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Dependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__4"


    // $ANTLR start "rule__Dependency__Group__4__Impl"
    // InternalDependency.g:727:1: rule__Dependency__Group__4__Impl : ( ( rule__Dependency__FpAssignment_4 ) ) ;
    public final void rule__Dependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:731:1: ( ( ( rule__Dependency__FpAssignment_4 ) ) )
            // InternalDependency.g:732:1: ( ( rule__Dependency__FpAssignment_4 ) )
            {
            // InternalDependency.g:732:1: ( ( rule__Dependency__FpAssignment_4 ) )
            // InternalDependency.g:733:2: ( rule__Dependency__FpAssignment_4 )
            {
             before(grammarAccess.getDependencyAccess().getFpAssignment_4()); 
            // InternalDependency.g:734:2: ( rule__Dependency__FpAssignment_4 )
            // InternalDependency.g:734:3: rule__Dependency__FpAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__FpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getFpAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__4__Impl"


    // $ANTLR start "rule__Dependency__Group__5"
    // InternalDependency.g:742:1: rule__Dependency__Group__5 : rule__Dependency__Group__5__Impl rule__Dependency__Group__6 ;
    public final void rule__Dependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:746:1: ( rule__Dependency__Group__5__Impl rule__Dependency__Group__6 )
            // InternalDependency.g:747:2: rule__Dependency__Group__5__Impl rule__Dependency__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__5"


    // $ANTLR start "rule__Dependency__Group__5__Impl"
    // InternalDependency.g:754:1: rule__Dependency__Group__5__Impl : ( '--' ) ;
    public final void rule__Dependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:758:1: ( ( '--' ) )
            // InternalDependency.g:759:1: ( '--' )
            {
            // InternalDependency.g:759:1: ( '--' )
            // InternalDependency.g:760:2: '--'
            {
             before(grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__5__Impl"


    // $ANTLR start "rule__Dependency__Group__6"
    // InternalDependency.g:769:1: rule__Dependency__Group__6 : rule__Dependency__Group__6__Impl rule__Dependency__Group__7 ;
    public final void rule__Dependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:773:1: ( rule__Dependency__Group__6__Impl rule__Dependency__Group__7 )
            // InternalDependency.g:774:2: rule__Dependency__Group__6__Impl rule__Dependency__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Dependency__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__6"


    // $ANTLR start "rule__Dependency__Group__6__Impl"
    // InternalDependency.g:781:1: rule__Dependency__Group__6__Impl : ( ( rule__Dependency__OAssignment_6 ) ) ;
    public final void rule__Dependency__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:785:1: ( ( ( rule__Dependency__OAssignment_6 ) ) )
            // InternalDependency.g:786:1: ( ( rule__Dependency__OAssignment_6 ) )
            {
            // InternalDependency.g:786:1: ( ( rule__Dependency__OAssignment_6 ) )
            // InternalDependency.g:787:2: ( rule__Dependency__OAssignment_6 )
            {
             before(grammarAccess.getDependencyAccess().getOAssignment_6()); 
            // InternalDependency.g:788:2: ( rule__Dependency__OAssignment_6 )
            // InternalDependency.g:788:3: rule__Dependency__OAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__OAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getOAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__6__Impl"


    // $ANTLR start "rule__Dependency__Group__7"
    // InternalDependency.g:796:1: rule__Dependency__Group__7 : rule__Dependency__Group__7__Impl rule__Dependency__Group__8 ;
    public final void rule__Dependency__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:800:1: ( rule__Dependency__Group__7__Impl rule__Dependency__Group__8 )
            // InternalDependency.g:801:2: rule__Dependency__Group__7__Impl rule__Dependency__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__7"


    // $ANTLR start "rule__Dependency__Group__7__Impl"
    // InternalDependency.g:808:1: rule__Dependency__Group__7__Impl : ( '-->' ) ;
    public final void rule__Dependency__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:812:1: ( ( '-->' ) )
            // InternalDependency.g:813:1: ( '-->' )
            {
            // InternalDependency.g:813:1: ( '-->' )
            // InternalDependency.g:814:2: '-->'
            {
             before(grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__7__Impl"


    // $ANTLR start "rule__Dependency__Group__8"
    // InternalDependency.g:823:1: rule__Dependency__Group__8 : rule__Dependency__Group__8__Impl rule__Dependency__Group__9 ;
    public final void rule__Dependency__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:827:1: ( rule__Dependency__Group__8__Impl rule__Dependency__Group__9 )
            // InternalDependency.g:828:2: rule__Dependency__Group__8__Impl rule__Dependency__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Dependency__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__8"


    // $ANTLR start "rule__Dependency__Group__8__Impl"
    // InternalDependency.g:835:1: rule__Dependency__Group__8__Impl : ( ( rule__Dependency__TnAssignment_8 ) ) ;
    public final void rule__Dependency__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:839:1: ( ( ( rule__Dependency__TnAssignment_8 ) ) )
            // InternalDependency.g:840:1: ( ( rule__Dependency__TnAssignment_8 ) )
            {
            // InternalDependency.g:840:1: ( ( rule__Dependency__TnAssignment_8 ) )
            // InternalDependency.g:841:2: ( rule__Dependency__TnAssignment_8 )
            {
             before(grammarAccess.getDependencyAccess().getTnAssignment_8()); 
            // InternalDependency.g:842:2: ( rule__Dependency__TnAssignment_8 )
            // InternalDependency.g:842:3: rule__Dependency__TnAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__TnAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getTnAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__8__Impl"


    // $ANTLR start "rule__Dependency__Group__9"
    // InternalDependency.g:850:1: rule__Dependency__Group__9 : rule__Dependency__Group__9__Impl rule__Dependency__Group__10 ;
    public final void rule__Dependency__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:854:1: ( rule__Dependency__Group__9__Impl rule__Dependency__Group__10 )
            // InternalDependency.g:855:2: rule__Dependency__Group__9__Impl rule__Dependency__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__9"


    // $ANTLR start "rule__Dependency__Group__9__Impl"
    // InternalDependency.g:862:1: rule__Dependency__Group__9__Impl : ( '.' ) ;
    public final void rule__Dependency__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:866:1: ( ( '.' ) )
            // InternalDependency.g:867:1: ( '.' )
            {
            // InternalDependency.g:867:1: ( '.' )
            // InternalDependency.g:868:2: '.'
            {
             before(grammarAccess.getDependencyAccess().getFullStopKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__9__Impl"


    // $ANTLR start "rule__Dependency__Group__10"
    // InternalDependency.g:877:1: rule__Dependency__Group__10 : rule__Dependency__Group__10__Impl ;
    public final void rule__Dependency__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:881:1: ( rule__Dependency__Group__10__Impl )
            // InternalDependency.g:882:2: rule__Dependency__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__10"


    // $ANTLR start "rule__Dependency__Group__10__Impl"
    // InternalDependency.g:888:1: rule__Dependency__Group__10__Impl : ( ( rule__Dependency__TpAssignment_10 ) ) ;
    public final void rule__Dependency__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:892:1: ( ( ( rule__Dependency__TpAssignment_10 ) ) )
            // InternalDependency.g:893:1: ( ( rule__Dependency__TpAssignment_10 ) )
            {
            // InternalDependency.g:893:1: ( ( rule__Dependency__TpAssignment_10 ) )
            // InternalDependency.g:894:2: ( rule__Dependency__TpAssignment_10 )
            {
             before(grammarAccess.getDependencyAccess().getTpAssignment_10()); 
            // InternalDependency.g:895:2: ( rule__Dependency__TpAssignment_10 )
            // InternalDependency.g:895:3: rule__Dependency__TpAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__TpAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getTpAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__10__Impl"


    // $ANTLR start "rule__GUI__Group__0"
    // InternalDependency.g:904:1: rule__GUI__Group__0 : rule__GUI__Group__0__Impl rule__GUI__Group__1 ;
    public final void rule__GUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:908:1: ( rule__GUI__Group__0__Impl rule__GUI__Group__1 )
            // InternalDependency.g:909:2: rule__GUI__Group__0__Impl rule__GUI__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GUI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__0"


    // $ANTLR start "rule__GUI__Group__0__Impl"
    // InternalDependency.g:916:1: rule__GUI__Group__0__Impl : ( 'GUI' ) ;
    public final void rule__GUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:920:1: ( ( 'GUI' ) )
            // InternalDependency.g:921:1: ( 'GUI' )
            {
            // InternalDependency.g:921:1: ( 'GUI' )
            // InternalDependency.g:922:2: 'GUI'
            {
             before(grammarAccess.getGUIAccess().getGUIKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getGUIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__0__Impl"


    // $ANTLR start "rule__GUI__Group__1"
    // InternalDependency.g:931:1: rule__GUI__Group__1 : rule__GUI__Group__1__Impl rule__GUI__Group__2 ;
    public final void rule__GUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:935:1: ( rule__GUI__Group__1__Impl rule__GUI__Group__2 )
            // InternalDependency.g:936:2: rule__GUI__Group__1__Impl rule__GUI__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__GUI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__1"


    // $ANTLR start "rule__GUI__Group__1__Impl"
    // InternalDependency.g:943:1: rule__GUI__Group__1__Impl : ( ( rule__GUI__NameAssignment_1 ) ) ;
    public final void rule__GUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:947:1: ( ( ( rule__GUI__NameAssignment_1 ) ) )
            // InternalDependency.g:948:1: ( ( rule__GUI__NameAssignment_1 ) )
            {
            // InternalDependency.g:948:1: ( ( rule__GUI__NameAssignment_1 ) )
            // InternalDependency.g:949:2: ( rule__GUI__NameAssignment_1 )
            {
             before(grammarAccess.getGUIAccess().getNameAssignment_1()); 
            // InternalDependency.g:950:2: ( rule__GUI__NameAssignment_1 )
            // InternalDependency.g:950:3: rule__GUI__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GUI__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGUIAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__1__Impl"


    // $ANTLR start "rule__GUI__Group__2"
    // InternalDependency.g:958:1: rule__GUI__Group__2 : rule__GUI__Group__2__Impl rule__GUI__Group__3 ;
    public final void rule__GUI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:962:1: ( rule__GUI__Group__2__Impl rule__GUI__Group__3 )
            // InternalDependency.g:963:2: rule__GUI__Group__2__Impl rule__GUI__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__GUI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__2"


    // $ANTLR start "rule__GUI__Group__2__Impl"
    // InternalDependency.g:970:1: rule__GUI__Group__2__Impl : ( '(' ) ;
    public final void rule__GUI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:974:1: ( ( '(' ) )
            // InternalDependency.g:975:1: ( '(' )
            {
            // InternalDependency.g:975:1: ( '(' )
            // InternalDependency.g:976:2: '('
            {
             before(grammarAccess.getGUIAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__2__Impl"


    // $ANTLR start "rule__GUI__Group__3"
    // InternalDependency.g:985:1: rule__GUI__Group__3 : rule__GUI__Group__3__Impl rule__GUI__Group__4 ;
    public final void rule__GUI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:989:1: ( rule__GUI__Group__3__Impl rule__GUI__Group__4 )
            // InternalDependency.g:990:2: rule__GUI__Group__3__Impl rule__GUI__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__GUI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__3"


    // $ANTLR start "rule__GUI__Group__3__Impl"
    // InternalDependency.g:997:1: rule__GUI__Group__3__Impl : ( ( rule__GUI__XAssignment_3 ) ) ;
    public final void rule__GUI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1001:1: ( ( ( rule__GUI__XAssignment_3 ) ) )
            // InternalDependency.g:1002:1: ( ( rule__GUI__XAssignment_3 ) )
            {
            // InternalDependency.g:1002:1: ( ( rule__GUI__XAssignment_3 ) )
            // InternalDependency.g:1003:2: ( rule__GUI__XAssignment_3 )
            {
             before(grammarAccess.getGUIAccess().getXAssignment_3()); 
            // InternalDependency.g:1004:2: ( rule__GUI__XAssignment_3 )
            // InternalDependency.g:1004:3: rule__GUI__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GUI__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGUIAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__3__Impl"


    // $ANTLR start "rule__GUI__Group__4"
    // InternalDependency.g:1012:1: rule__GUI__Group__4 : rule__GUI__Group__4__Impl rule__GUI__Group__5 ;
    public final void rule__GUI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1016:1: ( rule__GUI__Group__4__Impl rule__GUI__Group__5 )
            // InternalDependency.g:1017:2: rule__GUI__Group__4__Impl rule__GUI__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__GUI__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__4"


    // $ANTLR start "rule__GUI__Group__4__Impl"
    // InternalDependency.g:1024:1: rule__GUI__Group__4__Impl : ( ',' ) ;
    public final void rule__GUI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1028:1: ( ( ',' ) )
            // InternalDependency.g:1029:1: ( ',' )
            {
            // InternalDependency.g:1029:1: ( ',' )
            // InternalDependency.g:1030:2: ','
            {
             before(grammarAccess.getGUIAccess().getCommaKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__4__Impl"


    // $ANTLR start "rule__GUI__Group__5"
    // InternalDependency.g:1039:1: rule__GUI__Group__5 : rule__GUI__Group__5__Impl rule__GUI__Group__6 ;
    public final void rule__GUI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1043:1: ( rule__GUI__Group__5__Impl rule__GUI__Group__6 )
            // InternalDependency.g:1044:2: rule__GUI__Group__5__Impl rule__GUI__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__GUI__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GUI__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__5"


    // $ANTLR start "rule__GUI__Group__5__Impl"
    // InternalDependency.g:1051:1: rule__GUI__Group__5__Impl : ( ( rule__GUI__YAssignment_5 ) ) ;
    public final void rule__GUI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1055:1: ( ( ( rule__GUI__YAssignment_5 ) ) )
            // InternalDependency.g:1056:1: ( ( rule__GUI__YAssignment_5 ) )
            {
            // InternalDependency.g:1056:1: ( ( rule__GUI__YAssignment_5 ) )
            // InternalDependency.g:1057:2: ( rule__GUI__YAssignment_5 )
            {
             before(grammarAccess.getGUIAccess().getYAssignment_5()); 
            // InternalDependency.g:1058:2: ( rule__GUI__YAssignment_5 )
            // InternalDependency.g:1058:3: rule__GUI__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GUI__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGUIAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__5__Impl"


    // $ANTLR start "rule__GUI__Group__6"
    // InternalDependency.g:1066:1: rule__GUI__Group__6 : rule__GUI__Group__6__Impl ;
    public final void rule__GUI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1070:1: ( rule__GUI__Group__6__Impl )
            // InternalDependency.g:1071:2: rule__GUI__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GUI__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__6"


    // $ANTLR start "rule__GUI__Group__6__Impl"
    // InternalDependency.g:1077:1: rule__GUI__Group__6__Impl : ( ')' ) ;
    public final void rule__GUI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1081:1: ( ( ')' ) )
            // InternalDependency.g:1082:1: ( ')' )
            {
            // InternalDependency.g:1082:1: ( ')' )
            // InternalDependency.g:1083:2: ')'
            {
             before(grammarAccess.getGUIAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__Group__6__Impl"


    // $ANTLR start "rule__SystemDependencyObjects__UsernameAssignment_0"
    // InternalDependency.g:1093:1: rule__SystemDependencyObjects__UsernameAssignment_0 : ( ruleUserName ) ;
    public final void rule__SystemDependencyObjects__UsernameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1097:1: ( ( ruleUserName ) )
            // InternalDependency.g:1098:2: ( ruleUserName )
            {
            // InternalDependency.g:1098:2: ( ruleUserName )
            // InternalDependency.g:1099:3: ruleUserName
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUserName();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__UsernameAssignment_0"


    // $ANTLR start "rule__SystemDependencyObjects__UserimportAssignment_1"
    // InternalDependency.g:1108:1: rule__SystemDependencyObjects__UserimportAssignment_1 : ( ruleUserImport ) ;
    public final void rule__SystemDependencyObjects__UserimportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1112:1: ( ( ruleUserImport ) )
            // InternalDependency.g:1113:2: ( ruleUserImport )
            {
            // InternalDependency.g:1113:2: ( ruleUserImport )
            // InternalDependency.g:1114:3: ruleUserImport
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserImport();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__UserimportAssignment_1"


    // $ANTLR start "rule__SystemDependencyObjects__AtAssignment_2"
    // InternalDependency.g:1123:1: rule__SystemDependencyObjects__AtAssignment_2 : ( ruleAt ) ;
    public final void rule__SystemDependencyObjects__AtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1127:1: ( ( ruleAt ) )
            // InternalDependency.g:1128:2: ( ruleAt )
            {
            // InternalDependency.g:1128:2: ( ruleAt )
            // InternalDependency.g:1129:3: ruleAt
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getAtAtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsAccess().getAtAtParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__AtAssignment_2"


    // $ANTLR start "rule__SystemDependencyObjects__DependenciesAssignment_3"
    // InternalDependency.g:1138:1: rule__SystemDependencyObjects__DependenciesAssignment_3 : ( ruleDependency ) ;
    public final void rule__SystemDependencyObjects__DependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1142:1: ( ( ruleDependency ) )
            // InternalDependency.g:1143:2: ( ruleDependency )
            {
            // InternalDependency.g:1143:2: ( ruleDependency )
            // InternalDependency.g:1144:3: ruleDependency
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getDependenciesDependencyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsAccess().getDependenciesDependencyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__DependenciesAssignment_3"


    // $ANTLR start "rule__SystemDependencyObjects__GuisAssignment_4"
    // InternalDependency.g:1153:1: rule__SystemDependencyObjects__GuisAssignment_4 : ( ruleGUI ) ;
    public final void rule__SystemDependencyObjects__GuisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1157:1: ( ( ruleGUI ) )
            // InternalDependency.g:1158:2: ( ruleGUI )
            {
            // InternalDependency.g:1158:2: ( ruleGUI )
            // InternalDependency.g:1159:3: ruleGUI
            {
             before(grammarAccess.getSystemDependencyObjectsAccess().getGuisGUIParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGUI();

            state._fsp--;

             after(grammarAccess.getSystemDependencyObjectsAccess().getGuisGUIParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDependencyObjects__GuisAssignment_4"


    // $ANTLR start "rule__UserName__NameAssignment_2"
    // InternalDependency.g:1168:1: rule__UserName__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UserName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1172:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1173:2: ( RULE_STRING )
            {
            // InternalDependency.g:1173:2: ( RULE_STRING )
            // InternalDependency.g:1174:3: RULE_STRING
            {
             before(grammarAccess.getUserNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserName__NameAssignment_2"


    // $ANTLR start "rule__UserImport__EnvironmentAssignment_1"
    // InternalDependency.g:1183:1: rule__UserImport__EnvironmentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UserImport__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1187:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1188:2: ( RULE_STRING )
            {
            // InternalDependency.g:1188:2: ( RULE_STRING )
            // InternalDependency.g:1189:3: RULE_STRING
            {
             before(grammarAccess.getUserImportAccess().getEnvironmentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserImportAccess().getEnvironmentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__EnvironmentAssignment_1"


    // $ANTLR start "rule__UserImport__BoxpathAssignment_3"
    // InternalDependency.g:1198:1: rule__UserImport__BoxpathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__UserImport__BoxpathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1202:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1203:2: ( RULE_STRING )
            {
            // InternalDependency.g:1203:2: ( RULE_STRING )
            // InternalDependency.g:1204:3: RULE_STRING
            {
             before(grammarAccess.getUserImportAccess().getBoxpathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserImportAccess().getBoxpathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserImport__BoxpathAssignment_3"


    // $ANTLR start "rule__At__NameAssignment_2"
    // InternalDependency.g:1213:1: rule__At__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__At__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1217:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1218:2: ( RULE_STRING )
            {
            // InternalDependency.g:1218:2: ( RULE_STRING )
            // InternalDependency.g:1219:3: RULE_STRING
            {
             before(grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__NameAssignment_2"


    // $ANTLR start "rule__Dependency__NameAssignment_1"
    // InternalDependency.g:1228:1: rule__Dependency__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dependency__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1232:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1233:2: ( RULE_STRING )
            {
            // InternalDependency.g:1233:2: ( RULE_STRING )
            // InternalDependency.g:1234:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__NameAssignment_1"


    // $ANTLR start "rule__Dependency__FnAssignment_2"
    // InternalDependency.g:1243:1: rule__Dependency__FnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Dependency__FnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1247:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1248:2: ( RULE_STRING )
            {
            // InternalDependency.g:1248:2: ( RULE_STRING )
            // InternalDependency.g:1249:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getFnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getFnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__FnAssignment_2"


    // $ANTLR start "rule__Dependency__FpAssignment_4"
    // InternalDependency.g:1258:1: rule__Dependency__FpAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Dependency__FpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1262:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1263:2: ( RULE_STRING )
            {
            // InternalDependency.g:1263:2: ( RULE_STRING )
            // InternalDependency.g:1264:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getFpSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getFpSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__FpAssignment_4"


    // $ANTLR start "rule__Dependency__OAssignment_6"
    // InternalDependency.g:1273:1: rule__Dependency__OAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Dependency__OAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1277:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1278:2: ( RULE_STRING )
            {
            // InternalDependency.g:1278:2: ( RULE_STRING )
            // InternalDependency.g:1279:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getOSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getOSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__OAssignment_6"


    // $ANTLR start "rule__Dependency__TnAssignment_8"
    // InternalDependency.g:1288:1: rule__Dependency__TnAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Dependency__TnAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1292:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1293:2: ( RULE_STRING )
            {
            // InternalDependency.g:1293:2: ( RULE_STRING )
            // InternalDependency.g:1294:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getTnSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getTnSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__TnAssignment_8"


    // $ANTLR start "rule__Dependency__TpAssignment_10"
    // InternalDependency.g:1303:1: rule__Dependency__TpAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Dependency__TpAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1307:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1308:2: ( RULE_STRING )
            {
            // InternalDependency.g:1308:2: ( RULE_STRING )
            // InternalDependency.g:1309:3: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getTpSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getTpSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__TpAssignment_10"


    // $ANTLR start "rule__GUI__NameAssignment_1"
    // InternalDependency.g:1318:1: rule__GUI__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GUI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1322:1: ( ( RULE_STRING ) )
            // InternalDependency.g:1323:2: ( RULE_STRING )
            {
            // InternalDependency.g:1323:2: ( RULE_STRING )
            // InternalDependency.g:1324:3: RULE_STRING
            {
             before(grammarAccess.getGUIAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__NameAssignment_1"


    // $ANTLR start "rule__GUI__XAssignment_3"
    // InternalDependency.g:1333:1: rule__GUI__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__GUI__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1337:1: ( ( RULE_INT ) )
            // InternalDependency.g:1338:2: ( RULE_INT )
            {
            // InternalDependency.g:1338:2: ( RULE_INT )
            // InternalDependency.g:1339:3: RULE_INT
            {
             before(grammarAccess.getGUIAccess().getXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getXINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__XAssignment_3"


    // $ANTLR start "rule__GUI__YAssignment_5"
    // InternalDependency.g:1348:1: rule__GUI__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__GUI__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1352:1: ( ( RULE_INT ) )
            // InternalDependency.g:1353:2: ( RULE_INT )
            {
            // InternalDependency.g:1353:2: ( RULE_INT )
            // InternalDependency.g:1354:3: RULE_INT
            {
             before(grammarAccess.getGUIAccess().getYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGUIAccess().getYINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUI__YAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}