package cucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\aarti.kulkarni\\eclipse-workspace\\Cirrus\\src\\test\\java\\features",
		glue="stepDefinition",tags= {"@Appmenu,@MyProfile,@MyHangar"},
		plugin= {"pretty","html:target/cucumber","json:target/cucumber1","junit:target/cucks.xml"}
		)
/*
 * "junit:json:target/cucks.xml","json:target/cucumber"
 *  dryRun=true,monochrome=true,
 */

public class TestRunner {
	
	/*
	 * This will provide all required information to run frature file
	 * It will provide location details where all features and step definitions are present
	 */
	
	
	
	
	
	}
