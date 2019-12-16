package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.springframework.util.SystemPropertyUtils;

import TestBase.DriverManagement;
import TestBase.PropertyReader;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends TestBase{
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	
 public Login() throws IOException {
	// TODO Auto-generated constructor stub
	 //instantinaite driver
	 /*
	  * For Temporary purpose instantiniating driver in constructor
	  * //this.driver=driver;
	  */
	 
	  driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
     wait = new Waits();
}
	
	
	@Given("^User is on landing page$")
	public void verifyUserIsOnLandingPage() throws MalformedURLException
	{
		/*
		 * first check if user is on landing page if not then redirect it landing page by logging out
		 */
		
		wait.waitForGivenTime(60);
		if(driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).isDisplayed())
		{
			System.out.println("Yes user is on landing page");
		    
		}
			
	}
	
	@Then("^User navigate to sign in page$")
	public void userNavigateToLoginPage()
	{
		/*
		 * Remember This step can be used in any feature so make sure it is complete and not dependent on any step
		 * Hence adding step to check yes it is on landing page
		 */
		if(!driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).isDisplayed())
		{
			System.out.println("No user is not on landing page");
		}
		//This will click on login button on landing page which will redirect it to sign iin page
		driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).click();
		wait.waitForGivenTime(60);
	}
	
	@When("^User enter username (.+) and password (.+)$")
	public void enterUserNameAndPassword(String username,String password)
	{
		/*
		 * Remember This step can be used in any feature so make sure it is complete and not dependent on any step
		 * Hence adding step to check yes it is on sign in page
		 */
        wait.waitForGivenTime(60);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:username']")).sendKeys(username);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:password']")).sendKeys(password);
		
		
	}
	
	@And("^User submit the details$")
	public void userSubmitDetails()
	{
		/*
		 * This steps can't be used sepratatly as it is dependent on previous step
		 */
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Sign In\"]")).click();
		wait.waitForGivenTime(60);
	}
	
	@Then("^User should \\\"([^\\\"]*)\\\" logged in to application$")
	public void verifyUSerLoggedIn(String status)
	{
		/*
		 * VErify it is logged in
		 */
		try {
		if(driver.findElement(By.xpath("//android.view.View[@text=\"TERMS AND CONDITIONS\"]")).isDisplayed())
		{
			/*
			 * if accept terms are coming accept and go ahead
			 */
			driver.findElement(By.xpath("//android.widget.Button[@text=\"Accept\"]")).click();
			wait.waitForGivenTime(30);
			if(driver.findElement(By.xpath("//android.view.View[@text='Allow Access?']")).isDisplayed())
			{
				driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
			}
			
		}}catch (Exception e) {
			System.out.println("this is not first time user");
			if(status.equalsIgnoreCase("be succesfully"))
			{
				if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/label_my_hanger']")).isDisplayed())
				{
					System.out.println("Yes succesfully logged in");
				}
			}else if(status.equalsIgnoreCase("not be succesfully"))
			{
				verifyUserIsOnLoginPage();
			}
		}
		
	}


    @And("^User should get (.+) informative message$")
    public void verifyUserGetInformativeMessage(String message) throws Throwable {
        
        AndroidElement messageElement = driver.findElement(By.xpath("//android.view.View[@text='"+message+"']"));
        System.out.println(messageElement.getText());
        if(messageElement.isDisplayed())
        {
        	System.out.println("yes displayed");
        	
        }
        
        
}
    @Given("^User is on sign in page$")
    public void verifyUserIsOnLoginPage()
    {
    	wait.waitForGivenTime(30);
    	//driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:username']"))
    	
		if(!propertyObj.findMobileElement("xpath", objectRepository.getProperty("Username")).isDisplayed())
		{
		
			System.out.println("No user is not on sign in page");
			/*
			 * if user is logged in then will logout
			 */
			
			
		}
    	
    }
    
    
	
}
