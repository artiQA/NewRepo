package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAppointment {
	
	WebDriver driver;
	
	public BookAppointment(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnBookAppointment() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/nav[1]/div[3]"));
	}
	
	

}
