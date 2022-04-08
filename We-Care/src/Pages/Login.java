package Pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	

	
	public void enterMobile(String enterMobileNumberField, String MobNo) {
		driver.findElement(By.xpath(enterMobileNumberField)).sendKeys(MobNo); 
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.wait();
	}
	
	public void enterOTP(String OTP) {
		driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(OTP);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void enterMpin(String mpin) {
		
		driver.findElement(By.xpath("//input[@placeholder='Enter PIN']")).sendKeys(mpin);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[5]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void selProfile() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[1]/div/div[2]/div[1]/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void clickOnProfile() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/nav[1]/div[1]/div")).click();
	}
}
	


