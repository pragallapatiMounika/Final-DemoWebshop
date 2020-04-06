package StepDefinition.shoppingCart;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		//glue = {"StepDefiniton.shoppingCart"},
		plugin = {"pretty", "html:target/cucumber" , "json:reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport1.html"},
		tags = {"@tag3"},
		monochrome = true
		)

public class ShoppingCart_runner {
	@AfterClass
	public static void extendReport() {
		 Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
		//Reporter.loadXMLConfig("src/test/resources/testdata/extent_reports.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}


}