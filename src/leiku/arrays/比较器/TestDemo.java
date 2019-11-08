package leiku.arrays.比较器;

import java.util.Arrays;

/**
 * 如果  自己定义的类  需要进行比较操作  就需要实现Comparable接口
 * @author 76519
 *
 */
class Persion implements Comparable<Persion>{
	private String username;
	private int age;
	public Persion(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persion [username=" + username + ", age=" + age + "]\n";
	}
	@Override
	public int compareTo(Persion o) {
		//比较年龄  并进行排序
		if(this.age > o.age) {
			return 1;
		}else if(this.age == o.age) {
			return 0;
		}else {
			return -1;
		}
		
	}
	
	
}
public class TestDemo {
	public static void main(String[] args) {
		//构建对象数组
		Persion[] per = new Persion[] {
				new Persion("张三",20),
				new Persion("李四",19),
				new Persion("王五",21)
		};
		//进行对象数组的排序处理
		Arrays.sort(per);
		System.out.println(Arrays.toString(per));
		
		//备注：
			//若想要实现倒序排列  只需要修改类中复写的compareTo()返回结果即可(1和-1换个位置就行了)
	}

}
