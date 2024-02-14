package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test {

	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
		
	}
	
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("Inside the before test block");
	}
	
	@AfterTest
	public void aftertest() 
	{
	 System.out.println("Inside the after test block");	
	}
	
	@BeforeSuite
	public void beforesuite() 
	{
	 System.out.println("Inside the before suite block");	
	}
	
	@AfterSuite
	public void aftersuite() 
	{
	 System.out.println("Inside the after suite block");	
	}
	
	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println("Inside the before method block");
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println("Inside the after method block");
	}
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("Inside the before class block");
	}
	
	@AfterClass
	public void afterclass() 
	{
		System.out.println("Inside the after class block");
	}
}
