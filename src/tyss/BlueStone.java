package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Ring",Keys.ENTER);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@data-key='8']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@title='Place Order']")).click();
Thread.sleep(5000);
		
		driver.close();
}
}
