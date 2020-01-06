package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.springframework.util.SystemPropertyUtils;

import com.aventstack.extentreports.model.Device;

import TestBase.Scrolling;
import TestBase.TestBase;
import TestBase.Waits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidElement;

public class MyProfile extends TestBase{
	private Waits wait;

	public MyProfile() throws IOException {
		super();
		wait = new Waits();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Given("^User is on My profile page$")
    public void veirfyUserIsOnMyProfileScreen() throws Throwable {
        
		try {
			if(findMobileElement("xpath", "UpdateProfileScreenLabel").isDisplayed())
			{
				System.out.println("Yes user is on update profile");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			findMobileElement("xpath", "HamburgerMenu").click();
			findMobileElement("xpath", "MyProfileMenu").click();
			if(findMobileElement("xpath", "UpdateProfileScreenLabel").isDisplayed())
			{
				System.out.println("Yes Navigated,Now user is on update profile");
			}
		}
    }
	
	 @When("^User update first name (.+) ,last name (.+)$")
	    public void updateLastAndFirstName(String firstname, String lastname) throws Throwable {
		   wait.waitForGivenTime(30);
           findMobileElement("xpath", "updateData").click();
           findMobileElement("xpath", "FirstName").sendKeys(firstname);
           findMobileElement("xpath", "LastName").sendKeys(lastname);
           findMobileElement("xpath", "updateProfileButton").click();
           System.out.println("Dtails entered");
           wait.waitForGivenTime(30);
	    }
	 @Then("^User details should be updated to first name (.+) ,Last name (.+)$")
	    public void verifyUserDetailsUpdated(String firstNmae ,String LastName) throws Throwable {
	        wait.waitForGivenTime(30);
	        String updatedUsername = findMobileElement("xpath", "UserNameFromMyProfile").getText();
	        String FinalName = firstNmae+" "+LastName;
	        System.out.println(FinalName);
	        System.out.println(updatedUsername);
	        if(updatedUsername.equalsIgnoreCase(FinalName))
	        {
	        	System.out.println("Details updated");
	        }else {
	        	System.out.println("Details are not updated");
	        }
	        //verify on App Menu
	        //findMobileElement("xpath", "").click();
	        
	        driver.findElement(By.className("android.widget.ImageButton")).click();
			 try {
				 findMobileElement("xpath", "HamburgerMenu").isDisplayed();
			 }catch (Exception e) {
				// TODO: handle exception
				 driver.findElement(By.className("android.widget.ImageButton")).click();
			}
	    }
	 @When("^User upload profile pic from \"([^\"]*)\"$")
	    public void uploadProfilePicture(String uploadOption) throws Throwable {
	        
		 wait.waitForGivenTime(30);
		 findMobileElement("xpath", "updateProfile").click();
		 try {
			 if(findMobileElement("xpath", "AllowButton").isDisplayed())
			 {
				 findMobileElement("xpath", "AllowButton").click();
				 try {
					 if(findMobileElement("xpath", "PermissionMessageForFileAccess").isDisplayed())
					 findMobileElement("xpath", "AllowButton").click();
				 }catch (Exception e) {
					// TODO: handle exception
					 System.out.println("No allow popup came");
				}
				 
				 //findMobileElement("xpath", "PermissionMessage").click();
				 
				 try {
				 if(findMobileElement("xpath", "PanelToChooseProfileImage").isDisplayed())
				 {
					 findMobileElement("xpath", "GalleryOption").click();
					 boolean isprofileSelected = choosePictureFromGallery();
					 findMobileElement("className","BackButton").click();
					 if(isprofileSelected==false)
					 {
						 System.out.println("profile update failed");
					 }else {
						 System.out.println("yes it is true!");
					 }
					 
				 }
				 }catch (Exception e) {
					// TODO: handle exception
					 System.out.println("Profile image is not updated");
				}
			 }
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 
		}
		 
		 
	 }
  
	 
	 public boolean choosePictureFromGallery() throws IOException, InterruptedException
	 {
		 boolean isPictureSelected = false;
		 System.out.println("choosing gallery picture");
		
				 List<AndroidElement> galleryImages =driver.findElements(By.className("com.sec.samsung.gallery.glview.composeView.ThumbObject"));
				 System.out.println(galleryImages.size());
                 for (AndroidElement image : galleryImages) {
					if(image.isDisplayed())
					{
						wait.waitForGivenTime(30);
//						Actions action = new Actions(driver);
//						action.doubleClick(image).build().perform();
						driver.findElements(By.className("com.sec.samsung.gallery.glview.composeView.ThumbObject")).get(0).click();
						
						try {
							 if(findMobileElement("xpath", "EditPhoto").isDisplayed())
								 {
									 System.out.println("edit button is visible");
									 findMobileElement("xpath", "cropDone").click();
									 wait.waitForGivenTime(60);
									  isPictureSelected=true; 
									  break;
								 }}catch (Exception e) {
									// TODO: handle exception
									 e.printStackTrace();
									 System.out.println("No picture is selected");
									  isPictureSelected=false;
									  break;
								
							 
						}
					}
                	 
					
				}
					 	
				 
					
					 return isPictureSelected;
		 
				 
			 
			}
		 
	 @When("^User remove profile picture$")
	    public void removeProfilePicture() throws Throwable {
	      System.out.println("Removing profile picture"); 
		  removePictureFromGallery();
		  
	      
		 
	    }
	 boolean isProfileRemoved=false;
	 public boolean removePictureFromGallery()
	 {
		 System.out.println("This time it will remove profile pictuee");
		 wait.waitForGivenTime(30);
		 findMobileElement("xpath", "updateProfile").click();
		 try {
			 if(findMobileElement("xpath", "AllowButton").isDisplayed())
			 {
				 findMobileElement("xpath", "AllowButton").click();
				 findMobileElement("xpath", "AllowButton").click();
				 //findMobileElement("xpath", "PermissionMessage").click();
				 //findMobileElement("xpath", "PermissionMessageForFileAccess").click();
				 try {
				 if(findMobileElement("xpath", "PanelToChooseProfileImage").isDisplayed())
				 {
					 findMobileElement("xpath", "RemoveOption").click();
					 Thread.sleep(1000);
					 
					 //add code to verify if possible	 
					 isProfileRemoved=true;
				 }
				 }catch (Exception e) {
					// TODO: handle exception
					 System.out.println("Profile image is not updated");
					 isProfileRemoved=false;
				}
			 }
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 isProfileRemoved=false;
			 
		}
		 
		 
		 return isProfileRemoved;
	 }
	
	 @Then("^profile picture should be removed$")
	    public void verifyRemoveProfile() throws Throwable {
	        
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 try {
			 findMobileElement("xpath", "HamburgerMenu").isDisplayed();
		 }catch (Exception e) {
			// TODO: handle exception
			 driver.findElement(By.className("android.widget.ImageButton")).click();
		}
		 Assert.assertTrue(isProfileRemoved);
		 
		 
		 //findMobileElement("xpath", "RemovePictureValidations");
		 //System.out.println(findMobileElement("xpath", "RemovePictureValidations").getAttribute("index"));
	    }
}
