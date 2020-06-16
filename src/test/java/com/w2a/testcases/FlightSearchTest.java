package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightSearchTest {


    @Test
    public void FlightSearchTest() {

        Page.initConfiguration();
        HomePage home = new HomePage();
        //Assert.assertEquals(home.findTabCount(), 5);
        ErrorCollector.verifyEquals(home.findTabCount(), 7);
        home.gotoFlights().bookAFlight("Vienna", "Berlin", "13/06/2020", "20/06/2020");
        Page.quitBrowser();
    }
}
