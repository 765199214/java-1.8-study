package thread.第三天;
class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+",x="+i);
		}
		System.out.println(Thread.currentThread().getContextClassLoader());;
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));;
	}
	
}
public class TestDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt,"有名线程").start();
	}

}
