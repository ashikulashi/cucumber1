package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failed.txt", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"rerun:C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\Rerun\\failed.txt" })
public class TestRerunner {

	@AfterClass

	public static void report() {

		JVMReport.generateJvmReport("C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\JSONReport");

	}

}
