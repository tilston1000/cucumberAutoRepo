package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the Facebook login page$")
	public void user_is_on_the_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opening url");
	}
	
	@When("^user enters First Name$")
	public void user_enters_First_Name() 
	{
		driver.findElement(By.id("u_0_l")).sendKeys("Andy");
	}
	
	@Then("^user checks if First Name is present$")
	public void user_checks_if_First_Name_is_present()
	{
		String userNameActual = driver.findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals("Andy", userNameActual);
	}
	

}
