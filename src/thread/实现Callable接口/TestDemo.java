package thread.实现Callable接口;
import java.util.concurrent.FutureTask;

//java.util.concurrent.Callable<T>   T表示返回类型
class MyThread implements java.util.concurrent.Callable<String> {
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 40; i++) {
			System.out.println("黄牛卖票,票数：" + i);
		}
		return "票卖完了";
	}
}

public class TestDemo {
	public static void main(String[] args) throws Exception{
		FutureTask<String> ft = new FutureTask<>(new MyThread());
		//执行启动多线程
		new Thread(ft).start();;
		//取得返回值
		System.out.println(ft.get());
	}
}
