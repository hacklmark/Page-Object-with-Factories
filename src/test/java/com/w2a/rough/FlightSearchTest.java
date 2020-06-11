package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class FlightSearchTest {


    public static void main(String[] args){

        Page.initConfiguration();
        HomePage home = new HomePage();
        home.gotoFlights();
        Page.quitBrowser();
    }
}
