package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    //browser opening method
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //finding forgotyourpassword link element
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String actualMessage=driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();
        String expectedMessage="Forgot your password?";
        //Validate actual and expected message
        Assert.assertEquals("Forgot your password?","Forgot your password?");
    }
    @After
    public void teardown(){
          closeBrowser();
    }
}


