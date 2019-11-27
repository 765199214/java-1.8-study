package classloader;

public class TestDemo {
	public static int num = 0;
	public static  void increase(){
		num ++;
	}
	public static void main(String[] args) {
		System.out.println(TestDemo.class.getClassLoader());
		System.out.println(TestDemo.class.getClassLoader().getParent());
		System.out.println(TestDemo.class.getClassLoader().getParent().getParent());
		
		for (int i = 0; i < 1000; i++) {
			increase();
		}
		System.out.println(num);
	}
}
