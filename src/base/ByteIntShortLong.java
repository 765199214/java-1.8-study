package base;

public class ByteIntShortLong extends Object{
	public static void main(String[] args) {
		short s = 1;
		s += 2;//静默转换为int类型
		System.out.println(s);
		System.out.println("66" instanceof String);
		System.out.println("66".getClass());
	}
}
