package com.qascript;

import com.qascript.utils.PropertyUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;

    public static void initializeDriver() {
        Properties properties = PropertyUtil.loadApplicationProperties();
        String url = properties.get("applicationURL").toString();
//        System.out.println(url);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
