package firstcode;

public class operators {

	public static void main(String[] args) {
		
		//Operators
		//addition
		int a=20, b=20;
		int result=a + b;
		System.out.println("The first value is :"+ a);
		System.out.println("the second value is : "+ b);
		System.out.println("the addition of both the values are : "+result);
		
		//sub
		int result1=a-b;
		System.out.println("The subtraction of both the number is : "+ result1);
		
		//division
		float result2=a/b;
		System.out.println("the division of two number are : "+result2);
		
		//remainder
		int result3=a%b;
		System.out.println("The remainder of two numbers are : "+result3);
		
		int x = 10, y= 5;
		x += 5;
		System.out.println("Addition"+x);
		
		y -= 4;
		System.out.println("Substraction"+y);
		
		x *= 2;
		System.out.println("multiplication: "+ x);
		
		y /= 3;
		System.out.println("division: "+ y);
		
		//java rational operators
		int a1=2,a2=3;
		System.out.println(a1==a2);
		System.out.println(a1!=a2);
		System.out.println(a1>a2);
		System.out.println(a1<a2);
		System.out.println(a1<=a2);
		System.out.println(a1>=a2);
		System.out.println(a1<<a2);

	}

}
