package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Safari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
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
