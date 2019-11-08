package cn.重载重写;

class Animal{
	public void move() {
		System.out.println("animal   move");
	}
	public void eat() {
		System.out.println("animal eat");
	}
}
class Dog extends Animal{
	public void move() {
		System.out.println("dog   move");
	}
	public void sleep() {
		System.out.println("dog sleep");
	}
}
public class 重写 {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.move(); 	//dog   move
		a.eat();	//animal eat
		//1、因为是父类变量  接收子类的对象(有个前提：多态使用时，子类父类都有相同的方法！！！)
		//2、他先找父类的子类是否有方法的重写，有则调用子类的重写方法处理，没有就调用父类的
	}

}
