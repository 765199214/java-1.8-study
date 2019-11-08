package vip.jdk8新特性.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a", "b", "c", "d", "e");

		myList.stream()
				.filter(s -> s.startsWith("1"))
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);
	}
}
