package io.stream.字符流;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TestCharInputStream {
	public static void main(String[] args) throws Exception {
		File file = new File("E:"+File.separator+"helloread.txt");
		if(file.exists()) {//必须保证文件存在
			Reader reader = new FileReader(file);
			char[] data = new char[1024];//指定容器   每次读取到的数据  放在容器中
			int len = reader.read(data);
			System.out.println(len);
			System.out.println("读取到的内容【"+new String(data)+"】");
			System.out.println("读取到的内容【"+new String(data,0,len)+"】");
			reader.close();
		}
	}
}
