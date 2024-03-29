package com.stringBuffer;

import java.util.Iterator;

public class StringTest {
	// 定义循环次数
	static final int time = 50000;

	public static void main(String[] args) {
		testString();
		testStringBuffer();
		testStringBuilder();
		test1String();
		test2String();
	}

	// String类运行效率测试
	public static void testString() {
		// 外面定义
		String s = "";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			s += "java ";
		}
		long end = System.currentTimeMillis();
		//操作java.lang.String类型使用的时间为：5511毫秒
		System.out.println("操作" + s.getClass().getName() + "类型使用的时间为：" + (end - begin) + "毫秒");
	}

	public static void test1String() {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			// 测试创建 time 个对象所需要的时间
			String s = "I" + "love" + "java";
		}
		long over = System.currentTimeMillis();
		System.out.println("字符串直接相加操作：" + (over - begin) + "毫秒");
	}

	public static void test2String() {
		String s1 = "I";
		String s2 = "love";
		String s3 = "java";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			String s = s1 + s2 + s3;
		}
		long over = System.currentTimeMillis();
		System.out.println("字符串间接相加操作：" + (over - begin) + "毫秒");
	}

	// StringBuffer运行效率测试(方法自锁)
	public static void testStringBuffer() {
		StringBuffer sb = new StringBuffer();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			sb.append("java ");
		}
		long over = System.currentTimeMillis();
		System.out.println("操作" + sb.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
	}

	// StringBuilder 运行效率测试
	public static void testStringBuilder() {
		StringBuilder sb = new StringBuilder();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			sb.append("java");
		}
		long over = System.currentTimeMillis();
		System.out.println("操作" + sb.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
	}

}
