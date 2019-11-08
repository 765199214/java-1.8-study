package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 截取最大长度的数据(从头到指定的长度)
 * @author 76519
 *
 */
public class Stream_limit {
	public static void main(String[] args) {
		List<UserDemo1> userLists = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3)
		);
		//取前两个的信息
		System.out.println("-----jdk 1.8 前-----");
		for (int i = 0,len = userLists.size();i<len;i++) {
			if(i<2) {
				System.out.println(userLists.get(i));
			}
		}
		System.out.println("-----jdk 1.8 后-----");
		Stream<UserDemo1> stream = userLists.stream();
		stream.limit(2).forEach(e->System.out.println(e));
	}
}
