package com.testingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description
    @Test

    public void test_Selenium03()
    {

        //Selenium 3
        //you need to set up the Driver(browser)
       // System.getProperties("webdriver.gecko.driver","/path/geckodriver");

        //Selenium 4
        //Selenium Manager - its a utility that can download the driver automatically
        //start and stop itself

        EdgeDriver driver  = new EdgeDriver();
        driver.get("https://google.com");








    }
}
