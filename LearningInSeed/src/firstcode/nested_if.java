package firstcode;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {

		String usename="Krushna";
		String password="pass@jave";
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter username");
		String username=s.nextLine();
		
		System.out.println("Enter username");
		String pass=s.nextLine();
		
		if(usename.equals(username))
		{
			if(password.equals(pass))
			{
				System.out.println("login sucessful");
			}
			else 
			{
				System.out.println("invalid pass and username");
			}
				
		}
		else {
			System.out.println("invalid username");
		}

	}

}
