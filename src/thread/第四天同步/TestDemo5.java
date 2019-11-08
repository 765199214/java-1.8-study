package thread.第四天同步;

/**
 * 以卖票为例
 * 
 * @author Administrator
 *
 */

//同步方法实现线程锁操作
class MyTest5 implements Runnable {
	private int ticket = 10;// 10张票

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			this.sale();
		}
	}
	
	//同步方法    将同步代码块改写成  同步的方法
	public synchronized void sale() {
		if (this.ticket > 0) {

			// 模拟实现网络延迟
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 打印当前线程名称 和 所剩 票数
			System.out.println(Thread.currentThread().getName() + ",x=" + this.ticket--);
		}
	}

}

public class TestDemo5 {
	public static void main(String[] args) {
		// 考虑到票数的共享 应该是几个线程共有一个对象
		MyTest5 mt = new MyTest5();
		new Thread(mt, "票贩子A").start();
		new Thread(mt, "票贩子B").start();
		new Thread(mt, "票贩子C").start();

		// 所以 理论上没有网络延迟的情况下 所有的票都能卖完 且不会出错
		// 由此 引出问题 若出现网络延迟呢？

		// 打印信息 会出现 票贩子B,x=0 票贩子A,x=-1的情况
		
		//使用synchronized关键字来锁定操作(同步代码块    或    同步方法)
	}
}
