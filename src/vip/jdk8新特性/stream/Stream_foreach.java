package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 使用stream进行迭代操作
 * @author 76519
 *
 */
public class Stream_foreach {
	public static void main(String[] args) {
		//获取list集合
		List<UserDemo1> userLists = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6)
		);
		//遍历
		System.out.println("stream使用前");
		for (UserDemo1 userDemo1 : userLists) {
			System.out.println(userDemo1);
		}
		System.out.println("----------");
		System.out.println("使用stream");
		Stream<UserDemo1> stream = userLists.stream();
		stream.forEach(e->{System.out.println(e);});
	}
}
