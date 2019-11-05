package TestBase;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
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
    	
    	    Dimension dimensions = driver.manage().window().getSize();
    	    int Startpoint = (int) (dimensions.getHeight() * 0.5);
    	    int scrollEnd = (int) (dimensions.getHeight() * 0.5);
    	    //driver.swipe(200, Startpoint,200,scrollEnd,2000); 
    	
    	
    }
    public void scrollToElement(String elementName, boolean scrollDown){
    	String listID = ((RemoteWebElement) driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ListView\")")).getId();
    	String direction;
    	if (scrollDown) {
    		direction = "down";
    	} else {
    		direction = "up";
    	}
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", direction);
    	scrollObject.put("element", listID);
    	scrollObject.put("text", elementName);
    	driver.executeScript("mobile: scrollTo", scrollObject);
    }

}
