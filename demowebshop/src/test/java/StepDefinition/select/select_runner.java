package StepDefinition.select;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		//glue = {"StepDefiniton.select.select_stepdef.class"},
		tags = {"@tag2"},
				plugin = {"pretty", "html:target/cucumber" , "json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport2.html"},		
		monochrome = true
		)

public class select_runner {
	@AfterClass
	public static void extendReport() {
		 Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
		//Reporter.loadXMLConfig("src/test/resources/testdata/extent_reports.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}


}
