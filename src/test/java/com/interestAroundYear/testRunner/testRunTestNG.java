package com.interestAroundYear.testRunner;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.interestAroundYear.factory.helperClass;

//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".//Features/" }, // providing location of feature file in "features"
		glue = "com.interestAroundYear.stepDefinitions" // specifying stepDefinition package name
		, plugin = { "pretty", // plugins to generate cucumber report
				"html:reports/myreport.html", // for cucumber report
				"rerun:target/rerun.txt", // capturing failure scenarios
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // Generating extent reports
		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true)

public class testRunTestNG extends AbstractTestNGCucumberTests {
	//static variables to hold Webdriver instance and properties
		static WebDriver driver;
		static Properties p;
		@BeforeTest
		@Parameters({"browser"})
		public void setup(String browser) throws IOException{

			driver = helperClass.initializeBrowser(browser);		//calling the initializeBrowser method of baseClass to get the driver
			p = helperClass.getProperties();				//calling the getProperties method of baseClass
			driver.manage().window().maximize();		//Maximizing the browser window 
			driver.get("https://emicalculator.net/");//navigating to the appUrl
		}
		@AfterTest
		public void tearDown() {
			if(driver!=null) {
				driver.quit();	//closing the browser
			}
		}
}
