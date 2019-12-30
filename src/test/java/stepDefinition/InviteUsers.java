package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Streams.DoubleFunctionWithIndex;

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
	     
		 wait.waitForGivenTime(60);
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
			// boolean isInvitationDone =false;
			 
	         if(findMobileElement("xpath", "SendInviteButton").isEnabled())
	         {
	        	 findMobileElement("xpath", "SendInviteButton").click();
                 do {
                	 System.out.println("In while loop");
					wait.waitForGivenTime(30);
				} while (!findMobileElement("xpath", "SelectedAircraftText").getText().equalsIgnoreCase("Select Aircraft"));     		
	        	
	        	findMobileElement("className", "BackButton").click();
	        	wait.waitForGivenTime(30);
                wait.waitForGivenElement(50, findMobileElement("className", "BackButton"));
                findMobileElement("className", "BackButton").click();
	    
	        	 
	        	 //wait.waitForGivenElement(60, findMobileElement("xpath", "Progressbar"));         }
	        
	         }
		  
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
	    
	  public AndroidElement findUserInList(String tailNumber,String email) throws Throwable
	  {
		 System.out.println("In find user");
		 userisOnManageUSerPage();
		  String AircraftName = "";
		  List<AndroidElement> Aircarfts = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tv_aircraft_name_label']"));
		  List<AndroidElement> ExpandButtons = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/iv_expand']"));
		  for(int i=0;i<Aircarfts.size();i++)
		  {
			  if(Aircarfts.get(i).getText().contains(tailNumber))
			  {
				  AircraftName = Aircarfts.get(i).getText();
				  System.out.println("Given aircraft is"+AircraftName);
				  ExpandButtons.get(i).click();
				  int displayedUserCount = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
				  wait.waitForGivenTime(50);
                  new Scrolling().verticalScroll();
                  try {
                	findMobileElement("xpath", "UserListCollaps").isDisplayed();
                	System.out.println("done");
                  }catch (Exception e) {
					// TODO: handle exception
                     
                	 ExpandButtons.get(i).click();
				}
			  }
		  }

//				
//				{	
//					
//					
//					wait.waitForGivenTime(50);
//					System.out.println("waited");
//					try {
//						findMobileElement("xpath", "UserListCollaps").isDisplayed();
//						System.out.println("expanded");
//					}catch (Exception e) {
//						// TODO: handle exception
//						ExpandButtons.get(i).click();
//						System.out.println("in catch block");
//					}
//						//System.out.println("List is open,We can proceed");
//							//wait.waitForGivenTime(60);
//						
//					         //Taking total count of users 
//					    int openingBracketIndex=AircraftName.indexOf("(");
//					         int closingBracketIndex=AircraftName.indexOf(")");
//					         String Total_count = AircraftName.substring(openingBracketIndex+1, closingBracketIndex);
//					         System.out.println(displayedUserCount);
//					         int final_Count=0;
//					         //scroll till last user comes
//					         do {
//					        	 if(displayedUserCount!=Integer.valueOf(Total_count))
//					             { 
//					            	 //scrolling
//					            	 new Scrolling().verticalScroll();
//					            	 //Post scroll,Take new count of users
//					            	 int displayedUserCount_new = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
//					            	 //Adding new count of users to existing one which are displayed
//					            	 final_Count = displayedUserCount+displayedUserCount_new;
//					            	 System.out.println(final_Count);
//					             }
//							} while (final_Count<=Integer.valueOf(Total_count));
//
//							
//						}
//						
//					}
		  
		  //wait.waitForGivenTime(60);
		  //List<AndroidElement> listOfUsers = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/tv_aircraft_user_email']"));
		  //System.out.println(listOfUsers.size());
		  
		  //Count of users displayed now on screen
//         int displayedUserCount = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
//         //Taking total count of users 
//         int openingBracketIndex=AircraftName.indexOf("(");
//         int closingBracketIndex=AircraftName.indexOf(")");
//         String Total_count = AircraftName.substring(openingBracketIndex+1, closingBracketIndex);
//         System.out.println(Total_count);
//         int final_Count=0;
//         //scroll till last user comes
//         do {
//        	 if(displayedUserCount!=Integer.valueOf(Total_count))
//             { 
//            	 //scrolling
//            	 new Scrolling().verticalScroll();
//            	 //Post scroll,Take new count of users
//            	 int displayedUserCount_new = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
//            	 //Adding new count of users to existing one which are displayed
//            	 final_Count = displayedUserCount+displayedUserCount_new;
//            	 System.out.println(final_Count);
//             }
//		} while (final_Count<=Integer.valueOf(Total_count));
         
		AndroidElement user = null;
         try {
        	 
        	 if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']")).isDisplayed())
        	 {
        		  user = driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']"));
        	 }
         }catch (Exception e) {
			// TODO: handle exception
        	 System.out.println("User is not present on list");
        	 new Scrolling().verticalScroll();
        	 user = driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']")); 
		}
			
         return user;
         }
	  }


