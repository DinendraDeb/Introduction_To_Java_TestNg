import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_Basics_2 {

	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	//to print the integers in odd indexes
	for (int i= 0; i< arr.length; i++)
	{
		if(i%2 != 0)
		{
			System.out.println(arr[i]);
		}
	}
	//Arraylist:-
	ArrayList<String> a = new ArrayList<String>();
	a.add("Dinendra");
	a.add("Aishani");
	a.add("Dipendra");
	a.add("Pavitra");
	System.out.println(a.get(3));
	
	//converting static array to arraylist
	String [] str = {"Ram","Shyam","BL","CL"};
	List<String> Arr2 = Arrays.asList(str);
	System.out.println( Arr2.contains("BL"));
	
	}

	}
