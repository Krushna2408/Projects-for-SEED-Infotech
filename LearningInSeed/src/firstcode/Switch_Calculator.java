package firstcode;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {

		Scanner s=new Scanner (System.in);
		
		
		System.out.println("1=addition /n 2=subtraction /n 3=multiplication /n 4=division");
		System.out.println("Choose Operator: ");
		
		int operator = s.nextInt();
		
		System.out.println("Enter first number:");
		int a = s.nextInt();
		
		System.out.println("Enter Second number:");
		int b = s.nextInt();
		
		int result=0;
		
		switch(operator) {
		case 1:
			result = a+b;
			break;
		case 2:
			result = a-b;
			break;
		case 3:
			result =a*b;
			break;
		case 4:
			result =a/b;
			break;
			
			default:
				System.out.println("Invalid operator");
		
		}
		System.out.println("Result: "+result);
		

	}

}
