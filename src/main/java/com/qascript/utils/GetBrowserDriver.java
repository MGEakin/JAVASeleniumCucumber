package com.qascript.utils;

import com.qascript.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetBrowserDriver extends BaseClass {
    public static WebDriver getBrowserDriver(String browser){
        if(browser != null){
            if(browser.equalsIgnoreCase("chrome")){
                driver = setChromeDriver();
            }
            else if(browser.equalsIgnoreCase("firefox")){
                driver = setFirefoxDriver();
            }
            else{
                driver = setIEDriver();
            }
        }
        return driver;
    }

    public static WebDriver setChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver setFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
    public static WebDriver setIEDriver(){
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }
}
