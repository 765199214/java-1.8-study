package jiheCollection.set.treeSet排序;

import java.util.Set;
import java.util.TreeSet;

class Persion implements Comparable<Persion> {
	// 进行排序实际上是针对对象数组进行排序操作
	// 如果要进行 对象数组 的排序，对象所在的类一定要实现Comparable接口，而且compareTo(),因为只有通过此方法才能够知道大小关系
	// ****如果使用Comparable接口进行大小关系匹配的时候，------>所有的属性都需要进行比较

	private String userName;
	private Integer age;

	public Persion(String userName, Integer age) {
		this.userName = userName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name =" + this.userName + ",age=" + this.age + "\n";
	}

	@Override
	public int compareTo(Persion o) {
		// 优先对年龄进行比较
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			// 年龄相同时 进行名称的比较
			this.userName.compareTo(o.userName);
		}
		return 0;
	}

}

/**
 * 实际开发中  对类中字段(属性)的数量  有严格的要求    如果数量过多，就显得过于麻烦
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Set<Persion> set = new TreeSet<Persion>();
		set.add(new Persion("张三",19));
		set.add(new Persion("张三",19));//重复数据
		set.add(new Persion("李四",19));//重复年龄
		set.add(new Persion("王五",20));
		
		System.out.println(set);//[name =张三,age=19, name =王五,age=20]
	}
}
