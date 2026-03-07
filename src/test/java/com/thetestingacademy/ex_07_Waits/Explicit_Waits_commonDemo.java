package com.thetestingacademy.ex_07_Waits;

import com.thetestingacademy.ex_00_SeleniumTasks.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Explicit_Waits_commonDemo extends CommonToAll {
    @Test
    @Description("Implicit_Waits demo")
    public void test_verify_implicit_waits() {
        WebDriver driver=new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        waitForVisibility(driver,20,"//span[@data-cy='closeModal']");
        clickElementFound("//span[@data-cy='closeModal']");
        waitForJVM(1000);
        closeBrowser(driver);

    }
            }








