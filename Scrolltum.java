import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Scrolltum {

    WebDriver driver;
    String baseURL = "https://learn.letskodeit.com/p/practice";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");

    }

    @AfterMethod
    public void quitThat() {
        driver.close();
    }

    @Test
    public void emailTime() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bmwcheck")));
        button.click();
        System.out.println(button);
        Thread.sleep(2000);

    }
}

