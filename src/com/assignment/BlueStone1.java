package com.assignment;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;



public class BlueStone1 
{
	
		static 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		}
		
		static int count=0;
		public static void screen(WebDriver driver) throws Exception
		{

			TakesScreenshot ts=(TakesScreenshot)driver;
			File sc=ts.getScreenshotAs(OutputType.FILE);
			File ff=new File("./ScreenShot/BlueStone1"+count+".png");
			Files.copy(sc,ff);
			count++;
			
		}

		public static void main(String[] args) throws Exception{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com");
			screen(driver);
			List<WebElement> menu = driver.findElements(By.xpath("//nav[@class=\"wh-navbar\"]/descendant::li[2]"));
			screen(driver);
			Actions a = new Actions(driver);
			Thread.sleep(2000);
			for (WebElement name : menu) {
				a.moveToElement(name).build().perform();// to mouse over
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//li[2]/a[@title='Diamond Rings']")).click();
			screen(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='top-filter']/descendant::section[1]")).click();
			screen(driver);
			List<WebElement> menu1 = driver.findElements(By.xpath("//form[@id=\"price\"]/div/div/span"));
			screen(driver);
			for (WebElement name : menu1) {
				String price = name.getText();
				System.out.println(price);
			}
			driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
			screen(driver);
		}
	}

