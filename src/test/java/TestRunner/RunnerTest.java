package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFiles/Login.feature"},
				glue= {"Steps"},
				dryRun=true
		)

public class RunnerTest {

}
