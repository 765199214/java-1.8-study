package cn.匿名内部类;

public class TestDemo {
	public static void main(String[] args) {
		//通常方式
		IMessage iMessage = new MessageImpl();
		fun(iMessage);
		
		//使用匿名内部类
		IMessage iMessage2 = new IMessage() {
			@Override
			public void print() {
				System.out.println("mldn!!");
			}
		};
		fun(iMessage2);
	}
	
	public static void fun(IMessage iMessage) {
		iMessage.print();
	}
}
