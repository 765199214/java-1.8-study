package leiku.runtime;

public class TestDemo {
	public static void main(String[] args) {
		
		long l = Runtime.getRuntime().maxMemory();
		System.out.println("最大内存空间："+l);
		//System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println("最大空闲空间："+Runtime.getRuntime().freeMemory());
		//System.out.println(Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory());
	}
}
