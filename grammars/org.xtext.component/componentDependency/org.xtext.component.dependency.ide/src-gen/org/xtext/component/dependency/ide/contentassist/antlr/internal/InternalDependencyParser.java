package org.xtext.component.dependency.ide.contentassist.antlr.internal;

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
import org.xtext.component.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleComponentDependencyObjects"
    // InternalDependency.g:53:1: entryRuleComponentDependencyObjects : ruleComponentDependencyObjects EOF ;
    public final void entryRuleComponentDependencyObjects() throws RecognitionException {
        try {
            // InternalDependency.g:54:1: ( ruleComponentDependencyObjects EOF )
            // InternalDependency.g:55:1: ruleComponentDependencyObjects EOF
            {
             before(grammarAccess.getComponentDependencyObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDependencyObjects();

            state._fsp--;

             after(grammarAccess.getComponentDependencyObjectsRule()); 
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
    // $ANTLR end "entryRuleComponentDependencyObjects"


    // $ANTLR start "ruleComponentDependencyObjects"
    // InternalDependency.g:62:1: ruleComponentDependencyObjects : ( ( rule__ComponentDependencyObjects__Group__0 ) ) ;
    public final void ruleComponentDependencyObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:66:2: ( ( ( rule__ComponentDependencyObjects__Group__0 ) ) )
            // InternalDependency.g:67:2: ( ( rule__ComponentDependencyObjects__Group__0 ) )
            {
            // InternalDependency.g:67:2: ( ( rule__ComponentDependencyObjects__Group__0 ) )
            // InternalDependency.g:68:3: ( rule__ComponentDependencyObjects__Group__0 )
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getGroup()); 
            // InternalDependency.g:69:3: ( rule__ComponentDependencyObjects__Group__0 )
            // InternalDependency.g:69:4: rule__ComponentDependencyObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDependencyObjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDependencyObjects"


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


    // $ANTLR start "rule__ComponentDependencyObjects__Group__0"
    // InternalDependency.g:152:1: rule__ComponentDependencyObjects__Group__0 : rule__ComponentDependencyObjects__Group__0__Impl rule__ComponentDependencyObjects__Group__1 ;
    public final void rule__ComponentDependencyObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:156:1: ( rule__ComponentDependencyObjects__Group__0__Impl rule__ComponentDependencyObjects__Group__1 )
            // InternalDependency.g:157:2: rule__ComponentDependencyObjects__Group__0__Impl rule__ComponentDependencyObjects__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentDependencyObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__0"


    // $ANTLR start "rule__ComponentDependencyObjects__Group__0__Impl"
    // InternalDependency.g:164:1: rule__ComponentDependencyObjects__Group__0__Impl : ( ( rule__ComponentDependencyObjects__UsernameAssignment_0 ) ) ;
    public final void rule__ComponentDependencyObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:168:1: ( ( ( rule__ComponentDependencyObjects__UsernameAssignment_0 ) ) )
            // InternalDependency.g:169:1: ( ( rule__ComponentDependencyObjects__UsernameAssignment_0 ) )
            {
            // InternalDependency.g:169:1: ( ( rule__ComponentDependencyObjects__UsernameAssignment_0 ) )
            // InternalDependency.g:170:2: ( rule__ComponentDependencyObjects__UsernameAssignment_0 )
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getUsernameAssignment_0()); 
            // InternalDependency.g:171:2: ( rule__ComponentDependencyObjects__UsernameAssignment_0 )
            // InternalDependency.g:171:3: rule__ComponentDependencyObjects__UsernameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__UsernameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDependencyObjectsAccess().getUsernameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__0__Impl"


    // $ANTLR start "rule__ComponentDependencyObjects__Group__1"
    // InternalDependency.g:179:1: rule__ComponentDependencyObjects__Group__1 : rule__ComponentDependencyObjects__Group__1__Impl rule__ComponentDependencyObjects__Group__2 ;
    public final void rule__ComponentDependencyObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:183:1: ( rule__ComponentDependencyObjects__Group__1__Impl rule__ComponentDependencyObjects__Group__2 )
            // InternalDependency.g:184:2: rule__ComponentDependencyObjects__Group__1__Impl rule__ComponentDependencyObjects__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentDependencyObjects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__1"


    // $ANTLR start "rule__ComponentDependencyObjects__Group__1__Impl"
    // InternalDependency.g:191:1: rule__ComponentDependencyObjects__Group__1__Impl : ( ( rule__ComponentDependencyObjects__UserimportAssignment_1 ) ) ;
    public final void rule__ComponentDependencyObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:195:1: ( ( ( rule__ComponentDependencyObjects__UserimportAssignment_1 ) ) )
            // InternalDependency.g:196:1: ( ( rule__ComponentDependencyObjects__UserimportAssignment_1 ) )
            {
            // InternalDependency.g:196:1: ( ( rule__ComponentDependencyObjects__UserimportAssignment_1 ) )
            // InternalDependency.g:197:2: ( rule__ComponentDependencyObjects__UserimportAssignment_1 )
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getUserimportAssignment_1()); 
            // InternalDependency.g:198:2: ( rule__ComponentDependencyObjects__UserimportAssignment_1 )
            // InternalDependency.g:198:3: rule__ComponentDependencyObjects__UserimportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__UserimportAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDependencyObjectsAccess().getUserimportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__1__Impl"


    // $ANTLR start "rule__ComponentDependencyObjects__Group__2"
    // InternalDependency.g:206:1: rule__ComponentDependencyObjects__Group__2 : rule__ComponentDependencyObjects__Group__2__Impl ;
    public final void rule__ComponentDependencyObjects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:210:1: ( rule__ComponentDependencyObjects__Group__2__Impl )
            // InternalDependency.g:211:2: rule__ComponentDependencyObjects__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__2"


    // $ANTLR start "rule__ComponentDependencyObjects__Group__2__Impl"
    // InternalDependency.g:217:1: rule__ComponentDependencyObjects__Group__2__Impl : ( ( rule__ComponentDependencyObjects__AtAssignment_2 ) ) ;
    public final void rule__ComponentDependencyObjects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:221:1: ( ( ( rule__ComponentDependencyObjects__AtAssignment_2 ) ) )
            // InternalDependency.g:222:1: ( ( rule__ComponentDependencyObjects__AtAssignment_2 ) )
            {
            // InternalDependency.g:222:1: ( ( rule__ComponentDependencyObjects__AtAssignment_2 ) )
            // InternalDependency.g:223:2: ( rule__ComponentDependencyObjects__AtAssignment_2 )
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getAtAssignment_2()); 
            // InternalDependency.g:224:2: ( rule__ComponentDependencyObjects__AtAssignment_2 )
            // InternalDependency.g:224:3: rule__ComponentDependencyObjects__AtAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDependencyObjects__AtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDependencyObjectsAccess().getAtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__Group__2__Impl"


    // $ANTLR start "rule__UserName__Group__0"
    // InternalDependency.g:233:1: rule__UserName__Group__0 : rule__UserName__Group__0__Impl rule__UserName__Group__1 ;
    public final void rule__UserName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:237:1: ( rule__UserName__Group__0__Impl rule__UserName__Group__1 )
            // InternalDependency.g:238:2: rule__UserName__Group__0__Impl rule__UserName__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDependency.g:245:1: rule__UserName__Group__0__Impl : ( 'UserName' ) ;
    public final void rule__UserName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:249:1: ( ( 'UserName' ) )
            // InternalDependency.g:250:1: ( 'UserName' )
            {
            // InternalDependency.g:250:1: ( 'UserName' )
            // InternalDependency.g:251:2: 'UserName'
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
    // InternalDependency.g:260:1: rule__UserName__Group__1 : rule__UserName__Group__1__Impl rule__UserName__Group__2 ;
    public final void rule__UserName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:264:1: ( rule__UserName__Group__1__Impl rule__UserName__Group__2 )
            // InternalDependency.g:265:2: rule__UserName__Group__1__Impl rule__UserName__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDependency.g:272:1: rule__UserName__Group__1__Impl : ( ':' ) ;
    public final void rule__UserName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:276:1: ( ( ':' ) )
            // InternalDependency.g:277:1: ( ':' )
            {
            // InternalDependency.g:277:1: ( ':' )
            // InternalDependency.g:278:2: ':'
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
    // InternalDependency.g:287:1: rule__UserName__Group__2 : rule__UserName__Group__2__Impl ;
    public final void rule__UserName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:291:1: ( rule__UserName__Group__2__Impl )
            // InternalDependency.g:292:2: rule__UserName__Group__2__Impl
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
    // InternalDependency.g:298:1: rule__UserName__Group__2__Impl : ( ( rule__UserName__NameAssignment_2 ) ) ;
    public final void rule__UserName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:302:1: ( ( ( rule__UserName__NameAssignment_2 ) ) )
            // InternalDependency.g:303:1: ( ( rule__UserName__NameAssignment_2 ) )
            {
            // InternalDependency.g:303:1: ( ( rule__UserName__NameAssignment_2 ) )
            // InternalDependency.g:304:2: ( rule__UserName__NameAssignment_2 )
            {
             before(grammarAccess.getUserNameAccess().getNameAssignment_2()); 
            // InternalDependency.g:305:2: ( rule__UserName__NameAssignment_2 )
            // InternalDependency.g:305:3: rule__UserName__NameAssignment_2
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
    // InternalDependency.g:314:1: rule__UserImport__Group__0 : rule__UserImport__Group__0__Impl rule__UserImport__Group__1 ;
    public final void rule__UserImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:318:1: ( rule__UserImport__Group__0__Impl rule__UserImport__Group__1 )
            // InternalDependency.g:319:2: rule__UserImport__Group__0__Impl rule__UserImport__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDependency.g:326:1: rule__UserImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__UserImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:330:1: ( ( 'import' ) )
            // InternalDependency.g:331:1: ( 'import' )
            {
            // InternalDependency.g:331:1: ( 'import' )
            // InternalDependency.g:332:2: 'import'
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
    // InternalDependency.g:341:1: rule__UserImport__Group__1 : rule__UserImport__Group__1__Impl rule__UserImport__Group__2 ;
    public final void rule__UserImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:345:1: ( rule__UserImport__Group__1__Impl rule__UserImport__Group__2 )
            // InternalDependency.g:346:2: rule__UserImport__Group__1__Impl rule__UserImport__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDependency.g:353:1: rule__UserImport__Group__1__Impl : ( ( rule__UserImport__EnvironmentAssignment_1 ) ) ;
    public final void rule__UserImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:357:1: ( ( ( rule__UserImport__EnvironmentAssignment_1 ) ) )
            // InternalDependency.g:358:1: ( ( rule__UserImport__EnvironmentAssignment_1 ) )
            {
            // InternalDependency.g:358:1: ( ( rule__UserImport__EnvironmentAssignment_1 ) )
            // InternalDependency.g:359:2: ( rule__UserImport__EnvironmentAssignment_1 )
            {
             before(grammarAccess.getUserImportAccess().getEnvironmentAssignment_1()); 
            // InternalDependency.g:360:2: ( rule__UserImport__EnvironmentAssignment_1 )
            // InternalDependency.g:360:3: rule__UserImport__EnvironmentAssignment_1
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
    // InternalDependency.g:368:1: rule__UserImport__Group__2 : rule__UserImport__Group__2__Impl rule__UserImport__Group__3 ;
    public final void rule__UserImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:372:1: ( rule__UserImport__Group__2__Impl rule__UserImport__Group__3 )
            // InternalDependency.g:373:2: rule__UserImport__Group__2__Impl rule__UserImport__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDependency.g:380:1: rule__UserImport__Group__2__Impl : ( 'from' ) ;
    public final void rule__UserImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:384:1: ( ( 'from' ) )
            // InternalDependency.g:385:1: ( 'from' )
            {
            // InternalDependency.g:385:1: ( 'from' )
            // InternalDependency.g:386:2: 'from'
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
    // InternalDependency.g:395:1: rule__UserImport__Group__3 : rule__UserImport__Group__3__Impl ;
    public final void rule__UserImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:399:1: ( rule__UserImport__Group__3__Impl )
            // InternalDependency.g:400:2: rule__UserImport__Group__3__Impl
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
    // InternalDependency.g:406:1: rule__UserImport__Group__3__Impl : ( ( rule__UserImport__BoxpathAssignment_3 ) ) ;
    public final void rule__UserImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:410:1: ( ( ( rule__UserImport__BoxpathAssignment_3 ) ) )
            // InternalDependency.g:411:1: ( ( rule__UserImport__BoxpathAssignment_3 ) )
            {
            // InternalDependency.g:411:1: ( ( rule__UserImport__BoxpathAssignment_3 ) )
            // InternalDependency.g:412:2: ( rule__UserImport__BoxpathAssignment_3 )
            {
             before(grammarAccess.getUserImportAccess().getBoxpathAssignment_3()); 
            // InternalDependency.g:413:2: ( rule__UserImport__BoxpathAssignment_3 )
            // InternalDependency.g:413:3: rule__UserImport__BoxpathAssignment_3
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
    // InternalDependency.g:422:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:426:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalDependency.g:427:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDependency.g:434:1: rule__At__Group__0__Impl : ( 'Save' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:438:1: ( ( 'Save' ) )
            // InternalDependency.g:439:1: ( 'Save' )
            {
            // InternalDependency.g:439:1: ( 'Save' )
            // InternalDependency.g:440:2: 'Save'
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
    // InternalDependency.g:449:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:453:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalDependency.g:454:2: rule__At__Group__1__Impl rule__At__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDependency.g:461:1: rule__At__Group__1__Impl : ( '@' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:465:1: ( ( '@' ) )
            // InternalDependency.g:466:1: ( '@' )
            {
            // InternalDependency.g:466:1: ( '@' )
            // InternalDependency.g:467:2: '@'
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
    // InternalDependency.g:476:1: rule__At__Group__2 : rule__At__Group__2__Impl ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:480:1: ( rule__At__Group__2__Impl )
            // InternalDependency.g:481:2: rule__At__Group__2__Impl
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
    // InternalDependency.g:487:1: rule__At__Group__2__Impl : ( ( rule__At__NameAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:491:1: ( ( ( rule__At__NameAssignment_2 ) ) )
            // InternalDependency.g:492:1: ( ( rule__At__NameAssignment_2 ) )
            {
            // InternalDependency.g:492:1: ( ( rule__At__NameAssignment_2 ) )
            // InternalDependency.g:493:2: ( rule__At__NameAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getNameAssignment_2()); 
            // InternalDependency.g:494:2: ( rule__At__NameAssignment_2 )
            // InternalDependency.g:494:3: rule__At__NameAssignment_2
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


    // $ANTLR start "rule__ComponentDependencyObjects__UsernameAssignment_0"
    // InternalDependency.g:503:1: rule__ComponentDependencyObjects__UsernameAssignment_0 : ( ruleUserName ) ;
    public final void rule__ComponentDependencyObjects__UsernameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:507:1: ( ( ruleUserName ) )
            // InternalDependency.g:508:2: ( ruleUserName )
            {
            // InternalDependency.g:508:2: ( ruleUserName )
            // InternalDependency.g:509:3: ruleUserName
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUserName();

            state._fsp--;

             after(grammarAccess.getComponentDependencyObjectsAccess().getUsernameUserNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__UsernameAssignment_0"


    // $ANTLR start "rule__ComponentDependencyObjects__UserimportAssignment_1"
    // InternalDependency.g:518:1: rule__ComponentDependencyObjects__UserimportAssignment_1 : ( ruleUserImport ) ;
    public final void rule__ComponentDependencyObjects__UserimportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:522:1: ( ( ruleUserImport ) )
            // InternalDependency.g:523:2: ( ruleUserImport )
            {
            // InternalDependency.g:523:2: ( ruleUserImport )
            // InternalDependency.g:524:3: ruleUserImport
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserImport();

            state._fsp--;

             after(grammarAccess.getComponentDependencyObjectsAccess().getUserimportUserImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__UserimportAssignment_1"


    // $ANTLR start "rule__ComponentDependencyObjects__AtAssignment_2"
    // InternalDependency.g:533:1: rule__ComponentDependencyObjects__AtAssignment_2 : ( ruleAt ) ;
    public final void rule__ComponentDependencyObjects__AtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:537:1: ( ( ruleAt ) )
            // InternalDependency.g:538:2: ( ruleAt )
            {
            // InternalDependency.g:538:2: ( ruleAt )
            // InternalDependency.g:539:3: ruleAt
            {
             before(grammarAccess.getComponentDependencyObjectsAccess().getAtAtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getComponentDependencyObjectsAccess().getAtAtParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDependencyObjects__AtAssignment_2"


    // $ANTLR start "rule__UserName__NameAssignment_2"
    // InternalDependency.g:548:1: rule__UserName__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UserName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:552:1: ( ( RULE_STRING ) )
            // InternalDependency.g:553:2: ( RULE_STRING )
            {
            // InternalDependency.g:553:2: ( RULE_STRING )
            // InternalDependency.g:554:3: RULE_STRING
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
    // InternalDependency.g:563:1: rule__UserImport__EnvironmentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UserImport__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:567:1: ( ( RULE_STRING ) )
            // InternalDependency.g:568:2: ( RULE_STRING )
            {
            // InternalDependency.g:568:2: ( RULE_STRING )
            // InternalDependency.g:569:3: RULE_STRING
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
    // InternalDependency.g:578:1: rule__UserImport__BoxpathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__UserImport__BoxpathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:582:1: ( ( RULE_STRING ) )
            // InternalDependency.g:583:2: ( RULE_STRING )
            {
            // InternalDependency.g:583:2: ( RULE_STRING )
            // InternalDependency.g:584:3: RULE_STRING
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
    // InternalDependency.g:593:1: rule__At__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__At__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:597:1: ( ( RULE_STRING ) )
            // InternalDependency.g:598:2: ( RULE_STRING )
            {
            // InternalDependency.g:598:2: ( RULE_STRING )
            // InternalDependency.g:599:3: RULE_STRING
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