package jiheCollection.集合输出;

import java.util.ArrayList;
import java.util.List;
/**
 * 使用foreach进行输出操作
 * @author 76519
 *
 */
public class TestForEach {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello");
		all.add("java");
		all.add("world");
		
		System.out.println(all);
		
		for (String string : all) {
			System.out.print(string + " 、");
		}
	}
}
