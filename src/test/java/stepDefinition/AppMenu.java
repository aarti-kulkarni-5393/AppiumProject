package stepDefinition;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import TestBase.TestBase;
import cucumber.api.java.da.Men;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidElement;

public class AppMenu extends TestBase {

	public AppMenu() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@When("^User open App Menu$")
    public void user_open_app_menu() throws Throwable {
        
		try {
			if(findMobileElement("xpath", "MyHangarMenu").isDisplayed())
			{
				System.out.println("App menu is already opened");
			}
		}catch (Exception e) {
			// TODO: handle exception
			findMobileElement("xpath", "MyHangarMenu").click();
			if(findMobileElement("xpath", "MyHangarMenu").isDisplayed())
			{
				System.out.println("App menu opened");
			}
		}
		
    }
	 @Then("^User verifies Mobile Application Support Number is (.+)$")
	    public void verifyMobileApplicationSupport(String mobileappsupportnumber) throws Throwable {
	        
		String actual_MobileSupportNumber= findMobileElement("xpath", "MobileApplicationSupport").getText();
		Assert.assertTrue("", actual_MobileSupportNumber.equals(mobileappsupportnumber));
		 
	    }
	 @And("^User verifies Application Support Number is (.+)$")
	    public void verifyApplicationSupportNumber(String applicationsupportnumber) throws Throwable {
	        String actualApplicationSupportNumber = findMobileElement("xpath", "AppSuportNumber").getText();
	        Assert.assertTrue("", actualApplicationSupportNumber.equals(applicationsupportnumber));
	    }
	 @And("^Username \"([^\"]*)\" should be displayed with profile picture$")
	    public void verifyUsernameDisplayedOnAppMenu(String username) throws Throwable {
	        
		    String actual_Username=findMobileElement("xpath", "").getText().trim();
		    Assert.assertTrue(actual_Username.equalsIgnoreCase(username.trim()));
		 
	    }


	    @Then("^App menus should be in sequence$")
	    public void verifyAppMenuSequence() throws Throwable {
	        
	    	List<AndroidElement> Menus = driver.findElements(By.xpath("AppMenu"));
	    	if(Menus.get(0).getText().equalsIgnoreCase("My Hangar"))
	    		System.out.println("First Menu is My Hangar");
	    	if(Menus.get(1).getText().equalsIgnoreCase("Manage Additional Users"))
	    	   System.err.println("Second Menu is Manage Additional Users");
	    	if(Menus.get(2).getText().equalsIgnoreCase("My Profile"));
	    		System.out.println("Third Menu is My Profile");
	    	if(Menus.get(3).getText().equalsIgnoreCase("Mobile Application Support"));
	    	System.out.println("Fourth menu is Mobile Application Support");
	    	if(Menus.get(4).getText().equalsIgnoreCase("Log Out"));
	    	System.out.println("Fifth menu is Log out");
	    	
	    }
}
