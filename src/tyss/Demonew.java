package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demonew {
	
	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.urbanladder.com/?gclid=Cj0KCQjw0IDtBRC6ARIsAIA5gWtlxhGRsNPmalO7DQTUohJa0xRwDxQxPoE-o7jQsX6llE1XEV2XKBAaAsCkEALw_wcB");
		driver.findElement(By.xpath("//a[@class='close-reval-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//input[@placeholder='search']")).sendKeys("sofa",Keys.ENTER);
		
	}

}
