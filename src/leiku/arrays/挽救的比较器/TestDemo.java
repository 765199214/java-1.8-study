package leiku.arrays.挽救的比较器;

import java.util.Arrays;
import java.util.Comparator;

//定义需要比较的类(Comparator出现的前提是类之前未实现Comparable   但后续需要进行对象排序  又不能修改原来的类)
class Persion {
	private String userName;
	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Persion(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persion [userName=" + userName + ", age=" + age + "]\n";
	}

}

// 创建一个挽救的比较上述类的工具类
class PersionComparator implements Comparator<Persion> {
	@Override
	public int compare(Persion o1, Persion o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}
}

public class TestDemo {
	public static void main(String[] args) {
		Persion[] per = new Persion[] { 
				new Persion("张三", 20),
				new Persion("李四", 19),
				new Persion("王五", 21)
			};
		//进行排序操作(只需要设置一个排序的处理器)
		Arrays.sort(per, new PersionComparator());
		System.out.println(Arrays.toString(per));
		
		/**
		 * 批注：挽救的比较器是类未实现Comparable接口，同时也不准修改类的情况下，想要指定的类  也能进行对象排序操作
		 */
		
	}

}
