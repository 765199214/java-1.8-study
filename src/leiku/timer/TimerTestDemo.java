package leiku.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//此处可以通过TimerTask看出    是一个实现Runnable接口的抽象类---->线程
class MyTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("当前系统时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")
				.format(new Date()));
	}
	
}
public class TimerTestDemo {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//单位毫秒    1秒后开始执行   每2秒执行一次
		timer.schedule(new MyTask(), 1000, 2000);
	}
}
