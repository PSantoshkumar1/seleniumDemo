package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(24);
		WebElement mon=driver.findElement(By.id("Mon"));
		Select  s1=new Select(mon);
		s1.selectByValue("Apr");
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1994");
//		driver.findElement(By.xpath("//select[@aria-label='Day']")).
//		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
//		driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		
	}

}
