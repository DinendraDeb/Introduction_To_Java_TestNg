
public class Java_Basics {

	public static void main(String[] args) {
		//Declaring a number and printing:-
		int num = 5;
		String Str = "I am Dinendra";
		char ch = 'D';
	    double f = 20.9;
	    boolean B = true;
	    System.out.println(B);
	    //array:-
	    int[] arr = new int[5];
	    arr[0]=0;
	    arr[1]=1;
	    arr[2]=2;
	    arr[3]=3;
	    arr[4]=4;
	    int[] arr2 = {0,1,2,3,4};
	    System.out.println(arr[2]);
	    //for loop:-
	    int i;
	    for (i=0 ; i< arr.length ; i++ )
	    {
	    	System.out.println(arr[i]);
	    }
	    //String array using enhanced for loop
	    String[] name = {"Dinendra","Aishani","Dipendra","Pavitra"};
	    for (String s: name)
	    {
	    	System.out.println(s);
	    	
	    }
	    
	    
	
		
		

	}

}
