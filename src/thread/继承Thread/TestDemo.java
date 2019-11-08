package thread.继承Thread;
class MyThread extends Thread{//线程主体类
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	@Override
	public void run() {//所有线程从此处开始执行
		for (int i = 0; i < 10; i++) {
			System.out.println(this.title +", i="+i);
		}
	}
}

public class TestDemo {

	public static void main(String[] args) {
		//不正确的启动     直接调用run  只是相当于顺序打印
		MyThread m1 = new MyThread("hello");
		MyThread m2 = new MyThread("java");
		//m1.run();
		//m2.run();
		
		//正确的启动
		m1.start();
		//m1.start();  //Exception in thread "main" hello, i=0java.lang.IllegalThreadStateException
		m2.start();
		
		//IllegalThreadStateException
		//m1.start();
	}

}
