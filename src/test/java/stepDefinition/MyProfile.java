package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.springframework.util.SystemPropertyUtils;

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
	        wait.waitForGivenTime(60);
	        String updatedUsername = findMobileElement("xpath", "UserNameFromMyProfile").getText();
	        String FinalName = firstNmae+LastName;
	        if(updatedUsername.equalsIgnoreCase(FinalName))
	        {
	        	System.out.println("Details not updated");
	        }else {
	        	System.out.println("Details are not updated");
	        }
	        //verify on App Menu
	        //findMobileElement("xpath", "").click();
	        
	        
	    }
	 @When("^User upload profile pic from \"([^\"]*)\"$")
	    public void uploadProfilePicture(String uploadOption) throws Throwable {
	        
		 wait.waitForGivenTime(30);
		 findMobileElement("xpath", "updateProfile").click();
		 try {
			 if(findMobileElement("xpath", "AllowButton").isDisplayed())
			 {
				 findMobileElement("xpath", "AllowButton").click();
				 //findMobileElement("xpath", "PermissionMessage").click();
				 findMobileElement("xpath", "PermissionMessageForFileAccess").click();
				 try {
				 if(findMobileElement("xpath", "PanelToChooseProfileImage").isDisplayed())
				 {
					 findMobileElement("xpath", "GalleryOption").click();
					 boolean isprofileSelected = choosePictureFromGallery();
					 if(isprofileSelected==false)
					 {
						 System.out.println("profile update failed");
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
  
	 boolean isPictureSelected=false;
	 public boolean choosePictureFromGallery()
	 {
		 System.out.println("choosing gallery picture");
		 try {
			 if(findMobileElement("xpath", "Gallery").isDisplayed())
			 {
				 List<AndroidElement> galleryImages =driver.findElements(By.xpath("//com.sec.samsung.gallery.glview.composeView.ThumbObject"));
				 System.out.println(galleryImages.size());
				 if(!galleryImages.isEmpty())
				 {
					 galleryImages.get(1).click();
					 try {
					 if(findMobileElement("xpath", "EditPhoto").isDisplayed())
					 {
						 findMobileElement("xpath", "cropDone").click();
						 wait.waitForGivenTime(60);
						 isPictureSelected=true;
						 
						 
					 }}catch (Exception e) {
						// TODO: handle exception
						 System.out.println("No picture is selected");
						 isPictureSelected=false;
					}
				 }
			 }
		 }catch (Exception e) {
				// TODO: handle exception
			 System.out.println("Gallery option is not opened");
			 isPictureSelected=false;
			}
		 return isPictureSelected;
	 }
	 
	 public void removePictureFromGallery()
	 {
		 System.out.println("This time it will remove profile pictuee");
		 wait.waitForGivenTime(30);
		 findMobileElement("xpath", "updateProfile").click();
		 try {
			 if(findMobileElement("xpath", "AllowButton").isDisplayed())
			 {
				 findMobileElement("xpath", "AllowButton").click();
				 //findMobileElement("xpath", "PermissionMessage").click();
				 findMobileElement("xpath", "PermissionMessageForFileAccess").click();
				 try {
				 if(findMobileElement("xpath", "PanelToChooseProfileImage").isDisplayed())
				 {
					 findMobileElement("xpath", "RemoveOption").click();
					 //add code to verify if possible	 
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
	
}
