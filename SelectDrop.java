package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectDrop {

    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        String baseurl = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(baseurl);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Select dropCountry = new Select(driver.findElement(By.name("country")));
        dropCountry.selectByVisibleText("ANTARCTICA");



    }
}
