
public class Function_overloading {
	public void getdata(int a) {
		System .out.println(a);
	}
    public void getdata(String a) {
    	System.out.println(a);
    }
    public void area(int side) {
    System.out.println(side * side);	
    }
    
    public void area(int length,int breadth) {
    	System.out.println(length * breadth);
    }
	public static void main(String[] args) {
		Function_overloading F = new Function_overloading();
		F.getdata(2);
		F.getdata("Dinendra");
		F.area(4);
		F.area(4, 12);
		
	}

}
