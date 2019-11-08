package jiheCollection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/**
 * 只是作为了解   项目实际开发多使用java.util.List   不到万不得已不要使用java.util.Collection
 * @author 76519
 *
 */
public class TestCollection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection coll = new ArrayList<String>();
		coll.add("hello");
		coll.add("hello");
		coll.add("world");
		coll.add("java");
		
		System.out.println(coll);
		//以object类型作为数据的类型返回   那么就有可能出现向下转型    就可能出现   java.lang.ClassCastException
		Object[] obj = coll.toArray();
		System.out.println(Arrays.toString(obj));
	}
}
