//package testscripts;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//public class RegistrationPage {
//	@Test(priority = 3)
//	public void registrationPage() {
//		
//		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
//		firstName.clear();
//		firstName.sendKeys("John");
//		
//		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
//		lastName.clear();
//		lastName.sendKeys("Williams");
//		
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
//		password.clear();
//		password.sendKeys("testing");
//		
//		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
//		address.clear();
//		address.sendKeys("agiletech");
//		
//		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
//		city.clear();
//		city.sendKeys("agiletech");
//		
//		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
//		select.selectByVisibleText("Virginia");
//		
//		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
//		zipCode.clear();
//		zipCode.sendKeys("22030");
//		
//		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
//		phoneNumber.clear();
//		phoneNumber.sendKeys("2023125415");
//		
//		WebElement registerButton = driver.findElement(By.id("submitAccount"));
//		registerButton.click();
//		
//	}
//}
