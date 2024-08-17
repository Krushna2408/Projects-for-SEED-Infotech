package oops;

public class multi_inheritance 
{
	void salary()
	{
		System.out.println("i am in parant class");
	}
}
class employee1 extends multi_inheritance
{
	void ITdepartment()
	{
		System.out.println("i am in child");
	}
}
class location extends employee
{
	void comp_location()
	{
		System.out.println("Nagpur");
	}

	public static void main(String[] args) 
	{
		location e1=new location();
		e1.ITdepartment();
		e1.salary();
		e1.comp_location();
	}

}
