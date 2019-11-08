package cn.抽象类;
class B extends A{
	@Override
	public void fun() {
		System.out.println("66666");
	}
	
	/*public void print() {
		System.out.println("55555");
	}*/
	
}
public class TestDemo {
	public static void main(String[] args) {
		A a = new B();
		a.fun();
		a.print();//先找实例化的对象中是否存在指定的方法重写，如果没有就会去父类中查找
	}
}
