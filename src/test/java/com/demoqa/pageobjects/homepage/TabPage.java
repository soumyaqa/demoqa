package com.demoqa.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by New on 4/21/2017.
 */
public class TabPage {
    private static WebDriver driver;
    int tabNumber;

    public void setHomePage(HomePage homePage){
        driver = homePage.giveControl();
    }

    public void selectTab(int tabNumber){
        this.tabNumber = tabNumber;
        switch (tabNumber){
            case 1:
                driver.findElement(By.id("ui-id-1")).click();
                break;
            case 2:
                driver.findElement(By.id("ui-id-2")).click();
                break;
        }
    }

    public String getTitle(){
        String title = "";

        switch (tabNumber){
            case 1:
                title = driver.findElement(By.xpath(".//div[@id='tabs-1']/b")).getText();
                break;
            case 2:
                title = driver.findElement(By.xpath(".//div[@id='tabs-2']/b")).getText();
                break;
        }

        return title;
    }

    public void close(){
        driver.close();
    }
}
