package stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import TestBase.DriverManagement;
import TestBase.Waits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Dashboard {
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	public Dashboard() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		driver = DriverManagement.getInstance("real");
	}
	
	
	@Given("^User is on dahsboard$")
	public void verifyUserIsOnDashboard()
	{
		wait.waitForGivenTime(60);;
		if(driver.findElementByClassName("android.widget.ImageButton").isDisplayed())
		{
			System.out.println("user is logged in and now on Dahsboard");
			
		}
	}
	
	@When("^User log out from the application$")
	public void logout()
	{
		wait.waitForGivenTime(60);;
		if(!driver.findElementByClassName("android.widget.ImageButton").isDisplayed())
		{
			System.out.println("user is not logged iin");
			
		}
		
		//click on menu
		driver.findElement(By.className("android.widget.ImageButton")).click();
		System.out.println("clciked on menu");
		if( driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Logout']")).isDisplayed())
		{
			System.out.println("displayed ");
			//click on logout button
			driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Logout']")).click();
			System.out.println("clciked on logout");
		}
		
        
        /*
         * Wait till pop up is coming
         */
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(driver.findElement(By.xpath("//android.widget.Button[@text=\"CONFIRM\"]")).isDisplayed())
        {
        	driver.findElement(By.xpath("//android.widget.Button[@text=\"CONFIRM\"]")).click();
        	
        }
        wait.waitForGivenTime(60);;
        if(driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:username']")).isDisplayed())
        {
        	System.out.println("Successfully logged out");
        }
		
	}

}
