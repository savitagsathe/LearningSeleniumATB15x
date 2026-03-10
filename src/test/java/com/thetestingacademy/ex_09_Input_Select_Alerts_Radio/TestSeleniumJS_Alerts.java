package com.thetestingacademy.ex_09_Input_Select_Alerts_Radio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.thetestingacademy.ex_00_SeleniumTasks.WaitHelper.*;

public class TestSeleniumJS_Alerts {
    @Test
    public void testalerts() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement jsAlertElement = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        WebElement jsConfirmAlertElement = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement jsPromptAlertElement = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));

        //1.click on the js alert btn
        //jsAlertElement.click();

        //2.click on the jsConfirmAlertElement
        //jsConfirmAlertElement.click();

        //3.click on the jsPromptAlertElement
       jsPromptAlertElement.click();

        //wait for alert pop up
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
        //wait using common utility
        waitForAlert(driver, 5);

        //hit ok btn of pop up
        Alert alert = driver.switchTo().alert();
        //alert.accept();//1.have only ok btn so accept() only

        //2.have only ok and cancel btn so accept() and dissmiss()
        //alert.accept();
        //alert.dismiss();

        //3.enter the text and hit only ok so accept()
        alert.sendKeys("savita");
        alert.accept();
        //result verification
        String actualResult = driver.findElement(By.id("result")).getText();
        //1.
        //Assert.assertEquals(actualResult, "You successfully clicked an alert");
        //2.
        //System.out.println();Assert.assertEquals(actualResult, "You clicked: Ok");

        //3.
        System.out.println();Assert.assertEquals(actualResult, "You entered: savita");

        waitJVM(2000);
        closeBrowser(driver);


    }
}
