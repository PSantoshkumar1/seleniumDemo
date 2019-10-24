package tyss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BS {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	static int count=0;
	public static void screen(WebDriver driver) throws IOException
	{

		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("./Screenshot/"+count+".png");
		Files.copy(sc,ff);
		count++;
		
	}


	public static void main(String[] args) throws Exception {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
screen(driver);

WebElement ring=driver.findElement(By.xpath("//a[text()='Rings ']"));
screen(driver);
Actions a=new Actions(driver);
screen(driver);
a.moveToElement(ring).build().perform();
Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
	
	
	
	
	}
}
