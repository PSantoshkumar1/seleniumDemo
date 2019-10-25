package com.parlaleducation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P1 {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("hi1");
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			FirefoxOptions fo = new FirefoxOptions();
			fo.setCapability("marionette", false);
			System.out.println("hi2");
			driver = new FirefoxDriver(fo);
			System.out.println("hi3");
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	@Test
	public void testParameterWithXml() {

		driver.get("https://www.google.com/");
		driver.close();

	}
}
