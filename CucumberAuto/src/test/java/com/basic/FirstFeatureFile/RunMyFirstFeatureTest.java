package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/FirstFeatureFileFF/"},
			glue={"com/basic/FirstFeatureFile/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report4.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports4.html"}		
			)
	
	public class RunMyFirstFeatureTest {
	

}
