package refelect.threeeDays;

import java.lang.reflect.Field;

class Father{
	private String name;

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/
	
}
class Sun extends Father{
	private int age;

	/*public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/
	
}
/**
 * 获取类  或  父类中的属性值
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("refelect.threeeDays.Sun");
		//如果是单纯的获取类中的属性名称   不对其进行操作  使用 Class类中的getFields或getFile(String name)即可
		//普通代码块
		{
			//取得父类的全部属性
			Field[] fields = cls.getFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);//父类的没有打印
			}
		}
		System.out.println("--------------------------");
		//getDeclaredFields   取得所有   本类中的  属性
		//getDeclaredField(String name)  根据名称取得  本类中   指定的属性
		{
			//取得子类的全部属性
			Field[] fields = cls.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);//private int refelect.threeeDays.Sun.age
			}
		}
		//父类的为什么没获取到呢？  *******************
			//在实际的开发之中，属性基本上都会进行封装处理，所以自然没有必要去关注父类中的属性，也就是说以后的操作的时候  所取得的属性都是以本类属性为主
		
		
		//额外补充：父类的private属性get/set 后   子类才能继承
		/*Sun s = new Sun();
		s.setName("6666");
		System.out.println(s.getName());*/
	}
}
