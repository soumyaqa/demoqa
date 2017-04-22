package com.demoqa.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by New on 4/21/2017.
 */
public class TabPage {
    private WebDriver driver;
    int tabNumber;

    public void setHomePage(HomePage homePage){
        driver = homePage.giveControl();
    }

    public void selectTab(int tabNumber){
        this.tabNumber = tabNumber;
        switch (tabNumber){
            case 1:
                //Tab 1 section in the home page
                driver.findElement(By.id("ui-id-1")).click();
                break;
            case 2:
                //Tab 2 section in the home page
                driver.findElement(By.id("ui-id-2")).click();
                break;
            //other tab sections won't be tested for this demo project
        }
    }

    public String getTitle(){
        String title = "";

        switch (tabNumber){
            case 1:
                //Title text of Tab 1 section
                title = driver.findElement(By.cssSelector("div[id='tabs-1']>b")).getText();
                break;
            case 2:
                //Title of Tab 2 section
                title = driver.findElement(By.cssSelector("div[id='tabs-2']>b")).getText();
                break;
        }

        return title;
    }

    public void close(){
        driver.close();
    }
}
