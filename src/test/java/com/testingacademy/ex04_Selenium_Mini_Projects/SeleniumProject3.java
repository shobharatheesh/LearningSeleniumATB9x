package com.testingacademy.ex04_Selenium_Mini_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject3 {

    @Description("Verify that with invalid email, error message is shown on the https://vwo.com/free-trial/?")
    @Test

    public void test__free_trial() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial");

        //Find the business email and verify the invalid email address

       //<input
        // class="W(100%) Py(14px) input-text invalid-input"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required=""
        // data-gtm-form-interact-field-id="0">

        WebElement email_address = driver.findElement(By.id("page-v1-step1-email"));
        email_address.sendKeys("aaaaaaadddd");

        //Click on the checkbox button

        //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox" name="gdpr_consent_checkbox"
        // id="page-264cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="1">

        WebElement checkbox = driver.findElement(By.id("page-264cu-gdpr-consent-checkbox"));
        checkbox.click();

        //find the create account button and then click on the button

        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit"
        // value="">
        // Create a Free Trial Account
        // </button>

        WebElement button_createaccount = driver.findElement(By.className("btn-modal-form-submit"));
        button_createaccount.click();

        //Verify the error message

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");


        Thread.sleep(3000);
        driver.quit(); // It will close all the tabs. - session id == null

    }


}
