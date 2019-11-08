package jihemap.hashTable.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestDemoOutputStream {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.setProperty("bj", "beijing");
		properties.setProperty("wh", "wuhan");

		// 保存属性到文件
		properties.store(
				new FileOutputStream(
						new File("D:" + File.separator + "area.properties"))
				, "Area Info");
		/**
		 * #Area Info 
		 * #Thu Aug 30 15:18:56 CST 2018 
		 * wh=wuhan 
		 * bj=beijing
		 */
	}
}
