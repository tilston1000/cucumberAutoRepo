package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the Demo Site page$")
	public void user_is_on_the_Demo_Site_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^user enters First Name$")
	public void user_enters_First_Name()
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Andy");
	}
	
	@And("^user enters Last Name$")
	public void user_enters_Last_Name()
	{
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tester");
	}


}
