package com.vodacoom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigClass {

    public WebDriver configMethod(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://vodacomuat.a04b.metricstream.com/metricstream/auth/dualLogin.jsp");
        driver.manage().window().maximize();

        return driver;
    }

    public void HelperMethod(){


    }

}
