package jihemap.concurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * map集合实现方式三：使用ConcurrentHashMap子类创建
 * (结合了Hashtable的线程安全性和HashMap的高性能------>可以保证多个线程更新数据的同步，又保证很高的查询速度)
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(3, "mldnjava");
		map.put(1, "hello");
		map.put(1 , "java");//key重复
		map.put(2, "mldn");
		System.out.println(map);
	}
}
