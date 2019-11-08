package jiheCollection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * java.util.List的第一个子类   java.util.ArrayList  线程不安全   异步处理   性能更高  (但在项目开发中，非公用的资源  只有自己  同步异步没区别)
 * 如果需要考虑性能问题    一般传入初始化大小
 * @author 76519
 *
 */
public class TestArrayList {
	public static void main(String[] args) {
		//list接口的子类有三个    java.util.ArrayList     java.util.Vector   java.util.LinkedList
		List<String> all = new ArrayList<String>();//泛型定义String  只能保存String类型的参数
		//如果需要考虑性能问题    一般传入初始化大小
			//new ArrayList<>(initialCapacity)
		all.add("hello");
		all.add("hello");//设置重复数据
		all.add("world");
		all.add("java");
		System.out.println(all);//[hello, hello, world]
		System.out.println(Arrays.toString(all.toArray()));//[hello, hello, world]
		
		System.out.println(all.size());//3
		
		System.out.println(all.isEmpty());//false
		List<String> list = new ArrayList<String>();
		System.out.println(list.isEmpty());//true
		
		System.out.println("  " +all.contains("w"));//false
		System.out.println("  "+all.contains("world"));//true
		all.remove("world");
		System.out.println("  "+all.contains("world"));//false
		
		System.out.println(all.get(0));
		System.out.println(all.get(1));
		System.out.println(all.get(2));
		//System.out.println(all.get(10));//IndexOutOfBoundsException
		
		/*//查看debug下的数据添加模式
		for(int i=0,len = 30;i<len;i++) {
			all.add(String.valueOf(i)+" world");
		}*/
	}
}
