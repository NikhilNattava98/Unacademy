package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/feature/StartLearning.feature",glue= {"stepDefinition/AddCourseTest"},
				plugin= {"pretty","html:IssueReport/htmlreport",
						"json:IssueReport/jsonreport.json",
						"junit:IssueReport/xmlreport.xml",
						"com.cucumber.listener.ExtentCucumberFormatter:IssueReport/cucumber-reports/report.html"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}