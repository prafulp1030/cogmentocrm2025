package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/featureFiles/dealsPage.feature"},
		glue= {"steps"}
		
		)
public class RunnerTest2 extends AbstractTestNGCucumberTests
{
	
}
