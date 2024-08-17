package oops;

public class call_by_method {
	String name;
	int age;
	
	void show(String n, int a) 
	{
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
	public static void main(String[]args) 
	{
		call_by_method a1= new call_by_method();
		a1.show("shadow", 10);
		a1.display();
	}
		

}
