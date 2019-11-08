package cn.内部类;
//定义外部类
public class Outter {
	private String msg = "Hello World !!";
	//定义内部类
	class Inner{
		public void print() {
			//System.out.println("这是内部类中的方法");
			System.out.println(msg);
		}
	}
	
	//负责产生内部类对象  并且  调用print()
	public void fun() {
		Inner inner = new Inner();
		inner.print();
	}
}
