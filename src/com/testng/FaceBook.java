package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {
	@Test
	public void demoF() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("puta.santosh@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@putta",Keys.ENTER);

		driver.close();
		


}
	@Test
	public void demoFa() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kiransunil1010@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kittu@1020",Keys.ENTER);

		driver.close();
}
}