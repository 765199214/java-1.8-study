package leiku.regex;
//java.util.regex.Pattern
public class TestDemo1 {
	public static void main(String[] args) {
		//1.描述  单个  的字符   x   (待匹配的内容是一个字符所组成)
		//System.out.println("a".matches("a"));//true
		//System.out.println("aa".matches("a"));//false
		
		//匹配范围
		//System.out.println("a".matches("[abc]"));//true
		//System.out.println("e".matches("[^abc]"));//true
		//System.out.println("a".matches("[a-zA-Z]"));//true
		
		//单个的简化表达式
		//System.out.println("a".matches("."));//true
		//System.out.println("A".matches("."));//true
		//System.out.println("ab".matches("."));//false
	}

}
