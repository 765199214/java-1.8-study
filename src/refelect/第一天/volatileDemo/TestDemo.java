package refelect.第一天.volatileDemo;
/**
 * 单例设计模式(懒汉式的弊端)
 * @author 香蕉不拿拿先生
 */
class Singleton{
	//饿汉式    在类加载时  进行对象的实例化(构造方法私有化   外部不能直接通过new关键字产生该类的实例化对象)
	//private static Singleton singleton = new Singleton();
	
	//懒汉式  使用时  进行实例化对象的创建
	private static Singleton singleton2;
	
	//外部想要使用该类的实例化对象  只能通过该类提供的   静态  方法获取实例化对象
	public static Singleton getInstance() {
		if(singleton2 == null) {
			singleton2 = new Singleton();
		}
		return singleton2;
	}
	
	//单例设计模式    需要将构造方法私有化  让外部不能进行类的实例话操作
	private Singleton() {
		System.out.println("构造方法 "+Thread.currentThread().getName());
	}
}
/**
 * volatile关键字  必须牵扯到单例设计模式   (懒汉式    饿汉式),volatile关键字和懒汉式进行绑定
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		//创建多个线程  进行实例话对象的创建
		new Thread(()->Singleton.getInstance(),"线程A").start();
		new Thread(()->Singleton.getInstance(),"线程B").start();
		new Thread(()->Singleton.getInstance(),"线程C").start();
		new Thread(()->Singleton.getInstance(),"线程D").start();
		new Thread(()->Singleton.getInstance(),"线程E").start();
		
		//运行发现  会有三个实例化打印信息   调用3次new
			//单例设计  不再是单例了   会造成多个重复的实例化   -----   多个线程  同时进入
			//线程的不同步(第一次实例化对象时   可能有延迟  导致第二个线程进行了实例化)
		
	}
}
