package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/HooksFF/"},
			glue={"com/basic/hooksSD/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports5.html"}			
			)
	
	public class RunHooksTest {
	

}
