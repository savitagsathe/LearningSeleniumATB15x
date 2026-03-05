package com.thetestingacademy.ex_07_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Explicit_Waits {
    @Test
    @Description("Implicit_Waits demo")
    public void test_verify_implicit_waits() {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        // //span[@data-cy='closeModal']
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModel.click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
            }








