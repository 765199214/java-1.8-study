package refelect.threeeDays;

import java.lang.reflect.Field;

class Perion{
	private String userName;//此时的类中  只是明确的提供有一个属性
}
/**
 * 获取本类的属性   并设置和取得值(了解)  --- 实际开发之中一定需要使用get/set方法，给用户操作的机会
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) throws Exception {
		//通过反射  获取  被反射类的操作对象
		Class<?> cls = Class.forName("refelect.threeeDays.Perion");
		//此处不再是仅仅取得名称了    需要对取到的变量进行赋值  和  取值   操作  ----->
				//就必须需要获取被反射类的实例化对象  ---  只有在类对象实例化之后才会对类中的所有属性进行空间的分配
		Object obj = cls.newInstance();//实例化本类的对象
		//根据具体的属性名称  获取  本类中的指定的属性
		Field field = cls.getDeclaredField("userName");
		//******************
		//动态设置封装:AccessibleObject.setAccessible(boolean flag) throws SecurityException
		//取消封装(由于属性是private修饰    表示被封装了   如果要想使用里面的属性  就必须取消封装)  
			//---- 自己测试暂只限制private修饰的属性  不添加下列语句会报错
		field.setAccessible(true);
		//对  获取到的   属性进行设值
		field.set(obj, "香蕉不拿拿");
		//取出已设置的值
		Object getUserName = field.get(obj);
		System.out.println(getUserName);
	}
}
