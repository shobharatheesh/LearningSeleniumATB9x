package com.testingacademy.ex08_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium21InvalidSelectorException {

    //Orange CRM example

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Description
    @Test
    public void test_actions() throws Exception {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //give wrong syntax of xpath, then we get the invalid selector exception

        WebElement  username = driver.findElement(By.xpath("//input[@placeholder='Username'][1000"));
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






