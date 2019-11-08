package jihemap.hashTable.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TestDemoInputStream {
	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		//从指定文件中加载信息
		properties.load(
				new FileInputStream(new File("D:"+File.separator+"area.properties")));
		System.out.println(properties);
		System.out.println(properties.getProperty("wh"));
	}
}
