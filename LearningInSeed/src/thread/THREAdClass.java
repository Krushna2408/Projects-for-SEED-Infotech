package thread;

//we can create threads by using 
//1.Thread (Class)
//2.Runnable (Interface)

public class THREAdClass extends Thread    //Step1= Extend the thread class
{
	public void run()                     //Step2=override the run method
	{
		System.out.println("thread");
	}
	public static void main(String[] args) 
	{
		THREAdClass th=new THREAdClass();  //step 3=create object of  class		                     
		th.start();                       //step4 =start the thread
	}
}