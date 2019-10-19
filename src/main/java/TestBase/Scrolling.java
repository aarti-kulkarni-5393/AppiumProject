package TestBase;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling {
	
	public AndroidDriver<AndroidElement> driver ;
	private Waits wait;
	public Scrolling() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		driver = DriverManagement.getInstance("real");
		wait = new Waits();
	}
	
	/*
	 * Both are methods using Uiselector and Uiscrollable
	 * But it will only work for elements visible on screen
	 */
	public void scrollToNthElement(int index)
	{
		
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.cirrusaircraft.connectedapp:id/hanger_holder\")).scrollIntoView("
        + "new UiSelector().text(\"LOCATION\").instance("+index+"));");
	}
	
	public void scrollingTo(String Parent,String text)
	{
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.cirrusaircraft.connectedapp:id/hanger_holder\")).scrollIntoView("
        + "new UiSelector().text(\"LOCATION\"));");
		
	}/*
	Handling with single scrollable element
	*/
	
	
	public void scrollingToExact(String Parent,String text)
	{

MobileElement el = (MobileElement) driver
    .findElementByAndroidUIAutomator("new UiScrollable("
        + "new UiSelector().scrollable(true)).scrollIntoView("                      
        + "new UiSelector().textContains(\"LOCATION\"));");
	}
	
	/*
	 * Try to scroll using javascript
	 * Its helpful in iOS than Android
	 */
    public void scrollByJavascript(AndroidElement element,AndroidElement element1)
    { 
    	//create javascript object
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	// create hashmap to handle scroll object
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", "down");
    	scrollObject.put("elementId", ((RemoteWebElement)element).getId());
    	scrollObject.put("elementToId", ((RemoteWebElement)element1).getId());
    	// give scroll object and action as scroll
    	js.executeScript("mobile:scrollBackTo", scrollObject);
    }
    
    /*
     * To work it, addinng static method for scroll which will scroll to specific amount
     */
    
    public void scroll()
    {
    	
    	
    }

}
