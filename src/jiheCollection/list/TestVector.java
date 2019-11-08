package jiheCollection.list;

import java.util.List;
import java.util.Vector;

/**
 * list集合的第二个子类  java.util.Vector 同步处理   线程安全  但性能低
 * @author 76519
 *
 */
public class TestVector {
	public static void main(String[] args) {
		List<String> all = new Vector<String>();
		all.add("hello");
		all.add("world");
		all.add("java");
		
		all.remove("java1");//集合中没有的数据
		System.out.println(all);
		all.remove("java");//集合中存在的数据
		System.out.println(all);
	}
}
