import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LocatorResearch extends LocatorsClass{

    public void getPassword(){

        WebDriver driver = cnfigFile();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement forgorPwd = driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]"));
        forgorPwd.click();
        try {
            Thread.sleep(Duration.ofSeconds(10).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement rstPwd = driver.findElement(By.cssSelector("button.reset-pwd-btn"));
        rstPwd.click();
        WebElement getRstPwd = driver.findElement(By.cssSelector("p.infoMsg"));
        String inputText=getRstPwd.getText();
        System.out.println(inputText);

        String[] passwordArray =inputText.split("'");
        String password = passwordArray[1].split("'")[0];

    }
}
