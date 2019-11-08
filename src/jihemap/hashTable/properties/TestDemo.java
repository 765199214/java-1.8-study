package jihemap.hashTable.properties;

import java.util.Properties;

/**
 * public class Properties extends Hashtable<Object,Object> 
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Properties properties = new Properties();
		//properties.setProperty(String key,String  value) -- 只能操作字符串
		properties.setProperty("bj", "beijing");
		
		System.out.println(properties.getProperty("bj"));
		System.out.println(properties.getProperty("wh"));
	}
}
