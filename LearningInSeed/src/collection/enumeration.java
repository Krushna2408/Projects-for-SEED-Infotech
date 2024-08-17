package collection;


import java.util.Enumeration;
import java.util.Vector;

public class enumeration 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(100);
		v.add("java");
		v.add(10.30);
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
