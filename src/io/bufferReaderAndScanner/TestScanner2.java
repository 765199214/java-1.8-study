package io.bufferReaderAndScanner;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Scanner读取文件内容(含中文)
 * @author 76519
 *
 */
public class TestScanner2 {
	public static void main(String[] args) throws Exception {
		//读取此java项目的地址
		String path = new File("").getCanonicalPath();
		path += File.separator+"src"+File.separator+"io"+File.separator+"bufferIO5"+File.separator;
		System.out.println(path);
		
		Scanner scanner = new Scanner(new FileInputStream(new File(path+"annotation.txt")));
		//空格会默认为换行处理    所以需要自己定义换行规则
		scanner.useDelimiter("\n");//自定义分隔符
		//文件内容不止一行  所以使用while循环
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
		
		//由此可见
		//Scanner完美的替代了BufferedReader，而且更好的实现了InputStream的操作
	}
}
