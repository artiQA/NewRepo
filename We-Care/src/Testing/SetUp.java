package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LinkCorporate;
import Pages.Login;
//import Pages.Test;

public class SetUp {
	
	public static WebDriver driver;
	
	@BeforeSuite
	
	public void Initialize() throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");  
	
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://covid.sit.health.jiolabs.com/vaccination"); 
		System.out.println("Done");
		
		//home.enterMobile(null, null)
	
	}
	
	

	
	@AfterSuite
	
	public void TeardownTest() {
		SetUp.driver.quit();
	}

}
