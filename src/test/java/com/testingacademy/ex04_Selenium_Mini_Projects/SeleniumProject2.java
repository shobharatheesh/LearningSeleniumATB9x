package com.testingacademy.ex04_Selenium_Mini_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumProject2 {

    @Description("Clicking on link ---> Start a free trial")
    @Test

    public void test_start_free_trial_link() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //Click on the link - start a free trial once the login page is opened
        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>

        //Link text - full text match

       // WebElement a_tag_free_trail_linktext = driver.findElement(By.linkText("Start a free trial"));
        //a_tag_free_trail_linktext.click();

        //Partial link text

        WebElement tag_free_partialtext= driver.findElement(By.partialLinkText("Start"));
        tag_free_partialtext.click();


        Thread.sleep(3000);
        driver.quit(); // It will close all the tabs. - session id == null

    }


}
