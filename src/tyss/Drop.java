package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement before=driver.findElement(By.id("droppable"));
		System.out.println("before dragging  "+before.getText());
		
		Actions a= new Actions(driver);
		
           WebElement target=driver.findElement(By.id("draggable"));
          a.dragAndDropBy(target, 180, 30);
		WebElement WE=driver.findElement(By.xpath(""));
//		a.doubleClick().build().perform();
//		a.dragAndDropBy(frame,we,WE ).build().perform();
//		
		

	}
}