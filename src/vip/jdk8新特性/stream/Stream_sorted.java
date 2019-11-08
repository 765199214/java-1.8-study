package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream排序
 * @author 76519
 *
 */
public class Stream_sorted {
	public static void main(String[] args) {
		List<UserDemo1> userLists = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3)
		);
		List<UserDemo1> userLists2 = Arrays.asList(
				new UserDemo1("香蕉1",1),
				new UserDemo1("香蕉5",5),
				new UserDemo1("香蕉6",6),
				new UserDemo1("香蕉4",4),
				new UserDemo1("香蕉2",2),
				new UserDemo1("香蕉3",3)
		);
		System.out.println("-----jdk 1.8 前-----");
		Collections.sort(userLists,new Comparator<UserDemo1>() {

			@Override
			public int compare(UserDemo1 o1, UserDemo1 o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});
		userLists.stream().forEach(e->{System.out.println(e);});
		System.out.println("-----jdk 1.8 后-----");
		//排序
		Stream<UserDemo1> stream2 = userLists2.stream();
		stream2.sorted(Comparator.comparing(UserDemo1::getAge)).forEach(e->{System.out.println(e);});
	}
}
