package com.testingacademy.ex07_ActionClassAdvance;

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

public class Selenium20CRM {

    //Orange CRM example

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        edgeOptions.setAcceptInsecureCerts(true); //accepts insecure certificates
        driver = new EdgeDriver(edgeOptions);

    }

    @Description
    @Test
    public void test_actions() throws Exception {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement  username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Admin");

        WebElement  password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement  login = driver.findElement(By.className("orangehrm-login-button"));
        login.click();

        Thread.sleep(3000);

        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.getTitle();
        System.out.println(driver.getTitle());

        WebElement user = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        user.sendKeys("sree");

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(user).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();


    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}






