package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("jobsanputta@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		 driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("123@santu",Keys.ENTER);
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		 Thread.sleep(2000);

       driver.findElement(By.xpath("//textarea[@class='vO']")).sendKeys("chowdarysantosh7@gmail.com");
      Thread.sleep(2000);

     driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Nill");
     Thread.sleep(2000);

      driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("HI... Good evening");
     Thread.sleep(2000);

   driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
   Thread.sleep(2000);

}
}
