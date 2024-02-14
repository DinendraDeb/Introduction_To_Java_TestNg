package Locators_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox_Check {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
        
		WebDriver driver = new FirefoxDriver();
		
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']")).click();
        String text = driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']")).getText();
        System.out.println("text");
        
        WebElement S = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
    	Select S1 = new Select(S);
    	S1.selectByVisibleText(text);

	   }
	}
