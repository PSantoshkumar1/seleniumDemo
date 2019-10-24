package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java4 {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for Jewellery']")).sendKeys("Rings",Keys.ENTER);
		List<WebElement>menu=driver.findElements(By.xpath("//div[@class='p-image']")); 
		Thread.sleep(4000);
		
		int xpathCount=menu.size();
		System.out.println("The Number of Results found for Rings are "+xpathCount);

}
}
