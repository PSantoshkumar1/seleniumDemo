package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Gmail12 {
	WebDriver driver;
@Test
	public void demoM() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("jobsanputta@gmail.com",Keys.ENTER);
		Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("123@santu",Keys.ENTER);
      Thread.sleep(4000);
		List<WebElement> mail = driver.findElements(By.xpath("//div[@class='BltHke nH oy8Mbf aE3']"));
		System.out.println(((WebElement) mail).getText());

      

//	@Test
//	public void onTestStart(ITestResult result) 
//	{
//		
//	}
//	
//	public void onTestSuccess(ITestResult result) 
//	{
//		
//		Reporter.log(result.getName());
//		Reporter.log(null, result.getStatus());
//
//	}
//	public void onTestFailure(ITestResult result) 
//	{
//		
//		Reporter.log(result.getName());
//		Reporter.log(null, result.getStatus());
//
//	}
//	public void onTestSkipped(ITestResult result)
//	{
//		Reporter.log(result.getName());
//		Reporter.log(null, result.getStatus(), false);
//
//		
//	}
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
//	{
//		Reporter.log(result.getName());
//
//	}
//	public void onTestFailedWithTimeout(ITestResult result) 
//	{
//		
//		
//	}
//	public void onStart(ITestContext context) 
//	{
//		Reporter.log(context.getOutputDirectory());
//		
//
//		
//		
//	}
//	public void onFinish(ITestContext context) 
//	{
//	
	}
}
//
//
