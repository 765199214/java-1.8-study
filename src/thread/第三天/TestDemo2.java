package thread.第三天;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		MyThread2 mt =new MyThread2();
		mt.run();//直接通过对象调用run()   ----  //得出：main是主线程
		new Thread(mt).start();//通过线程调用
		
		

	}

}
