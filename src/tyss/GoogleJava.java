package tyss;

import java.awt.Component;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleJava {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public void size()
	{
		
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java",Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pages=(WebElement)driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
		
		
//		for(int i=0;i<=pages.size();i++)
//		{
//			driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
//			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//		}
}
	
	}
