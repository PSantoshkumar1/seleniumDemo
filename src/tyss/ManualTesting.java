package tyss;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ManualTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	static int count=0;
	public static void screen(WebDriver driver) throws Exception
	{

		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("./ScreenShot/Manual1"+count+".png");
		Files.copy(sc,ff);
		count++;
	}

	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.google.com/search?q=manual+testing&rlz=1C1CHBF_enIN811IN811&oq=manual&aqs=chrome.1.69i57j0l4j69i61.4410j0j9&sourceid=chrome&ie=UTF-8\r\n");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		screen(driver);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
		screen(driver);
//		js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");
//		Thread.sleep(4000);
//		js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");

}
}