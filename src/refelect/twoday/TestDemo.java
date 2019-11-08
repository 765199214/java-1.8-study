package refelect.twoday;

interface IMessage{}
interface IFruit{}
class Persion implements IMessage,IFruit{}
/**
 * 获取包名和类名
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		//反射取得类的实例化对象
		Class<?> cls = Persion.class;
		
		//取得类的包名称
		System.out.println(cls.getPackage());//package refelect.第二天
		System.out.println(cls.getPackage().getName());//refelect.第二天
		
		//取得父类的Class对象
		System.out.println(cls.getSuperclass());//class java.lang.Object
		System.out.println(cls.getSuperclass().getName());//java.lang.Object
		
		//取得父接口信息
		Class<?>[] itf = cls.getInterfaces();
		for (Class<?> class1 : itf) {
			System.out.println(class1.getName());
		}
	}
}
