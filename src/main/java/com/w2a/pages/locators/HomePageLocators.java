package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

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

    //second element should be found within the first block
    @FindBys({
            @FindBy(css=".room-data"),
            @FindBy(id="flight-age-select-1-hp-flight")
    })
    public WebElement firstChildAge;

    //one of them should be found, than it works
    @FindAll({
            @FindBy(css="#flight-age--2-hp-flight"),
            @FindBy(id="flight-age-select-2-hp-flight")
    })
    public WebElement secondChildAge;

    @FindBy(css="#wizard-tabs")
    public WebElement block;

    @FindBy(css="li[role='presentation']")
    public List<WebElement> tabCount;

}
