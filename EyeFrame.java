import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EyeFrame {

    WebDriver driver;
    String baseURL = "https://learn.letskodeit.com/p/practice";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeDisShitDown(){
        driver.close();
    }

    @Test
    public void iFrameTime() throws InterruptedException {
        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.id("search-courses")).sendKeys("python");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }
}
