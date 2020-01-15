package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.Assert;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.util.SystemPropertyUtils;

import TestBase.DriverManagement;
import TestBase.Log;
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
	
	//private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	private Scrolling scroll;
	private Log log;
	private boolean isPDRSuccess;
	private HashMap<String, String> oldData;
	public Dashboard() throws IOException {
		// TODO Auto-generated constructor stub
		//driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
		wait = new Waits();
		scroll = new Scrolling();
		log = new Log(Dashboard.class);
	}
	
	
	@Given("^User is on My Hangar screen$")
	public void verifyUserIsOnMyHangarScreen()
	{
		wait.waitForGivenTime(40);
		
		//if(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/label_my_hanger']")).isDisplayed())
		try {
			if(driver.findElement(By.xpath("//android.widget.TextView[@text='MY HANGAR']")).isDisplayed())
			{
				log.info("user is logged in and now on my hangar screen");
				
			}
		}catch (Exception e) {
			// User navigates to My hangar page
			findMobileElement("xpath", "HamburgerMenu").click();
			findMobileElement("xpath", "MyHangarMenu").click();
			wait.waitForGivenTime(30);
		}
		
	}
	
	@When("^User log out from the application$")
	public void logout()
	{
		wait.waitForGivenTime(30);
		//click on bottom menu uat
		//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp:id/bottom_sheet_hamburger']")).click();
		//QA
		//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.qa:id/bottom_sheet_hamburger']")).click();
		findMobileElement("xpath", "HamburgerMenu").click();
		//click on logout
		findMobileElement("xpath", "Logout").click();
		//driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Log Out\"]")).click();
		wait.waitForGivenTime(30);
		try {
       
			findMobileElement("xpath", "ConfirmLogoutButton").isDisplayed();
            findMobileElement("xpath", "ConfirmLogoutButton").click();       
		}catch (Exception e) {
			// TODO: handle exception
			wait.waitForGivenTime(30);
			findMobileElement("xpath", "Logout").click();
			findMobileElement("xpath", "ConfirmLogoutButton").isDisplayed();
            findMobileElement("xpath", "ConfirmLogoutButton").click();
		}
        wait.waitForGivenTime(30);
        wait.waitForGivenElement(60, findMobileElement("xpath", "Username"));
        try {
        	findMobileElement("xpath", "Username").isDisplayed();
        	log.info("Successfully logged out");
        }catch (Exception e) {
			// TODO: handle exception
        	wait.waitForGivenTime(40);
        	findMobileElement("xpath", "Username").isDisplayed();
        	log.info("Successfully logged out");
		}
        
        	
        
	}
	
	
	
	@When("^User has access to (.+) aircraft$")
    public Boolean checkAccessToAircraft(String aircraftmodelnumber) throws Throwable {
/*
 * scroll up	
 */
	 scroll.scrollUp();
     Boolean AircraftAccess = true;
     int countOfAircraft =0;
	 String aircraftNAme;
    
	do {
		AndroidElement onscreenAircraft = findMobileElement("xpath", "Aircraft");
		aircraftNAme = onscreenAircraft.getText();
		System.out.println(aircraftNAme);
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
		  System.out.println(aircraftNAme.equalsIgnoreCase(aircraftmodelnumber));
	} while (!aircraftNAme.equalsIgnoreCase(aircraftmodelnumber));
    // check if aicraft is on screen or at bottom of screen
	
	return AircraftAccess;
	}
	
	
    @Then("^User should see aircraft tale number (.+) and model number (.+)$")
    public void verifyTaleNumberAndModelNumber(String aircraftmodelnumber, String aircrafttailenumber) throws Throwable {
        
    	//to verify tail number
    	List <AndroidElement> airctaft_List = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/aircraft_name']"));
    	log.info(String.valueOf(airctaft_List.size()));
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
			log.info(WelcomeText.getText());
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
        
    	String Actual_location = findMobileElement("xpath", "Aircraft_Location").getText();
        //System.out.println(Actual_location);
    	if(Actual_location.equalsIgnoreCase(location))
        {
    		log.info("Location is present on my hangar for particular aircraft");
        }
    	
    }

    @And("^Aircraft module number is (.+)$")
    public void verifyModelNumber(String aircraftmodelnumber) throws Throwable {
        
    	//String ModelNUmber = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_name']")).getText();
    	//System.out.println(ModelNUmber);
    	String ModelNUmber = findMobileElement("xpath", "AircraftNameOnMyHangar").getText();
    	if(ModelNUmber.equalsIgnoreCase(aircraftmodelnumber))
        {
    		log.info("Location is present on my hangar for particular aircraft");
        }
    
    }


    @And("^User should see Last updated date and time is (.+)$")
    public void vrifyLastUpdatedDateTime(String lastupdateddatetime) throws Throwable {
        
       String ActualDateTime = findMobileElement("xpath", "LastUpdatedTime").getText();
       log.info(ActualDateTime);
    }
	
	
    @When("^User navigate to dashboard for aircaft (.+)$")
    public void NavigateToGivenAircraft(String aircrafttailnumber) throws Throwable {
        
    	checkAccessToAircraft(aircrafttailnumber);
    	//AndroidElement Aircarft = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_image']"));
    	AndroidElement Aircraft = driver.findElement(By.xpath("//android.widget.TextView[@text='"+aircrafttailnumber+"']"));
    	Aircraft.click();
    	
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
    	
    	String LastSyncDataTime =findMobileElement("xpath", "LastSyncDataTime").getText();
    	// Expected LastSyncDataTime = LAST UPDATED TODAY AT  11:07 AM
    	// Old Last Sync Data = LAST UPDATED JAN 13 2020 AT  4:53 PM
    	/*
    	 * We will check if Today is present in string
    	 */
    	
    	System.out.println(LastSyncDataTime.substring(LastSyncDataTime.indexOf("UPDATED")+1,LastSyncDataTime.indexOf("AT")).trim());
    	String LastSyncDate=LastSyncDataTime.substring(LastSyncDataTime.indexOf("LAST UPDATED")+1,LastSyncDataTime.indexOf("AT")).trim(); 
    	System.out.println(LastSyncDataTime.indexOf("LAST UPDATED") );
    	System.out.println(LastSyncDataTime.indexOf("AT"));
    	OldAircraftVitals.put("LastSyncDate", LastSyncDataTime);
    	
    	try {
    		AndroidElement TKSController = findMobileElement("xpath", "TksController");
    		TKSController.isDisplayed();
    		AndroidElement TKS_Value = findMobileElement("xpath", "TksTotalValue");
    		OldAircraftVitals.put("TKSVALUE", TKS_Value.getText());
    	}catch(Exception e){
    		log.info("No TKS is assigned to user");
    	}
    	
    	try {
    		
    		AndroidElement OxygenController = findMobileElement("xpath", "OxygenController");
    		OxygenController.isDisplayed();
    		AndroidElement Oxygen_Value = findMobileElement("xpath", "OxygentTotalValue");
    		OldAircraftVitals.put("OxygenValue", Oxygen_Value.getText());
    	}catch(Exception e1){
    		log.info("No Oxygen is assigned to user");
    	}
    		
        
    	/*
    	 * Following are fields which will be always present
    	 */
    	AndroidElement Fuel_Quantity = findMobileElement("xpath", "FuelTotalValue");
        OldAircraftVitals.put("FuelValue", Fuel_Quantity.getText());
        AndroidElement Battery_Value = findMobileElement("xpath", "BatteryValue");
        OldAircraftVitals.put("BatteryValue", Battery_Value.getText());
        AndroidElement OilTemp_Value = findMobileElement("xpath", "OilTempValue");
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
    		if(findMobileElement("xpath", "AircraftStatus").isDisplayed())
    		{
    			//System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/aircraft_tail_number']")).getText());
    			if(!findMobileElement("xpath", "TailNumber").getText().equalsIgnoreCase(modelNUmber))
    			Assert.assertFalse(false);
    			
    			log.info("succesfully navigated to dashboard");
    			
    		}
			
		} catch (Exception e) {
			System.out.println("USer is not properly navigated to dashboard");
			// TODO: handle exception
		}
    	/*
    	 * Here its taking old data to verify it is updated on refreshing dashboard data
    	 */
    	 oldData = getAllAircraftVitalsFromDashboardForGivenAircraft();
    	
    	for (String keys : oldData.keySet()) {
			
    		log.info(keys+"   "+oldData.get(keys));
		}
         
    	
   
    }
	
	
    @When("^User has not access to (.+) aircraft$")
    public void noAccessForAircraft(String aircrafttailnumber) throws Throwable {
        boolean isAccess = checkAccessToAircraft(aircrafttailnumber);
        Assert.assertTrue("Access is not there", isAccess);
        
    }
	
    @When("^User refresh dashboard for updated aircraft vitals$")
    public void refreshingDashboardToUpdateAircraftVitals() throws Throwable
    {
    	//Calling refresh dashboard method
    	isPDRSuccess =refreshDashboard();
    	
    }
    @Then("^Dahsboard should be updated with latest aircraft vitals$")
    public void verifyDashboardresults() throws Throwable {
    	
    	log.info(String.valueOf(isPDRSuccess));
    	verifyResultsOnDashboard(isPDRSuccess,oldData);
    }
    
    public void verifyResultsOnDashboard(boolean isSuccess,HashMap<String, String> oData)
    {
    	HashMap<String, String> beforeRefreshData = oData;
    	if(isSuccess)
    	{
    		log.info("PDR request is succesfull hence verify data should be updated");
    		 /*
    		  * On success check last updated date /time is Today and Data is updated with latest data
    		  */
    	     HashMap<String, String> updatedData = getAllAircraftVitalsFromDashboardForGivenAircraft();
    	     for (String keys : updatedData.keySet()) {
    				
    	    		log.info(keys+"   "+updatedData.get(keys));
    			}
    	     
    	   if((!beforeRefreshData.get("LastSyncDate").equalsIgnoreCase(updatedData.get("LastSyncDate"))) && updatedData.get("LastSyncDate").contains("Today"))
    	   {
                 
    		   if((!updatedData.equals(beforeRefreshData)))
    		   {
    			   checkTwoMapVitals(beforeRefreshData, updatedData);
    			   Assert.assertTrue(true);
    		   }else {
    			   Assert.assertTrue(false);
    		   }
              
    		   
    	   }
    			
    	}else {
    		
    		
    	}
    	
    }
    
    public boolean refreshDashboard() throws Throwable {
    	//Using swipe functionality to refresh
    	log.info("pulling down to refresh");
    	new Scrolling().swipe(findMobileElement("xpath", "AircraftStatus"), findMobileElement("xpath", "Hours"));
    	try {
    		findMobileElement("xpath", "RefreshDataConfirmationPopUp").isDisplayed();
    		
    	}catch (Exception e) {
			// TODO: handle exception
    		log.info("confirmation pop up have not displayed");
    		log.info("Lets try ,Will again refresh for new data");
    		new Scrolling().swipe(findMobileElement("xpath", "AircraftStatus"), findMobileElement("xpath", "Hours"));
    		
		}
//    	if(findMobileElement("xpath", "TextOnRefreshDataConfirmationPopUp").getText().equalsIgnoreCase(""))
//		{
//			log.info("Text on confirmation pop up is verfied and it is as expected");
//		}else{
//			log.info("Text on confirmation pop up is verfied and it is not as expected");
//		}
			findMobileElement("xpath", "ConfirmButton").click();
			log.info("started refreshing data");
			int expectedStatusCount =3;
			int actualStatusCount =0;
			boolean isPDRRequestDone = false;
			/*
			 * here 5 min max time required to update data
			 * after 5 min either it will fail or pass ---> static wait can work but its too long and sometimes it update data early
			 * hence all checks are added.
			 * It will check all required status messages are coming and check is process still running if yes wait till it finished
			 */
			try {
			wait.waitForGivenElement(60,findMobileElement("xpath", "pdrStatus") );
			
             while (findMobileElement("xpath", "pdrStatus").isDisplayed()) {
				
                	//findMobileElement("xpath", "pdrStatus").isDisplayed();
                	String currentStatus = findMobileElement("xpath", "pdrStatus").getText();
                	System.out.println(actualStatusCount);
                	System.out.println(currentStatus);
                	if(currentStatus.contains("Connection established"))
                	{
                		if(actualStatusCount==0)
                		  actualStatusCount++;
                		
                		log.info("waiting till next status comes");
                		wait.waitForGivenTime(30);
                		
                	}else if(currentStatus.contains("Processing information")){
                		
                		if(actualStatusCount==1)
                    	   actualStatusCount++;
                    		
                    	log.info("waiting till next status comes");
                    	wait.waitForGivenTime(60);
                		
                		
                	}else if(currentStatus.contains("Aircraft status updated")) {
                		
                		log.info("status updated");
                		actualStatusCount++;
                		break;
                	}
                		
                	
                }
			}catch(Exception e2) {
				log.info("Either PDR request is completed or failed");
			}
			
			if(actualStatusCount==expectedStatusCount)
			{
				log.info("All status are displayed");
				log.info("Will check results");
				isPDRRequestDone=true;
			}else {
				findMobileElement("xpath", "FailedPDRStatusBar").isDisplayed();
				findMobileElement("xpath", "ClosePDFailedBar").click();
				isPDRRequestDone=false;
			}
					
		
			return isPDRRequestDone;
    }
    
    public boolean checkTwoMapVitals(HashMap<String, String> old,HashMap<String, String> latest)
    {
    	boolean isMatch = true;
    	for (String keys : old.keySet()) {
			
    		if(!latest.get(keys).equalsIgnoreCase(old.get(keys)))
    		{
    			isMatch=false;
    			log.info(keys + " Latest Data "+latest.get(keys)+" Old Data"+old.get(keys) );
    			
    		} else
    		{
    			isMatch=true;
    		}
    			
    		
		}
    	return isMatch;
    }
    
   
}
	
	

