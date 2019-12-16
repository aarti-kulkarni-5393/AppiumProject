package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.DriverManagement;
import TestBase.Waits;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InviteUsers {
	
	private AndroidDriver<AndroidElement> driver;
	private Waits wait;
	
	public InviteUsers() throws IOException {
		// TODO Auto-generated constructor stub
		driver = DriverManagement.getInstance("real","");
		wait = new Waits();
	}
	
	
	
	@Then("^User navigate to invite user screen$")
	public void navigateToInviteUserScree()
	{
		wait.waitForGivenTime(30);
		// click on bottom menu
		//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp:id/bottom_sheet_hamburger']")).click();
		//QA
	    driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.qa:id/bottom_sheet_hamburger']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Manage Additional Users\"]")).click();
		
	}
	
	 @When("^User submit details of additional user firstname (.+) ,lastname (.+),email(.+),airctaft(.+)$")
	    public void submitAdditionalUserDetails(String firstname, String lastname, String email, String airctaftName) throws Throwable {
	     
		 wait.waitForGivenTime(30);
		 // check user is on invite screen
		 if(driver.findElement(By.xpath("//android.widget.TextView[@text=\"Additional User Details\"]")).isDisplayed())
		 {
			 driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.qa:id/add']")).click();
			 wait.waitForGivenTime(30);
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_first_name']")).sendKeys(firstname);
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_last_name']")).sendKeys(lastname);
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_email']")).sendKeys(email);
			 
			 //write code to select aircraft
			 driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.cirrusaircraft.connectedapp:id/aircraft_spinner']")).click();
			 //check list opens
			 if(driver.findElement(By.className("android.widget.ListView")).isDisplayed())
			 {
				 // now select aircrat from list
				 
				 List<AndroidElement> list_airctaft = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/item_text']"));
				 System.out.println(list_airctaft.size());
				 for (AndroidElement aircraft : list_airctaft) {
					 System.out.println(aircraft.getText());
					 System.out.println(aircraft.getText().equals(airctaftName));
					 if(aircraft.getText().equals(airctaftName))
					 {
						 System.out.println(aircraft.getText());
						 aircraft.click();
						 break;
					 }
					
				}
			 }
			 // select role by default 
			 //check aircraft is selected 
	         if(!driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp:id/item_text']")).getText().equals("Select Aircraft"))
	         {
	        	// click on role select drop down
				 driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.cirrusaircraft.connectedapp:id/role_spinner']")).click();
		         //check list view displayed
				 if(driver.findElement(By.className("android.widget.ListView")).isDisplayed())
				 {
					 driver.findElement(By.xpath("//android.widget.TextView[@text='Aircraft Co-Owner']")).click();
				 }
	         }
	         
	         if(driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.cirrusaircraft.connectedapp:id/send_invite']")).isEnabled())
	         {
	        	 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.cirrusaircraft.connectedapp:id/send_invite']")).click();
	         }
			 
	         wait.waitForGivenTime(30);
	         //toaster validations
	         // back button
	         driver.findElement(By.className("android.widget.ImageButton")).click();
		 
		 }
	    }

	 @Then("^user should get error message$")
	    public void user_should_get_error_message() throws Throwable {
		 
		 WebElement btn = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.cirrusaircraft.connectedapp:id/et_email']/[@clickable='true']"));
		 btn.click();
		 
	    }

}
