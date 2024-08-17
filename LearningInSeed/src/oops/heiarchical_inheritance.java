package oops;

public class heiarchical_inheritance 
{
	void salary()
	{
		System.out.println("i am in parant class");
	}
}
class employee2 extends heiarchical_inheritance
{
	void ITdepartment()
	{
		System.out.println("i am in child");
	}
}
class location1 extends heiarchical_inheritance
{
	void comp_location()
	{
		System.out.println("Nagpur");
	}

	public static void main(String[] args) 
	{
		employee e1=new employee();
		e1.ITdepartment();
		location l1=new location();
		l1.salary();
		l1.comp_location();
	}

}
