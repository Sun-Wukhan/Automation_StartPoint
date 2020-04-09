import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    public static WebElement element = null;

    public static WebElement emailBox(WebDriver driver) {
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement passwordBox(WebDriver driver) {
        element = driver.findElement(By.id("pass"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {
        element = driver.findElement(By.id("u_0_2"));
        return element;

    }

    public static WebElement writePassWord(WebDriver driver) {
        element = passwordBox(driver);
        element.sendKeys("Gang");
        return element;
    }

    public static void clickOnEmailBox(WebDriver driver) {
        element = emailBox(driver);
        element.sendKeys("Navid_Khan@iCloud.com");
    }
}

