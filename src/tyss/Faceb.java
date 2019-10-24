package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faceb {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//tbody[1]//tr[2]//td/input")).sendKeys("puta.santosh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@putta");
		

}
}