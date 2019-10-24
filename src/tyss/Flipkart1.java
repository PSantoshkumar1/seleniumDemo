package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el=driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
js.executeScript("arguments[0].scrollIntoView()",el);
Thread.sleep(6000);
js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
}
}