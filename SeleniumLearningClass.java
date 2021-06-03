package learning.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumLearningClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?.lang=en-US&src=help&activity=ybar-signin&pspid=986270010&.done=https%3A%2F%2Fhelp.yahoo.com%2Fkb%2FSLN2056.html%3Fguccounter%3D1%26guce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAAKCk2NBK0emI7aXtMD_Db12LgOYVIJsBFFBLTtis_y5hnIocOZJNQ-zOhSnEKxyXYya3Yz-JI7KICJCYP73TafGBXH3ja2BogxMqFD8pChUWMGYDzcE4p9I2YUHqIs6EQbBP2HNfoUJ46UX1epqi6XTi0CX-43je2OjTdQ-kWLS&specId=yidReg&done=https%3A%2F%2Fhelp.yahoo.com%2Fkb%2FSLN2056.html%3Fguccounter%3D1%26guce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAAKCk2NBK0emI7aXtMD_Db12LgOYVIJsBFFBLTtis_y5hnIocOZJNQ-zOhSnEKxyXYya3Yz-JI7KICJCYP73TafGBXH3ja2BogxMqFD8pChUWMGYDzcE4p9I2YUHqIs6EQbBP2HNfoUJ46UX1epqi6XTi0CX-43je2OjTdQ-kWLS");
		
//		WebElement helpLink = driver.findElement(By.xpath("//*[@id=\"login-body\"]/div[1]/span[2]/a"));
//		
//		helpLink.click();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
		lastName.sendKeys("Williams");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		email.sendKeys("johnwilliams245871455");
		
		Thread.sleep(2000);
		
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
//		password.sendKeys("Agile1tech123456@");
//		
//		Thread.sleep(2000);
//		
//		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
//		phoneNumber.sendKeys("7032512545");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select")));
		select.selectByValue("AF");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
		month.click();
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]")));
		selectMonth.selectByVisibleText("June");
		
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]"));
		day.sendKeys("15");
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]"));
		year.sendKeys("2000");
		
		Thread.sleep(2000);
		
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
		continueButton.click();
		
		
		
//		driver.quit();
	}

}
