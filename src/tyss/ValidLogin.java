package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement  un=driver.findElement(By.id("username"));
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	String ExpectedTitle="Enter Time-Track";
	String ActualTitle =driver.getTitle();
	System.out.println(ActualTitle);
	if(ActualTitle.contentEquals(ExpectedTitle))
	{
driver.findElement(By.id("logoutLink")).click();
System.out.println("Title is displayed and not logout");
try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		driver.findElement(By.id("logoutLink")).click();
		
	}
	else {
		System.out.println("  Title is not displayed and not logout");
		
	}
driver.close();
	}

}
