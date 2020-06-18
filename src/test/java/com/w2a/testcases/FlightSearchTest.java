package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.HomePage;
import com.w2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class FlightSearchTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void flightSearchTest(String fromCity, String toCity, String fromDate, String toDate, String runMode) throws InterruptedException {

        if (runMode.equalsIgnoreCase("N")){
            throw new SkipException("Skipping the test as the Run mode is NO");
        }else {
            Page.initConfiguration();
            HomePage home = new HomePage();
            //Assert.assertEquals(home.findTabCount(), 5);
            ErrorCollector.verifyEquals(home.findTabCount(), 5);
            home.gotoFlights().bookAFlight(fromCity, toCity, fromDate, toDate);
        }
    }

    @AfterMethod
    public void tearDown() {
        if (Page.driver != null) {
            Page.quitBrowser();
        }
    }
}
