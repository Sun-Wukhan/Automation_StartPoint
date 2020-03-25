package basicweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class DropDownMenu {


    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        Select sel = new Select(dropdown);
        sel.selectByVisibleText("Database Testing");
        Thread.sleep(2000);
        sel.selectByIndex(1);
        Thread.sleep(2000);


    }
}



