package JavaProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadandWriteWebtable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(4000);
		@SuppressWarnings("unchecked")
		String str;
			
	

	List <WebElement> tableRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	int rowcount = tableRows.size();
	
  //  FileOutputStream fis = new FileOutputStream(new File("E:\\webxl.xls"));
    XSSFWorkbook wb = new XSSFWorkbook();
    String sheetname = "Mysheet";
     XSSFSheet sh = wb.createSheet(sheetname);
     //String fis = "Hello,World";
    

     // Create a new row
     Row row = sh.createRow(0);

     // Create a new cell
     Cell cell = row.createCell(0);

     // Set the cell value
     cell.setCellValue("Hello World");

     // Write the workbook to a file
     FileOutputStream fos = new FileOutputStream(new File("E:\\webxl.xls"));
     wb.write(fos);
     fos.close();

     // Close the workbook
     wb.close();

//	
	//		System.out.println(webElement.getText());
	
	
}

}


