package basicweb;

import org.junit.jupiter.api.TestTemplate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HoveringMethods {

    public static WebDriver driver;
    public static String baseURL = "https://learn.letskodeit.com/p/practice";

    @BeforeClass
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void cleanUpTest() {
        driver.close();
    }

    @Test
    public void tryThis() throws InterruptedException {
        WebElement mouseSkill = driver.findElement(By.id("mousehover"));
        Actions act = new Actions(driver);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(3000);
        act.moveToElement(mouseSkill).perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).perform();
        Thread.sleep(3000);
        act.click().build().perform();
    }

    @Test
    public void testSwitchToWindows() throws Exception {
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(5000);
        // Save the parent window
        String parentWindow = driver.getWindowHandle();
        // Grab all the windows
        Set<String> windows = driver.getWindowHandles();
        // Switch to the new window
        for (String wind : windows) {
            if (!wind.equals(parentWindow)) {
                driver.switchTo().window(wind);
                Thread.sleep(5000);
                driver.findElement(By.id("search-courses")).sendKeys("Python");
                driver.findElement(By.id("search-course-button")).click();
                Thread.sleep(5000);
            }
        }
        Thread.sleep(5000);
        driver.switchTo().window(parentWindow);
    }
}





