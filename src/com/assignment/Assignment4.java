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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	
	
	@Listeners(Listgmail.class)
public class Assignment4 {
	WebDriver driver ;
	@BeforeClass
	
	
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeM()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	}
		@Test
		public void test1() throws InterruptedException {
			
			List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[6]"));
			Actions a=new Actions(driver);
			for(WebElement name:menu)
			{		
				a.moveToElement(name).build().perform();
		}
			driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='grid-view-result']/ul/li[1]")).click();
			Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
			 
			 driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]"));
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='scrollable-list active']/ul/li[1]")).click();
			Thread.sleep(1000);
			String name=driver.findElement(By.xpath("//span[@class='select-size']/div/span/span")).getText();
			Thread.sleep(1000);
			driver.findElement(By.id("buy-now")).click();
			Thread.sleep(1000);
			 String name1=driver.findElement(By.xpath("//span[@class='size-box-overlay']")).getText();
			Assert.assertEquals(name, name1,"pass");
			
		
			
			
		}
	}

