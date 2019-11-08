package thread.实现Runnable接口;

class MyThread implements Runnable{//线程主体类
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
		//实现Runnable接口后    虽然解决了单继承的局限性   但由于不是继承Thread类  所以无Thread类的start()可以调用
		MyThread m1 = new MyThread("hello");
		MyThread m2 = new MyThread("java");
		//关注thread的构造方法     public Thread(Runnable target)
		new Thread(m1).start();
		new Thread(m2).start();
	}
}
