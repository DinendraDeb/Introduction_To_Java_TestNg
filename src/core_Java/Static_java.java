package core_Java;

public class Static_java {
	//instance variables
	String name;
	String address;
	static String city = "Kolkata";
	static int i =0;
	
Static_java(String name, String address)//local variables
{
		
	this.name = name;
	this.address= address;
	i++;
	System.out.println(i);
}
	
 public void getaddress() {
	 System.out.println(name+" "+address+" "+city);
		
	}
 
 public static void getCity() 
 {
	System.out.println(city); 
 }
	

	public static void main(String[] args) {
		Static_java S = new Static_java("Dinendra","BT Road");
		Static_java S1 = new Static_java("Aishani","Dhakuria");
		S.getaddress();
		S1.getaddress();
		Static_java.getCity();
		getCity();
		

	}

}
