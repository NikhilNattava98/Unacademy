package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = "src/test/resoures/feature/Startlearning.feature",glue= {"stepDefinition"}
)

public class RunnerStartLearning extends AbstractTestNGCucumberTests{

}
