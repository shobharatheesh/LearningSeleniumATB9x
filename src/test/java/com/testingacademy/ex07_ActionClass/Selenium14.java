package com.testingacademy.ex07_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium14 {

    //spice jet example

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
        driver = new EdgeDriver(edgeoptions);
    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws Exception{

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").perform();




    }



     @AfterTest
    public void closeBrowser() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
     }
}