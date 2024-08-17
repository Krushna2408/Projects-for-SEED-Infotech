package thread;


public class NamingThread 
{
	public static void main(String[] args) 
	{
	
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		 
		Thread.currentThread().setName("JAVA");
	    System.out.println(Thread.currentThread().getName());	
	}

}