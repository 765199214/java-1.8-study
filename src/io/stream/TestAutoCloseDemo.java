package io.stream;

class Message implements AutoCloseable {
	public Message() {
		System.out.println("创建一条新的消息");
	}
	public void print() {
		System.out.println("打印一条信息");
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("【AutoCloseable接口】进行关闭方法的处理");
		
		//抛出一个异常   照样调用
		//throw new Exception("666666");
	}

}

/**
 * 自动关闭操作的 演示
 * 
 * @author 76519
 *
 */
public class TestAutoCloseDemo {
	public static void main(String[] args) throws Exception {
		
		//实现AutoCloseable接口   覆写close方法   会自动进行close()的调用
		
		//查看下列代码信息打印的顺序
		try (Message message = new Message()) {//必须放置在try里
			message.print();
		}
		/*
		 * try(Message message = new Message()){
		 * 
		 * }catch(Exception e){ e.printStackTrace(); }
		 */
	}
}
