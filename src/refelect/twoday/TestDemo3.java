package refelect.twoday;

import java.lang.reflect.Constructor;

class Humen{
	private String userName;
	private int age;
	//无参构造
	//public Humen() {}
	//有参构造
	public Humen(String userName,int age) {
		this.userName = userName;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Humen [userName=" + userName + ", age=" + age + "]";
	}
}
/**
 * 无参的重要性
 * @author 76519
 */
public class TestDemo3 {
	public static void main(String[] args) throws Exception{
		Class<?> humenCls = Humen.class;
		//当没有无参构造时
		//java.lang.NoSuchMethodException: refelect.第二天.Humen.<init>()
		//System.out.println(humenCls.newInstance());
		
		//解决思路
		//通过获取反射对象中的构造方法   实例化对象  ---  此处使用的方法是根据   指定类型获得指定的构造方法
		Constructor<?> cons = humenCls.getConstructor(String.class,int.class);
		//获取构造的对象     并    进行实例化
		System.out.println(cons.newInstance("香蕉不拿拿先生",25));
	}
}
