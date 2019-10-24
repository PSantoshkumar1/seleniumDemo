package tyss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sai/Desktop/.html");
		WebElement all=driver.findElement(By.id("b"));
		Select s=new Select(all);
		List<WebElement> num=s.getOptions();
		
		if(s.isMultiple()) {
			for(WebElement nums:num)
			{
		s.selectByValue(nums.getText());
		System.out.println(nums.getText());
		}
			List<WebElement> num1=s.getAllSelectedOptions();
			for(WebElement numss:num1)
			{
				System.out.println(numss.getText());
			}

		

	}

}
}
