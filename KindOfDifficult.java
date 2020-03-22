package basicweb;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.Element;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class KindOfDifficult {
    private static Object Element;

    //public static WebDriver driver;

    public static void main(String[]args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        sel.selectByValue("benz");
        sel.selectByValue("honda");
        Thread.sleep(2000);

        }
    }
