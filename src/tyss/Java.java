package tyss;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java",Keys.ENTER);
		Thread.sleep(2000);
	WebElement we=driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']/span"));
		Actions a=new Actions(driver);
		a.doubleClick(we).perform();
		
	Robot r=new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}