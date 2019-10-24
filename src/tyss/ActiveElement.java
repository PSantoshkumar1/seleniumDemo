// w a script to get  the colour of login button present in actiTime application
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	// enter the text in the text box where the active element is present
	String AttributeValue  =driver.findElement(By.id("username")).getAttribute("placeholder");
	System.out.println(AttributeValue);
	String cssValue=driver.findElement(By.xpath("//div[text()='Login']")).getCssValue("border-top");
	System.out.println(cssValue);
	String FontFamily=driver.findElement(By.xpath("//div[text()='Login']")).getCssValue("font-family");
	System.out.println(FontFamily);
	driver.quit();
	
	
	
		
	}

}
