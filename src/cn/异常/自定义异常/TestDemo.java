package cn.异常.自定义异常;
class MyExceptions extends Exception{
	public MyExceptions(String msg){
		super(msg);
	}
}
public class TestDemo {
	public static void main(String[] args) throws Exception{
		if ((10 + 20) == 30) {
			throw new MyExceptions("计算错误");
		}
	}

}
