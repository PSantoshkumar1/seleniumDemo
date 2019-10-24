package tyss;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FaceBookusername {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
//		 PrintStream o = new PrintStream(new File("A.txt"));
//		 PrintStream console = System.out; 

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
		System.out.println(sh.getRow(1).getCell(0).toString());
		System.out.println(System.getProperty("user.dir"));

}
}