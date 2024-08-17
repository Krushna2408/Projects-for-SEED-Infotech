
package firstcode;

import java.util.Scanner;

public class While_loop_reverse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		int no =s.nextInt();
		int rem,rev=0;
		int temp = no;
		while(no != 0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if (rev==temp)
		{
			System.out.println("Num is palidrome");
		}
		else
		{
			System.out.println("Num is not palidrome");
 		}
		

	}

}
