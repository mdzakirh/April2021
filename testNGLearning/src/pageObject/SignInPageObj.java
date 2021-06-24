package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPageObj {
	WebDriver internalDriver;
	
	public SignInPageObj(WebDriver driver) {
		internalDriver = driver;
	}
	
	public WebElement emailAddressText() {
		WebElement emailAddressTextBox = internalDriver.findElement(By.id("email_create"));
		return emailAddressTextBox;
	}
	
	public WebElement createButton() {
		WebElement createAnElementButton = internalDriver.findElement(By.name("SubmitCreate"));
		return createAnElementButton;
	
	}
	
	

}
