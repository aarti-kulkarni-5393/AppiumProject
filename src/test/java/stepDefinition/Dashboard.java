package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.junit.Assert;
import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.util.SystemPropertyUtils;

import TestBase.DriverManagement;
import TestBase.PropertyReader;
import TestBase.Scrolling;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.bytebuddy.matcher.ModifierMatcher.Mode;

public class Dashboard extends TestBase{
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	private Scrolling scroll;
	public Dashboard() throws IOException {
		// TODO Auto-generated constructor stub
		propertyObj = new PropertyReader();
		  driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
		wait = new Waits();
		scroll = new Scrolling();
	}
	
	
	@Given("^User is on My Hangar screen$")
	public void verifyUserIsOnMyHangarScreen()
	{
		wait.waitForGivenTime(60);
		
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
    public Boolean checkAccessToAircraft(String aircraftmodelnumber) throws Throwable {
/*
 * scroll up	
 */
	 scroll.scrollUp();
     Boolean AircraftAccess = false;
     int countOfAircraft =0;
	 String aircraftNAme;
    //System.out.println(onscreenAircraft.getText());
	do {
		AndroidElement onscreenAircraft = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_key']"));
		aircraftNAme = onscreenAircraft.getText();
		if(aircraftNAme.equalsIgnoreCase(aircraftmodelnumber))
			break;
		   scroll.verticalScroll();
		   //scroll.pull();
		   if(countOfAircraft>=20)
		   {
			   AircraftAccess=false;
			   break;
			   
		   }
		   countOfAircraft++;
	} while (aircraftNAme.equalsIgnoreCase(aircraftmodelnumber));
        
    return AircraftAccess;
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
    
    @Then("^User should see Locaton of aircraft is (.+)$")
    public void verifyLocationOnMyHangar(String location) throws Throwable {
        
    	String Actual_location = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_location']")).getText();
        //System.out.println(Actual_location);
    	if(Actual_location.equalsIgnoreCase(location))
        {
        	System.out.println("Location is present on my hangar for particular aircraft");
        }
    	
    }

    @And("^Aircraft module number is (.+)$")
    public void verifyModelNumber(String aircraftmodelnumber) throws Throwable {
        
    	String ModelNUmber = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_name']")).getText();
    	//System.out.println(ModelNUmber);
    	if(ModelNUmber.equalsIgnoreCase(aircraftmodelnumber))
        {
        	System.out.println("Location is present on my hangar for particular aircraft");
        }
    
    }


    @And("^User should see Last updated date and time is (.+)$")
    public void vrifyLastUpdatedDateTime(String lastupdateddatetime) throws Throwable {
        
       String ActualDateTime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/last_updated_time']")).getText();
       System.out.println(ActualDateTime);
    }
	
	
    @When("^User navigate to dashboard for aircaft (.+)$")
    public void NavigateToGivenAircraft(String aircrafttailnumber) throws Throwable {
        
    	checkAccessToAircraft(aircrafttailnumber);
    	AndroidElement Aircarft = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_image']"));
    	Aircarft.click();
    	
    }
    
	/*
	 * We will check whic fields are available for Given aircraft and take all vitals in map
	 * 
	 */
	/*
	 * Will take all required fields check elements here
	 */
    
    public HashMap<String, String> getAllAircraftVitalsFromDashboardForGivenAircraft()
    {

    	
    	HashMap<String, String> OldAircraftVitals = new HashMap<String, String>();
    	
    	try {
    		AndroidElement TKSController = driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tks_container']"));
        	AndroidElement OxygenController = driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/oxygen_container']"));
    		
    		if(TKSController.isDisplayed())
    		{
    	        AndroidElement TKS_Value = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tks_value_total']"));
    	        OldAircraftVitals.put("TKSVALUE", TKS_Value.getText());
    			
    		}
    		
    			if (OxygenController.isDisplayed()) {
    				AndroidElement Oxygen_Value = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/oxygen_value_total']"));
    		        OldAircraftVitals.put("OxygenValue", Oxygen_Value.getText());
    				
    			}
			
		} catch (Exception e) {
			
			System.out.println("No oxygen and TKS is assigned to user");
		}
    	/*
    	 * Following are fields which will be always present
    	 */
    	AndroidElement Fuel_Quantity = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/fuel_value_total']"));
        OldAircraftVitals.put("FuelValue", Fuel_Quantity.getText());
        AndroidElement Battery_Value = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/battery_value']"));
        OldAircraftVitals.put("BatteryValue", Battery_Value.getText());
        AndroidElement OilTemp_Value = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/oil_temp_value']"));
        OldAircraftVitals.put("OilTempValue", OilTemp_Value.getText());
        //AndroidElement FlihtHours = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/et_flight_hours']"));
        //OldAircraftVitals.put("FlighHours", FlihtHours.getText());
        
               

        return OldAircraftVitals;
    
    }
	
    @And("^User verify dashboard is displayed with all required aircraft vitals for aircraft (.+)$")
    public void verifyAndGetAircraftVitals(String modelNUmber) throws Throwable {
        
    	/*
    	 * It will verify and get old data and keep it in map
    	 */
    	try {
    		if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/logo_aircraft_status']")).isDisplayed())
    		{
    			System.out.println("succesfully navigated to dashboard");
    			if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/logo_aircraft_status']")).getText().equalsIgnoreCase(modelNUmber))
    			Assert.assertFalse(false);	
    			
    		}
			
		} catch (Exception e) {
			System.out.println("USer is not properly navigated to dashboard");
			// TODO: handle exception
		}
    	HashMap<String, String> oldData = getAllAircraftVitalsFromDashboardForGivenAircraft();
    	
    	for (String keys : oldData.keySet()) {
			
    		System.out.println(keys+"   "+oldData.get(keys));
		}
         
    	
   
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
