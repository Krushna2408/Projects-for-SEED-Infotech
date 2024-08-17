package thread;

public class ThreadYeild extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadYeild ty=new ThreadYeild();
		ty.start();
		ty.yield();
		
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

}