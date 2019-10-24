package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el=driver.findElement(By.xpath("//h2[text()='Selenium Sponsors']"));
js.executeScript("arguments[0].scrollIntoView()",el);
}
}