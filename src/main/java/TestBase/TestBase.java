package TestBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	private AndroidDriver<AndroidElement> driver;
	/*
	 * This is launching app in emulator or device
	 */
	public TestBase() throws MalformedURLException {
		// TODO Auto-generated constructor stub
	  driver = DriverManagement.getInstance("real");
	}
	public static DesiredCapabilities capabilties(String device) throws MalformedURLException {
	
	/* This is another way to give generic path in framework
	 * File srcsFile = new File("src");
	 * File finalFilePath = new File(srcsFile,"UAT-0.3.0.apk");
	 */
	
	DesiredCapabilities caps = new DesiredCapabilities();
	if(device.equalsIgnoreCase("emulator"))
	{
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AutomationEmulator");
	}else if(device.equalsIgnoreCase("Real"))
	{
		//For Real device just change device name
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	}
	caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\UAT-0.4.0.apk");
	
	//return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
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
	
	

	public void scrollTo(String parent,String child)
	{
		// scroll to given element
		System.out.println("scrolling");
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.cirrusaircraft.connectedapp:id/hanger_holder\")).scrollIntoView("
        + "new UiSelector().text(\"N527FC\"));");

//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//        + ".resourceId("+parent+")).scrollIntoView("
//        + "new UiSelector().text("+child+"));");
//		System.out.println("scrolling");

        
	}
	
   

}
