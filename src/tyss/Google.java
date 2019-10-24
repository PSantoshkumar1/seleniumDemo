package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java",Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//h3[text()='Java | Oracle']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	
		
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}
}