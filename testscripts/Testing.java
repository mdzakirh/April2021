package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public void test() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
//		WebElement bestSellersButton = driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a"));
//		boolean bestSellersButtonValue = bestSellersButton.isDisplayed();
//		System.out.println(bestSellersButtonValue);
//		String expectedTitle = "My Store";
//		WebElement actualTitle = driver.findElement(By.xpath("/html/head/title"));
//		System.out.println(actualTitle.getText());
//		if(expectedTitle.equalsIgnoreCase(actualTitle.getText())) {
//			System.out.println("Title matched");
//		}else {
//			System.out.println("Title didn't match");
//		}
		
		WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signinButton.click();
		
		WebElement emailAddressTextBox = driver.findElement(By.id("email_create"));
		emailAddressTextBox.clear();
		emailAddressTextBox.sendKeys("alsdhhg@gmail.com");
		
		WebElement createAnElementButton = driver.findElement(By.name("SubmitCreate"));
		createAnElementButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		firstName.clear();
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		lastName.clear();
		lastName.sendKeys("Williams");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.clear();
		password.sendKeys("testing");
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address.clear();
		address.sendKeys("agiletech");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.clear();
		city.sendKeys("agiletech");
		
		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		select.selectByVisibleText("Virginia");
		
		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		zipCode.clear();
		zipCode.sendKeys("22030");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		phoneNumber.clear();
		phoneNumber.sendKeys("2023125415");
		
		WebElement registerButton = driver.findElement(By.id("submitAccount"));
		registerButton.click();
		
		String expectedUserNameText = "John Williams";
		WebElement actualUserName = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
		String actualUserNameText = actualUserName.getText();
		
		if(expectedUserNameText.equals(actualUserNameText)) {
			System.out.println("Registration testing scenario is passed");
		}else {
			System.out.println("Registration testing scenario failed");
		}
		
		
		
		driver.quit();
	}

}
