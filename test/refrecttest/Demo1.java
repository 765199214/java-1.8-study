package refrecttest;
interface IPersionOne{};
interface IPersionTwo{};
class Persion implements IPersionOne,IPersionTwo {
	
} 
public class Demo1 {
	public static void main(String[] args) throws Throwable {
		Class<?> perC = Class.forName("refrecttest.Persion");
		System.out.println(perC);
		System.out.println(perC.getName());
		System.out.println(perC.getPackage().getName());
		System.out.println(perC.getSimpleName());
		System.out.println("------------------------");
		//单继承  所以只会有一个对象    显式/隐式  单继承Object
		System.out.println(perC.getSuperclass());
		System.out.println(perC.getSuperclass().getName());
		System.out.println(perC.getSuperclass().getSimpleName());
		System.out.println(perC.getSuperclass().getPackage().getName());
		System.out.println("------------------------");
		//多实现
		Class<?>[] interfaces = perC.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
			System.out.println(interfaces[i].getName());
			System.out.println(interfaces[i].getSimpleName());
			System.out.println(interfaces[i].getPackage().getName());
			System.out.println("********************");
		}
		
	}
}
