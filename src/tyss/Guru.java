package tyss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(a.getText());
		a.accept();


}
}