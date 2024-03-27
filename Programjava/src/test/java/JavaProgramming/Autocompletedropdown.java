package JavaProgramming;
import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocompletedropdown {

	public static void main(String[] args) throws Exception  {
		
	//	WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
	
		  //  WebElement autocomplete = driver.findElement(By.cssSelector(".auto-complete__value-container.auto-complete__value-container--is-multi.css-1hwfws3"));
		WebElement autocomplete = driver.findElement(By.id("autoCompleteMultipleInput"));
		
	Thread.sleep(6000);
		   autocomplete.click();
		  
		  autocomplete.sendKeys("g");
		  Thread.sleep(4000);
		   autocomplete.sendKeys(Keys.TAB);
		
			//WebDriverWait wait = new WebDriverWait(driver, 20);
		//	wait.until(ExpectedConditions.elementToBeSelected(autocomplete));

			autocomplete.click();
		
		  String options;
	
		   List<WebElement> myList1 = driver.findElements(By.xpath("//div[@class='auto-complete__menu css-26l3qy-menu']"));
		  
		   System.out.println(myList1);
		   for (WebElement element:myList1)
		   {
		     options = element.getText();
		       System.out.println(options);
	}
}
}


