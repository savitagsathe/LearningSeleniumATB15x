package com.thetestingacademy.ex_00_SeleniumTasks;

import org.openqa.selenium.WebDriver;


public class BasePage {
    protected WebDriver driver;
    protected WaitHelper waitHelper;   // ← must be declared

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitHelper = new WaitHelper(driver);
    }
}
