package cn.枚举.枚举方式2;
//枚举就是一种高级的多例设计模式
enum Color{
	RED,GREEN,BLUE
}
public class TestDemo {

	public static void main(String[] args) {
		System.out.println(Color.RED);
		System.out.println(Color.RED.ordinal()+"="+Color.RED.name());
		System.out.println(Color.BLUE.ordinal()+"="+Color.BLUE.name());
	}

}
