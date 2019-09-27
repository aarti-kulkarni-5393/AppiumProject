package TestBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	
	/*
	 * This is launching app in emulator or device
	 */
	public Waits wait;
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
	caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\UAT-0.3.0.apk");
	
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
	
	
   

}
