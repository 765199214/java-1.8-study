package thread.第四天同步;

/**
 * 以卖票为例
 * @author Administrator
 *
 */
class MyTest implements Runnable{
	private int ticket = 10;//10张票
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			//如果还有票  才能继续卖
			if(this.ticket > 0) {
				//打印当前线程名称   和  所剩  票数
				System.out.println(Thread.currentThread().getName()+",x="+this.ticket--);
			}
		}
	}
	
}

public class TestDemo2 {
	public static void main(String[] args) {
		//考虑到票数的共享  应该是几个线程共有一个对象
		MyTest mt = new MyTest();
		new Thread(mt,"票贩子A").start();
		new Thread(mt,"票贩子B").start();
		new Thread(mt,"票贩子C").start();
		
		//所以   理论上没有网络延迟的情况下   所有的票都能卖完   且不会出错
		//由此  引出问题   若出现网络延迟呢？
	}
}
