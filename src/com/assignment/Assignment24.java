package com.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//public class GmailCompareSubject{@Listeners(Listgmail.class)
public class Assignment24 {
	WebDriver driver ;
	@BeforeClass
	
	
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	}

	@BeforeMethod
	public void beforeM()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void test1() throws InterruptedException {

		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("jobsanputta@gmail.com",Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("123@santu",Keys.ENTER);

		

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys("chowdarysantosh7@gmail.com",Keys.ENTER);
		Thread.sleep(1000);
		String name="Bhavya";
		driver.findElement(By.name("subjectbox")).sendKeys(name);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@data-tooltip='Save & close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='ajl aib aZ6']/div[1]/div/div/div/div[5]")).click();
		Thread.sleep(2000);
		String name2=driver.findElement(By.xpath("//div[@class='Tm aeJ']/descendant::table[5]/tbody/tr[1]/td[6]/div/div/div/span/span")).getText();
		
		Assert.assertEquals(name,name2, "pass");
		
		
	}
}
