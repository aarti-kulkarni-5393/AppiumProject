package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.springframework.util.SystemPropertyUtils;

import com.google.j2objc.annotations.Property;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PropertyReader {
	
	
	/*
	 * Property file will be reading from static block at testbase
	 */
	private Properties propertyObj;
	AndroidDriver<AndroidElement> driver;
	
    public PropertyReader() throws IOException {
		// TODO Auto-generated constructor stub
    	 propertyObj = new Properties();
    	 
    	driver = DriverManagement.getInstance("real","C:\\Users\\aarti.kulkarni\\eclipse-workspace\\\\Cirrus\\\\src\\\\main\\\\java\\\\Resources\\\\UAT-0.11.0.apk");
    	 //loadPropertyFile(Path);
    
	}
    
    public void loadPropertyFile(String path) throws IOException
    {
     File ApplicationFile = new File(path);
   	 FileInputStream inputstream = new FileInputStream(ApplicationFile);
   	 propertyObj.load(inputstream);
    }
    
    public String getProperty(String key)
    {
    	/*
    	 * This will get propery file from given file
    	 */
    	return getSystemPath() + String.valueOf(propertyObj.get(key));
    	
    	
    }
    
    public String getObjectPropertyValue(String objectName)
    {
    	return String.valueOf(propertyObj.get(objectName));
    	
    }
   
        
    public String getSystemPath()
    {
    	
    	return System.getProperty("user.dir");
    }
    
	
}
