package cn.重载重写;

class Animals{
	public void move() {
		System.out.println("animal move");
	}
	public void move(String str) {
		System.out.println(str +" move");
	}
	public int move(int i) {
		return i;
	}
}
public class 重载 {
	public static void main(String[] args) {
		//重载是针对同一个类     方法名相同   但返回类型和传入参数可以不同
	}
}
