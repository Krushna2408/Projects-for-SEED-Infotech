package Exception_handling;

class YoungerAgeException extends RuntimeException
{
	public YoungerAgeException (String msg)
	{
		super(msg);
	}

}
class test
{
	public static void main(String[] args)
	{
		int age =17;
		if(age<18)
		{
			throw new YoungerAgeException("you are not eligiable");
		}
		else
		{
		
			System.out.println("Eligible");
		}
	}
}
