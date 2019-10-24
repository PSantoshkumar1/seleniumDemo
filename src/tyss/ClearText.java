//w a script to clear the value present in text box  login button is diplayed or not & to check  wherther check box c1 is selected or not
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClearText {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver =new ChromeDriver();
		//enter the url
		driver.get("file:///C:/Users/sai/Desktop/.html");
		//clear the text or value present in textbox
		driver.findElement(By.xpath("//input[@type='type' and @value='A']")).click();
		//get the text of a link
		String value=driver.findElement(By.id("d1")).getText();
		//check whether button A is enabled or not
		if(driver.findElement(By.xpath("//input[@type='button' and @value='A']")).isEnabled())
		{
			System.out.println("button  A is enabled");
		}
		//check whether button login is displayed or not
		if(driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed())
		{
			System.out.println("button login is displayed");
		}
		//check whether C1 checkbox is selected or no
		if(driver.findElement(By.xpath("//input[@checked]")).isSelected())
		{
			System.out.println("checkbox is selected");
		}
		driver.close();
	}

}
