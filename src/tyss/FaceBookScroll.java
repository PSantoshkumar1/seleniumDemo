package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookScroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//tbody[1]//tr[2]//td/input")).sendKeys("puta.santosh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@putta");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      //Thread.sleep(6000);
       //js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
}
}
