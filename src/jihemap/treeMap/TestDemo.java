package jihemap.treeMap;

import java.util.Map;
import java.util.TreeMap;

class Persion implements Comparable<Persion>{
	private String name;
	public Persion(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + "]";
	}


	@Override
	public int compareTo(Persion o) {
		return this.name.compareTo(o.name);
	}
}

/**
 * 不是integer或String类型的排序实现----了解
 * 
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Map<Persion, String> map = new TreeMap<Persion,String>();
		map.put(new Persion("张三"), "zs");
		map.put(new Persion("李四"), "ls");
		System.out.println(map);
		//作为map集合的key值  未实现Comparable接口   则会运行报错
		// java.lang.ClassCastException: jihemap.treeMap.Persion cannot be cast to java.lang.Comparable
		
	}
}
