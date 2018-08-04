package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\AAMFoundation\\eclipse-workspace\\regressionfolder\\src\\test\\java\\Features\\FilterOption.Feature"
		,glue={"StepDefination"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true, 
		//strict = true, 
		dryRun = false 
		)

public class TestRunner {
	

	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	 Reporter.setSystemInfo("user", System.getProperty("user.name"));
     Reporter.setSystemInfo("os", "Mac OSX");
     Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
