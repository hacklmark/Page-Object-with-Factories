package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

    @FindBy(css="#gc-custom-header-nav-bar-acct-menu > button")
    public WebElement account;

    //@FindBy(css="#account-signin")
    @FindAll({
            @FindBy(css="#account-signin"),
            @FindBy(xpath = "//*[contains(text(), 'Sign in')]")
    })
    public WebElement signinBtn;
}
