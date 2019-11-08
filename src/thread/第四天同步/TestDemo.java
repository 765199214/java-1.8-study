package thread.第四天同步;
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int x = 0; x < 10;x++) {
			System.out.println(Thread.currentThread().getName()+",x="+x);
		}
	}
	
}
public class TestDemo {
	public static void main(String[] args) {
		//线程的优先级     优先级越高   只是 越有可能先执行
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt,"线程A");
		Thread t2 = new Thread(mt,"线程B");
		Thread t3 = new Thread(mt,"线程C");
		//设置优先级
		t1.setPriority(Thread.MIN_PRIORITY);//A
		t2.setPriority(Thread.MAX_PRIORITY);//B
		t3.setPriority(Thread.NORM_PRIORITY);//C
		
		t1.start();
		t2.start();
		t3.start();
	}

}
