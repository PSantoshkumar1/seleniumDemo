package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBBbb {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);

		
		List<WebElement> days= s.getOptions();
		for(WebElement dy:days)
		{
			System.out.println(dy.getText());
		}
		
	//System.out.println(we.getoptions("//select[@aria-label='Day']/option"));	
		
	}
	
}
