package Locators_Example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		int sum = 0;
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000L);
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List <WebElement> values  = driver.findElements(By.xpath("//div[@class = 'tableFixHead']//td[4]"));
		for(int i =0 ; i< values.size();i++)
		{
			
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		String text = driver.findElement(By.xpath("//div[@class = 'totalAmount']")).getText();
		int Number =  Integer.parseInt(text.split(":")[1].trim());
		System.out.println(Number);
		Assert.assertEquals(sum, Number);
		

	}

}
