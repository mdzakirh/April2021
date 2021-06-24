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
import org.testng.asserts.SoftAssert;

import pageObject.HomePageObjects;
import pageObject.RegistrationPageObj;
import pageObject.SignInPageObj;
import pageObject.UserHomePageObj;

public class homePage{
	
	HomePageObjects homePageObj;
	SignInPageObj signInPageObj;
	RegistrationPageObj registrationPageObj;
	UserHomePageObj userHomePageObj;
	
	
	WebDriver driver;
		
	@Parameters ("browser")
	@BeforeTest(groups = {"smoke"})
	public void driverInitialization( String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
//		System.setProperty("webdriver.internetExplorer.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\ie.exe");
		
		
//		driver = new InternetExplorer();
		
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
	
	
	@Test(priority = 1, groups = {"smoke"})
	public void indexPage() {
		boolean value = homePageObj.signInButton().isDisplayed();
		Assert.assertTrue(value);
		homePageObj.signInButton().click();
	}
	
	
	@Parameters ("emailAddress")
	@Test(priority = 2, groups = {"smoke"})
	public void signInPage(String emailAddress) {
		
		signInPageObj.emailAddressText().clear();
		signInPageObj.emailAddressText().sendKeys(emailAddress);
				
		signInPageObj.createButton().click();
	}
	
	
	@Parameters ({"firstName","lastName"})
	@Test(priority = 3)
	public void registrationPage(String firstName, String lastName) {
		registrationPageObj.firstNameTextBox().clear();
		registrationPageObj.firstNameTextBox().sendKeys(firstName);
		
		registrationPageObj.lastNameTextBox().clear();
		registrationPageObj.lastNameTextBox().sendKeys(lastName);
		
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
//		Assert.assertTrue(condition);
//		Assert.assertFalse(condition);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualUserNameText, expectedUserNameText);
	}
	
	@AfterTest(groups = {"smoke"})
	public void finishTest() {
		driver.quit();
	}
}
