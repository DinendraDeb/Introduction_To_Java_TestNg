
public class Class_implements_interface implements CentralTraffic_Interface {

	public static void main(String[] args) {
		CentralTraffic_Interface CI = new Class_implements_interface();
		CI.red();
		CI.green();
		CI.yellow();
		

	}

	@Override
	public void red() {
		System.out.println("Red Signal");
		
	}

	@Override
	public void green() {
		System.out.println("Green signal");
		
	}

	@Override
	public void yellow() {
		System.out.println("Yellow signal");
		
	}

}
