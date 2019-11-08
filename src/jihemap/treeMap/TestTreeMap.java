package jihemap.treeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * map实现方式四：TreeMap  ---可以排序的子类   按照key进行排序
 * @author 76519
 *
 */
public class TestTreeMap {
	public static void main(String[] args) {
		//public final class Integer extends Number implements Comparable<Integer>
		Map<Integer, String> map = new TreeMap<Integer,String>();
		map.put(2, "C");
		map.put(0, "X");
		map.put(1, "B");
		System.out.println(map);//{0=X, 1=B, 2=C}
		
		//Integer或String能够实现排序  是因为他们实现了Comparable<T>接口
	}
}
