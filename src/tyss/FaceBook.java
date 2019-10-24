package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {

	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
	     WebDriverWait ww =new WebDriverWait(driver,10);
//ww.until(ExpectedConditions.textToBePresentInElement(("//tbody[1]//tr[2]//td/input",));
		//driver.findElement(By.xpath("//tbody[1]//tr[2]//td/input")).sendKeys("puta.santosh@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@putta");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
driver.findElement(By.xpath("//div[@class='_6qfu _5lxt f_click']")).click();
driver.findElement(By.xpath("")).click();

}
}
