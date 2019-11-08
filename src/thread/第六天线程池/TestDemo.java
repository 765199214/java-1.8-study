package thread.第六天线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		//创建一个线程池的模型   但是里面没有线程
		//无限大小的线程池
		ExecutorService executorService = Executors.newCachedThreadPool();
		//创建单线程池
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		//创建固定大小的线程池
		//ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			//添加延迟效果  或者   不添加延迟    运行有差异(添加了延迟效果后    线程运行会有空余)
			//Thread.sleep(200);
			int index = i;//保存一下i的内容
			executorService.submit(() -> {
				System.out.println(Thread.currentThread().getName()+"、i= "+index);
			});
		}
		//关闭线程池
		executorService.shutdown();
	}

}
