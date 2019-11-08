package io.stream.转换流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 字节输出流  转  字符输出流(了解)
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		//OutputStreamWriter 字节输出流 转 字符输出流  
		//InputStreamReader  字节输入流 转 字符输入流
		File file = new File("E:"+File.separator+"hello.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		OutputStream outputStream = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(outputStream);//字节流转为字符流
		writer.write("hello");
		writer.close();
		outputStream.close();
		
		
	}
}
