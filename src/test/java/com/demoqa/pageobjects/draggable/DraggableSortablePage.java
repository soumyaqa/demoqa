package com.demoqa.pageobjects.draggable;

import com.demoqa.pageobjects.draggable.DraggablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by New on 4/21/2017.
 */
public class DraggableSortablePage {
    private WebDriver driver;

    public void setDraggablePage(DraggablePage draggablePage){
        driver = draggablePage.giveControl();
    }

    public void clickSelectableSortable(){
        driver.findElement(By.linkText("Draggable + Sortable")).click();
    }

    public void dragAndDrop(){
        Actions builder = new Actions(driver);
        WebElement dragElement = driver.findElement(By.id("draggablebox"));
        WebElement lastElementInList = driver.findElement(By.cssSelector("ul[id='sortablebox']>:last-child"));

        builder.dragAndDrop(dragElement, lastElementInList).build().perform();
    }

    public String getLastElementInList() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement lastElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul[id='sortablebox']>:nth-child(6)")));
        return lastElement.getText();
    }

    public void close(){
        driver.close();
    }
}
