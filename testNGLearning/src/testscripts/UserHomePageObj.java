package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserHomePageObj {
	WebDriver internalDriver;
	
	public UserHomePageObj(WebDriver driver) {
		internalDriver = driver;
	}
	
	public WebElement userName() {
		WebElement actualUserName = internalDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
		return actualUserName;
	}
	
	
}
