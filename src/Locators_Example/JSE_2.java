package Locators_Example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class JSE_2 {

	public static void main(String[] args) throws InterruptedException {
		int sum = 0;
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@id = 'autocomplete']"));
		e.click();
		e.sendKeys("Ind");
		Thread.sleep(3000L);
		e.sendKeys(Keys.DOWN);
		e.sendKeys(Keys.DOWN);
		e.click();
	}

}
