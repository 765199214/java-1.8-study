package 设计模式.单例设计;

/**
 * 懒加载(懒汉式)
 * @author 76519
 */
public class LazySingleDemo {
	//定义一个此类下的变量
	private static LazySingleDemo lazySingleDemo = null;
	//单例设计模式  外部不能直接实例化其类
	private LazySingleDemo() {
		System.out.println("private LazySingleDemo");
	};
	//定义一个方式    
	public static LazySingleDemo getInstance() {
		if(lazySingleDemo == null) {
			lazySingleDemo = new LazySingleDemo();
			System.out.println("实例化了一次");
		}else {
			System.out.println("已经有了此实例");
		}
		return lazySingleDemo;
	}
}
