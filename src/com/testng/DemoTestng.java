package com.testng;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestng {
		
	
WebDriver driver;
	@org.testng.annotations.BeforeClass
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.out.println("BC");

	}
	@AfterClass
	public void afterC() {
		System.out.println("Ac");
	}
	
	@BeforeMethod
	public void beforeM()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("BM");
		
	}
@AfterMethod
public void afterM() {
	driver.close();
	System.out.println("Am");
	
}
@Test
public void demoM()
{
	driver.findElement(By.name("email")).sendKeys("kiran",Keys.ENTER);
	System.out.println("Hi");
	
}
@Test
public void demoM1()
{
	driver.findElement(By.name("email")).sendKeys("kittu",Keys.ENTER);
	System.out.println("HI");
}
@Test(priority=2)
public void demo() {
	driver.findElement(By.name("email")).sendKeys("kiran",Keys.ENTER);
	System.out.println("Hil");
	
	
}
@Test(priority=1)
public void demoS() {
	driver.findElement(By.name("email")).sendKeys("kittu",Keys.ENTER);
	System.out.println("His");

}

}