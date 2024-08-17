package firstcode;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
		
		System.out.println("Science marks ");
		int sub1=input.nextInt();
		
		System.out.println("Maths marks ");
		int sub2=input.nextInt();
		
		System.out.println("Sst marks ");
		int sub3=input.nextInt();
		
		System.out.println("English marks ");
		int sub4=input.nextInt();
		
		System.out.println("total marks");
		int totalgain = sub1+sub2+sub3+sub4;
		float per=(totalgain / 400.0f) *100;
		
		System.out.println("Totl Marks: "+totalgain+"/400");
		System.out.println("Percentage: "+per+"%");
		
		 if (per<=30.0f) {
			 System.out.println("You are fail");
		 }
		 else {
			 System.out.println("you are pass");
		 }


	}

}
