package com.qascript.utils;

import com.qascript.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BrowserUtils extends BaseClass {

    static Properties properties = PropertyUtil.loadFrameworkProperties();

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){
        String timeout = properties.getProperty("timeout.maximum").toString();
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.getInteger(timeout)));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }
}
