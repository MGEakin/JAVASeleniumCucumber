package com.qascript;

import com.qascript.utils.PropertyUtil;
import org.openqa.selenium.WebDriver;

import static com.qascript.utils.GetBrowserDriver.getBrowserDriver;

import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    static Properties appProperties = PropertyUtil.loadApplicationProperties();
    static Properties frameworkProperties = PropertyUtil.loadFrameworkProperties();

    public static void initializeDriver() {
        String url = appProperties.get("applicationURL").toString();
        String browser = frameworkProperties.getProperty("browser.driver");
        driver = getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
