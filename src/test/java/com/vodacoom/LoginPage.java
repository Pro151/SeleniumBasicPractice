package com.vodacoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ConfigClass {

    public WebDriver LoginMethod() throws InterruptedException {

        WebDriver driver = configMethod();
        WebElement loginE = driver.findElement(By.xpath("//font[text()=\"System User Login\"]"));
        loginE.click();
        WebElement uName = driver.findElement(By.name("username"));
        uName.sendKeys("SYSTEMI");
        WebElement pWd = driver.findElement(By.name("passwordHolder"));
        pWd.sendKeys("welcome*12");
        WebElement loginBtn = driver.findElement(By.id("passwordLoginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        return driver;
    }

}
