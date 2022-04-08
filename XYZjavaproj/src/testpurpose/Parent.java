package testpurpose;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parent {
	
	@BeforeSuite
	public void beforesuitetest() {
		System.out.println("befor suite");
	}
	
	@AfterSuite
	public void aftersuitetest() {
		System.out.println("After suite");
	}
	
	Parent(){}
	@Test
	public static void newtest() {
		System.out.println("test parent");
	}
	
	public void newtestone() {
		System.out.println("test two parent");
	}
	
	@BeforeTest
	public void beforetestone() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void aftertestone() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeclassone() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterclassone() {
		System.out.println("After Class");
	}
	

}
