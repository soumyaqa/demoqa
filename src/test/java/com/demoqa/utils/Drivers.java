package com.demoqa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by New on 4/21/2017.
 */
public class Drivers {
    private static WebDriver driver;

    public static WebDriver getDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_LOC);
            driver = new ChromeDriver();
        }

        return driver;
    }
}
