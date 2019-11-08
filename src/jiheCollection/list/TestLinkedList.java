package jiheCollection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * List的第三个子类  java.util.LinkedList   源码开头的参数   就说明了  其是一个链表结构
 * @author 76519
 *
 */
public class TestLinkedList {
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		
		System.out.println(linkedList);
		linkedList.remove("java1");//删除一个不存在的数据
		System.out.println(linkedList);
		linkedList.remove("java");
		System.out.println(linkedList);
	}
}
