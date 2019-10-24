package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99 {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		// ChromeOptions co=new ChromeOptions();
		// co.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/upload/");

		WebElement upload = driver.findElement(By.id("file_wraper0"));

		upload.click();
		Runtime r = Runtime.getRuntime();
		r.exec("‪C:\\Users\\sai\\Desktop\\QspProgram.exe");

	}
}