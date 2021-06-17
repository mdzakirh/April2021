package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObj {
	WebDriver driver;

	public RegistrationPageObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement firstNameTextBox() {
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		return firstName;
	}
	
	public WebElement lastNameTextBox() {
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		return lastName;
	}
	
	public WebElement passwordTextBox() {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		return password;
	}
	
	public WebElement addressTextBox() {
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		return address;
	}
	
	public WebElement cityTextBox() {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		return city;
	}
	
	public void selectState() {
		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		select.selectByVisibleText("Virginia");
	}
	
	public WebElement zipCode() {
		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		return zipCode;
	}
	
	public WebElement phoneNumberTextBox() {
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		return phoneNumber;
	}
	
	public WebElement registrationButton() {
		WebElement registerButton = driver.findElement(By.id("submitAccount"));
		return registerButton;
	}
}
