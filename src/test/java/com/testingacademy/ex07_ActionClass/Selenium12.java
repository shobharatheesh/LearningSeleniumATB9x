package com.testingacademy.ex07_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium12 {


    WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest--");
        driver = new EdgeDriver(edgeoptions);

    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws Exception{

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

        //keyboard
        //keydown+shift --->sendkeys
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"Shobha").keyUp(Keys.SHIFT).perform();


    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
