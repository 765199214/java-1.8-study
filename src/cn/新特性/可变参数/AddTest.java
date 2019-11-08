package cn.新特性.可变参数;

public class AddTest {
	public static void main(String[] args) {
		System.out.println(add());
		System.out.println(add(1,2,3));
		System.out.println(add(new int[] {1,2,3}));
	}
	/**
	 * 实现任意个数的数据的想加处理操作
	 * @param data  要进行想加操作的数据
	 * @return  返回多个数据的想加结果
	 */
	public static int add(int ... data) {//本身还是一个数组
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			temp += data[i];
		}
		return temp;
	}
	//多个参数时   可变参数写最后面      -----》add(1,2,3)数据采用","拼接的   写前面  会以为其他的类型也是其参数  导致报错
	//无法区分逗号
	public static int add2(String msg,int ... data) {//本身还是一个数组
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			temp += data[i];
		}
		return temp;
	}
}
