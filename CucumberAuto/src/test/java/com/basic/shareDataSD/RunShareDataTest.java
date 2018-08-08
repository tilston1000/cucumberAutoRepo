package com.basic.shareDataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/ShareDataFF/"},
			glue={"com/basic/shareDataSD/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report9.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports9.html"}			
			)
	
	public class RunShareDataTest {
	

}
