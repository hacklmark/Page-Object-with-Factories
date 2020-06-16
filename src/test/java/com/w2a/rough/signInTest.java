package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;

public class signInTest {

    public static void main(String[] args) throws InterruptedException {
        Page.initConfiguration();
        SigninPage signinPage = Page.topNav.gotoSignIn();
        Thread.sleep(2000);
        signinPage.doLogin("test.automatisierer@gmail.com", "Autotest@123");
        Page.quitBrowser();
    }
}
