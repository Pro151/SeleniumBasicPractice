import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class LocatorsClass {

    public WebDriver cnfigFile() {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\promitmukherjee\\Downloads\\MISC\\Learning\\Java\\Auto\\Webdriver\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\promitmukherjee\\Downloads\\MISC\\Learning\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;
    }
}
