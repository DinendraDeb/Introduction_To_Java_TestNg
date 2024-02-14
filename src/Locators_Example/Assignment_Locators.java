package Locators_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\debdi\\OneDrive\\Desktop\\Selenium\\Selenium_2023\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Dinendra Deb");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("a@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("PWD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		Thread.sleep(1000);
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'radio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'date']")).sendKeys("09/07/1990");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div [contains(@class, 'alert')]")).getText());
		}

}
