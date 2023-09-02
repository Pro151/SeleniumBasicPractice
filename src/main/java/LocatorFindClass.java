import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LocatorFindClass extends LocatorsClass {
    public void LocatorFindings() throws InterruptedException {

        WebDriver driver = cnfigFile();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("inputUsername"));
        userName.sendKeys("PromitQAE");
        String password = getPassword(driver);
        WebElement passWord = driver.findElement(By.name("inputPassword"));
        passWord.sendKeys(password);
        WebElement pressButton = driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]"));
        pressButton.click();
        WebElement errorLogin = driver.findElement(By.xpath("//p[@class=\"error\"]"));
        System.out.println(errorLogin.getText());

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
        String inputText = getRstPwd.getText();
        System.out.println(inputText);

        //Pattern pattern = Pattern.compile("temporary password "(.*?)\"");
        //Matcher matcher = pattern.matcher(inputText);

        /*if (matcher.find()) {
            String extractedText = matcher.group(1);
            System.out.println("Extracted text: " + extractedText);
        } else {
            System.out.println("Pattern not found.");
        }*/

        try {
            Thread.sleep(Duration.ofSeconds(10).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






        /*WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement errorLogin =driver.findElement(By.xpath("//p[@class=\"error\"]"));

        // Wait for the error message to be visible and contain expected text
        wait.until(ExpectedConditions.visibilityOf(errorLogin));
        String expectedErrorMessage = "* Incorrect username or password";
        wait.until(ExpectedConditions.textToBePresentInElement(errorLogin, expectedErrorMessage));*/

        driver.quit();


    }

    public static String getPassword(WebDriver driver) throws InterruptedException{
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

        return password;

    }


}
