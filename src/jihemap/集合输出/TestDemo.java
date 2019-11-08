package jihemap.集合输出;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 集合输出是核心，map中无iterator()；------熟练
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		//集合中存值
		map.put(3, "hello");
		map.put(1, "java");
		map.put(2, "world");
		System.out.println(map);
		System.out.println(map.get(1));
		//map集合不存在iterator()，就必须先将map集合转为Set集合
		//set中的泛型  存的是一个变量类型 
		//结合此目录下的png图，发现是将key和value包装成了一个Map.Entry对象
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		//转化为  Iterator  迭代对象
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		//迭代输出
		while(iterator.hasNext()) {//取出每一个   Map.entry 对象
			Map.Entry<Integer, String> me = iterator.next();
			//通过对象获取key值     和    value信息
			System.out.println("key = "+me.getKey() +"  value = "+me.getValue());
		}
		
	}
}
