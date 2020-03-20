package basicweb;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeClass;

public class TestiNGDemo {

    @BeforeClass()
    public void TryThisOne(){
        System.out.println("All prisoners ready up for execution!");
    }

    @Test()
    public void ThisIsTheTest(){
        System.out.println("PRISONER 1 HAS BEEN EXECUTED");
    }

    @Test()
    public void ThisIsTheSecondTest() {
        System.out.println("PRISONER TWO HAS BEEN EXECUTED!");
    }

    @AfterClass()
    public void SecondChance(){
        System.out.println("ALL PRISONERS HAVE BEEN MURDERED");
    }

    @Before()
    public void ExecutionStatement(){
        System.out.println("BRING IN THE NEXT PRISONER");
    }

    @After()
    public void WeirdWaysToLearn(){
        System.out.println("Confirm KIA");
    }

}
