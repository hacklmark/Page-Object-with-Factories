package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest {

    @BeforeTest
    public void setUp(){
        Page.initConfiguration();
    }

    @Test
    public void signInTest() throws InterruptedException {
        SigninPage signinPage = Page.topNav.gotoSignIn();
        Thread.sleep(2000);
        signinPage.doLogin("test.automatisierer@gmail.com", "Autotest@123");
    }

    @AfterTest
    public void tearDown(){
        Page.quitBrowser();
    }
}
