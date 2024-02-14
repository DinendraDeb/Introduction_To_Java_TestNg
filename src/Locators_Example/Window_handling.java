package Locators_Example;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Material')]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		String text = driver.findElement(By.xpath("//a[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		String username = text.split("@")[1].split(".")[0];
		System.out.println(username);
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(text);
		
		

	}

}
