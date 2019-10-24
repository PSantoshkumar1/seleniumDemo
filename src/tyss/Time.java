package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();

	 driver.get("https://demo.actitime.com/login.do");
	 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	 Thread.sleep(8000);
	 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	 Thread.sleep(2500);
	 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div[@class='popup_menu_icon']")).click();
	// driver.findElement(By.xpath("//div[@onmouseover='highlight(this)']")).click();

	 
	 
	 
	 
}
}