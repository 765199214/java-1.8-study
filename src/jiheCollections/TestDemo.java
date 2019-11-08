package jiheCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合操作的工具类(辅助类)  -- 了解
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		//java.lang.UnsupportedOperationException运行出错  --  不能直接使用
		//Collections.EMPTY_LIST封装的方式：public static final List EMPTY_LIST = new EmptyList<>();
		
		/*List emptyList = Collections.EMPTY_LIST;
		emptyList.add("6666");
		System.out.println(emptyList);*/
		
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "A","B","C");
		Collections.reverse(all);//反转
		Collections.sort(all);
		System.out.println(all);
	}
}
