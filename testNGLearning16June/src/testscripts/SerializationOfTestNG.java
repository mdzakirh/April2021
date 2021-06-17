package testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SerializationOfTestNG {

	public SerializationOfTestNG() {
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@Test ()
	public void testB() {
		System.out.println("Test");
	}
	
	@Test(dependsOnMethods = "testB")
	public void testA() {
		System.out.println("Test");
	}
	
	@Test()
	public void testC() {
		System.out.println("Test");
	}
	
	@Test()
	public void testD() {
		System.out.println("Test");
	}
	
	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
}
