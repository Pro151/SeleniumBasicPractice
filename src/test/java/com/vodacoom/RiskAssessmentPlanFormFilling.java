package com.vodacoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiskAssessmentPlanFormFilling extends RiskAssessmentPlanLoading{

    public void riskPlanForm() throws InterruptedException {

        WebDriver driver = RisKAssessmentMethod();
        WebElement name = driver.findElement(By.xpath("//input[@aria-label=\"Name\"]"));
        name.sendKeys("Test_Auto_08091993");
        Thread.sleep(500);
        WebElement persPect = driver.findElement(By.xpath("//span[@aria-label=\"Perspective\"]"));
        persPect.click();
        Thread.sleep(1000);
        WebElement persPectSelectDrpdown = driver.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[1]"));
        persPectSelectDrpdown.click();
    }
}
