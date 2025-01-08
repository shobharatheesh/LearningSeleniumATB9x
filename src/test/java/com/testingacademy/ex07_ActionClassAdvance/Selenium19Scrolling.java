package com.testingacademy.ex07_ActionClassAdvance;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium19Scrolling {

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

        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //actions.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
        System.out.println("Scrolling Down");

        Thread.sleep(3000);

        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        System.out.println("Scrolling up");






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



