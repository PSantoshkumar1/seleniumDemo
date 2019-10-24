package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sai/Desktop/hhttmmll.html");
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@name='textB']")).isDisplayed();
			}
			});
		
		driver.findElement(By.xpath("//input[@nsssame='textA']")).sendKeys("SAntu");
		driver.findElement(By.xpath("//input[@name='textC']")).sendKeys("psk");


}}
