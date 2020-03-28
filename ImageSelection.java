package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageSelection {

    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.facebook.com/login/identify?ctx=recover";
        driver.get(baseURL);
        driver.findElement(By.cssSelector("a[title='Go to Facebook home'']")).click();

        if (driver.getTitle().equals("Facebook Log in")){
            System.out.println("You're on facebook home");
        } else {
            System.out.println("Not on Facebook bro");
        }
        driver.close();

    }
}
