package oops;


	// 2 . Runtime Polymorphism
	// Dynamic Polymorphism
	// We can achieve run time polymorphism by using overriding
    
//same method
	//diff class
	//same argument
	//inheritance (is-a)

public class overriding_polymorphism {
		
		void calculate(int a , int b)
		{
			System.out.println(a/b);
		}
}
	class multiply extends overriding_polymorphism
	{	
		void calculate(int a , int b)
		{
		    super.calculate(a, b);
			System.out.println(a*b);
		}

		public static void main(String[] args) 
		{
			
			multiply m1= new multiply ();
			m1.calculate(5, 3);

		
	}
	
}