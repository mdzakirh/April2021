package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionForSampleFeature {
	WebDriver driver;
	
	
	@Given("^I am in a signin page$")
	public void i_am_in_a_signin_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	}

	@When("^Insert valid username in username text box$")
	public void insert_valid_username_in_username_text_box() throws Throwable {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.clear();
		userName.sendKeys("standard_user");

	}

	@And("^Insert valid password in password text box$")
	public void insert_valid_password_in_password_text_box() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.clear();
		password.sendKeys("secret_sauce");
	}

	@And("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginButton.click();
	}
	
	@Then("^User should be in user homepage$")
	public void user_should_be_in_user_homepage() throws Throwable {
	    Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}
	
	
	/// from here its negative signin testing
	
	@When("^Insert invalid username in username text box$")
	public void insert_invalid_username_in_username_text_box() throws Throwable {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.clear();
		userName.sendKeys("standard");
	}

	@When("^Insert invalid password in password text box$")
	public void insert_invalid_password_in_password_text_box() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.clear();
		password.sendKeys("secret_sauce123466");
	}

	@Then("^I should be in the same page$")
	public void i_should_be_in_the_same_page() throws Throwable {
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
	}
	
	//////// data from feature file
	
	@Given("^I am in a \"([^\"]*)\"$")
	public void i_am_in_a(String signinPage) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.navigate().to(signinPage);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	}

	@When("^Insert valid \"([^\"]*)\" in username text box$")
	public void insert_valid_in_username_text_box(String username) throws Throwable {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.clear();
		userName.sendKeys(username);
	}

	@When("^Insert valid \"([^\"]*)\" in password text box$")
	public void insert_valid_in_password_text_box(String pwd) throws Throwable {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.clear();
		password.sendKeys(pwd);
	}
	
	
	@After
	public void closeDriver() {
		driver.close();
	}



}
