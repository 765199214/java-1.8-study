package refelect.twoday;

import java.lang.reflect.Method;

class Student {
	private String userName;
	private int age;

	public Student() {
	}

	public Student(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void testPrint(String userName,int age) {
		System.out.println("[Student] username = "+userName+ " age = "+age);
	}

}

/**
 * 反射获取类中的普通方法 
 * 以getter/setter方法为例
 * 所有的普通方法   都必须在实例化对象之后才可以进行调用
 * @author 76519
 *
 */
public class TestDemo4 {
	public static void main(String[] args) throws Exception {
		// 明确规定方法名称 和 方法名称中需要传递的参数
		String attribute = "userName";//指定的set/get的属性名称
		String value = "香蕉";//需要传入的数值
		// 通过反射 获取指定的类
		Class<?> cls = Class.forName("refelect.twoday.Student");
		// 任何情况下调用类中的普通方法都必须要经过实例化对象
		Object obj = cls.newInstance();
		// 通过 反射得到的类 获取其中的方法
		// 取得setUserName这个普通方法的实例化对象 设置方法名称 和 参数类型
		// 注：setUserName()是方法，这个方法名称是根据 给定的属性信息 拼凑而成，同时该方法需要接收一个String类型的参数
		Method setMethod = cls.getMethod("set"+initCap(attribute), String.class);
		Object o1 = setMethod.invoke(obj, value);//相当于  Student对象.setUserName(...)
		System.out.println("o1  "+o1);
		//取得方法  并取出值
		Method getMethod = cls.getMethod("get"+initCap(attribute));
		Object o2 = getMethod.invoke(obj);
		System.out.println("o2  "+o2);
		
		//自己测试传入多个属性值时   ---  测试普通方法
		Method testMethod = cls.getMethod("testPrint", String.class,int.class);
		testMethod.invoke(obj, "香蕉不拿拿先生",25);//测试发现   如果指定的方法是静态的    此处的参数obj可以写为null
	}
	
	/**
	 * 根据属性名称   进行拼凑的   set或  get  方法名
	 * @param str 属性名称
	 * @return 修改后的字符串类型
	 */
	public static String initCap(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
}
