package com.basic.multiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/MultiFF/"},
			glue={"com/basic/multiSD/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report7.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports7.html"}		
			)
	
	public class RunMultiTest {
	

}
