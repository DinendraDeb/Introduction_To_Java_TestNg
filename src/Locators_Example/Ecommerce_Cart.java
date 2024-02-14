package Locators_Example;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce_Cart {

	public static void main(String[] args) {
		String [] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> E = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
		for (int i =0 ; i< E.size();i++)
		{
			String name = E.get(i).getText().trim();
			String[]name1 = name.split(" ");
			String name2 = name1[0];
			List a = Arrays.asList(itemsNeeded);
			int j =0;
			if (a.contains(name2))
			 {
			j++;
			driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
			if (j==3)
			  {
				break;
			  }
			
			 }
		}
		driver.findElement(By.xpath("//a[@class = 'cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[contains(@class,'cart-preview')]/div/button")).click();
		driver.findElement(By.xpath("//input[@class = 'promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]")));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText());
		
		
 }

}
