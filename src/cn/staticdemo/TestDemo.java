package cn.staticdemo;


public class TestDemo {

	public static void main(String[] args) {
		System.out.println(new StaticDemo().getName());
		System.out.println(new StaticDemo("66").getName());
		System.out.println(new StaticDemo().getName());
	}

}
