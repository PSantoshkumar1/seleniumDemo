package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
//		//js.executeScript("window.scrollBy(0,15000)" );
//		Thread.sleep(6000);
//		//js.executeScript("window.scrollBy(0,-15000)" );
//		Thread.sleep(6000);
		// js.executeScript("window.scrollBy(500,0)" );
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");

	}
}