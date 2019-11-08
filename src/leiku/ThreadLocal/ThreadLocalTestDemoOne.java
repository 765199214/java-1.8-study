package leiku.ThreadLocal;
class Message{
	private String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}

class MessageComsumer{
	public void print(Message msg) {//此处必须明确接收Message对象
		System.out.println(Thread.currentThread().getName()+"="+msg.getNote());
	}
}
public class ThreadLocalTestDemoOne {
	public static void main(String[] args) {
		System.out.println("666");
		new Thread(()->{
			Message message = new Message();
			message.setNote("hello java");
			new MessageComsumer().print(message);
		},"线程一").start();
		
		new Thread(()->{
			Message message = new Message();
			message.setNote("linkpower lock");
			new MessageComsumer().print(message);
		},"线程二").start();
		
		//由此  引出一个问题：MessageConsumer类中   必须引用一个message对象  执行  打印操作
		//如果我本身是不想在peint()方法中传递参数   -----   直接无参操作   同样执行   如何实现？
	}
}
