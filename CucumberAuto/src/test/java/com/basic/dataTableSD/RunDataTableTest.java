package com.basic.dataTableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			dryRun=false,
			features={"src/test/resources/com/basic/dataTableFF/"},
			glue={"com/basic/dataTableSD/"},
			plugin={"pretty", 
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report3.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReports3.html"}		
			)
	
	public class RunDataTableTest {
	

}
