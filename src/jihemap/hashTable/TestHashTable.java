package jihemap.hashTable;

import java.util.Hashtable;
import java.util.Map;

/**
 * map集合实现方式二：hashtable子类(1%)
 * @author 76519
 *
 */
public class TestHashTable {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "hello");
		map.put(2, "java");
		map.put(3, "world");
		map.put(3, "mldn");//重复的key
		map.put(4, "a");
		
		System.out.println(map);//{4=a, 3=mldn, 2=java, 1=hello}
	}
}
