package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailAndPassWord {

    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/login.html";
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        email.sendKeys("AdinaIsAStinky@hotmail.com");
        password.sendKeys("GangStuff");
        Thread.sleep(2000);

        email.clear();
        password.clear();

        driver.close();
        driver.quit();

    }
}
