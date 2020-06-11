package com.w2a.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    @FindBy(css="#tab-flight-tab-hp")
    public WebElement flightTab;

    @FindBy(css="li.uitk-tab:nth-child(3) > a:nth-child(1)")
    public WebElement flightTab2;

    public void gotoFlights(){

        try {
            flightTab.click();
            System.out.println("Működik az első oldal");
        }catch (Exception e){
            flightTab2.click();
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
