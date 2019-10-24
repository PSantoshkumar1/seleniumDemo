package tyss;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UbLadder {

	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		java.util.List<WebElement> menu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
}
}
