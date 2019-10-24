package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/santosh.html");
		WebElement link =driver.findElement(By.tagName("a"));
				link.click();
				
		
		 driver.navigate().back(); driver.findElement(By.id("d1")).click();
		  System.out.println(driver.getTitle()); 
		  driver.navigate().back();
		  driver.findElement(By.name("n1")).click();
		  
		  driver.navigate().back(); driver.findElement(By.className("c1")).click();
		 
	}
	

}
