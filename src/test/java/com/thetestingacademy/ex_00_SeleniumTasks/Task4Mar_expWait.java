package com.thetestingacademy.ex_00_SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task4Mar_expWait {
    @Test
    public void verify_vwo_login_explicitWait(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-username\"]")));
        email.sendKeys("admin@admin.com");

        WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-password\"]")));
        password.sendKeys("admin");

        WebElement SignInButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"js-login-btn\"]")));
        SignInButton.click();

        WebElement errorMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"js-notification-box-msg\"]")));
        String actualMessage=errorMessage.getText();


        Assert.assertEquals(actualMessage,"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
