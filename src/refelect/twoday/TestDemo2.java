package refelect.twoday;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class People{
	public People() {}
	public People(String name) throws RuntimeException{}
	public People(String name,int age)throws RuntimeException,Exception {}
}
/**
 * 调用类的构造方法
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) {
		Class<?> cls = People.class;
		//取得所有的构造方法(把构造封装成类了--- Constructor )
		Constructor<?>[] cons = cls.getConstructors();
		for (Constructor<?> constructor : cons) {
			//************
			System.out.println(constructor);
		}
		System.out.println("****************");
		//获取类的构造方法   了解上面Constructor 类  toString()的原理
		for (Constructor<?> constructor : cons) {
			//取得前面的包名称 constructor.getModifiers()-->int
			System.out.println("constructor.getModifiers()-->"+constructor.getModifiers());
			//通过  Modifier.toString将获取的int转换成对应的权限名称
			System.out.println("Modifier.toString(constructor.getModifiers())---->"+Modifier.toString(constructor.getModifiers()));
			System.out.print(Modifier.toString(constructor.getModifiers())+" ");
			//取得构造的名称 refelect.第二天.People
			System.out.print(constructor.getName() + "(");
			//获取构造中的各项参数
			Class<?> params[] = constructor.getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				//获取每个    传入参数
				System.out.print(params[i].getName());
				//中间使用   逗号   隔开
				if(i < params.length - 1) {
					System.out.print(",");
				}
			}
			System.out.print(")");
			//如果存在异常
			Class<?>[] exception = constructor.getExceptionTypes();
			if(exception.length > 0) {//表示有异常
				System.out.print(" throws ");
				for (int j = 0 ; j < exception.length ; j ++) {
					System.out.print(exception[j].getName());
					//同样一个方法多个异常时   需要中间有逗号隔开
					if(j < exception.length - 1) {
						System.out.print(",");
					}
				}
			}
			System.out.println();
		}
	}
}
