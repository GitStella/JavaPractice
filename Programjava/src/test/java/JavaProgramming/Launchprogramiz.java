package JavaProgramming;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
public class Launchprogramiz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//	WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.programiz.com/sql/online-compiler/");
			
			Thread.sleep(3000);
			
			WebElement clearmenu = driver.findElement(By.xpath("//li[@class='editor-btn-list__item ']//button[@class='editor-btn']//*[name()='svg']"));
			clearmenu.click();
			
			WebElement clearclick = driver.findElement(By.xpath("//li[@class='option-clear']"));
			clearclick.click();
			Thread.sleep(3000);
			
			WebElement queryline = driver.findElement(By.className("CodeMirror-line"));
			queryline.click();
		
			WebElement linefocus = driver.findElement(By.cssSelector("textarea"));
			linefocus.sendKeys("select customer_id from customers;");
		
		  	WebElement runsql = driver.findElement(By.xpath("//button[normalize-space()='Run SQL']"));  
		  	runsql.click();
		 
		  	driver.close();
	}

}
