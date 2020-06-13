package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//button[starts-with(@id,'tab-flight-tab-hp')]")
    public WebElement flightTab;

    //Locators for Flight booking

    @FindBy(css="#flight-origin-hp-flight")
    //@FindBy(css="input[id^='flight-origin-hp-flight']")
    public WebElement fromCity;

    @FindBy(css="#flight-destination-hp-flight")
    //@FindBy(css="input[id^='flight-destination-hp-flight']")
    public WebElement toCity;

    @FindBy(css="#flight-departing-hp-flight")
    public WebElement departFlight;

    @FindBy(css="#flight-returning-hp-flight")
    public WebElement returnFlight;

    @FindBy(css="#traveler-selector-hp-flight > div > ul > li > button")
    public WebElement travellerSelector;

    @FindBy(css="#traveler-selector-hp-flight > div > ul > li > div > div > div > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon")
    public WebElement adultCount;

    @FindBy(css="#traveler-selector-hp-flight > div > ul > li > div > div > div > div.children-wrapper > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon")
    public WebElement childCount;

    @FindBy(css="#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button > span")
    //@FindBy(css="#button[type='submit']")
    public WebElement search;

    @FindBy(css="#flight-age-select-1-hp-flight")
    public WebElement childAge;

    @FindBy(css="#wizard-tabs")
    public WebElement block;

}
