package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
features = "src/test/resoures/feature/slearning.feature",glue= {"stepDefinition"}
)
public class StartLearningRunner {

}