package tyss;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Html1 {
//	static {
//		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
//	}
		@Test
		public void demoM() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/sai/Desktop/h.html");
	List<WebElement> link3=driver.findElements(By.xpath("//a[text()='Selenium']"));
	((WebElement) link3).click();
	String link=((WebElement) link3).getAttribute("href");
	URL u =new URL(link);
	HttpsURLConnection con=(HttpsURLConnection) u.openConnection();
	int rcode=con.getResponseCode();
	if(rcode==200)
	{
		System.out.println(rcode);
		System.out.println("Link is not broken");
		System.out.println(con.getResponseCode());
	}
	else {
		System.out.println(rcode);
		System.out.println("Link is broken");
	}
	//System.out.println(we.getText());

}
}