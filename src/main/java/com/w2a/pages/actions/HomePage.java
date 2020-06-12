package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends Page {

    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.home);
    }

    public HomePage gotoFlights(){

        try {
            home.flightTab.click();
            System.out.println("Működik az első oldal");
        }catch (Exception e){
            home.flightTab2.click();
            System.out.println("Bassza meg az első oldal");
        }
        return this;
    }

    public void gotoHotels(){

    }

    public void gotoFlightAndHotels(){

    }

    public void bookAFlight(String from, String to, String departing, String returning) {
        home.fromCity.sendKeys(from);
        home.toCity.sendKeys(to);
        home.departFlight.sendKeys(departing);
        //home.returnFlight.sendKeys(returning);
        home.returnFlight.click();
        home.returnFlight.clear();
        //home.returnFlight.sendKeys(returning);

        home.travellerSelector.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        home.travellerSelector.click();
        //home.adultCount.click();
        //home.childCount.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        home.search.click();
    }
}
