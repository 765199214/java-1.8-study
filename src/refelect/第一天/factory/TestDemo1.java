package refelect.第一天.factory;

/**
 * 创建水果类接口
 * @author 76519
 *
 */
interface IFruit {
	public void eat();
}
class Cherry implements IFruit{
	@Override
	public void eat() {
		System.out.println("吃樱桃....");
	}
}
class Apple implements IFruit{
	@Override
	public void eat() {
		System.out.println("吃橘子....");
	}
}

class Factory{
	private Factory() {};//私有化构造方法   使其不能直接实例化
	
	//创建实例化工厂方式
	public static IFruit getIFruitInstance(String className) {
		IFruit fruit = null;
		try {
			//Object类  强制转换为   IFruit
			fruit = (IFruit) Class.forName(className).newInstance();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return fruit;
	}
}
/**
 * 一般模式下的工厂设计模式
 * @author 76519
 *
 */
public class TestDemo1 {
	public static void main(String[] args) {
		//new Factory();
		//多态模式  接收数据
		IFruit iFruit = Factory.getIFruitInstance("refelect.factory.Cherry");
		iFruit.eat();
		
		/**
		 * //通过反射类改进的工厂设计模式，最大的特征在于可以方便动态进行子类的扩充操作
		 * 关键字new 会造成耦合度高的问题
		 */
	}
}
