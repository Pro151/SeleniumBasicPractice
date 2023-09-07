package com.vodacoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiskAssessmentPlanLoading extends LoginPage{

    public WebDriver RisKAssessmentMethod() throws InterruptedException {

        WebDriver driver = LoginMethod();
        Thread.sleep(3000);
        WebElement settingsClick= driver.findElement(By.xpath("//a[@data-title=\"Settings\"]"));
        settingsClick.click();
        Thread.sleep(3000);
        WebElement enterpriseClick = driver.findElement(By.xpath("//a[@title=\"Enterprise Risk\"]"));
        enterpriseClick.click();
        Thread.sleep(2000);
        WebElement riskAssessmentclick = driver.findElement(By.xpath("//a[text()=\" Risk Assessments\"]"));
        riskAssessmentclick.click();
        Thread.sleep(1000);
        WebElement formClickRcsa = driver.findElement(By.xpath("(//span[text()=\" Forms\"])[1]"));
        formClickRcsa.click();
        Thread.sleep(3000);
        //WebElement rcsaPlanClick = driver.findElement(By.xpath("(//a[text()=\"Risk Assessment Plan\"])[1]"));
        WebElement rcsaPlanClick = driver.findElement(By.xpath("(//a[@aria-label=\"Open Form Risk Assessment Plan\"])[1]"));
        rcsaPlanClick.click();
        Thread.sleep(25000);

        return driver;


    }
}
