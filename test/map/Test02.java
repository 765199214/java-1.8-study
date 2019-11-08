package map;

import java.util.HashMap;

public class Test02 {
	public static void main(String[] args) {
		HashMap map = new HashMap<>(10);
		map.put(1, "香蕉");
		System.out.println(map.get(2));
		System.out.println(map.get(0));
		System.out.println(map.size());
	}
}
