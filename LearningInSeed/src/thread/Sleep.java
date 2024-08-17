package thread;

public class Sleep extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " " + Thread.currentThread().getName());

			
		}
	}

	public static void main(String[] args) {
		// public static native void sleep(mili sec) throws InterruptedException

		Sleep s1 = new Sleep();
		s1.setName("seed 1");
		s1.start();

		Sleep s2 = new Sleep();
		s2.setName("seed 2");
		s2.start();

	}

}