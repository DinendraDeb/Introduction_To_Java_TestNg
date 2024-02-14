package Locators_Example;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebtabeSorting_Streams {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> e = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originallist = e.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originallist.equals(sortedlist));
        
        List<String> price = e.stream().filter(s->s.getText().contains("Beans")).
        		map(s->getpriceVeggie(s)).collect(Collectors.toList());
        price.forEach(a-> System.out.println(a));
        
        if(price.size()<1)
        {
        	driver.findElement(By.xpath("//a[@aria-label= 'Next']")).click();
        	List<WebElement> e1 = driver.findElements(By.xpath("//tr/td[1]"));
        	List<String> price1 = e1.stream().filter(s->s.getText().contains("Beans")).
            		map(s->getpriceVeggie(s)).collect(Collectors.toList());
            price1.forEach(a-> System.out.println(a));
        }

}

	private static String getpriceVeggie(WebElement s) {
		String Value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Value;
	}
}
