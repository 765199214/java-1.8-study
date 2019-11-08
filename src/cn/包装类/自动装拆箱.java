package cn.包装类;

/**
 * @author Administrator
 *
 */
public class 自动装拆箱 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b);//true
		System.out.println(a == new Integer(10));//false
		System.out.println(a.equals(new Integer(10)));//true
	}
}
