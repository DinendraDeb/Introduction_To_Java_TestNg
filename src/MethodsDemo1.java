
public class MethodsDemo1 {

	public static void main(String[] args)
	
	{
		MethodsDemo1 M = new MethodsDemo1();
		M.getdata();
		String S = M.getdata1();
		System.out.println(S);
		getdata2();
		

	}
	//print a data inside class using objects and methods
	public void getdata()
	
	{
		System.out.println("Hello World");
		
	}
	//change method tye to return a string
	public String getdata1()
	{
		System.out.println("My name is Dinendra Deb!!");
		return "PwC";
	}
	//using static keyword
	public static void getdata2()
	{
		System.out.println("Inside Static Block");
	}

}
