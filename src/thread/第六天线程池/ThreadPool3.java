package thread.第六天线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/***
 * 阿里巴巴的Java开发手册中明确地指出，不允许使用Executors来创建线程池
 * @author 76519
 *
 */
public class ThreadPool3 {
	public static int count = 0;
	public static int getCount(){
		return count;
	}
	public static void setCount(){
		count++;
	}
	public static void main(String[] args) {
		ExecutorService executorService = new ThreadPoolExecutor(10, 100,
				60L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
		
		for (int i = 0; i < 1000; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					setCount();
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
		System.out.println(getCount());
	}
}
