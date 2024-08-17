package oops;

public class inheritance 
{
	void salary()
	{
		System.out.println("i am in parant class");
	}
}
//single line inheritance
class employee extends inheritance
{
	void ITdepartment()
	{
		System.out.println("i am in child");
	}

	public static void main(String[] args) 
	{
		employee e1=new employee();
		e1.ITdepartment();
		e1.salary();
	}

}
