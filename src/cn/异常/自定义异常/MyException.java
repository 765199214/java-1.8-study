package cn.异常.自定义异常;

public class MyException extends Exception{
	
	//写构造方法
	public MyException(String msg) {
		super(msg);
	}
}
