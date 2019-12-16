package TestBase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Waits {

	AndroidDriver<AndroidElement> driver;
	private PropertyReader propertyObj;
	
	public Waits() throws IOException {
		// TODO Auto-generated constructor stub
		//It gets you instance of existing class
		propertyObj = new PropertyReader();
		  driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
		
	}
	
	
	public void waitForGivenTime(int time)
	{
		//it will wait for given time
		//Time unit will be in seconds only
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	/*
	 * Dynammic waits
	 */
	
	public void waitForGivenElement(int time,AndroidElement element)
	{
		
		
	}
	
}
