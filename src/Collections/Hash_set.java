package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Dinendra");
		hs.add("Aishani");
		hs.add("BT");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("Aishani"));
		System.out.println(hs.isEmpty());
		Iterator <String> i = hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
