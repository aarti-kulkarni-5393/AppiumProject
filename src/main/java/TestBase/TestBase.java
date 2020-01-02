package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public  static PropertyReader propertyObj;
	public  static PropertyReader objectRepository;
	public static MobileElement mobileElement;
	
	protected AndroidDriver<AndroidElement> driver;
	/*
	 * This is launching app in emulator or device
	 */
	public TestBase() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		try {
			propertyObj = new PropertyReader();
			objectRepository = new PropertyReader();
			 handleProperties();
			 /*
			  * Need to add this in Before statement
			  */
			 //AppiumSetUp appium = new AppiumSetUp();
			 //System.out.println(propertyObj.getProperty("PlatForm") + propertyObj.getProperty("App_Path"));
	      driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
		
		}catch(Exception e) {
			System.out.println("Exception occured  while creating driver:::::"+e.getMessage());
			e.printStackTrace();
		}
	}
	public static DesiredCapabilities capabilties(String device,String App_Path) throws MalformedURLException {
	
	/* This is another way to give generic path in framework
	 * File srcsFile = new File("src");
	 * File finalFilePath = new File(srcsFile,"UAT-0.3.0.apk");
	 */
	
	DesiredCapabilities caps = new DesiredCapabilities();
	if(device.equalsIgnoreCase("emulator"))
	{
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AutomationEmulator");
		caps.setCapability("noReset", true);
	}else if(device.equalsIgnoreCase("Real"))
	{
		//For Real device just change device name
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	}
	
	 caps.setCapability(MobileCapabilityType.APP, App_Path);
	 caps.setCapability("automationName", "UiAutomator2");
	 caps.setCapability("waitForIdleTimeout", 2000);
	 caps.setCapability("disableWindowAnimation", true);
	 return caps;
	
	}
	
//	/*
//	 * waits class will be executed from here
//	 */
//	public void waitForGivenTime(int time) throws MalformedURLException
//	{
//		wait = new Waits();
//		wait.waitForGivenTime(30);
//	}
	

	public  void handleProperties() throws IOException
	{
			
			propertyObj.loadPropertyFile("C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\Application.properties");
			
			if(propertyObj.getProperty("Enviornment").contains("QA"))
			{
				
				objectRepository.loadPropertyFile(propertyObj.getProperty("QA_ObjectRepositoryPath"));
				             
						
			}else if(propertyObj.getProperty("Enviornment").contains("UAT")) {
				//System.out.println("loading UAT properties");
				objectRepository.loadPropertyFile(propertyObj.getProperty("UAT_ObjectRepositoryPath"));
				 
			}
			
		}
	
		
	/*
     * This will be find element by giving object details - how do you want to find it i.e. way --e.g. xpath /id 
     * And Object name which is present in property file
     */
    
    public AndroidElement findMobileElement(String TypeOfObject,String ObjectName)
    {
    	String Object = TypeOfObject;
    	
    	String ObjectNameValue= objectRepository.getObjectPropertyValue(ObjectName);
    	System.out.println("This is value in findElement "+ObjectNameValue);
    	  	
    	AndroidElement element;
    	switch (Object) {
		case "xpath":
			element= driver.findElement(By.xpath(ObjectNameValue));
			return element;
		case "ID":
			element=driver.findElement(By.id(ObjectNameValue));
			return element;
				//break;		
		case "className":
			element= driver.findElement(By.className(ObjectNameValue));
			return element;			

		default:
			System.out.println("No element is found ,please check ");
			element =null;
			return element;
			
		}
    	
    	
    }

	


boolean isElementPresent;
public  boolean waitForPresence( int timeLimitInSeconds, String targetResourceId){

try{
	mobileElement =  (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\""+targetResourceId+"\")");
	WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
	wait.until(ExpectedConditions.visibilityOf(mobileElement));
	boolean isElementPresent = mobileElement.isDisplayed();
	return isElementPresent;	
}catch(Exception e){
	isElementPresent = false;
	System.out.println(e.getMessage());
	return isElementPresent;
} }
	

public boolean retryingFindClick(AndroidElement element,int tryCount) {
    boolean result = false;
    int attempts = 0;
    while(attempts < tryCount) {
        try {
        	System.out.println(attempts);
        	element.click();
            result = true;
            break;
        } catch(StaleElementReferenceException e) {
        }
        attempts++;
    }
    return result;
}
   


}