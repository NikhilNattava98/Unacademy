package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = "src/test/resources/feature/StartLearning.feature")
//, glue= {"stepDefinition"})

public class RunnerStartLearning extends AbstractTestNGCucumberTests
{

}
