package vip.jdk8新特性.lambda表达式;
//1.使用函数式编程    要求接口中只能有一个方法   多个方法时    lambada会不知道是哪个方法
//2.由此而生   一个接口注解
@FunctionalInterface //是一个函数式编程接口   只允许有一个方法
interface IMessage{
	public void print();
}
public class TestDemo {
	public static void main(String[] args) {
		//使用  匿名内部类   打印信息
		IMessage im = new IMessage() {
			@Override
			public void print() {
				System.out.println("66666");
			}
		};
		im.print();
		
		//使用lambda表达式
		IMessage imessage = () -> System.out.println("66666");
		imessage.print();
	}
}
