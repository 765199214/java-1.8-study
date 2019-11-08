package leiku.arrays;

import java.util.Arrays;
//了解  
public class TestDemo {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(a));
		//比较两个数组
		System.out.println(Arrays.equals(a, b));
		//二分查找法   ----  查找不到时为负数
		System.out.println(Arrays.binarySearch(a, 55));
	}
}
