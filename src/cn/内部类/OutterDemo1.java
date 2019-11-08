package cn.内部类;

public class OutterDemo1 {
	private String msg = "hello world";
	//外部类中的某个方法(jdk 1.8之后的版本)
	public void fun(int num) {
		//内部类写在方法中
		class Inner{
			public void print() {
				System.out.println("num="+num);
				System.out.println("msg="+msg);
			}
		}
		//外部类中的方法中的函数
		new Inner().print();
	}
	
	//jdk1.8之前的方法中的内部类的定义形式(形参前需要添加  final  关键字)
	public void funOther(final int num) {
		//内部类写在方法中
		class Inner{
			public void print() {
				System.out.println("num="+num);
				//System.out.println("num="+(num+1));
				System.out.println("msg="+msg);
			}
		}
		//外部类中的方法中的函数
		new Inner().print();
	}
}

