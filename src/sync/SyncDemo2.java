package sync;

import java.util.Date;

public class SyncDemo2 {
	public static volatile int syncnum1 = 0;
	public static volatile int syncnum2 = 0;
	//同步方法
	public static synchronized void syncincrease1(int ints) throws InterruptedException{
		System.out.println("Thread Name = "+Thread.currentThread().getName()+"  syncincrease  ints = "+ints);
		System.out.println("-->"+System.currentTimeMillis());
		syncnum1 ++;
		System.out.println(syncnum1);
		//延迟五秒  运行查看线程信息  
		Thread.sleep(5000);
	}
	//同步类
	public static void syncincrease2 (int ints) throws InterruptedException{
		System.out.println("Thread Name = "+Thread.currentThread().getName()+"  syncincrease  ints = "+ints);
		System.out.println("-->"+System.currentTimeMillis());
		synchronized(SyncDemo2.class){
			syncnum2 ++ ;
			System.out.println(syncnum2);
			//延迟五秒  运行查看线程信息  
			Thread.sleep(5000);
		}
	}
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[10];
//		for (int i = 0; i < 10; i++) {
//			threads[i] = new Thread(()->{
//				for (int j = 0; j < 20; j++) {
//					try {
//						syncincrease1(j);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			});
//			
//			threads[i].start();
//		}
		
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(()->{
				for (int j = 0; j < 20; j++) {
					try {
						syncincrease2(j);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			threads[i].start();
		}
	}
}
