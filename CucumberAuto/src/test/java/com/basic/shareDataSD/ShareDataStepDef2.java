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

public class ShareDataStepDef2 {
	
	WebDriver driver;
	
	public ShareDataStepDef2(SharedClass share)
	{
		driver = share.setUp();
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
	
	

}
