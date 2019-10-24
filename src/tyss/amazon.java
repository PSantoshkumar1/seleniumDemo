package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el=driver.findElement(By.xpath("//div[@class='navFooterBackToTop']"));
js.executeScript("arguments[0].scrollIntoView()",el);
Thread.sleep(6000);
driver.findElement(By.xpath("//div[@class='navFooterBackToTop']")).click();

}
}
