package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/featureFiles/contactPage.feature" },
		glue= {"steps"}
		
		)


public class RunnerTest1 extends AbstractTestNGCucumberTests{

}
