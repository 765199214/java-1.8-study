package refelect.第一天.实例反射;

import java.util.Date;

/**
 * 取得实例化对象就意味着取得了一个     指定类    的    操作权
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("java.util.Date");//使用字符串描述使用的类
		//反射出的对象    采取   newInstance()  进行实例化
		Object obj = cls.newInstance();//实例化对象，等价于：new java.util.Date
		System.out.println(obj);
		
		//Object类型   向下  转型
		Date date = (Date) obj;
		System.out.println(date.getTime());
	}
}
