package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        PageFactory.initElements(driver, this.home);
    }

    public void gotoFlights(){

        try {
            home.flightTab.click();
            System.out.println("Működik az első oldal");
        }catch (Exception e){
            home.flightTab2.click();
            System.out.println("Bassza meg az első oldal");
        }

    }

    public void gotoHotels(){

    }

    public void gotoFlightAndHotels(){

    }

    public void bookAFlight(String from, String to, String departing, String returning, String noOfAdults, String noOfChildren){

    }
}
