package cn.新特性.泛型.方法4;

public class TestDemo {
	public static void main(String[] args) {
		Integer data[] = fun(1,2,3);
		for (int temp : data) {//迭代和自动拆箱
			System.out.print(temp+"、");
		}
	}
	//<T>描述的是泛型标记的声明
	public static <T> T[] fun(T ... args) {
		return args;
	}
}
