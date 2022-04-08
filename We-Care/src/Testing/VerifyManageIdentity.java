package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.LinkCorporate;


public class VerifyManageIdentity extends SetUp{
	
@Test
	
	public void manageIdentity() throws IOException {
		Properties obj = new Properties();
		
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/Configs/locators.properties");
		obj.load(objfile);
		
		LinkCorporate link = new LinkCorporate(driver);
		
		link.clickManageIdentity();
		link.clickInfoPopup();
		link.clickLinkNewId();
		//link.clickOnCorporate();
		
		
	}
	

}
