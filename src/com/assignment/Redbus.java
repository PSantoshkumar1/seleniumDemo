package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {
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

driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Bengaluru");
Thread.sleep(2000);


driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("hubli");
Thread.sleep(2000);


driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);


driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::tr[4]/td[6]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@id='search_btn']")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//span[@class='g-button fr']")).click();
Thread.sleep(2000);


driver.findElement(By.xpath("//div[@id='rb-calmiddle']/ul[@class='rb-calendar-days']/descendant::li[@data-date='18']")).click();
Thread.sleep(6000);


//driver.close();
}
}