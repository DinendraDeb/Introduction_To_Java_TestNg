
public class Print_smallest_number {

	public static void main(String[] args) {
		int min = 0 ;
		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1]= 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 9;
		for (int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		    
		    if (a[i][j] < min)
		    {
		    	min = a[i][j];
		    }
			}
		}
		System.out.println(min);
}

}
