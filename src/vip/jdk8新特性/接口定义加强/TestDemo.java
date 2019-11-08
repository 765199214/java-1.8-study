package vip.jdk8新特性.接口定义加强;
interface IMessage {
	//public abstract void print();
	public default void ptint() {
		System.out.println("default定义接口的普通方法");
	}
	public void fun();
	
	public static IMessage getInstance() {
		return new IMessageImpl();
	}
}
class IMessageImpl implements IMessage{
	@Override
	public void fun() {
		System.out.println("66666");
	}
	
}
public class TestDemo {
	public static void main(String[] args) {
		int a = 10_1;
	}

}
