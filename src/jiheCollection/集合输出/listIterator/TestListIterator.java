package jiheCollection.集合输出.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/**
 * 双向迭代接口(了解)  0.01%
 * @author 76519
 *
 */
public class TestListIterator {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello");
		all.add("a");
		all.add("world");
		all.add("java");
		
		System.out.println(all);//[hello, hello, world, java]
		//双向迭代接口  listIterator是由list接口定义的
		ListIterator<String> listIterator = all.listIterator();
		/*************想要实现由后向前输出         就必须先要进行 由前向后输出******************/
		//public interface ListIterator<E> extends Iterator<E>  这里的方法是iterator接口的方法
		System.out.print("由前向后输出          ");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+"、");
		}
		System.out.print("\n由后向前输出           ");
		while(listIterator.hasPrevious()) {//ListIterator自己定义的方式  判断是否有   上一个元素
			System.out.print(listIterator.previous()+"、");//输出上一个元素
		}
	}
}
