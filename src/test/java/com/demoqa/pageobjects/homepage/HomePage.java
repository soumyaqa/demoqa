package com.demoqa.pageobjects.homepage;

import com.demoqa.utils.Drivers;
import org.openqa.selenium.WebDriver;

/**
 * Created by New on 4/21/2017.
 */
public class HomePage {
    private static WebDriver driver;

    public void setBrowser(String browser){
        driver = Drivers.getDriver(browser);
    }

    public void openPage(){
        driver.get("http://demoqa.com/");
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void close(){
        driver.close();
    }

    public WebDriver giveControl(){
        return driver;
    }
}
