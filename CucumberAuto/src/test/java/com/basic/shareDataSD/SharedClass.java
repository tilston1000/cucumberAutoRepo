package com.basic.shareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;
	
	@Before
	public WebDriver setUp()
	{
		if(driver==null)
		{
			System.out.println("in before1");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\andrew.tilston\\Testing Info\\Projects\\Downloads\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;	
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		driver = null;
	}

}
