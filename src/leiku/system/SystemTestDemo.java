package leiku.system;

public class SystemTestDemo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s = "*";
		for (int i = 0; i < 9999; i++) {
			s+="hello ";
		}
		long end = System.currentTimeMillis();
		//毫秒
		System.out.println("运行时间："+(end - start));
	}

}
