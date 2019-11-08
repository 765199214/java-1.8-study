package 设计模式.单例设计;

/**
 * 饿汉式(类每次加载  只加载一次实例)
 * @author 76519
 *
 */
public class SingleDemo {
	//私有无参构造方法
	private SingleDemo () {
		System.out.println("实例化");
	};
	//饿汉式   不管有没有   都实例化(类创建后  就自身实例化)
	private static SingleDemo singleDemo = new SingleDemo();
	//外部获得类的实例的方式
	public static SingleDemo getInstance() {
		System.out.println("getInstance");
		return singleDemo;
	}
}
