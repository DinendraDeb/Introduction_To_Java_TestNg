package Locators_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement e = driver.findElement(By.xpath("/div[@class='form-group']/input[@name = 'name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(e)).getText());
        WebElement e1 = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
        driver.findElement(with(By.tagName("input")).below(e1)).click();
        
        
        

	}

}
