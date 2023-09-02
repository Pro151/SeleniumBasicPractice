import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WindowActivities {



    public static void main(String[] args) {

// TODO Auto-generated method stub



        System.setProperty("webdriver.edge.driver", "C:\\Users\\promitmukherjee\\Downloads\\MISC\\Learning\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().to("https://rahulshettyacademy.com");

        driver.navigate().back();

        driver.navigate().forward();
        driver.navigate().back();


    }



}

