package tyss;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

TakesScreenshot ts=(TakesScreenshot)driver; 
File Sc = ts.getScreenshotAs(OutputType.FILE);
File ss = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc, ss);
}
}