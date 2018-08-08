package com.basic.shareDataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share)
	{
		driver = share.setUp();
	}
	
	@Given("^user is on the Facebook login page$")
	public void user_is_on_the_Facebook_login_page()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@When("^user enters \"([^\"]*)\" first name$")
	public void user_enters_First_Name(String userName) 
	{
		driver.findElement(By.id("u_0_l")).sendKeys(userName);
	}
}
