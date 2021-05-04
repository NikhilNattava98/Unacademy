package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
features = "src/test/resoures/feature/Startlearning.feature",glue= {"stepDefinition"}
)

public class RunnerStartLearning {

}
