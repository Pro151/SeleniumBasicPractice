import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);

        /*for(int i=0;i<=3;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }*/

        int i=1;

        while(i<5){

            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.xpath("//input[@value=\"Done\"]")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.xpath("(//input[@value=\"Departure City\"])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@text=\"Bengaluru (BLR)\"]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value=\"CCU\"])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
    }
}
