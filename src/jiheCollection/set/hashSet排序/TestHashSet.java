package jiheCollection.set.hashSet排序;

import java.util.HashSet;
import java.util.Set;


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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persion other = (Persion) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
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
 * 
 * @author 76519
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<Persion> set = new HashSet<Persion>();//注意这里是hashset
		set.add(new Persion("张三",19));
		set.add(new Persion("张三",19));//重复数据
		set.add(new Persion("李四",19));//重复年龄
		set.add(new Persion("王五",20));
		set.add(new Persion("香蕉",21));
		
		System.out.println(set);//[name =李四,age=19, name =王五,age=20, name =张三,age=19, name =香蕉,age=21]

	}
}
