package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 过滤器操作
 * @author 76519
 *
 */
public class Stream_filter {
	public static void main(String[] args) {
		List<UserDemo1> userLists = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3)
		);
		System.out.println("-----jdk 1.8 前-----");
		//输出年龄属性高于2但小于5的数据(不包含)
		for (UserDemo1 userDemo1 : userLists) {
			if(userDemo1.getAge() > 2 && userDemo1.getAge() < 5 ) {
				System.out.println(userDemo1);
			}
		}
		System.out.println("-----jdk 1.8 后-----");
		Stream<UserDemo1> stream = userLists.stream();
		stream.filter(e -> (e.getAge()>2 && e.getAge() < 5)).forEach(user->{System.out.println(user);});
	}
}
