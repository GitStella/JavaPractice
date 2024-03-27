package JavaProgramming;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadlessChrome {
	
	public static void main(String[] args) {
		
	
	//	WebDriverManager.chromedriver().setup();
		
		
	//	webdrmg .cd.browserversion(mention browser version)
		//System.setProperties(null);
		
	////	ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("--headless=new");
	//	opt.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		System.out.println("Title" +driver.getTitle());
		driver.quit();
		
		
		
	}

}
