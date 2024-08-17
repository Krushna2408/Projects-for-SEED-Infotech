package oops;

interface interface_abstract1 
{
	void show();

}
interface interface_abstract2 
{
	void display();

}

class myclass implements interface_abstract1, interface_abstract2
{
	public void show()
	{
		System.out.println("chunnu goli");
	}
	
	public void display()
	{
		System.out.println("hai kya?");
	}
	public static void main (String[] args)
	{
//		interface_abstract1 i1=new interface();
		myclass m1=new myclass();
		m1.show();
		m1.display();
	}
}
