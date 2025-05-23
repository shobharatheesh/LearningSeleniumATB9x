package com.testingacademy.ex07_ActionClassAdvance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium19FileUpload {

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

        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement file_upload1 =driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

        file_upload1.sendKeys(working_dir +"/src/test/java/com/testingacademy/ex07_ActionClassAdvance/AdBlock1.crx");
        //file_upload1.sendKeys("D:/practice/SeleniumLearning/LearningSeleniumATB9x/src/test/java/com/testingacademy/ex07_ActionClass/AdBlock1.crx");
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

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



