package synchronization;

class bookTheaterApp
{
   static int total_seats=20;
	
    static synchronized void  bookSeat(int seat)
	{
		if(total_seats>=seat)
		{
			System.out.println(seat + " seats booked successfully");
			total_seats=total_seats-seat;
			System.out.println("seats_left: "+total_seats);
		}
		else
		{
			System.out.println( seat+ "  seats cannot be booked ");
			System.out.println("total seats  "+total_seats);
		}
	}
}
class Mythread1 extends Thread
{
	bookTheaterApp b;
	int seat;
	Mythread1(bookTheaterApp b,int seat)
	{
		this.b=b;
		this.seat=seat;
	}
	public void run()
	{
		b.bookSeat(seat);
	}
}
class Mythread2 extends Thread
{
	bookTheaterApp b;
	int seat;
	Mythread2(bookTheaterApp b,int seat)
	{
		this.b=b;
		this.seat=seat;
	}
	public void run()
	{
		
		b.bookSeat(seat);
	}
}
public class MovieBookApp1 
{

	public static void main(String[] args) 
	{
		bookTheaterApp b1=new bookTheaterApp();
		
		Mythread1 m1=new Mythread1(b1,7);
		m1.start();
		
		
		Mythread2 m2=new Mythread2(b1,6);
		m2.start();
		  
		bookTheaterApp b2=new bookTheaterApp();
		
		Mythread1 m3=new Mythread1(b2,8);
		m3.start();
		
		Mythread2 m4=new Mythread2(b2,9);
		m4.start();
	}

}