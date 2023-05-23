package com.qascript.utils;

import com.qascript.BaseClass;
//import Assert;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BrowserUtils extends BaseClass {

    static Properties properties = PropertyUtil.loadFrameworkProperties();

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void hoverElement(String element1, String element2){
        WebElement e1 = findAndWaitForElement(element1);
        WebElement e2 = findAndWaitForElement(element2);

        Actions actions = new Actions(driver);
        actions.moveToElement(e1).click(e2).build().perform();
    }
    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){
        String timeout = properties.getProperty("timeout.maximum");
        Long duration = Long.parseLong(timeout);
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }

    public static void validateText(String element, String expectedText){

        System.out.println("element:" + element + " | expected:" + expectedText);
        String actualText = findAndWaitForElement(element).getText();
        System.out.println("element:" + element + " | actual:" + actualText);

        Boolean boo = actualText.equals(expectedText);
        System.out.println(boo.toString());
        Assert.isTrue(actualText.equals(expectedText), "Actual does not match expected");
    }
}
