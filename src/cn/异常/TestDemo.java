package cn.异常;

/**
 * 验证 try catch finally的执行顺序
 * 
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		/**
		 * 不管成功还是异常失败，finally都会执行
		 */
		System.out.println(jisuan(10,0));
		/**
		 * finally  再return 之前执行   若再其中出现了新的赋值    则会造成影响
		 */
		System.out.println(jisuan2(10,1));
	}
	
	public static int jisuan(int a,int b) {
		int result = 0;
		System.out.println("开始计算");
		try {
			System.out.println("计算中...");
			result = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("结束");
		}
		return result;
	}
	public static int jisuan2(int a,int b) {
		int result = 0;
		System.out.println("开始计算");
		try {
			System.out.println("计算中...");
			result = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			result = 100;
			System.out.println("结束");
		}
		return result;
	}
}
