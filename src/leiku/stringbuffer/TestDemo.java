package leiku.stringbuffer;
/**
 * 线程安全的
 * @author 76519
 *
 */
public class TestDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb);
		
		//字符反转
		System.out.println(sb.reverse());
		//删除指定返回的数据(字符下标)
		sb.append("world");
		System.out.println(sb.delete(5, 10));
		
		//StringIndexOutOfBoundsException
		//System.out.println(sb.delete(15, 20));
		
		//插入数据
		System.out.println(sb.insert(3, "6666"));
	}

}
