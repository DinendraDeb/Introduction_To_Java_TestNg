package core_Java;

public class Exception_java {

	public static void main(String[] args) {
		int b= 7;
		int c =0;
		try
		{
			int k = b/c;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("Caught an exception!!");
		}
		finally
		{
			System.out.println("delete cookies !!");
		}
		
	}

}
