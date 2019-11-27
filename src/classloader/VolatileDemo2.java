package classloader;

/**
 * 验证volatile关键字<i>无法</i>保证原子性
 * @author 765199214
 *
 */
public class VolatileDemo2 {
	
	public static volatile int syncnum = 0;
	public static volatile int num = 0;
	
	public static synchronized void syncincrease(){
		syncnum ++;
	}
	public static  void increase(){
		num ++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		//1、创建10个线程
		Thread[] syncthreads = new Thread[10];
		Thread[] threads = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			
			//十个线程都调用同步方法
			syncthreads[i] = new Thread(()->{
				for (int j = 0; j < 1000; j++) {
					syncincrease();
				}
			});
			syncthreads[i].start();
			
			//十个线程都调用普通方法
			threads[i] = new Thread(()->{
				for (int j = 0; j < 1000; j++) {
					increase();
				}
			});
			threads[i].start();
		}
		
		//等待所有线程执行完成  才继续执行下面的代码
		for (Thread syncthread : syncthreads) {
			syncthread.join();
		}
		for (Thread thread : threads) {
			thread.join();
		}
		
		System.out.println(syncnum);
		//System.out.println(num);
	}
}
