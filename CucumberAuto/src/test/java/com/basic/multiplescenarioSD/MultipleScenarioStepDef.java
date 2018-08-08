package com.basic.multiplescenarioSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenarioStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the Facebook login page$")
	public void user_is_on_the_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^user enters First Name$")
	public void user_enters_First_Name() 
	{
		driver.findElement(By.id("u_0_l")).sendKeys("Andy");
	}
	
	@Then("^user checks if First Name is present$")
	public void user_checks_if_First_Name_is_present() throws InterruptedException
	{
		String userNameActual = driver.findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals("Andy", userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^user enters Surname$")
	public void And_user_enters_Surname() throws InterruptedException
	{
		driver.findElement(By.id("u_0_n")).sendKeys("Tilston");
		Thread.sleep(1000);
	}
	
	@But("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank() throws InterruptedException
	{
		String mobileActual = driver.findElement(By.id("u_0_q")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver = null;
	}
	

}
