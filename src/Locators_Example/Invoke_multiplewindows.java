package Locators_Example;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invoke_multiplewindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Set<String> wh = driver.getWindowHandles();
        Iterator<String> it = wh.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        driver.get("https://rahulshettyacademy.com/");
        String text = driver.findElement(By.xpath("//h2/a[@href = 'https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).getText();
        driver.switchTo().window(parentid);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='form-group']/input[@name = 'name']")).sendKeys(text);
        WebElement name = driver.findElement(By.xpath("//div[@class='form-group']/input[@name = 'name']"));
        //File file = name.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file,new File("Screenshot.png"));
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
        
	}

}
