package refelect.第一天.factory.wonderfull;

/**
 * 创建水果类接口
 * 
 * @author 76519
 *
 */
interface IFruit {
	public void eat();
}

class Cherry implements IFruit {
	@Override
	public void eat() {
		System.out.println("吃樱桃....");
	}
}

class Apple implements IFruit {
	@Override
	public void eat() {
		System.out.println("吃苹果....");
	}
}

/**
 * 创建另外的一个 接口 (父类)
 * 
 * @author 76519
 *
 */
interface IMessage {
	public void print();
}

// 创建消息父类的子类对象
class MessageImpl implements IMessage {
	@Override
	public void print() {
		System.out.println("打印信息.....");
	}
}

class Factory {
	// 私有化构造方法 使其不能  实例化
	private Factory() {}

	/**
	 * 创建实例化      工厂方式   ----   泛型模式    
	 * @param className   接收的类名称(全路径)
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(String className) {
		T t = null;
		try {
			t = (T) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return t;
	}
}

/**
 * 一般模式下的工厂设计模式
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) {
		// 多态模式 接收数据
		IFruit iFruit = Factory.getInstance("refelect.第一天.factory.wonderfull.Cherry");
		iFruit.eat();
		
		// 多态模式   接收消息类
		IMessage iMessage = Factory.getInstance("refelect.第一天.factory.wonderfull.MessageImpl");
		iMessage.print();
	}
}
