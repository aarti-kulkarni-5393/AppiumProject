package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

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
		try {
	  driver = DriverManagement.getInstance("emulator");
		}catch(Exception e) {
			System.out.println("Exception occured  while creating driver:::::"+e.getMessage());
			e.printStackTrace();
		}
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
		caps.setCapability("noReset", true);
	}else if(device.equalsIgnoreCase("Real"))
	{
		//For Real device just change device name
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	}
	 caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\UAT-0.11.0.apk");
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
	
	
static {
		
		/*
		 * Temp code to read property file
		 */
		Properties PropertyReader = new Properties();
		File file = new File("C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\email.properties");
	try {
			FileInputStream stream = new FileInputStream(file);
			PropertyReader.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
   

}
