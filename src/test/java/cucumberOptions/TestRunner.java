package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\test\\java\\features",
		glue="stepDefinition")

public class TestRunner {
	
	/*
	 * This will provide all required information to run frature file
	 * It will provide location details where all features and step definitions are present
	 */
	
  
	}
