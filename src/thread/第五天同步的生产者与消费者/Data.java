package thread.第五天同步的生产者与消费者;

//数据保存类
public class Data {
	private String title;
	private String note;

	public synchronized void get() {
		// 为了体现效果 这里增加延迟效果
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.title + " = " + this.note);
	}

	// 为了解决多线程不同步时 造成 数据的不同步性问题
	public synchronized void set(String title, String note) {
		this.title = title;
		// 为了体现效果 这里增加延迟效果
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.note = note;
	}
}
