package classtest;
class Demo2{
	{
		System.out.println("1");
	}
	static {
		System.out.println("2");
	}
}
public class DemoTest2 {
	public static void main(String[] args) {
		new Demo2();
	}
}
