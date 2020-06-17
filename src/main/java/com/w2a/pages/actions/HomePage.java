package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends Page {

    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.home);
    }

    public HomePage gotoFlights(){

        home.flightTab.click();
        return this;
    }

    public void gotoHotels(){

    }

    public void gotoFlightAndHotels(){

    }

    public void bookAFlight(String from, String to, String departing, String returning) throws InterruptedException {
        type(home.fromCity,from);
        type(home.toCity,to);
        type(home.returnFlight,returning);
        type(home.departFlight,departing);
        click(home.travellerSelector);
        click(home.adultCount);
        click(home.childCount);
        click(home.childCount);
        Select select = new Select(home.firstChildAge);
        select.selectByValue("10");
        Thread.sleep(2000);
        Select select2 = new Select(home.secondChildAge);
        select2.selectByValue("11");
        Thread.sleep(2000);
        //home.block.click();
        Actions action = new Actions(driver);
        //action.sendKeys(Keys.PAGE_DOWN).perform();
        //action.sendKeys(Keys.ENTER).perform();
        action.moveToElement(home.search).click().perform();
    }

    public int findTabCount(){

        return home.tabCount.size();
    }
}
