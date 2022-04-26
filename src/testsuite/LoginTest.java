package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    //browser opening method
    @Before
    public void setUp(){
         openBrowser(baseUrl);
    }
    //browser closing method
    @After
    public void teardown(){
         closeBrowser();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //finding username element
        sendTextToElement(By.id("txtUsername"),"Admin");
        //finding password element
        sendTextToElement(By.name("txtPassword"),"admin123");
         //finding login button element
        clickOnElement(By.id("btnLogin"));
         //finding actual message element
         String actualResult=getTextFromElement(By.id("welcome"));
        String expectedMessage="Welcome";
        //Validate actual and expected message
        Assert.assertEquals("Welcome","Welcome");
        //printing only first part of the message on console
        System.out.println(actualResult.substring(0,7));


    }

}



