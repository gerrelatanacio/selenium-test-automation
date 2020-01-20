package com.rangakaranam.tutorial.testng;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTestNGTest {
	WebDriver driver;

	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		// Create an instance of the webdriver
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.get("https://www.google.com");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		assertEquals(driver.getTitle(), "Google");

	}

	@Test
	public void testFacebook() {
		driver.get("https://www.facebook.com");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		String title = "Facebook - Log In or Sign Up";

		assertEquals(driver.getTitle(), title);

	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}

}
