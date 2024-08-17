package collection;

import java.util.ArrayList;
import java.util.ListIterator;
public class listitrDemo 
{
	public static void main(String[] args) 
	{
		ArrayList A=new ArrayList();
		
		A.add(10);
		A.add("shantanu");
		A.add(55.00);
		
		System.out.println(A);
		
		ListIterator l=A.listIterator();
//		
		while (l.hasNext()) {
			System.out.println(l.next());
		}
     		System.out.println("====================================");
     		while(l.hasPrevious())
		   {
     			System.out.println(l.previous());
     		}
//     		l.add(200);
//		    l.set(20);
		
//		 System.out.println(A);	

	}
}