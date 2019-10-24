package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fbook {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed();
			}
			});
		
		driver.findElement(By.xpath("//tbody[1]//tr[2]//td/input")).sendKeys("puta.santosh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@putta");

}
}

