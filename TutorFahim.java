package basicweb;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.*;

public class TutorFahim {

    @BeforeTest
    public void dummyBeforeTest(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void dummyBeforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void dummyBeforeMethod(){
        System.out.println("before method");
    }

    @AfterTest
    public void dummyAfterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public void dummyAfterClass(){
        System.out.println("after class");
    }

    @AfterMethod
    public void dummyAfterMethid(){
        System.out.println("after method");
    }

    @Test
    public void testMethodOne(){
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethodTwo(){
        System.out.println("test method 2");
    }
}
