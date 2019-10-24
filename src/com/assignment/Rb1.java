package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rb1 {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(co);

driver.manage().window().maximize();

driver.get("https://www.redbus.in");

driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("hubli");
Thread.sleep(2000);


driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("bengaluru");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='return_cal']")).click();



}
}