package com.rangakaranam.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumJUnitTest {
	WebDriver driver;

	@Before
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
	
	@After
	public void after() {
		driver.quit();
	}

}
