package com.w2a.rough;

import com.w2a.pages.actions.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FlightSearchTest {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.gotoFlights();

        Thread.sleep(3000);
    }
}
