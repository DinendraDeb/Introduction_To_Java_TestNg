package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		hm.put(0,"Dinendra");
		hm.put(1,"Aishani");
		hm.put(2, "Raj");
		System.out.println(hm);
		Set S = hm.entrySet();
		Iterator i = S.iterator();
		while(i.hasNext())
		{
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		

	}

}
