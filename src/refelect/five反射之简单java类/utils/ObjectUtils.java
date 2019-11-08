package refelect.five反射之简单java类.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 根据属性名称调用类中相应的getter、setter方法
 * @author 76519
 *
 */
public class ObjectUtils {
	//构造方法私有化
	private ObjectUtils() {}
	/**
	 * 根据指定的类对象设置类中的属性，调用setter方法
	 * @param wrapObject	属性所在类的实例化对象	
	 * @param attribute 属性名称
	 * @param value 需要设置给属性的值
	 * @throws Exception 
	 */
	public static void setObjectValue(Object wrapObject,String attribute,String value) throws Exception {
		//根据实例化获取子类的属性
		Field field = wrapObject.getClass().getDeclaredField(attribute);
		//子类中不存在对应的属性   ----  继承的父类属性
		if(field == null) {
			//从父类中查询
			field = wrapObject.getClass().getField(attribute);
		}
		//如果在父类中依旧未找到
		if(field == null) {
			//该属性一定不存在
			return;
		}
		//拼凑  set属性名 
		String methodName = "set"+StringUtils.initcap(attribute);
		//取得对应的方法
		Method method = wrapObject.getClass().getMethod(methodName, field.getType());
		method.invoke(wrapObject, value);
	}
	/**
	 * 负责调用指定类中的getter方法
	 * @param wrapObject	表示要调用的方法的所在类对象
	 * @param attribute	属性名称
	 * @return 调用对象的结束
	 * @throws Exception
	 */
	public static Object getObject(Object wrapObject,String attribute) throws Exception {
		String methodName = "get"+StringUtils.initcap(attribute);
		Field field = wrapObject.getClass().getDeclaredField(methodName);
		if(field == null) {
			field = wrapObject.getClass().getField(methodName);
		}
		if(field == null) {
			return null;
		}
		Method method = wrapObject.getClass().getMethod(methodName);
		return method.invoke(wrapObject);
	}
}
