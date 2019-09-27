package TestBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverManagement extends TestBase {
	
	public static AndroidDriver<AndroidElement> driver = null;
	private DriverManagement() {
		// TODO Auto-generated constructor stub
	}
	
	
   public static AndroidDriver<AndroidElement> getInstance(String device) throws MalformedURLException
   {
	   if(driver==null)
	   {
		   DesiredCapabilities caps =capabilties(device);
		   driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);	   
	   }
	   
	   return driver;
   }
	

}
