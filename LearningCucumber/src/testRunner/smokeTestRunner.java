package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/features"},
		glue= {"stepDefinition"},
		plugin = {"html:testOutput"},
		tags = {"@smoke"}
		)

public class smokeTestRunner {

}
