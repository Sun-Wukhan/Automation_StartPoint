import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class ForTheFahim extends SearchPage {

    WebDriver driver;
    String baseURL = "https://www.facebook.com/";

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
    }

    @Test (priority = 0)
    public void hereWeGo() throws InterruptedException {
        SearchPage.emailBox(driver).sendKeys("navid_khan@Icloud.com");
        Thread.sleep(2000);

    }
    @Test (priority = 1)
    public void roundTwo() throws InterruptedException {
        SearchPage.writePassWord(driver);
        Thread.sleep(2000);
    }


    @AfterTest
    public void quitThat() {
        driver.close();
    }
}


