package TestBase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Waits {

	AndroidDriver<AndroidElement> driver;
	
	public Waits() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		//It gets you instance of existing class
		driver= DriverManagement.getInstance("real");
		
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
