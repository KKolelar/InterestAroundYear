package com.interestAroundYear.stepDefinitions;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
//import org.testng.annotations.Parameters;

import com.interestAroundYear.factory.helperClass;

import io.cucumber.java.*;


public class Hooks {
	static WebDriver driver;
	//This method runs after each step in a scenario
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		driver=helperClass.getDriver();
		// this is for cucumber junit report
		if (!scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());			//attach the screenshot to the scenario

		}

	}

}
