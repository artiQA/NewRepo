package testpurpose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Child extends Parent{

	@Test
	public static void newtest() {
		System.out.println("test");
	}
	
	@Test
	public void newtestone() {
		System.out.println("test two");
	}
	
	@Test
	public void main() {
    Parent P = new Parent();
    P.newtest();
	}
	

	
}
