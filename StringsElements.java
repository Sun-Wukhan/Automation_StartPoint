package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class StringsElements {

        public static void main(String[] args) {
            String baseUrl = "http://demo.guru99.com/test/newtours/";
            System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseUrl);
            WebElement Square = driver.findElement(By.linkText("Home"));
            WebElement td_Home = driver
                    .findElement(By
                            .xpath("//html/body/div"
                                    + "/table/tbody/tr/td"
                                    + "/table/tbody/tr/td"
                                    + "/table/tbody/tr/td"
                                    + "/table/tbody/tr"));

            Actions p1 = new Actions(driver);
            Action hoverHand = p1.moveToElement(Square).build();

            String backlight = td_Home.getCssValue("background-color");
            System.out.println("Before hover: " + backlight);
            hoverHand.perform();
            backlight = td_Home.getCssValue("background-color");
            System.out.println("After hover: " + backlight);
            driver.close();
        }
    }