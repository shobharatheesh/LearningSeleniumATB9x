package com.testingacademy.ex08_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium26NoSuchElementException {

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

        //Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

        WebElement  username = driver.findElement(By.xpath("//input[@placeholder='Shobha']"));
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






