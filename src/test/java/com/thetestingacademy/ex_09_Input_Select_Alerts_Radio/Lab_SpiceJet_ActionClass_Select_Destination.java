package com.thetestingacademy.ex_09_Input_Select_Alerts_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab_SpiceJet_ActionClass_Select_Destination {
    @Test
    public void spiceJetTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[text()='To']"));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(source).click().sendKeys("BLR")
                .moveToElement(destination).sendKeys("DEL")
                .build().perform();


    }
}
