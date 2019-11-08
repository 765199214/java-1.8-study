package thread.第五天死锁;
//小明想要用小王的本子   完成书写
class Pen{
	public synchronized void get(Note n) {
		System.out.println("为了得到本");
		n.result();
	}
	//若要不死锁  有一方的result方法必须不为 synchronized
	public synchronized void result() {
		System.out.println("用笔为了涂鸦");
	}
}
//小王想要用小明的笔   完成书写
class Note{
	public synchronized void get(Pen p) {
		System.out.println("为了得到笔");
		p.result();
	}
	//若要不死锁  有一方的result方法必须不为 synchronized
	public synchronized void result() {
		System.out.println("用本为了画画");
	}
}
//模拟死锁
public class DeadLock implements Runnable{
	//方便访问  使用static
	private static Note note = new Note();
	private static Pen pen = new Pen();
	
	public static void main(String[] args) {
		new DeadLock();
	}
	public DeadLock() {
		new Thread(this).start();
		pen.get(note);
	}
	@Override
	public void run() {
		note.get(pen);
	}

}
