package thread.第五天同步的生产者与消费者等待与唤醒机制;

//数据保存类
public class Data {
	private String title;
	private String note;
	
	//添加boolean值  进行限制和判断操作
	//true ：表示允许生产者生产，但不允许消费者取走数据(Data盒子为绿灯,生产者可以将生产的产品存入Data中)
	//false：表示生产完毕，允许消费者取走数据，但不能够生产(Data盒子为红灯，生产者产出的东西不能进入智能先等待，等待消费者将数据取走后才能再放入)
	private boolean flag = false;

	public synchronized void get() {
		if(this.flag == false) {
			//已经生产了，不允许重复生产数据    生产者产生的数据需要先进行等到操作
			//使用Object类中定义的wait()，让线程先等待
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 为了体现效果 这里增加延迟效果
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.title + " = " + this.note);
		this.flag = true;//表示生产者生产的数据已存入了，不允许继续存入  应该优先等待
		super.notify();//唤醒等待线程
	}

	// 为了解决多线程不同步时 造成 数据的不同步性问题
	public synchronized void set(String title, String note) {
		if(this.flag == true) {
			//现在不允许消费者取走
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.title = title;
		// 为了体现效果 这里增加延迟效果
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.note = note;
		
		this.flag = false;//表示继续生产者将数据存入
		super.notify();//唤醒等待线程
	}
}
