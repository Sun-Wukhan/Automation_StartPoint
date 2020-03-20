package basicweb;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.concurrent.TimeUnit;

public class LetsKodeIt {

    @Test()
    public void TryThisWebsite(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String baseURL = "https://learn.letskodeit.com/p/practice" ;
        driver.get(baseURL);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gangshit");
        driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
        driver.findElement(By.cssSelector("[value='orange']")).click();
        driver.findElement(By.xpath("//select[@id='carselect']")).click();
        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();








    }
}

