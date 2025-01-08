package com.testingacademy.ex07_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium15MakeMyTrip {

    //makemytrip example

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver(edgeOptions);
    }


    @Description
    @Test
    public void test_actions() throws Exception{

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        //span[@data-cy="closeModal"]

        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close_modal.click();

       WebElement from_city = driver.findElement(By.xpath("//input[@id='fromCity']"));
       from_city.click();

       Thread.sleep(3000);

       WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
       from.sendKeys("del");


       Actions actions = new Actions(driver);
       Thread.sleep(3000);
       //actions.moveToElement(from_city).click().sendKeys("del").build().perform();
      // Thread.sleep(3000);
       actions.moveToElement(from_city).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();





    }










   @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }


}
