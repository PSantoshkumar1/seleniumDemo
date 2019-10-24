package tyss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
//open the browser
		ChromeDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("https://github.com/SeleniumHQ/selenium/blob/master/java/client/src/org/openqa/selenium/firefox/FirefoxDriver.java");
		
		//getting the title & printing  it on the console
		System.out.println(driver.getTitle());
		
		
		//close the browser
		driver.close();
	}

}
