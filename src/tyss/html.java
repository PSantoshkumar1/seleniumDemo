package tyss;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class html {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sai/Desktop/.html");
//		
//		Robot r=new Robot();
//
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_CONTROL);
	
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
