package UpcastingDowncasting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RunProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String dot="9/October/2018";
		String date,month,year;
		String caldt,calmonth,calyear;		
		/*
		 * Split the String into String Array
		 */
		String dateArray[]= dot.split("/");
		date=dateArray[0];
		month=dateArray[1];
		year=dateArray[2];
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");  
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div")).click();
		float f = 1.1234561111111111111111111178901f;
		char c = 789;
 
		WebElement cal;
		//cal=driver.findElement(By.className("calendar"));
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		/**
		 * Select the year
		 */
		while (!calyear.equals(year)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println("Displayed Year::" + calyear);
		}
 
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		/**
		 * Select the Month
		 */
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
 
		cal=driver.findElement(By.className("calendar"));
		/**
		 * Select the Date
		 */
		List<WebElement> rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				caldt=cols.get(j).getText();
				if (caldt.equals(date)) 
				{
					cols.get(j).click();
					break;
				}
			}
		}
 
	}
 
}