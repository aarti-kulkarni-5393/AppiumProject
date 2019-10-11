package stepDefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;

import TestBase.DriverManagement;
import TestBase.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgotYourPassword {
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	
	public ForgotYourPassword() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		
		driver = DriverManagement.getInstance("real");
		wait = new Waits();
		
	}
	
	
	
	@And("^User navigate to forgot your password page$")
	public void navigateToForgotYourPasswordPage()
	{
		//click on forgot your password link 
		driver.findElement(By.xpath("//android.view.View[@text=\"Forgot Your Password?\"]")).click();
		wait.waitForGivenTime(60);
		
	}
	
	@When("^User provide usernae (.+) to reset password$")
    public void enterUsernameToResetPassworrd(String username) throws Throwable {
       
		wait.waitForGivenTime(30); 
		//check user is on forgot your password page
		if(driver.findElement(By.xpath("//android.view.View[@text=\"FORGOT YOUR PASSWORD?\"]")).isDisplayed())
		{
			System.out.println("Yes i am on forgot password page");
			// enter username
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='forgotPassword:forgotForm:forgot-email']")).sendKeys(username);
			//check if button is enabled if yes then click
			if(driver.findElement(By.xpath("//android.widget.Button[@text=\"Continue\"]")).isEnabled())
			{
				//click continue button
				driver.findElement(By.xpath("//android.widget.Button[@text=\"Continue\"]")).click();
			}
		}
		}
	
	 @Then("^User should be displayed with confirmation screen$")
	 public void verifyConfirmationScreen() throws MalformedURLException
	 {
		wait.waitForGivenTime(30); 
		//verify confirmation screen is coming
		 if(driver.findElement(By.xpath("//android.view.View[@text=\"CHECK YOUR MAIL\"]")).isDisplayed())
		 {
			 driver.findElement(By.xpath("//android.widget.Button[@text=\"CLOSE\"]")).click();
			 Login login = new Login();
			 login.verifyUserIsOnLoginPage();
			 Assert.assertTrue(true);
		 }
		 
	 }

	 
	 
	 
}
