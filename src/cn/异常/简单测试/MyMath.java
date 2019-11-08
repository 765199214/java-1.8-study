package cn.异常.简单测试;

public class MyMath {
	
	/**
	 * 满足要求：1.计算前和计算后需要打印信息；2.如果出现异常则将异常返回调用处
	 * @param x
	 * @param y
	 * @return
	 * @throws Exception
	 */
	public static int div(int x, int y) throws Exception{
		int result = 0;
		System.out.println("开始计算");
		try {
			System.out.println("计算中。。。。");
			result = x/y;//此处有异常  导致后面不执行  所以此处需要try...catch
		}catch(Exception e) {
			//这里的catch将异常自身处理了，不满足"如果出现异常则将异常返回调用处"这一条件，需要将异常返回出去
			throw e;
		}finally {
			System.out.println("计算结束");
		}
		return result;
	}
	
	/**
	 * 没有catch异常
	 * @param x
	 * @param y
	 * @return
	 * @throws Exception
	 */
	public static int div2(int x, int y) throws Exception{
		int result = 0;
		System.out.println("div2开始计算");
		try {
			result = x/y;//此处有异常  导致后面不执行  所以此处需要try...catch
		}finally {
			System.out.println("计算结束");
		}
		return result;
	}
}
