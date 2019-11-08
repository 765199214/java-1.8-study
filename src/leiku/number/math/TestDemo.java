package leiku.number.math;

//保留小数  并进位
class MyMath {
	/**
	 * 进行四舍五入操作
	 * 
	 * @param num
	 *            表示原始的操作数据
	 * @param scale
	 *            表示保留的小数位数
	 * @return 但会已经正确四舍五入后的数据内容
	 */
	public static double round(double num, int scale) {
		//5.02的四舍五入保留小数位  ---> 5.02*100-->502-->round-->除100
		return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
	}
}

public class TestDemo {
	public static void main(String[] args) {
		// 数值开方
		//System.out.println(Math.pow(10, 3));// 1000.0
		
		double val = MyMath.round(65.0145, 2);
		System.out.println(val);
	}
}
