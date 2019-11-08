package refelect.fourDay;

import java.lang.reflect.Field;

class Persion{
	private String userName;
}
/**
 * java.lang.reflect.Field.getType()  获取方法中成员变量的类型
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("refelect.fourDay.Persion");
		//Object obj = cls.newInstance();
		Field field = cls.getDeclaredField("userName");
		System.out.println(field.getName());//userName
		System.out.println(field.getType().getName());//java.lang.String
		System.out.println(field.getType().getSimpleName());//String
	}
}
