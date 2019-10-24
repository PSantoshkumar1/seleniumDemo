package com.assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BlueStone2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/descendant::li[2]"));
		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{		
			String menuName=name.getText();
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
	}
}

}
