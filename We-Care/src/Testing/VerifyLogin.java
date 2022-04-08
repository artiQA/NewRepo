package Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.LinkCorporate;
import Pages.Login;


public class VerifyLogin extends SetUp {

@Test
	
	public void Testing() throws IOException {
		Properties obj = new Properties();
		
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/Configs/locators.properties");
		obj.load(objfile);
		
		
		Login home = new Login(driver);
		
		
		home.enterMobile(obj.getProperty("loginMoileNumberField"),"9999900011");

		home.enterOTP("900011");

		home.enterMpin("7106");

		home.selProfile();
		
		home.clickOnProfile();
		
	}


}
