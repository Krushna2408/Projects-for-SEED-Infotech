package thread;

public class Threadjoin extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " " + "child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Threadjoin tj = new Threadjoin();
		tj.start();
		tj.join();
		
			for (int i = 0; i <= 5; i++) {
				System.out.println(i + " " + "main thread");
				Thread.sleep(1000);
			}
		
	}

}