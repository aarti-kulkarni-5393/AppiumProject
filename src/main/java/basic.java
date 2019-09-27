import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilties("Real");
		//it will wait till device open
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//String rootedDeviceDetection=driver.findElement(By.xpath("//android.widget.TextView[@text='Rooted Device Detected']")).getText();
		
		//System.out.println(rootedDeviceDetection);
		
		//System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='NEXT']")).isDisplayed());
		//driver.findElement(By.xpath("//android.widget.Button[@text='NEXT']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).click();
		
		//driver.findElements(By.xpath("new UiSeletor().clickable(true)")).
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("waiting");
		//Forgot your password page
		//driver.findElementByXPath("//android.view.View[@text=\"Forgot Your Password?\"]").click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Cancel button in forgot your password page
		//driver.findElement(By.xpath("//android.view.View[@text=\"CANCEL\"]")).click();
		//Username in forgot your password page
		//driver.findElementByXPath("//android.widget.EditText[@resource-id='forgotPassword:forgotForm:forgot-email']").sendKeys("nihilentuat6@gmail.com");
		
		
		// continue button on forgot your password ?page
		//driver.findElement(By.xpath("//android.widget.Button[@text=\"Continue\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:username']")).sendKeys("conaircraftnhltestuser1@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginPage:loginForm:password']")).sendKeys("cirrus001");
		//click on submit
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Sign In\"]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		

		
		

	}

}
