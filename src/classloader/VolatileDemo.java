package classloader;

/**
 * volatile:保证多线程变量副本的可见性
 * @author 765199214
 */
public class VolatileDemo {
	public static volatile boolean isChanged = false;
	public static void main(String[] args) throws InterruptedException {
		//开启线程一  
		new Thread(()->{
			System.out.println("等待数据-------");
			//死循环  等待数据变更(当全局变量变更，则死循环结束)
			while(!isChanged){
			}
			System.out.println("数据变更了------");
		}).start();
		//主线程等待
		Thread.sleep(3000);
		//线程二
		new Thread(()->{
			changeData();
		}).start();
		
	}
	public static void changeData(){
		System.out.println("数据变更前");
		isChanged = true;
		System.out.println("数据变更了");
	}
}
