package refelect.第一天.了解反射;

import java.util.Date;
/**
 * 反射取得实例化对象的三种方式
 * @author 76519
 *
 */
public class TestDemo1 {
	public static void main(String[] args) {
		//方式一    需要先实例化类   再反射
		Date date = new Date();
		//此处的泛型   只能是  "?"
		Class<?> dts = date.getClass();
		//System.out.println(dts);
		System.out.println(dts.getName());
		
		//方式二  不需要实例化   但需要引入包----import java.util.Date;
		Class<?> dts2 = Date.class;
		System.out.println(dts2.getName());
		
		//方式三   不需要实例化操作   也无需引入包
		try {
			//根据类名称(全路径名)   反射到类
			Class<?> dts3 = Class.forName("java.util.Date");
			System.out.println(dts3.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//总结：
			//除了方式一会产生实例化对象之外    其他两种都不会产生实例化对象
	}
}
