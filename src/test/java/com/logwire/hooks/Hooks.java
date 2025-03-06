package com.logwire.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.logwire.tools.DriverTool;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp() {
        // System.out.println("**** Before Scenrio ******");
        DriverTool.setupDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        // System.out.println("**** After Scenrio ******");
        // Prendre une capture d'ecran au cas d'echec du scenario
        if (scenario.isFailed()) {
            try {

                WebDriver driver = DriverTool.getDriver();
                if (driver != null) {
                    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", "Capture d'écran");
                }
            } catch (Exception e) {
                System.err.println("Erreur lors de la capture d'écran: " + e.getMessage());
            }
        }
        DriverTool.quitDriver();
    }

}
