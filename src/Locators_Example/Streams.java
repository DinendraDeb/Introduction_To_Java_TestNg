package Locators_Example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		ArrayList<String> a =  new ArrayList<String>();
		a.add("Dinendra");
		a.add("Dipendra");
		a.add("Pavitra");
		a.add("Aishani");
		a.add("RahulShetty");
		//int count = 0;
		//for (int i =0 ; i<a.size();i++)
		//{
		//	String actual = a.get(i);
		//	if(actual.startsWith("D"))
		//	{
		//		count++;
		//	}
		//}
		Long c = a.stream().filter(s->s.startsWith("D")).count();
		System.out.println(c);
		
		long d = Stream.of("Dravid","Tendulkar","Kohli","Yuvraj","Balaji").filter(s->
		{
			s.startsWith("D");
			return true;
			
		}).count();
		System.out.println(d);

	}

}
