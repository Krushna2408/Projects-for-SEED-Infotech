package oops;
//polymorphism
//ploy=many
//morphism= forms

//water= solid/liquid/gas

//overloading

//two types of polymorphishm
//1. compiletime polymorphishm
//static polymorphishm
//we can achived compiletime polymorphism by using overloading

//overloading

public class overloading_polymorphism 
{
	void salary(int a, String d)
	{
		System.out.println("core");
	}
	void salary(int b, int d)
	{
		System.out.println("java");
	}
	public static void main(String[]args)
	{
		overloading_polymorphism e1=new overloading_polymorphism();
		e1.salary(10, 20);
		e1.salary(10,"java");
		
	}

}



