package vip.jdk8新特性.lambda表达式;

interface IMath {
	// 实现x和y想加算法
	public int add(int x, int y);
}

public class TestDemo2 {
	public static void main(String[] args) {
		//			方法传递参数         方法中计算方式
		IMath im = (p1,p2) -> p1 + p2;
		System.out.println(im.add(10, 20));
	}

}
