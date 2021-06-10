package testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SerializationOfTestNG {

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@Test (priority = 1)
	public void testB() {
		System.out.println("Test");
	}
	
	@Test(priority = 2)
	public void testA() {
		System.out.println("Test");
	}
	
	@Test(priority = 3)
	public void testC() {
		System.out.println("Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
}
