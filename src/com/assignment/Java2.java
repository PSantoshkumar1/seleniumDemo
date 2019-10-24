package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java",Keys.ENTER);
		
		List<WebElement>menu=driver.findElements(By.xpath("//a")); 
		int lC=menu.size();
		
		System.out.println("Number of links"+lC);
		
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
			
			if(menu.size()==lC);
			{
				String s=name.getText();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[contains(.,'"+s+"')]")).click();
				break;
}
}
	}
}