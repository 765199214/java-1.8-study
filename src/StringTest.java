
public class StringTest {
	public static void main(String[] args) {
		String str1 = "bunana";
		String str2 = "bunana";
		String str3 = new String("bunana");
		String str4 = new String("bunana");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		str4.intern();
		System.out.println(str1 == str4);
		
		String s1 = new StringBuilder().append("ja").append("va1").toString();
		System.out.println(s1.intern() == s1);
		
//		String s = "";
//		for(int i = 0;i<Long.MAX_VALUE;i++) {
//			s = s+"abc";
//			s.intern();
//			System.out.println(i);
//		}
//		System.out.println(s);
	}
}
