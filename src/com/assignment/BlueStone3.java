package com.assignment;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
public class BlueStone3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	static int count=0;
	public static void screen(WebDriver driver) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/BlueStone3" + count + ".png");
		Files.copy(sc, ff);
		count++;
}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		BlueStone3.screen(driver);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[6]"));
        Actions a=new Actions(driver);
		 BlueStone3.screen(driver);
		for(WebElement name:menu)
		{		
			a.moveToElement(name).build().perform();
			 BlueStone3.screen(driver);
	}
		driver.findElement(By.xpath("//a[contains(.,'Bracelets')]")).click();
		 BlueStone3.screen(driver);
		driver.findElement(By.xpath("//div[@id='grid-view-result']/ul/li[1]")).click();
		BlueStone3.screen(driver);
		 driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
		 BlueStone3.screen(driver);
		 driver.findElement(By.xpath("//div[@class='scrollable-list active']/ul/li[1]")).click();
		 BlueStone3.screen(driver);
		driver.findElement(By.id("buy-now")).click();
		
		BlueStone3.screen(driver);
		 WebDriverWait ww=new WebDriverWait(driver,20000000);
}
}
