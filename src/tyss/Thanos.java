package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thanos {
	static  
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?sxsrf=ACYBGNTuLJyP3S9UlUlITS414dvQGzc4-A%3A1570788439030&source=hp&ei=VlSgXduiPObYz7sP96adyAs&q=Thanos&oq=Thanos&gs_l=psy-ab.3..35i39j0i67j0i20i263j0l2j0i67j0i20i263j0l3.121201.124804..125226...0.0..0.298.1094.0j6j1....3..0....1..gws-wiz.....10..35i362i39j0i131.dMNp8zMwERg&ved=0ahUKEwjbpbH3-pPlAhVm7HMBHXdTB7kQ4dUDCAY&uact=5"); 
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//canvas[@jsname='wvK4k']")).click();

				
	}				


}
