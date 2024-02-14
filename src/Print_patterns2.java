
public class Print_patterns2 {

	public static void main(String[] args) {
		int k =1;
		for (int i=0 ; i< 4; i++)
		{
			for (int j=0; j<= i; j++)
			{
				//to print in diff line
				//System.out.println(k);
				//to print in same line
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println( "");
			
		}

	}

}
