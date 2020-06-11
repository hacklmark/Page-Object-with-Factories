package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(css="#tab-flight-tab-hp")
    public WebElement flightTab;

    @FindBy(css="li.uitk-tab:nth-child(3) > a:nth-child(1)")
    public WebElement flightTab2;
}
