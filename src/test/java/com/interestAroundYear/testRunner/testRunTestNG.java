package com.interestAroundYear.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/" },	 // providing location of feature file in "features"
		glue = "com.interestAroundYear.stepDefinitions" 	// specifying stepDefinition package name
		, plugin = { "pretty", 	// plugins to generate cucumber report
				"html:reports/myreport.html",	 // for cucumber report
				"rerun:target/rerun.txt",	 // capturing failure scenarios
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },	 // Generating extent reports
		dryRun = false,	 // checks mapping between scenario steps and step definition methods
		monochrome = true)

public class testRunTestNG extends AbstractTestNGCucumberTests {

}
