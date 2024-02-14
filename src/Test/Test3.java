package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test3 {
	@Parameters({"URL"})
	@Test(groups = {"Smoke"})
	public void demo3(String urlname)
	{
		System.out.println("To check smoke group");
		System.out.println(urlname);
		
	}
	@Test(groups = {"Smoke"},dataProvider = "getdata")
	public void demo2(String username, String password)
	{
		System.out.println(username+"..."+password);
	}
	
	@Test(groups = {"Regression"})
	public void SecondTest3()
	{
		System.out.println("To check regression group");
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] dataset = new Object[3][2];
		dataset[0][0] = "username";
		dataset[0][1] = "pwd";
		
		dataset[1][0]= "user2";
		dataset[1][1]= "pwd2";
		
		dataset[2][0] = "user3";
		dataset[2][1] = "pwd3";
		
		
		return dataset;
	}

}
