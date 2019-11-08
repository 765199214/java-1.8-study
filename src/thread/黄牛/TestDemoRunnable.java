package thread.黄牛;
class MyThreadDemo implements Runnable{
	private int ticket = 30;
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			if(this.ticket > 0) {
				System.out.println("黄牛卖票,票数："+this.ticket--);
			}else {
				System.out.println(Thread.currentThread().getName()+"  无票   "+i);
			}
		}
	}
	
}
public class TestDemoRunnable {
	public static void main(String[] args) {
		MyThreadDemo m = new MyThreadDemo();
		new Thread(m).start();
		new Thread(m).start();
	}

}
