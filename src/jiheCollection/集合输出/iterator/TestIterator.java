package jiheCollection.集合输出.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 迭代输出(由前向后)   95%    和   迭代删除操作(0.00001%)
 * @author 76519
 *
 */
public class TestIterator {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello");
		all.add("a");
		all.add("world");
		all.add("java");
		
		System.out.println(all);//[hello, hello, world, java]
		
		//Collection接口为集合的父类  其中存在有迭代方式
		Iterator<String> iterator = all.iterator();//实例化Iterator接口对象
		while(iterator.hasNext()) {//hasNext()判断有下一个元素
			String printstr = iterator.next();//取得当前元素
			System.out.println("判断前     "+printstr);
			//删除当前元素
			if("a".equals(printstr)) {
				//all.remove("java");//添加此代码后   会出现   java.util.ConcurrentModificationException
				iterator.remove();//根据代码测试打印   发现   ----->实际删除的是集合中的数据
				System.out.println();
				continue;//执行操作后    继续进行while循环操作  不继续进行下面的操作(中断后续输出)
			}
			System.out.println("判断后   "+printstr);
			System.out.println();
		}
		System.out.println(all);
	}
}
