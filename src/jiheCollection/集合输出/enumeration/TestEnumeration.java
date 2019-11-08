package jiheCollection.集合输出.enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举输出  4.8%
 * @author 76519
 *
 */
public class TestEnumeration {
	public static void main(String[] args) {
		//list子类---vector额外定义
		Vector<String> vec = new Vector<String>();//线程安全型
		vec.add("hello");
		vec.add("hello");
		vec.add("world");
		vec.add("java");
		System.out.println(vec);
		
		//由java.util.Vector子类获取  枚举Enumeration
		Enumeration<String> elements = vec.elements();
		while(elements.hasMoreElements()) {//判断是否存在下一个元素
			System.out.println(elements.nextElement());
		}
		
	}
}
