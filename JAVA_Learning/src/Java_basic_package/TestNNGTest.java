package Java_basic_package;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNNGTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	
	}
	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("BeforeGroup");
	}
	
	@AfterGroups
	public void AfterGroups() {
		System.out.println("AfterGroups");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("AfterSuite");
	}
	
	
		

}
