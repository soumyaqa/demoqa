package com.demoqa.pageobjects.draggable;

import com.demoqa.utils.Constants;
import com.demoqa.utils.Drivers;
import org.openqa.selenium.WebDriver;

/**
 * Created by New on 4/21/2017.
 */
public class DraggablePage {
    private WebDriver driver;

    public void setBrowser(String browser){
        driver = Drivers.getDriver(browser);
    }

    public void open(){
        driver.get(Constants.BASE_URL + "/draggable");
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public WebDriver giveControl(){
        return driver;
    }

    public void close(){
        driver.close();
    }
}
