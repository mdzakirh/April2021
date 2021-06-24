package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseClass {
	WebDriver driver;
	
	@BeforeTest
	public void driverInitialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	}
	
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
}
