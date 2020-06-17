package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightSearchTest {

    @BeforeTest
    public void setUp(){
        Page.initConfiguration();
    }

    @Test
    public void FlightSearchTest() throws InterruptedException {

        HomePage home = new HomePage();
        //Assert.assertEquals(home.findTabCount(), 5);
        ErrorCollector.verifyEquals(home.findTabCount(), 5);
        home.gotoFlights().bookAFlight("Vienna", "Berlin", "13/06/2020", "20/06/2020");
    }

    @AfterTest
    public void tearDown(){
        Page.quitBrowser();
    }
}
