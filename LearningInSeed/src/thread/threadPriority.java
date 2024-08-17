package thread;

//1=MIN_PRIORITY
//5=NORM_PRIORIty
//10=MAX_PRIORITY
public class threadPriority extends Thread
{
	public void run()
	{
		System.out.println("Child thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
//		System.out.println(Thread.currentThread().getName());
	    System.out.println(Thread.currentThread().getPriority());
//	 
	    Thread.currentThread().setPriority(MIN_PRIORITY);
	    threadPriority tp=new threadPriority();
	 
	    tp.start();
	}
}