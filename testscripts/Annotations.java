package testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void testingAnnotations() {
		System.out.println("Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
