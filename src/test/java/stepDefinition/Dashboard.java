package stepDefinition;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import TestBase.DriverManagement;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Dashboard extends TestBase{
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	public Dashboard() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		driver = DriverManagement.getInstance("real");
		wait = new Waits();
	}
	
	
	@Given("^User is on My Hangar screen$")
	public void verifyUserIsOnMyHangarScreen()
	{
		wait.waitForGivenTime(30);;
		if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/lable_my_hanger']")).isDisplayed())
		{
			System.out.println("user is logged in and now on my hangar screen");
			
		}
	}
	
	@When("^User log out from the application$")
	public void logout()
	{
		wait.waitForGivenTime(30);
		//click on bottom menu
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp:id/bottom_sheet_hamburger']")).click();
		//click on logout
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Log Out\"]")).click();
		wait.waitForGivenTime(30);
        if(driver.findElement(By.xpath("//android.widget.Button[@text=\"CONFIRM\"]")).isDisplayed())
        {
        	driver.findElement(By.xpath("//android.widget.Button[@text=\"CONFIRM\"]")).click();
        	
        }
        wait.waitForGivenTime(60);
        if(driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:username']")).isDisplayed())
        {
        	System.out.println("Successfully logged out");
        }
		
	}
	
	
	@When("^User has access to (.+) aircraft$")
    public void checkAccessToAircraft(String aircraftmodelnumber) throws Throwable {
	
		/*
		 * scroll to given aircraft model
		 */
		System.out.println("scrolling to specific element");
		scrollTo("com.cirrusaircraft.connectedapp:id/aircraft_list", aircraftmodelnumber);
		
        
    }

    @Then("^User should see aircraft tale number (.+) and model number (.+)$")
    public void verifyTaleNumberAndModelNumber(String aircraftmodelnumber, String aircrafttalenumber) throws Throwable {
        
    	//to verify model number
    	List <AndroidElement> airctaft_List = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/aircraft_name']"));
    	System.out.println(airctaft_List.size());
    	for (AndroidElement aircraft : airctaft_List) {
			
    		if(aircraft.getText().equalsIgnoreCase(aircraftmodelnumber))
    		{
    			System.out.println(aircraft.getText());
    			Assert.assertTrue(true);
    		}else {
    			
    			Assert.assertTrue(false);
    		}	
		}
    	
    	//to verify tale number
    	verifyUserAccessToAircraft(aircrafttalenumber);
    	
    	
    }
    
    @Then("^User should have access to (.+) aircraft$")
    public void verifyUserAccessToAircraft(String aircrafttalenumber) throws Throwable {
    	
        System.out.println("here checking");
    	List <AndroidElement> airctaft_List = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/aircraft_key']"));
    	System.out.println(airctaft_List.size());
    	for (AndroidElement aircraft : airctaft_List) {
			
    		if(aircraft.getText().equalsIgnoreCase(aircrafttalenumber))
    		{
    			Assert.assertTrue(true);
    		}else {
    			
    			Assert.assertTrue(false);
    		}	
		}
    	 	 	 
         
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
