package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actilogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://127.0.0.1/login.do;jsessionid=53k2q47fvv4kb");
	 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	 Thread.sleep(8000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 
	 
	 
	 driver.findElement(By.xpath("//a[text()='Login']")).click();
	 Thread.sleep(8000);
	 
	 
	 driver.findElement(By.xpath("//a[text()='Logout']")).click();
	 
}
}
