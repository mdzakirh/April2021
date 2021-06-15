package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class homePage {
	HomePageObjects homePageObj;
	SignInPageObj signInPageObj;
	RegistrationPageObj registrationPageObj;
	UserHomePageObj userHomePageObj;
	
	WebDriver driver;
		
	@BeforeTest
	public void driverInitialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		homePageObj = new HomePageObjects(driver);
		signInPageObj = new SignInPageObj(driver);
		registrationPageObj = new RegistrationPageObj(driver);
		userHomePageObj = new UserHomePageObj(driver);
	}
	
	
	@Test(priority = 1)
	public void indexPage() {
		homePageObj.signInButton().click();
		
	}
	
	@Test(priority = 2)
	public void signInPage() {
		
		signInPageObj.emailAddressText().clear();
		signInPageObj.emailAddressText().sendKeys("al457@gmail.com");
				
		signInPageObj.createButton().click();
	}
	
	@Test(priority = 3)
	public void registrationPage() {
		registrationPageObj.firstNameTextBox().clear();
		registrationPageObj.firstNameTextBox().sendKeys("John");
		
		registrationPageObj.lastNameTextBox().clear();
		registrationPageObj.lastNameTextBox().sendKeys("Williams");
		
		registrationPageObj.passwordTextBox().clear();
		registrationPageObj.passwordTextBox().sendKeys("testing");
		
		registrationPageObj.addressTextBox().clear();
		registrationPageObj.addressTextBox().sendKeys("agiletech");
		
		registrationPageObj.cityTextBox().clear();
		registrationPageObj.cityTextBox().sendKeys("agiletech");
		
		registrationPageObj.selectState();
		
		registrationPageObj.zipCode().clear();
		registrationPageObj.zipCode().sendKeys("22030");
		
		registrationPageObj.phoneNumberTextBox().clear();
		registrationPageObj.phoneNumberTextBox().sendKeys("2023125415");
		
		registrationPageObj.registrationButton().click();
			
	}
	
	@Test(priority = 4)
	public void myAccountPage() {

		String expectedUserNameText = "John Williams";
		String actualUserNameText = userHomePageObj.userName().getText();
		
		Assert.assertEquals(actualUserNameText, expectedUserNameText);

	}
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
}
