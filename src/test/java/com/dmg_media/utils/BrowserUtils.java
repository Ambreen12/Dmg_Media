package com.dmg_media.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public  static  void waitForElementDisplayed(WebElement element){
        Driver. getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
         WebDriverWait  wait= new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
