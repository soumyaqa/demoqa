package com.demoqa.pageobjects.draggable;

import com.demoqa.pageobjects.homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by New on 4/21/2017.
 */
public class DraggablePage {
    WebDriver driver;
    public void setHomePage(HomePage homePage){
        driver = homePage.giveControl();
    }

    public void open(){
        driver.findElement(By.linkText("Draggable")).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public WebDriver giveControl(){
        return driver;
    }
}
