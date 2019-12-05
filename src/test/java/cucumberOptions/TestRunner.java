package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\sagar\\cirrusnew\\src\\test\\java\\features\\Regression",
		glue="stepDefinition",tags= {"@ValidationFnameLastname"})

public class TestRunner {
	
	/*
	 * This will provide all required information to run frature file
	 * It will provide location details where all features and step definitions are present
	 */
	
	}
