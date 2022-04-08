package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) { 
		
	    System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");  
	
	WebDriver driver = new ChromeDriver(); 
	// Launch Website 
	driver.navigate().to("http://www.google.com/"); 

	// Click on the search text box and send value 
	driver.findElement(By.id("lst-ib")).sendKeys("BrowserStack"); 

	// Click on the search button 
	driver.findElement(By.name("btnK")).click(); 

	// Close the Browser 
	driver.close(); 

}
}
