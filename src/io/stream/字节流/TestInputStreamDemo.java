package io.stream.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:"+File.separator+"hello.txt"); 
		System.out.println(file.getName());
		if(file.exists()) {//必须保证文件本身存在
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] data = new byte[1024];//吃饭用的勺子   -----  每次可以读取到的最大数量
			//1.一满勺，刚好装够最大数据，这时read返回的长度为定义的容器大小
			//2.不够一勺，返回能够读取到的字节的长度
			//3.没有了，返回-1
			int len = fileInputStream.read(data);//此时的数据读取到了数组中(将数据读到数组中)
			System.out.println(len);
			//输出的数组中所有的内容(数组中总长度1024  装不完   导致数据打印有"      ")
			//System.out.println("读取内容【"+new String(data)+"】");
			System.out.println("读取内容【"+new String(data,0,len)+"】");
			fileInputStream.close();
		}
	}
}
