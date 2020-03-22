package basicweb;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Test4Movements {

    public static WebDriver driver;
    public static String baseURL;

    @BeforeClass
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        baseURL = "https://learn.letskodeit.com/p/practice";
        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        System.out.println("This is the website and we logged in");
        driver.navigate().back();
        System.out.println("Now we went back");

    }

    @AfterClass
    public void CleanUP(){
        driver.quit();
        driver.close();
    }
}

