import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RedAlert {

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
    public void closerMove() {
        driver.close();
    }

    @Test (priority = 0)
    public void alertBox() throws InterruptedException {
        WebElement nom = driver.findElement(By.id("name"));
        nom.sendKeys("Broski");
        Thread.sleep(2000);

        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        nom.clear();
        //alert.dismiss();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void confirmBox() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Not Broski");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String huh = alert.getText();
        alert.accept();
        System.out.println(huh);

    }

}
