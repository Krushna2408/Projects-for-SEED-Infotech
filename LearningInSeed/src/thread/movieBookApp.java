package thread;

class BookTheaterSeat {
	int total_seats = 10;

	synchronized void bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + "seats booked succesfully");
			total_seats = total_seats - seats;
			System.out.println("seats left : " + total_seats);
		} else {
			System.out.println("seats can not be booked");
			System.out.println(" seats Left: " + total_seats);
		}
	}
}

public class movieBookApp extends Thread {
	 static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		movieBookApp mb = new movieBookApp();
		mb.seats = 7;
		mb.start();

		movieBookApp mb1 = new movieBookApp();
		mb1.seats = 6;
		mb1.start();

	}
}
