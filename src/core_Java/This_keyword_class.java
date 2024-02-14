package core_Java;

public class This_keyword_class {
	
	int a = 2;
	
	public void getdata() {
		int a =3;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		This_keyword_class th = new This_keyword_class();
		th.getdata();
		}

}
