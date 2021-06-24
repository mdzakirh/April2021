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
	
	@Test (groups = {"smoke"})
	public void testA() {
		System.out.println("TestA");
	}
	

	@Test(groups = {"smoke", "sanity"})
	public void testB() {
		System.out.println("TestB");
	}
	
	@Test(groups = {"sanity"})
	public void testC() {
		System.out.println("TestC");
	}
	
	@Test(groups = {"smoke", "sanity","regression"})
	public void testD() {
		System.out.println("TestD");
	}
	
	@Test(groups = {"regression"})
	public void testE() {
		System.out.println("TestE");
	}
	
	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
}
