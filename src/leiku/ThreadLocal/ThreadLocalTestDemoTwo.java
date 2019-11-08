package leiku.ThreadLocal;
class Message2{
	private String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}

class MessageComsumer2{
	public void print() {
		System.out.println(Thread.currentThread().getName()+"="+MesgUtil.get().getNote());
	}
}

//创建一个类  实现数据的保存
class MesgUtil{
	private static ThreadLocal<Message2> local = new ThreadLocal<Message2>();
	//ThreadLocal有几个重要的方法
	//设置一个数据  set
	//取得一个数据  get
	//删除数据    remove
	
	public static void set(Message2 message2) {
		local.set(message2);
	}
	public static Message2 get() {
		return local.get();
	}
	
}
public class ThreadLocalTestDemoTwo {
	public static void main(String[] args) {
		new Thread(()->{
			Message2 message2 = new Message2();
			message2.setNote("hello java");
			MesgUtil.set(message2);
			new MessageComsumer2().print();
		},"线程一").start();
		
		new Thread(()->{
			Message2 message2 = new Message2();
			message2.setNote("linkpower lock");
			MesgUtil.set(message2);
			new MessageComsumer2().print();
		},"线程二").start();
	}
}
