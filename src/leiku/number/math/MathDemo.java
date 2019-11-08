package leiku.number.math;

public class MathDemo {
	public static void main(String[] args) {
		//不保存小数位	
		System.out.println(Math.round(15.5));//16
		System.out.println(Math.round(15.51));//16
		
		//如果负数的小数  没 大于0.5  则不进位
		System.out.println(Math.round(-15.5));//-15
		System.out.println(Math.round(-15.51));//-16
	}

}
