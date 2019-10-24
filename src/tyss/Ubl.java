package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ubl {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		java.util.List<WebElement> menu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ancestor/li"));
Actions a=new Actions(driver);
for(WebElement name : menu)
{
	System.out.println(name.getText());
	a.moveToElement(name).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='close-reval-modal hide-mobile']")).click();

}

	}
}
