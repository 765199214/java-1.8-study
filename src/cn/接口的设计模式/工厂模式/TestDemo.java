package cn.接口的设计模式.工厂模式;

public class TestDemo {
	public static void main(String[] args) {
		//关键的实现语句
		/*IFruit iFruit = new Apple();
		iFruit.eat();*/
		//将实例化等操作  不放入客户端
		IFruit fruit = Factory.getInstance("apple");
		fruit.eat();
	}

}
