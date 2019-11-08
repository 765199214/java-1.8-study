package refelect.five反射之简单java类.utils;
/**
 * 针对字符串进行处理的操作
 * @author 76519
 *
 */
public class StringUtils {
	//构造方法私有化    ----   使其不能被直接实例化
	private StringUtils() {}
	
	/**
	 * 将字符串的首字母进行大写操作
	 * @param str
	 * @return
	 */
	public static String initcap(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
}
