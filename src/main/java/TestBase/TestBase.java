package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.logging.LogEntries;
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
	public Log log;
	protected AndroidDriver<AndroidElement> driver;
	public static String Username;
	public static String password;
	/*
	 * This is launching app in emulator or device
	 */
	public TestBase() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		try {
			//System.out.println("Log intialization for TestBase");
			log = new Log(TestBase.class);
			handleProperties();
		    driver = DriverManagement.getInstance(propertyObj.getObjectPropertyValue("PlatForm"),propertyObj.getProperty("App_Path"));
		    
		
		}catch(Exception e) {
			log.info("Exception occured  while creating driver:::::"+e.getMessage());
			log.info(e.getMessage());
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
	
   /*
    * Loading Object Property files
    */
	public  void handleProperties() throws IOException
	{
		    /*
		     * it will make sure property file object is intialized only once
		     */
		    if(propertyObj==null)
		    {
		    	log.info("Intializing application property file");
		    	propertyObj = new PropertyReader();
		    	objectRepository = new PropertyReader();
		    	propertyObj.loadPropertyFile("C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\Application.properties");
		    	getLoginUserDetails();
		    	if(propertyObj.getProperty("Enviornment").contains("QA"))
				{
					log.info("Loading Object Property file for QA");
					objectRepository.loadPropertyFile(propertyObj.getProperty("QA_ObjectRepositoryPath"));
					             
							
				}else if(propertyObj.getProperty("Enviornment").contains("UAT")) {
					log.info("Loading Object Property file for UAT");
					objectRepository.loadPropertyFile(propertyObj.getProperty("UAT_ObjectRepositoryPath"));
					 
				}
		    }
						
			
			
		}
	
		
	/*
     * This will be find element by giving object details - how do you want to find it i.e. way --e.g. xpath /id 
     * And Object name which is present in property file
     */
    
    public AndroidElement findMobileElement(String TypeOfObject,String ObjectName)
    {
    	log.info("Getting Element "+ObjectName+" of Type "+TypeOfObject);
    	String Object = TypeOfObject;
    	
    	String ObjectNameValue= objectRepository.getObjectPropertyValue(ObjectName);
    	
    	  	
    	AndroidElement element;
    	switch (Object) {
		case "xpath":
			element= driver.findElement(By.xpath(ObjectNameValue));
			return element;
		case "ID":
			element=driver.findElement(By.id(ObjectNameValue));
			return element;
						
		case "className":
			element= driver.findElement(By.className(ObjectNameValue));
			return element;			

		default:
			log.info("No element is found.");
			element =null;
			return element;
			
		}
    	
    	
    }
    
    

	public List<AndroidElement> findMobileElements(String objectName)
	{
		
		String ObjectNameValue= objectRepository.getObjectPropertyValue(objectName);
		return driver.findElements(By.xpath(ObjectNameValue));
		
		
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
   
public LogEntries getDefaultLogs()
{
	LogEntries logEntry = driver.manage().logs().get("driver");
	return logEntry;
}

public void getLoginUserDetails()
{
	Username=propertyObj.getObjectPropertyValue("Username");
	password=propertyObj.getObjectPropertyValue("Password");
}
public void getAppiumServerLogs() throws IOException
{
	//Getting server logs
	
	String ServerLogs = new AppiumSetUp().serverStdOut();
	System.out.println(ServerLogs.length());
	File serverLogFile = new File("AppiumServer"+Calendar.getInstance().getTimeInMillis());
	FileOutputStream fileOut = new FileOutputStream(serverLogFile);
	fileOut.write(ServerLogs.getBytes(), 0, ServerLogs.length());
	
	fileOut.close();
	//writeFile.flush();

}

}