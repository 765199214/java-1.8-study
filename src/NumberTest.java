import java.text.NumberFormat;

public class NumberTest {

	public static void main(String[] args) {
		int diliverNum = 100;// 举例子的变量
		int queryMailNum = 1193;// 举例子的变量
		// 创建一个数值格式化对象
		NumberFormat numberFormat = NumberFormat.getInstance();
		// 设置精确到小数点后2位
		numberFormat.setMaximumFractionDigits(2);
		String result = numberFormat.format((float) diliverNum / (float) queryMailNum * 100);
		System.out.println("diliverNum和queryMailNum的百分比为:" + result + "%");

		Double myNumber = 23323.3323232323;
		Double test = 0.3434;
		// getInstance()
		// 返回当前缺省语言环境的缺省数值格式。
		String myString = NumberFormat.getInstance().format(myNumber);
		System.out.println(myString);
		// getCurrencyInstance()返回当前缺省语言环境的通用格式
		myString = NumberFormat.getCurrencyInstance().format(myNumber);
		System.out.println(myString);
		// getNumberInstance() 返回当前缺省语言环境的通用数值格式。
		myString = NumberFormat.getNumberInstance().format(myNumber);
		System.out.println(myString);
		// getPercentInstance() 返回当前缺省语言环境的百分比格式。
		myString = NumberFormat.getPercentInstance().format(test);
		System.out.println(myString);
		// setMaximumFractionDigits(int) 设置数值的小数部分允许的最大位数。
		// setMaximumIntegerDigits(int) 设置数值的整数部分允许的最大位数。
		// setMinimumFractionDigits(int) 设置数值的小数部分允许的最小位数。
		// setMinimumIntegerDigits(int) 设置数值的整数部分允许的最小位数.
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(5);
		format.setMaximumIntegerDigits(10);
		format.setMinimumIntegerDigits(0);
		System.out.println(format.format(2132323213.23266666666));
	}

}
