import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Introduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\debdi\\OneDrive\\Desktop\\Selenium\\Selenium_2023\\chromedriver_win32\\chromedriver.exe");
		// webdriver is used as it is interface having many blank methods of driver hence to remove ambiguity using it to make sure it uses chrome driver methods only.  
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}
}
