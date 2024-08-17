package firstcode;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {

		
		Scanner  s = new Scanner (System.in);
		
		System.out.println("Enter the Year");
		
		int year = s.nextInt();
		
		if(year % 4==0) {
			
			if(year % 100==0) {
				
				if(year % 400==0) {
					
					System.out.println("Current Year is Leap Year");
				}
				else {
					System.out.println("It's a Leap Year");
				}
				
			}
			
			else {
				System.out.println("Current Year is Probably a Leap Year");
			}
		}
		else {
			System.out.println("Current Year is not Leap Year");
		}
		

	}

}