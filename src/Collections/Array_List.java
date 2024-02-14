package Collections;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Dinendra");
		arr.add("Aishani");
		System.out.println(arr);
		arr.add(0, "Raj");
		System.out.println(arr);
		System.out.println(arr.get(2));
		System.out.println(arr.contains("Raj"));
		System.out.println(arr.indexOf("Raj"));
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		//arr.remove(1);
		//arr.remove("Raj");

	}

}
