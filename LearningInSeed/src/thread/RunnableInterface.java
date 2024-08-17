package thread;

public class RunnableInterface implements Runnable//STEP1=implements Runnable Interface
{
 	public void run()                            //step 2=override the run()method
	{
		System.out.println("interface1");
	}
	public static void main(String[] args) 
	{                                    
		RunnableInterface RI=new RunnableInterface();//Step 3= create class object
		Thread th=new Thread(RI);                    //STEP 4=Create Thread class object for Runnable Interface                         
		th.start();                     //step 5=start the thread by using start()
	}
}