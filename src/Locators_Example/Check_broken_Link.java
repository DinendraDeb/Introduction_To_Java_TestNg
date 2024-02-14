package Locators_Example;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.time.Duration;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_broken_Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String url = driver.findElement(By.xpath("//a[contains(text(),'Broken Link')]")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url)..OpenConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		

	}

}
