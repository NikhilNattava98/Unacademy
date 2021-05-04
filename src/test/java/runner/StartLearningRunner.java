package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
features = "src/test/resoures/feature/slearning.feature",glue= {"stepDefinition"}
)

public class StartLearningRunner {

}
