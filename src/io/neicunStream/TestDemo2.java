package io.neicunStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 实现两个文件的合并输出处理
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) throws Exception {
		//data-a.txt  hello world!   
		//data-b.txt  您好  世界!
		//实现为 hello(你好) world!(世界!)
		
		//获取java项目工程的地址
		//String path =  Class.class.getClass().getResource("/").getPath();
		//String path =Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = new File("").getCanonicalPath();
		System.out.println("项目工程地质：  "+path);
		path += File.separator+"src"+File.separator+"io"+File.separator+"neicunStream"+File.separator;
		System.out.println("项目工程地质：  "+path+"data-a.txt");
		//1.定义两个文件数组对象
		File[] file = new File[] {
				new File(path+"data-a.txt"),
				new File(path+"data-b.txt")
		};
		System.out.println(readFile(file[1]));
		//定义一个字符串数组  每次读到的数据 都放入到数组中
		String [] data = new String[2];
		for (int i = 0; i < file.length; i++) {
			data[i] = readFile(file[i]);
		}
		
		//打印的方式
		String[] contentA = data[0].split(" ");
		String[] contentB = data[1].split(" ");
		//拼接方式
		StringBuffer stringBuffer = new StringBuffer();
		//创建一个文件输出流  将文件信息  打印
		OutputStream outputStream = new FileOutputStream(path+"data.txt");
		for (int i = 0; i < contentA.length; i++) {
			//String str = contentA[i] +"("+contentB[i]+")";
			stringBuffer.append(contentA[i]).append("(").append(contentB[i]).append(")").append(" ");
			outputStream.write(stringBuffer.toString().getBytes());
		}
		
		//关闭开启的流
		outputStream.close();
		System.out.println(stringBuffer);
	}
	/**
	 * 文件内容的读取操作   并将读到的内容返回
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static String readFile(File file) throws Exception {
		if(file.exists()) {
			//读文件   将文件信息  存入内存中
			InputStream inputStream = new FileInputStream(file);
			//使用ByteArrayOutputStream子类所扩充的方法    将数据内容存入到 ByteArrayOutputStream对象中
			ByteArrayOutputStream bos = new ByteArrayOutputStream();//使用内存流  不需要额外的创建文件    进行数据的保存操作
			//定义一个  缓存数组   进行数据的缓冲存储操作
			byte[] data = new byte[10];
			int temp = 0;
			//每次读取指定长度的  数据   
			while((temp = inputStream.read(data)) != -1) {
				//读到的数据    使用ByteArrayOutputStream的write方法(内存输出流)  将数据内容分批次  存入内存中
				bos.write(data, 0, temp);
			}
			//关闭流
			bos.close();
			inputStream.close();
			//将所有的读取到的内容返回
			return new String(bos.toByteArray());
		}
		return null;
	}
}
