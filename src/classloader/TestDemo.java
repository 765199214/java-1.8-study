package classloader;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println(TestDemo.class.getClassLoader());
		System.out.println(TestDemo.class.getClassLoader().getParent());
		System.out.println(TestDemo.class.getClassLoader().getParent().getParent());
	}
}
