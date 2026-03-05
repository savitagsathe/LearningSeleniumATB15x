package com.thetestingacademy.ex_00_SeleniumTasks;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class WaitHelper {
    WebDriverWait wait;

    public WaitHelper(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
