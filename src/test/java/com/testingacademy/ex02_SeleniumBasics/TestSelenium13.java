package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13 {

    @Description("Open the app")
    @Test

    public void test_Selenium13() throws Exception
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //use navigation methods
        driver.navigate().to("https://bing.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        //driver.close();

        driver.quit();
        
    }
}
