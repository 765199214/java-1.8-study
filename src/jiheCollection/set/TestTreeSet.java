package jiheCollection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Set接口的子类     java.util.TreeSet
 * @author 76519
 *
 */
public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> all = new TreeSet<String>();
		all.add("hello");
		all.add("hello");
		all.add("java");
		all.add("world");
		all.add("china");
		System.out.println(all);//[china, hello, java, world]
								//观察发现    treeset使用的是升序排列
	}
}
