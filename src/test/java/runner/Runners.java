package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	//@CucumberOptions(features="myFeatures" , glue="stepdefination")
	@CucumberOptions(features="C:\\Users\\PDC3B-Training.PDC3B\\eclipse-workspace\\cucumberproject\\myFeatures\\Login.feature" , glue="stepdefination", tags = {"@Regression"})

	public class Runners{

	
}
