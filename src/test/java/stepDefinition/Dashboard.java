package stepDefinition;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import TestBase.DriverManagement;
import TestBase.Scrolling;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Dashboard extends TestBase{
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	private Scrolling scroll;
	
	public Dashboard() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		driver = DriverManagement.getInstance("real");
		wait = new Waits();
		scroll = new Scrolling();
	}
	
	
	@Given("^User is on My Hangar screen$")
	public void verifyUserIsOnMyHangarScreen()
	{
		wait.waitForGivenTime(60);;
		
		//if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/label_my_hanger']")).isDisplayed())
		if(driver.findElement(By.xpath("//android.widget.TextView[@text='MY HANGAR']")).isDisplayed())
		{
			System.out.println("user is logged in and now on my hangar screen");
			
		}
	}
	
	@When("^User log out from the application$")
	public void logout()
	{
		wait.waitForGivenTime(30);
		//click on bottom menu uat
		//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp:id/bottom_sheet_hamburger']")).click();
		//QA
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.qa:id/bottom_sheet_hamburger']")).click();
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
	
     //AndroidElement element1 =  driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\");");
     //AndroidElement element =  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"N336HT\");");
     int size_aircrafts = driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id='com.cirrusaircraft.connectedapp:id/hanger_holder']")).size();
     System.out.println(size_aircrafts);
     
     while(size_aircrafts!=1)
     {
    	 int i=1;
    	 AndroidElement Aircraft = driver.findElement(By.xpath("(//android.view.ViewGroup)["+i+"]"));
    	 AndroidElement aircraftName = (AndroidElement) Aircraft.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/aircraft_key']"));
    	 System.out.println(aircraftName.getText());
    	 if(!aircraftName.getText().equalsIgnoreCase(aircraftmodelnumber))
    	 {
           //add scroll
    	   Scrolling scroll = new Scrolling();
    	   scroll.scrollToElement("N336HT", true);
    		
    	 }else {
    		 
    	 }
    	 
    	 i++;
    	 size_aircrafts--;
    	 
     }
	
	}
	
	
    @Then("^User should see aircraft tale number (.+) and model number (.+)$")
    public void verifyTaleNumberAndModelNumber(String aircraftmodelnumber, String aircrafttailenumber) throws Throwable {
        
    	//to verify tail number
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
    	verifyUserAccessToAircraft(aircrafttailenumber);
    	
    	
    }
    @Then("^User Should see (.+) with its (.+)$")
    public void user_should_see_with_its(String welcome, String username) throws Throwable {
       
    	AndroidElement WelcomeText = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/welcome_user']"));
    	if(WelcomeText.getText().equalsIgnoreCase(welcome))
		{
			System.out.println(WelcomeText.getText());
			Assert.assertTrue(true);
		}else {
			
			Assert.assertTrue(false);
		}	
    }
    
    @Then("^User should have access to (.+) aircraft$")
    public void verifyUserAccessToAircraft(String aircrafttalenumber) throws Throwable {
    	        
        //scrollTo("com.cirrusaircraft.connectedapp:id/aircraft_list", "SR22T");
    	//scroll.scrollWithGetChild();
    	//AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"N336HT\"]"));
    	//scroll.scrollByJavascript(element);
    	List <AndroidElement> airctaft_List = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/hanger_holder']"));
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
