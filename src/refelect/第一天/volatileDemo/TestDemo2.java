package refelect.第一天.volatileDemo;
/**
 * 单例设计模式(懒汉式的弊端)
 * @author 香蕉不拿拿先生
 */
class Singleton2{
	
	//懒汉式  使用时  进行实例化对象的创建
	private static Singleton2 singleton2;
	
	//外部想要使用该类的实例化对象  只能通过该类提供的   静态  方法获取实例化对象
	//添加关键字   synchronized  进行同步处理  --- 可以只实例化一个单例对象
	public static synchronized Singleton2 getInstance() {
		if(singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
	
	//单例设计模式    需要将构造方法私有化  让外部不能进行类的实例话操作
	private Singleton2() {
		System.out.println("构造方法 "+Thread.currentThread().getName());
	}
}
/**
 * volatile关键字  必须牵扯到单例设计模式   (懒汉式    饿汉式),volatile关键字和懒汉式进行绑定
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) {
		//创建多个线程  进行实例话对象的创建
		new Thread(()->Singleton2.getInstance(),"线程A").start();
		new Thread(()->Singleton2.getInstance(),"线程B").start();
		new Thread(()->Singleton2.getInstance(),"线程C").start();
		new Thread(()->Singleton2.getInstance(),"线程D").start();
		new Thread(()->Singleton2.getInstance(),"线程E").start();
		
		//现在看来问题的确解决了，因为同步有了锁-----  只产生一个  实例化
		
		//但再  高并发  的访问状态下，本操作会直接导致系统性能下降---->那么现在必须使用volatile关键字解决锁的问题
		
	}
}
