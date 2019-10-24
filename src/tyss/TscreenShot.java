package tyss;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class TscreenShot {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(co);

driver.manage().window().maximize();

driver.get("https://www.redbus.in");

TakesScreenshot ts=(TakesScreenshot)driver; 
File Sc = ts.getScreenshotAs(OutputType.FILE);
File ss = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc, ss);
driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Bengaluru");
Thread.sleep(2000);

TakesScreenshot ts1=(TakesScreenshot)driver; 
File Sc1 = ts1.getScreenshotAs(OutputType.FILE);
File ss1 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc1, ss);


driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("hubli");
Thread.sleep(2000);

TakesScreenshot ts2=(TakesScreenshot)driver; 
File Sc2 = ts2.getScreenshotAs(OutputType.FILE);
File ss2 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc2, ss);


driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
Thread.sleep(2000);
TakesScreenshot ts3=(TakesScreenshot)driver; 
File Sc3 = ts3.getScreenshotAs(OutputType.FILE);
File ss3 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc3, ss);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);

TakesScreenshot ts4=(TakesScreenshot)driver; 
File Sc4 = ts4.getScreenshotAs(OutputType.FILE);
File ss4 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc4, ss);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);

TakesScreenshot ts5=(TakesScreenshot)driver; 
File Sc5 = ts5.getScreenshotAs(OutputType.FILE);
File ss5 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc5, ss);
driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")).click();
Thread.sleep(2000);

TakesScreenshot ts6=(TakesScreenshot)driver; 
File Sc6 = ts6.getScreenshotAs(OutputType.FILE);
File ss6 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc6, ss);

driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::tr[4]/td[6]")).click();
Thread.sleep(2000);

TakesScreenshot ts7=(TakesScreenshot)driver; 
File Sc7 = ts7.getScreenshotAs(OutputType.FILE);
File ss7 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc7, ss);

driver.findElement(By.xpath("//button[@id='search_btn']")).click();
Thread.sleep(4000);

TakesScreenshot ts8=(TakesScreenshot)driver; 
File Sc8 = ts.getScreenshotAs(OutputType.FILE);
File ss8 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc8, ss);

driver.findElement(By.xpath("//span[@class='g-button fr']")).click();
Thread.sleep(2000);


TakesScreenshot ts9=(TakesScreenshot)driver; 
File Sc9 = ts.getScreenshotAs(OutputType.FILE);
File ss9 = new File("./Screenshot/DemoTwo.png");
Files.copy(Sc9, ss);


driver.findElement(By.xpath("//div[@id='rb-calmiddle']/ul[@class='rb-calendar-days']/descendant::li[@data-date='18']")).click();
Thread.sleep(6000);



}
}