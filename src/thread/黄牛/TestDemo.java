package thread.黄牛;

class MyThread extends Thread{
	//总的票数
	private int ticket = 30;
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			if(this.ticket > 0) {
				System.out.println("黄牛"+Thread.currentThread().getName()+"卖票,票数："+this.ticket--);
			}
		}
	}
}

public class TestDemo {
	public static void main(String[] args) {
		//3个人卖票       有问题的实现方式(票数未共享)----三个对象  各有各的ticket
		//new MyThread().start();
		//new MyThread().start();
		//new MyThread().start();
		
		//要想实现黄牛卖票   就需要在堆内存中  只定义一个对象(形成堆中一个ticket)，然后多个线程调用
		MyThread m = new MyThread();
		new Thread(m,"A").start();
		new Thread(m,"B").start();
		
		//引出一个问题：
		//MyThread有start()   还要调用别的start  虽能实现功能  但结构设计不好   所以使用runnable
	}

}
