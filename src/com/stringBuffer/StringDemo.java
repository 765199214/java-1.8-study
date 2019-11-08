package com.stringBuffer;

public class StringDemo {

	public static void main(String[] args) {
		//编译时   自动优化为  hello java
		String s = "hello"+" java";
		//jvm将其优化为StringBuilder 采用append拼接
		s+="6666";
		
		String str = "2B7E1516280E02060B071508090F4F3C";
		System.out.println(str.length());
	}

}
