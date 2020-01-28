package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
					 log.info("unable to click on Add user");
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
				 
				 List<AndroidElement> list_airctaft = findMobileElements("list_Aircrafts");
						 //driver.findElements(By.xpath("list_Aircrafts"));
				 log.info(String.valueOf(list_airctaft.size()));
				 for (AndroidElement aircraft : list_airctaft) {
					log.info(aircraft.getText());
					log.info(String.valueOf(aircraft.getText().equals(airctaftName)));
					 if(aircraft.getText().equalsIgnoreCase(airctaftName))
					 {
						log.info(aircraft.getText());
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
	        	 log.info("Aircarft is selected");
	         }}catch (Exception e) {
				// TODO: handle exception
	        	 log.info("aircarft is not selected");
			}
			// boolean isInvitationDone =false;
			 
	         if(findMobileElement("xpath", "SendInviteButton").isEnabled())
	         {
	        	 findMobileElement("xpath", "SendInviteButton").click();
                 do {
                	 log.info("In while loop");
					wait.waitForGivenTime(40);
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
	        
		 AndroidElement user =findUserInList(aircrafttailnumber, email);
		 if(user==null) {
			 log.info("element is not present");
		 }else {
			 log.info("user is present"+" "+user.getText());
		 }
		 
		 wait.waitForGivenElement(30, findMobileElement("className", "BackButton"));
		 findMobileElement("className", "BackButton").click();
			
		 
		
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
	    				log.info("we are on manage user screen");
	    			}
				}
	    	

	    }
	    /*
	     * It will find users under list of aircraft
	     */
	    
	  public AndroidElement findUserInList(String tailNumber,String email) throws Throwable
	  {
		  userisOnManageUSerPage();
		  String AircraftName = "";
		  List<AndroidElement> Aircarfts = findMobileElements("AircraftsOnManageUserScreen");
		  List<AndroidElement> ExpandButtons = findMobileElements("List_ExpandButtons");
		  int displayedUserCount =0;
		  int displayedUserCount_new =0;
		  for(int i=0;i<Aircarfts.size();i++)
		  {
			  if(Aircarfts.get(i).getText().contains(tailNumber))
			  {
				  AircraftName = Aircarfts.get(i).getText();
				  log.info(AircraftName);
				  try {
					  ExpandButtons.get(i).click();
					  displayedUserCount = findMobileElements("ListOfDisplayedInvitedUserCount").size();
	                  log.info(String.valueOf(displayedUserCount));
					  new Scrolling().verticalScroll();
					  wait.waitForGivenTime(50);
					  try {
						  findMobileElement("xpath", "UserListCollaps").isDisplayed();
						  //log.info("Waiting is issue is there");
						  break;
						  
					  }catch (Exception e) {
						// TODO: handle exception
						  try {
						  if(ExpandButtons.get(i).isDisplayed())
						  {
							  log.info("Issue is still there hence again clicking on Expand Button");
							  //driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/iv_expand']")).get(i).click();
		                   	  findMobileElements("List_ExpandButtons").get(i).click();
							  //displayedUserCount = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
		                   	displayedUserCount = findMobileElements("ListOfDisplayedInvitedUserCount").size();
		                   	  break;
						  }
						  }catch (Exception e2) {
							// TODO: handle exception
							  wait.waitForGivenTime(50);
							  //driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.cirrusaircraft.connectedapp.uat:id/iv_expand']")).get(i).click();
							  findMobileElements("List_ExpandButtons").get(i).click();
							  //ExpandButtons.get(i).click();
							  //retryingFindClick(ExpandButtons.get(i), 6);
							  //displayedUserCount = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
							  displayedUserCount = findMobileElements("ListOfDisplayedInvitedUserCount").size();
							  break;
						  }
						  
	                   	  
					}
					  
					  
					  
				  }catch (Exception e) {
						 
		                    log.info("it is working as expected");
		                    //displayedUserCount_new = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
		                    displayedUserCount_new = findMobileElements("ListOfDisplayedInvitedUserCount").size();
		                    break;
		                    
		                    
					  }
				}
				            
               }
			           
                  int InvitedUsersCount =getInvitedUserCount(AircraftName);
                  int final_Count=displayedUserCount+displayedUserCount_new;
                  do {
		        	 if(displayedUserCount!=InvitedUsersCount)
			             { 
			            	 //scrolling
			            	 new Scrolling().verticalScroll();
			            	 //Post scroll,Take new count of users
			            	 //displayedUserCount_new = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.cirrusaircraft.connectedapp.uat:id/ll_view_aircraft_user']")).size();
			            	 displayedUserCount_new = findMobileElements("ListOfDisplayedInvitedUserCount").size();
			            	 //Adding new count of users to existing one which are displayed
			            	 log.info(String.valueOf(displayedUserCount_new));
			            	 final_Count = final_Count+displayedUserCount_new;
			            	 log.info(String.valueOf(final_Count));
			             }
					} while (final_Count<=InvitedUsersCount);

              
		AndroidElement user = null;
         try {
        	 
        	 if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']")).isDisplayed())
        	 {
        		  user = driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']"));
        	 }
         }catch (Exception e) {
			// TODO: handle exception
        	 log.info("User is not present on list");
        	 new Scrolling().verticalScroll();
        	 user = driver.findElement(By.xpath("//android.widget.TextView[@text='"+email+"']")); 
		}
			
         return user;
         }
	  
       public int GetTotalCountOfInvitedUsers(String aircraftName)
       {
    	   wait.waitForGivenTime(30);
    	   List<AndroidElement> Aircarfts = findMobileElements("AircraftsOnManageUserScreen");
    	   String AircraftName ="";
    	   int count =0;
    	   for(int i=0;i<Aircarfts.size();i++)
    	   {
    		   if(Aircarfts.get(i).getText().contains(aircraftName))
    		   {
    			   AircraftName=Aircarfts.get(i).getText();
    			   log.info(String.valueOf(getInvitedUserCount(AircraftName)));
    			   count = getInvitedUserCount(AircraftName);
    			   break;
    		   }
    	   }
    	   
    	   
    	    return count;
    		   
       }
       
       @When("^User deletes invited user (.+) access for aircarft (.+)$")
       public void deleteUserFromList(String email,String aircrafttailnumber) throws Throwable {
           wait.waitForGivenTime(60);
           int userCount=0;
           int postDeleteUserCount=0;
           try {
        	   while(findMobileElement("xpath", "Progressbar").isDisplayed())
        	   {
        		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	   }
           }catch (Exception e) {
			// TODO: handle exception
        	   userCount = GetTotalCountOfInvitedUsers(aircrafttailnumber);
               //log.info(userCount);
        	     
		}
           //int userCount = GetTotalCountOfInvitedUsers(aircrafttailnumber);
           //log.info(userCount);
           AndroidElement userToDelete = findUserInList(aircrafttailnumber, email);
           if(userToDelete==null)
           {
        	   log.info("Make sure user is invited,At present its not on list");
           }else {
        	   
        	   new Scrolling().longPress(userToDelete, 2);
        	   try {
        		   findMobileElement("xpath", "DeleteUserConfirmationPopup").isDisplayed();
        		   findMobileElement("xpath", "YesButton").click();
        	   }catch (Exception e) {
				// TODO: handle exception
        		   new Scrolling().longPress(userToDelete, 3);
        		   findMobileElement("xpath", "DeleteUserConfirmationPopup").isDisplayed();
        		   findMobileElement("xpath", "YesButton").click();
        		   
			}
        	   
           }
           wait.waitForGivenTime(30);
           int expectedUserCount = userCount-1;
           try {
        	   while(findMobileElement("xpath", "Progressbar").isDisplayed())
        	   {
        		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	   }
           }catch (Exception e) {
			// TODO: handle exception
        	   wait.waitForGivenTime(30);
        	    postDeleteUserCount = GetTotalCountOfInvitedUsers(aircrafttailnumber);
        	   log.info("Post"+" "+postDeleteUserCount);
        	     
		}
           
           
           findMobileElement("className", "BackButton").click();
           Assert.assertTrue("user is deleted", postDeleteUserCount==expectedUserCount);
           
           
    	   
       }
       
      public int getInvitedUserCount(String aircraftName)
      {
    	  String AircraftName=aircraftName;
    	  log.info(AircraftName);
    	  int openingBracketIndex=AircraftName.indexOf("(");
          int closingBracketIndex=AircraftName.indexOf(")");
          //log.info(String.valueOf(openingBracketIndex));
          String Total_count = AircraftName.substring(openingBracketIndex+1, closingBracketIndex);
          log.info(Total_count);
          return Integer.valueOf(Total_count);
      }
	  }


