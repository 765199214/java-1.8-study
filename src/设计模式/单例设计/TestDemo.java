package 设计模式.单例设计;

public class TestDemo {
	public static void main(String[] args) {
		//SingleDemo singleDemo1 = SingleDemo.getInstance();
		//SingleDemo singleDemo2 = SingleDemo.getInstance();
		
		LazySingleDemo lazySingleDemo1 = LazySingleDemo.getInstance();
		LazySingleDemo lazySingleDemo2 = LazySingleDemo.getInstance();
	}
}
