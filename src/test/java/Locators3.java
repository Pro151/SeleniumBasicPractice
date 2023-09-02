import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators3 {



    public static void main(String[] args) {

// TODO Auto-generated method stub



        System.setProperty("webdriver.edge.driver", "C:\\Users\\promitmukherjee\\Downloads\\MISC\\Learning\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());









    }



}

