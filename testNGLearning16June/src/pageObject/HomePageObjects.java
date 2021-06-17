package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	WebDriver internalDriver;
	
	public HomePageObjects(WebDriver driver) {
		internalDriver = driver;
	}
	
	public WebElement signInButton() {
		WebElement signinButton = internalDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		return signinButton;
	}
	
	
	
	
}
