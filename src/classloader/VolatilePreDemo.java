package classloader;

/**
 * 验证两个线程修改    变量信息(高速缓存内容)   是修改副本，不会修改主体<br>
 * 参考:1.png  <br>
 * 结论：<br>
 * 	   运行结果与想象可能有不同，存在代码运行一直未停止的现象。<br>
 * 	   说明线程二修改的"共享变量"并不会影响到其他内存，所以主内存中的"共享变量"加载至各项线程中是副本，并非数据主体本身。<br>
 * @author 765199214
 *
 */
public class VolatilePreDemo {
	public static boolean isChanged = false;
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
