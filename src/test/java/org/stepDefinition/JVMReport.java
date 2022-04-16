package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonPath) {

		// 1.Mention file location

		File f = new File("C:\\Users\\elcot\\eclipse-workspace\\Cucumber3.30\\AllReports\\JVMReport");

		// 2.Add the details

		Configuration c = new Configuration(f, "Facebook Application");

		c.addClassifications("plateform", "Windows");
		c.addClassifications("jdk", "1.8");

		// 3.Add the json file path
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);

		// 4.To create object for reportBuilderClass

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}

}
