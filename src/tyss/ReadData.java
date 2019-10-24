package tyss;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class ReadData {

	public static void main(String[] args)  throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh= w.getSheet("Sheet1");
		Row firstRow =sh.getRow(0);
		int rowcount=sh.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<firstRow.getLastCellNum();j++) {
				org.apache.poi.ss.usermodel.Cell cl=sh.getRow(i).getCell(j);
				System.out.println(cl + "         ");
			}
		System.out.println();
	}
		System.out.println("||||||||||||||||||||||");
		sh.getRow(0).getLastCellNum();
		sh.getRow(1).getLastCellNum();
		String a=sh.getRow(1).getCell(0).toString();
		String s=sh.getRow(1).getCell(1).toString();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(s);



		System.out.println(sh.getRow(1).getCell(0).toString());
		//System.out.println(System.getProperty("user.dir"));
		
		
}
}