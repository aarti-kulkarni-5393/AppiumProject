package stepDefinition;

import TestBase.AppiumSetUp;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	AppiumSetUp appium = new AppiumSetUp();
	
	/*
	 * it will run before all scenarios, we can use appium start stop
	 */
	@Before
	public void setUp(Scenario scenario)
	{
		if(scenario.getSourceTagNames().contains("@Login"))
		{
			// login will be first test case so it will check if this is first test case for execution if yes start appium
           appium.startAppiumServer(4723);
	    }
		
		
	}
	
	/*
	 * it will run after all scenarios
	 */
	@After("@EndTest")
	public void tearDown(Scenario scenario)
	{
		System.out.println("after hooks");
	   appium.stopService();
		
		
	}
	

}
