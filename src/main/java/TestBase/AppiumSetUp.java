package TestBase;

import java.io.IOException;
import java.net.ServerSocket;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumSetUp {
	
	static AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	
	public AppiumSetUp() {
		// TODO Auto-generated constructor stub
	}
	
	public  void startAppiumServer(int port)
	{
		if(!checkIfServerIsRunnning(port))
		{
			startService();
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
		}
			service.start();
			
		}
	
	
	
	public  void stopService()
	{

		service.stop();
		
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
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}	


}
