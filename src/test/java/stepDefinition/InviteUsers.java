package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.DriverManagement;
import TestBase.Scrolling;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InviteUsers extends TestBase {
	
	//private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	public InviteUsers() throws IOException {
		// TODO Auto-generated constructor stub
		//driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
		//driver = DriverManagement.getInstance("real","");
		wait = new Waits();
	}
	
	
	
	@Then("^User navigate to invite user screen$")
	public void navigateToInviteUserScreen()
	{
		wait.waitForGivenTime(30);
		// click on bottom menu
		//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp:id/bottom_sheet_hamburger']")).click();
		//QA
		findMobileElement("xpath", "HamburgerMenu").click();
	    //driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/bottom_sheet_hamburger']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Manage Additional Users\"]")).click();
		
		
	}
	
	 @When("^User submit details of additional user firstname (.+) ,lastname (.+),email(.+),airctaft(.+)$")
	    public void submitAdditionalUserDetails(String firstname, String lastname, String email, String airctaftName) throws Throwable {
	     
		 wait.waitForGivenTime(90);
		 // check user is on invite screen
			 findMobileElement("xpath", "AddNewUser").click();
			 try {
			 if( findMobileElement("xpath", "FirstName").isDisplayed())
			 {
				 findMobileElement("xpath", "FirstName").sendKeys(firstname);
				 findMobileElement("xpath", "LastName").sendKeys(lastname);
				 findMobileElement("xpath", "Email").sendKeys(email);
			 }
			 }catch (Exception e) {
				// TODO: handle exception
				 if(findMobileElement("xpath", "AddNewUser").isDisplayed())
				 {
					 System.out.println("unable to click on Add user");
					 findMobileElement("xpath", "AddNewUser").click();
					 findMobileElement("xpath", "FirstName").sendKeys(firstname);
					 findMobileElement("xpath", "LastName").sendKeys(lastname);
					 findMobileElement("xpath", "Email").sendKeys(email);
				 }
				 
			}
				 
			 //driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_first_name']")).sendKeys(firstname);
			 //driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_last_name']")).sendKeys(lastname);
			 //driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_email']")).sendKeys(email);
			 
			 //write code to select aircraft
			 findMobileElement("xpath", "AircarftSelectionDropDown").click();
			 //check list opens
			 if(driver.findElement(By.className("android.widget.ListView")).isDisplayed())
			 {
				 // now select aircrat from list
				 
				 List<AndroidElement> list_airctaft = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/item_text']"));
				 System.out.println(list_airctaft.size());
				 for (AndroidElement aircraft : list_airctaft) {
					 System.out.println(aircraft.getText());
					 System.out.println(aircraft.getText().equals(airctaftName));
					 if(aircraft.getText().equalsIgnoreCase(airctaftName))
					 {
						 System.out.println(aircraft.getText());
						 aircraft.click();
						 break;
					 }
					
				}
			 }
			 // select role by default 
			 //check aircraft is selected 
			 try {
	         if(!findMobileElement("xpath", "SelectedAircraftText").getText().equalsIgnoreCase("Select Aircraft"))
	         {
	        	// click on role select drop down
				 //driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.cirrusaircraft.connectedapp:id/role_spinner']")).click();
		         //check list view displayed
//				 if(driver.findElement(By.className("android.widget.ListView")).isDisplayed())
//				 {
//					 driver.findElement(By.xpath("//android.widget.TextView[@text='Aircraft Co-Owner']")).click();
//				 }
	        	 System.out.println("Aircarft is selected");
	         }}catch (Exception e) {
				// TODO: handle exception
	        	 System.out.println("aircarft is not selected");
			}
	         if(findMobileElement("xpath", "SendInviteButton").isEnabled())
	         {
	        	 findMobileElement("xpath", "SendInviteButton").click();
	         }
	      	        
	         wait.waitForGivenTime(30);
	         //toaster validations
	         // back button
	         driver.findElement(By.className("android.widget.ImageButton")).click();
		 
		 }
		

	 @Then("^user should get error message$")
	    public void user_should_get_error_message() throws Throwable {
		 
		 WebElement btn = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_email']/[@clickable='true']"));
		 btn.click();
		 
	    }

	 @And("^Invited user (.+) is present under list of invited users for Aircraft (.+)$")
	    public void verfyUserIsList(String email, String aircrafttailnumber) throws Throwable {
	        
		 findUserInList(aircrafttailnumber, email);
	    }

	    @Given("^User is on Manage users screen$")
	    public void userisOnManageUSerPage() throws Throwable {
	    	
	    	try {
	    		if(!findMobileElement("xpath", "ManageUserPageTitle").isDisplayed())
	    		{
	    			
	    		}}
	    		catch (Exception e) {
					// TODO: handle exception
	    			System.out.println("Verify");
	    			navigateToInviteUserScreen();
	    			if(findMobileElement("xpath", "ManageUserPageTitle").isDisplayed())
	    			{
	    				System.out.println("we are on manage user screen");
	    			}
				}
	    	

	    }
	    /*
	     * It will find users under list of aircraft
	     */
	    
	  public void findUserInList(String tailNumber,String email) throws IOException
	  {
		  wait.waitForGivenTime(60);
		  String AircraftName = "";
		  List<AndroidElement> Aircarfts = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tv_aircraft_name_label']"));
		  List<AndroidElement> ExpandButtons = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/iv_expand']"));
		  System.out.println(Aircarfts.size());
		  System.out.println(ExpandButtons.size());
		  for(int i=0;i<Aircarfts.size();i++)
			{
			  
				if(Aircarfts.get(i).getText().contains(tailNumber))
				{
					System.out.println(Aircarfts.get(i).getText());
					AircraftName = Aircarfts.get(i).getText();
					ExpandButtons.get(i).click();
					break;
				}
			}
		  List<AndroidElement> listOfUsers = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tv_aircraft_user_email']"));
		  
		  System.out.println(listOfUsers.size());
		  
		  while(listOfUsers.size()!=0)
		  {
			 int i=0;
			 if(listOfUsers.get(i).getText().equalsIgnoreCase(email))
			 {
			       listOfUsers.get(i).click();
			       System.out.println("Got aircraft"+listOfUsers.get(i).getText());
			       break;
				  
			 }else {
				 
				 if(i==listOfUsers.size())
				 {
					 System.out.println("searched in all options");
					 new Scrolling().verticalScroll();
					 listOfUsers = driver.findElements(By.xpath("com.cirrusaircraft.connectedapp.uat:id/tv_aircraft_user_email"));
									
				 }
				
				 System.out.println("still seraching");
			 }
			  
			  
			  
			  i++;
		  }
		  
		 
		
		  
		  
	  }

}
