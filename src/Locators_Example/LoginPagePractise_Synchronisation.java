package Locators_Example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractise_Synchronisation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\debdi\\OneDrive\\Desktop\\Selenium\\Selenium_2023\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		String name = "rahulshettyacademy";
		String password1 = "learning";
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@value = 'user']/following-sibling::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id ='okayBtn']")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@data-style = 'btn-info']"));
		Select S = new Select (staticDropdown);
		S.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id = 'terms']")).click();
		driver.findElement(By.xpath("//input[@id ='signInBtn']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class= 'card-title']/a")));
		List<WebElement> a = driver.findElements(By.xpath("//h4[@class= 'card-title']/a"));
		for(int i=0 ; i<a.size();i++)
		{
			driver.findElements(By.xpath("//button[contains(text(),'Add ')]")).get(i).click();
			
		}
		driver.findElement(By.xpath("//a[contains(text(),' Checkout')]")).click();
		
		
		
		
		
		
		

	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String pwd = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String [] PasswordArray = pwd.split("'");
		String password = PasswordArray[1].split("'")[0];
		return password;
	}

}
