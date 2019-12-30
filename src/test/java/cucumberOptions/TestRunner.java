package cucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\test\\java\\features",
		glue="stepDefinition",tags= {"@Login,@Inviteuser"},
		plugin= {"pretty","html:target/cucumber"}
		)



public class TestRunner {
	
	/*
	 * This will provide all required information to run frature file
	 * It will provide location details where all features and step definitions are present
	 */
	
	
	
	
	
	}
