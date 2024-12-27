package com.testingacademy.ex03_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_AddExtension {

    @Description("Option class")
    @Test
     public void test_selenium16() throws Exception
    {
        //chrome browser
        ChromeOptions chromeoptions = new ChromeOptions();
        //chromeoptions.addArguments("--window-size=1280, 720");
        chromeoptions.addArguments("--window-size=800, 600");
        chromeoptions.addArguments("--incognito");
        chromeoptions.addArguments("--start-maximized");
        //chromeoptions.addArguments("--headless");
        chromeoptions.addExtensions(new File("src/test/java/com/testingacademy/ex03_Selenium_Options_Locators/AdBlock.crx"));

        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://youtube.com");

        Thread.sleep(30000);
        driver.close();




    }
}
