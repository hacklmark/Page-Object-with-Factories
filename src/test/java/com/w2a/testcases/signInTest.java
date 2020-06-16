package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;
import org.testng.annotations.Test;

public class signInTest {

    @Test
    public void signInTest() throws InterruptedException {
        Page.initConfiguration();
        SigninPage signinPage = Page.topNav.gotoSignIn();
        Thread.sleep(2000);
        signinPage.doLogin("test.automatisierer@gmail.com", "Autotest@123");
        Page.quitBrowser();
    }
}
