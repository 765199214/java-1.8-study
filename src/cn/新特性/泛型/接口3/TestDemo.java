package cn.新特性.泛型.接口3;
//接口上定义了一个泛型    描述的是一个泛型接口
interface IMessage<T> {
	public void print(T t); 
}
//子类实现泛型接口方式1
class IMessageImpl1<T> implements IMessage<T>{
	@Override
	public void print(T t) {
		System.out.println(t);
	}
}
class IMessageImpl2 implements IMessage<String>{
	@Override
	public void print(String t) {
		System.out.println(t);
	}
}
public class TestDemo{
	public static void main(String[] args) {
		IMessage<String> iMessage1 = new IMessageImpl1<String>();
		iMessage1.print("Hello World!");
		
		IMessage iMessage2 = new IMessageImpl2();
		iMessage2.print("Hello World!");
	}
}