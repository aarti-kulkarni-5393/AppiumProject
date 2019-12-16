package TestBase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling {
	
	public AndroidDriver<AndroidElement> driver ;
	private Waits wait;
	private PropertyReader propertyObj;
	public Scrolling() throws IOException {
		// TODO Auto-generated constructor stub
		propertyObj = new PropertyReader();
		  driver = DriverManagement.getInstance(propertyObj.getProperty("PlatForm"),propertyObj.getProperty("App_Path"));
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
		
	}
	
	public void scrollingTo()
	{
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.cirrusaircraft.connectedapp:id/hanger_holder\")).scrollIntoView("
        + "new UiSelector().text(\"LOCATION\"));");
		
	}
	/*
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
//    public void scrollByJavascript(AndroidElement element,AndroidElement element1)
//    { 
//    	//create javascript object
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	// create hashmap to handle scroll object
//    	HashMap<String, String> scrollObject = new HashMap<String, String>();
//    	scrollObject.put("direction", "down");
//    	scrollObject.put("elementId", ((RemoteWebElement)element).getId());
//    	scrollObject.put("elementToId", ((RemoteWebElement)element1).getId());
//    	// give scroll object and action as scroll
//    	js.executeScript("mobile:scrollBackTo", scrollObject);
//    }
    
    /*
     * To work it, addinng static method for scroll which will scroll to specific amount
     */
    
    public void verticalScroll()
    {
    	
    	    Dimension dimensions = driver.manage().window().getSize();
    	    int height = dimensions.getHeight();
    	    int width = dimensions.getWidth();
    	    // x will be same 
    	    int x = width/2;
    	    int startY = (int)(height*0.80);
    	    int endY = (int)(height*0.20);
    	    
    	    TouchAction action = new TouchAction(driver);
    	    action.press(PointOption.point(x, startY)).waitAction().moveTo(PointOption.point(x, endY)).release().perform();
    	    
 
    	
    	
    }
    
    public void scrollUp()
    {

	    Dimension dimensions = driver.manage().window().getSize();
	    int height = dimensions.getHeight();
	    int width = dimensions.getWidth();
	    // x will be same 
	    int x = width/2;
	    int startY = (int)(height*0.80);
	    int endY = (int)(height*0.20);
	    
	    TouchAction action = new TouchAction(driver);
	    action.press(PointOption.point(x, endY)).waitAction().moveTo(PointOption.point(x, startY)).release().perform();
    	
    }
    
    public void pull()
    {
  
    	scrollingTo();
    	scrollingTo();
    	
    }
//    public void scrollToElement(String elementName, boolean scrollDown){
//    	String listID = ((RemoteWebElement) driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ListView\")")).getId();
//    	String direction;
//    	if (scrollDown) {
//    		direction = "down";
//    	} else {
//    		direction = "up";
//    	}
//    	HashMap<String, String> scrollObject = new HashMap<String, String>();
//    	scrollObject.put("direction", direction);
//    	scrollObject.put("element", listID);
//    	scrollObject.put("text", elementName);
//    	driver.executeScript("mobile: scrollTo", scrollObject);
//    }

}
