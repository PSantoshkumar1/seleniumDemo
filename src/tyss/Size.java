package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int unheight=driver.findElement(By.id("username")).getSize().getHeight();
		int pwheight=driver.findElement(By.name("pwd")).getSize().getHeight();
		if(unheight==pwheight)
		{
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		
		}
		

	}

}
