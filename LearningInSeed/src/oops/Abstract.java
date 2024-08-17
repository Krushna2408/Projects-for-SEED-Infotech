package oops;

abstract class Abstract 
{
	abstract void start();

}
class car extends Abstract
{
	void start()
	{
		System.out.println("start with key");
	}
}
class scooter extends Abstract
{
	void start()
	{
		System.out.println("start with key");
	}
	public static void main (String[] args)
	{
		Abstract v1=new car();
		v1.start();
		
		scooter s1=new scooter();
		s1.start();
	}
}
