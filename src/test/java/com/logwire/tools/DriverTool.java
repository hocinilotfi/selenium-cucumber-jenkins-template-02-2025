package com.logwire.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTool {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setupDriver() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        switch (browser) {
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless=new");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "chrome":
            default:
                // ChromeOptions chromeOptions = new ChromeOptions();
                // chromeOptions.addArguments("--headless=new");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                driver = WebDriverManager.chromedriver().capabilities(options).create();
                // WebDriverManager.chromedriver().setup();
                // driver = new ChromeDriver(chromeOptions);
                break;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
