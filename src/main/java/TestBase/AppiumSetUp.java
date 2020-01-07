package TestBase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumSetUp {
	
	static AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	private Log log;
	public AppiumSetUp() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		log = new Log(AppiumSetUp.class);
	}
	
	public  void startAppiumServer(int port)
	{
		if(!checkIfServerIsRunnning(port))
		{
			startService();
			log.info("Appium server started");
		}
	}
	
	public  void startService()
	{
		
		/*
		 * it will first check if service its in user if not then it will start new appium session
		 */
		
		if(service.isRunning())
		{
			stopService();
			log.info("Stopped existing running appium server");
		}
			service.start();
			log.info("Fresh Appium server started Again");
			
		}
	
	
	
	public  void stopService()
	{

		service.stop();
		log.info("Appium server service stopped");
		
	}
public  boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
			log.info("service is already running");
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}	


}
