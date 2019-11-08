package jihemap.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map集合的实现方式一：HashMap (90%)
 * @author 76519
 *
 */
public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		String a = map.put(1, "hello");
		System.out.println("a-->"+a);
		String b = map.put(2, "java");
		System.out.println("b-->"+b);
		String c = map.put(3, "world");
		System.out.println("c-->"+c);
		String d = map.put(3, "mldn");//重复的key
		System.out.println("d-->"+d);
		String e = map.put(4, "hello");//重复的value
		System.out.println("e-->"+e);
		
		//0.75的系数   默认数组的大小为16   16x0.75=12
		/*for (int i = 0; i < 16; i++) {
			map.put(i+4, "香蕉");
		}*/
		
		System.out.println(map);//运行发现   重复的key  会保存最后个key的信息
		System.out.println(map.get(3));
		
		System.out.println(map.get(9999));//null
		
		/**取得所有的key信息**/
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();//集合输出   优先使用迭代器  Iterator
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("key="+key+",value="+map.get(key));
		}
		
		/**
		 * hashMap原理：数据量小的时候，是按照链表的模式进行存储数据；
		 * 当存储量变大之后为了进行快速查找，那么会将这个链表变为一个红黑树(二叉树)，用hash码作为数据的定位，来进行保存。
		 * 
		 */
	}
}
