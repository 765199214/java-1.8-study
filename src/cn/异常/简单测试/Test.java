package cn.异常.简单测试;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println(MyMath.div(10, 0));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("******************************************");
		try {
			System.out.println(MyMath.div2(10, 0));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
