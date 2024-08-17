package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iIterate
{
	public static <E> void main (String []args)
	{
		ArrayList al=new ArrayList();
		
		al.add(50);
		al.add(90);
		al.add(20);
		al.add("deepak");
		al.add("amit");
		
		System.out.println(al);
		
		Iterator<E> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println(al.remove(2));
		System.out.println(al);
	}
	
}