package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 与limit相反，取指定长度到最后的数据
 * @author 76519
 *
 */
public class Stream_skip {
	public static void main(String[] args) {
		List<UserDemo1> userLists = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3)
		);
		//取跳过前2个数据的数据
		System.out.println("-----jdk 1.8 前-----");
		for (int i = 0,len = userLists.size();i<len;i++) {
			if(i>=2) {
				System.out.println(userLists.get(i));
			}
		}
		System.out.println("-----jdk 1.8 后-----");
		Stream<UserDemo1> stream = userLists.stream();
		stream.skip(2).forEach(e->System.out.println(e));
		
		//Stream<UserDemo1> stream2 = userLists.stream();
		//stream2.skip(7).forEach(e->System.out.println(e));
	}
}
