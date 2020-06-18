package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;
import com.w2a.utilities.Utilities;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SignInTest {


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void signInTest(String username, String password, String runMode) throws InterruptedException {

        if (runMode.equalsIgnoreCase("N")){
            throw new SkipException("Skipping the test as the Run mode is NO");
        }else {
            Page.initConfiguration();
            SigninPage signinPage = Page.topNav.gotoSignIn();
            Thread.sleep(2000);
            signinPage.doLogin(username, password);
        }
    }

    @AfterMethod
    public void tearDown(){
        if (Page.driver!=null){
            Page.quitBrowser();
        }
    }
}
