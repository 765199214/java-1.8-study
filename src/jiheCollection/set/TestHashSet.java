package jiheCollection.set;

import java.util.HashSet;
import java.util.Set;
/**
 * Set集合  不可重复     创建形式之一    java.util.HashSet
 * @author 76519
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>();
//		 set.add("hello");
//		 set.add("hello");//重复元素
//		 set.add("java");
//		 set.add("world");
//		 System.out.println(set);//[java, world, hello]
		 set.add("A");
		 set.add("C");
		 set.add("B");
		 System.out.println(set);
	}
}
