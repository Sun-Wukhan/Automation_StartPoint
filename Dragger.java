package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Dragger {

    public static void main(String[]args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement from = driver.findElement(By.id("sourceImage"));
        WebElement to = driver.findElement(By.id("targetDiv"));

        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();

        act.doubleClick();
        act.
    }
}
