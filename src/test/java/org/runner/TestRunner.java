package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\HTMLReport",
		"json:C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\JSONReport\\fb.json",
		"junit:C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\JunitReport\\facebook.xml",
		"rerun:C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\Rerun\\failed.txt"})
public class TestRunner {

	@AfterClass

	public static void report() {

		JVMReport.generateJvmReport("C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\JSONReport\\fb.json");

	}

}
