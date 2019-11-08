package cn.array;

import java.util.Arrays;

public class TestDemo {
	public static void main(String[] args) {
		int [] a = new int[3];
		System.out.println(a.length);
		
		int[] b = {1,3,2,4};
		System.out.println(b.length);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {1,2,3,4};
		//b值钱用了sort
		System.out.println(Arrays.equals(b, c));
	}
}
