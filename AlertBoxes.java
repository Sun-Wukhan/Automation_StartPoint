package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertBoxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

