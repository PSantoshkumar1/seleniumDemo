package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcTime {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://127.0.0.1/login.do;jsessionid=53k2q47fvv4kb");
	 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	 Thread.sleep(8000);
	 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
     WebDriverWait ww =new WebDriverWait(driver,10);
	 //ww.until(ExpectedConditions.(locator)(driver.findElement(By.xpath("//a[@class='logout']")).click()));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@class='logout']")).click();
}
}