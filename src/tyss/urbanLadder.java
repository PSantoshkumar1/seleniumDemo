package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanLadder {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/?gclid=Cj0KCQjw0IDtBRC6ARIsAIA5gWtlxhGRsNPmalO7DQTUohJa0xRwDxQxPoE-o7jQsX6llE1XEV2XKBAaAsCkEALw_wcB"); 
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='topnav_itemname']")).click();

				Thread.sleep(3000);
	}				
}
