package thread;

public class ThreadTest1 extends Thread {
	private int count = 5;

	@Override
	public void run() {
		count--;
		System.out.println(this.currentThread().getName() + " count " + count);
	}

	public static void main(String[] args) {
		ThreadTest1 tt = new ThreadTest1();
		Thread t1 = new Thread(tt, "thread1");
		Thread t2 = new Thread(tt, "thread2");
		Thread t3 = new Thread(tt, "thread3");
		Thread t4 = new Thread(tt, "thread4");
		Thread t5 = new Thread(tt, "thread5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		/**
		 * thread2 count 3 thread1 count 3 thread4 count 1 thread3 count 0
		 * thread5 count 1
		 */
	}
}
