package JavaProgramming;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicwebtable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			Thread.sleep(4000);
			@SuppressWarnings("unchecked")
			String str;
			System.out.println("Enter the company name");
			Scanner compname = new Scanner(System.in);
			str = compname.nextLine();
			
		String rowValue ="";
	//	List <WebElement> tableRows1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]"));
		List <WebElement> tableRows1 = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr"));
					for (WebElement webElement1 : tableRows1) {
						System.out.println(webElement1.getText());
					}
		List <WebElement> tableRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	
			        for (WebElement webElement : tableRows) {
			            if (webElement.getText().contains(str)) {
			                rowValue = webElement.getText();
			              break;
			            }
			        }
			        System.out.println(rowValue);

			            }
			}

	
