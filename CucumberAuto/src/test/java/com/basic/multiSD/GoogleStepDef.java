package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the Google page$")
	public void user_is_on_the_Google_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
	}
	
	@When("^user enters search string$")
	public void user_enters_search_string()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	}
	
	

}
