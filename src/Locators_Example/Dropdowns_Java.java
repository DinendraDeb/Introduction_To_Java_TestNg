package Locators_Example;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns_Java {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\debdi\\OneDrive\\Desktop\\Selenium\\Selenium_2023\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static Dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i =1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic dropdown
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value= 'CCU']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(" (//a[@value='GAU'])[2]")).click();
	    
	    //Auto Suggestive
	    driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(3000);
	    List<WebElement> options =driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
	    for (WebElement option : options)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		break;
	    	}
	    	
	    }
	    
	    //Checkboxes
	    driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).click();
	    Assert.assertTrue(driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).isSelected());
	    System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
	    
	    //Calendar
	    driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	    
	    //click to enable/disable
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
	    	System.out.println("Its enabled");
	    	Assert.assertTrue(true);
	    }
	    
	    
	}
	
}
