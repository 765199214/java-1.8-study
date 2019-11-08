package thread.第六天线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTestDemo {

	public static void main(String[] args) {
		//创建一个具备有三个线程大小的定时调度线程池
		// 线程调度池
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
		
		//每次创建3个线程
		for (int i = 0; i < 3; i++) {
			int index = i;//保存一下i的内容
			//使用的是一个以秒为单位    表示1秒后开始执行   而后每5秒执行一次      TimeUnit.SECONDS表示单位为秒
			executorService.scheduleAtFixedRate(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					//System.out.println();
				}
			}, 1, 5, TimeUnit.SECONDS);
		}
	}

}
