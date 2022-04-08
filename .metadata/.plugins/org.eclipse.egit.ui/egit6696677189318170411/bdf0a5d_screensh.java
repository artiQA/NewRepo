package screenshot.scrshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screensh {
	
	static WebDriver driver;
	String win;
	ExtentTest test;
	ExtentReports report;
	
	@BeforeMethod
	public void Extentreporttest() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("Extent Reportssss");
	}
	@Test
	public void takescr() throws IOException {
		
		try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		win = driver.getWindowHandle();
		System.out.println("passsssssssssssssssss");
		System.out.println("passsssssssssssssssss");

		
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("ToolsQA");
		if(driver.getTitle().equals(driver.getTitle())) {
			test.log(LogStatus.PASS, "Test is Pass");
		}

		Thread.sleep(2000);
		driver.findElement(By.linkText("nouse")).click();
		}
		catch(Exception e) {
			driver.switchTo().window(win);
			e.printStackTrace();
			test.log(LogStatus.FAIL, test.addScreenCapture(takeSnapshot(driver)));
			}
			
		
		}
	
	public static String takeSnapshot(WebDriver driver) throws IOException {
		TakesScreenshot sh = (TakesScreenshot)driver;
		File file = sh.getScreenshotAs(OutputType.FILE);
		File dest = new File("user.dir" + "resultScreenshot.png");
		String errFilePath = dest.getAbsolutePath();
		FileUtils.copyFile(file, dest);
		return errFilePath;
		
	}
	@AfterMethod
	public void reportfile() {
		report.endTest(test);
		report.flush();
	}

}
