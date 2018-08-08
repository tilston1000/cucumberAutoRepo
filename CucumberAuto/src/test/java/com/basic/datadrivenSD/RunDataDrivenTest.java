package com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/dataDrivenFF/"},
			glue={"com/basic/datadrivenSD/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report2.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports2.html"}	
			)
	
	public class RunDataDrivenTest {
	

}
