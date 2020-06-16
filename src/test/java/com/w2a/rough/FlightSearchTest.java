package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;
import org.testng.Assert;

public class FlightSearchTest {


    public static void main(String[] args) {

        Page.initConfiguration();
        HomePage home = new HomePage();
        Assert.assertEquals(home.findTabCount(), "5");
        home.gotoFlights().bookAFlight("Vienna", "Berlin", "13/06/2020", "20/06/2020");
        Page.quitBrowser();
    }
}
