package com.hackathon.testRunner;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/"},
							glue="com.hackathon.stepDefinitions",
							plugin = { "pretty",
									"html:reports/myreport.html",
									"rerun:target/rerun.txt",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
				dryRun = false,
				monochrome = true)
public class testRunner {

}
