package refrecttest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class People1{

	public People1() {}
	public People1(String name) throws RuntimeException{}
	public People1(String name,int age)throws RuntimeException,Exception {}

}
public class Demo2 {
	public static void main(String[] args) throws Throwable {
		Class<?> peoC = Class.forName("refrecttest.People1");
		Constructor<?>[] constructors = peoC.getConstructors();
		for (Constructor<?> constructor : constructors) {
			//完整的每个构造方法  
			System.out.println(constructor);
			System.out.println(constructor.getName());
			//获取形参个数
			System.out.println("形参个数 -->"+constructor.getParameterCount());
			System.out.println("权限int-->"+constructor.getModifiers());
			System.out.println("权限 string-->"+Modifier.toString(constructor.getModifiers()));
			System.out.println("");
		}
	}
}
