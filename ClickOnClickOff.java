package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickOnClickOff {

    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/radio.html";
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement button1 = driver.findElement(By.id("vfb-7-1"));
        button1.click();
        System.out.println("This button is selected: " + button1.isSelected());


        driver.close();

        }

    }
