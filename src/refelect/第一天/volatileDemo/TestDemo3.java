package refelect.第一天.volatileDemo;
/**
 * 单例设计模式(懒汉式的弊端)
 * @author 香蕉不拿拿先生
 */
class Singleton3{
	
	//懒汉式  使用时  进行实例化对象的创建
	private static volatile Singleton3 singleton3;
	
	//外部想要使用该类的实例化对象  只能通过该类提供的   静态  方法获取实例化对象
	public static Singleton3 getInstance() {//如果要保证性能高  次方法就不能使用同步
		if(singleton3 == null) {
			//但volatile关键字从来不是说和同步产生关系   他只是定义变量后  让变量直接使用原始数据进行处理，所以此处需要增加同步操作
			synchronized (Singleton3.class) {
				if(singleton3 == null) {//同时此处也需要进行判断   ---  因为(多线程)延迟的原因
					singleton3 = new Singleton3();
				}
			}
		}
		return singleton3;
	}
	
	//单例设计模式    需要将构造方法私有化  让外部不能进行类的实例话操作
	private Singleton3() {
		System.out.println("构造方法 "+Thread.currentThread().getName());
	}
}
/**
 * volatile关键字  必须牵扯到单例设计模式   (懒汉式    饿汉式),volatile关键字和懒汉式进行绑定
 * @author 76519
 *
 */
public class TestDemo3 {
	public static void main(String[] args) {
		//创建多个线程  进行实例话对象的创建
		new Thread(()->Singleton3.getInstance(),"线程A").start();
		new Thread(()->Singleton3.getInstance(),"线程B").start();
		new Thread(()->Singleton3.getInstance(),"线程C").start();
		new Thread(()->Singleton3.getInstance(),"线程D").start();
		new Thread(()->Singleton3.getInstance(),"线程E").start();
	}
}
