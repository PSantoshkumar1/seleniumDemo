package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widht {

	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/.html");
		int UnLocation=driver.findElement(By.xpath("//input[@checked]")).getLocation().getY();
		int PwLocation=driver.findElement(By.xpath("")).getLocation().getY();
		System.out.println(UnLocation);
		System.out.println(PwLocation);
		/*		if(unwidth==pwidth)
		{
			System.out.println("same");
		}
		else {
			System.out.println("not same");
*/
		driver.close();
	}
	

	}
