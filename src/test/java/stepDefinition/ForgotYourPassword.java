package stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.mail.MessagingException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import TestBase.DriverManagement;
import TestBase.EmailUtility;
import TestBase.EmailUtility.EmailFolder;
import TestBase.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

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
	 
	 @Given("^user (.+) and (.+) received an email to reset password$")
	 public void verifyEmailRecevied(String username,String password) throws Exception
	 {
		 
		 EmailUtility utl = new EmailUtility(username,password , EmailUtility.EmailFolder.INBOX);
		 //https://conarftqa-cirrusaircraftvpo.cs4.force.com/conaircraft/_nc_external/identity/ui/login/ForgotPasswordInterstitial?r=00DP00000003O41005P0000002JFwOeyJlbmMiOiJBMjU2R0NNIiwiYXVkIjoiMDBEUDAwMDAwMDAzTzQxIiwia2lkIjoie1widFwiOlwiMDBEUDAwMDAwMDAzTzQxXCIsXCJ2XCI6XCIwMkcwQjAwMDAwMDRyWGtcIixcImFcIjpcImZvcmdvdHBhc3N3b3JkdXNlcnRyYW5zaWVudGtleWVuY3J5cHRcIixcInVcIjpcIjAwNVAwMDAwMDAySkZ3T1wifSIsImNyaXQiOlsiaWF0Il0sImlhdCI6MTU2Nzc2Nzc2Mzk4MSwiZXhwIjowfQ%3D%3D..lwKAHJPHJZQgkZ1J.oTSdmG5Yr50wFF1UPzuEfhlxc_i-0u6z__A_yZeoQ9062-YDbV2pxyThqAATXe7q7aDYFkpnI-2FFKhJEA%3D%3D.i0g5Qu2tMHuryiBcZCdjmg%3D%3D&display=page&fpot=fd364fc2-df28-437e-b608-312293be46026799a7ae-b14b-4565-835f-8bb0522e37ad
          List<String> links  = utl.printAllLinksFromEmail("Sandbox: Your new Connected Aircraft password", "Click Here", 2, true);
          //driver.navigate().to(linktext);	
          System.out.println(links.size());
		 for (String linktext : links) {
			//System.out.println(linktext);
			 /*
			  * creating chrome browser object temporary and closing post completeting work.
			  */
			 DesiredCapabilities cap =  new DesiredCapabilities();
			 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
			 AndroidDriver<AndroidElement> driver1 =  new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver1.get(linktext);
			wait.waitForGivenTime(30);
			driver1.findElement(By.xpath(".//input[@title='Reset Password']")).click();
			driver1.close();
		}
		 
	 }
	 

	 
}
