package io.neicunStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 使用内存流  实现一个大小写转换的操作   -----临时文件操作
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		String msg = "helloworld!!";
		//实例化InputStream类对象，实例化的时候  需要将操作的数据保存至内存中，最终读取的就是设置的内容
		InputStream input = new ByteArrayInputStream(msg.getBytes());
		//将输出的数据  保存再程序中
		OutputStream output = new ByteArrayOutputStream();
		int temp = 0;
		while((temp = input.read())!= -1) {
			output.write(Character.toUpperCase(temp));
		}
		//此时所有的数据都在OutputStream 中了
		System.out.println(output);
		output.close();
		input.close();
	}
}
	