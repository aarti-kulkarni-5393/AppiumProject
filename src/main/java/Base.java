import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	

	public static AndroidDriver<AndroidElement> capabilties(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
//		File srcsFile = new File("src");
//		File finalFilePath = new File(srcsFile,"UAT-0.3.0.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		if(device.equalsIgnoreCase("Emulator"))
		{
			//For Emulator 
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 28");
		}else if(device.equalsIgnoreCase("Real"))
		{
			//For Real device just change device name
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		
		
		
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\main\\java\\Resources\\UAT-0.3.0.apk");
		//instantiniate android driver 
		//set connection request in same
		
		return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
		//return driver;
				

	}

}
