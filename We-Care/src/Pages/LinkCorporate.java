package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkCorporate {

	WebDriver driver;
	
	public LinkCorporate(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void clickManageIdentity() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/nav[2]/div[2]/div")).click();

	}
	public void clickInfoPopup() {
		driver.findElement(By.xpath("//*[@id=\"switch-container\"]/div/div/div/div[2]/div[2]/div/div/div[2]")).click();
	}
	public void clickLinkNewId() {
		driver.findElement(By.xpath("//*[@id=\"switch-container\"]/div/div/div/div[1]/div[1]/div/div[1]/div[2]")).click();
	}
	
	public void clickOnCorporate() {
		driver.findElement(By.xpath("")).click();
	
	}
	
}

