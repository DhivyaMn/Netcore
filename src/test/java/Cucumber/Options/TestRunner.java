package Cucumber.Options;


	

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/featurefiles",glue= {"StepDefinations"})
	public class TestRunner {
	
	}
