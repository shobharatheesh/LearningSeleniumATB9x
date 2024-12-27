package com.testingacademy.ex03_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium14 {

    @Description("Option class")
    @Test
     public void test_selenium14() throws Exception
    {
        //edge browser
        EdgeOptions edgeoptions = new EdgeOptions();
        //edgeoptions.addArguments("--window-size=1280, 720");
        edgeoptions.addArguments("--window-size=800, 600");
        edgeoptions.addArguments("--incognito");
        edgeoptions.addArguments("--start-maximized");
        edgeoptions.addArguments("--headless");

        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://google.com");

        Thread.sleep(15000);
        driver.close();




    }
}
