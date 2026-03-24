package TCA.LAB;

class Ticket implements Runnable{
	private int tick= 1;
	private synchronized void book() {
		if(tick >0) {
			System.out.println(Thread.currentThread().getName() + "booked ticket"+tick);
			tick--;
		}
		else {
			System.out.println(Thread.currentThread().getName() + "No ticket");
		}
	}
	public void run() {
		book();
	}
}
public class TicketRegervation {

	public static void main(String[] args) {
		Ticket booking = new Ticket();
		Thread t1 = new Thread(booking,"passenger1 ");
		Thread t2 = new Thread(booking,"passenger2 ");
		t1.start();
		t2.start();
	}

}
