package thread;

/**
 * 当多个线程访问 MyThread 的 run 方法的时候，如果使用了 Synchronized 修饰，<br>
 * 那个多线程就会以排队的方式进行处理（这里排队是按照 CPU 分配的先后顺序而定的），<br>
 * 一个线程想要执行 Synchronized 修饰的方法里的代码，<br>
 * 首先是尝试获得锁，如果拿到锁，执行 Synchronized 代码体的内容，<br>
 * 如果拿不到锁的话，这个线程就会不断的尝试获得这把锁，直到拿到为止，<br>
 * 而且多个线程同时去竞争这把锁，也就是会出现锁竞争的问题。
 * 
 * @author 76519
 *
 */
public class ThreadTest2 extends Thread {
	private int count = 5;

	@Override
	public synchronized void run() {
		count--;
		System.out.println(this.currentThread().getName() + " count " + count);
	}

	public static void main(String[] args) {
		ThreadTest2 tt = new ThreadTest2();
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
	}
}
