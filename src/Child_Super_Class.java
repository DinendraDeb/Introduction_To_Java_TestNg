
public class Child_Super_Class extends Parent_Super_class {
	
	String name  = "Dinendra";
	
	public void getdata() 
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
	Child_Super_Class C = new Child_Super_Class();
	C.getdata();

	}

}
