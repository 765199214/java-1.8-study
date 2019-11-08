package cn.包装类;

public class 手动装箱 {

	public static void main(String[] args) {
		Integer num = new Integer(10);
		int a = num.intValue();
		System.out.println("int手动装箱拆箱:"+a*2);
		
		Double d = new Double(10.1);
		double b = d.doubleValue();
		System.out.println("double手动装箱拆箱："+b*2);
	}

}
