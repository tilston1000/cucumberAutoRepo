package com.basic.multiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the Facebook login page$")
	public void user_is_on_the_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^user enters \"([^\"]*)\" first name$")
	public void user_enters_First_Name(String userName) 
	{
		driver.findElement(By.id("u_0_l")).sendKeys(userName);
	}
	
	@Then("^user checks if \"([^\"]*)\" is present$")
	public void user_checks_if_First_Name_is_present(String userName) throws InterruptedException
	{
		String userNameActual = driver.findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^user enters \"([^\"]*)\" surname$")
	public void And_user_enters_Surname(String surname) throws InterruptedException
	{
		driver.findElement(By.id("u_0_n")).sendKeys(surname);
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
