package io.bufferReaderAndScanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 利用BufferedReader实现数据的键盘输入(了解)
 * @author 76519
 *
 */
public class TestBufferReader {
	public static void main(String[] args) throws Exception {
		//BufferedReader  
			//构造方法需要传递java.io.Reader类  
			//System.in是InputStream的子类，不能直接作为参数输入
				//所以   需要使用一个字节转字符的操作InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入信息：");
		//默认的换行模式(键盘的回车)是BufferedReader的最大弊端    ---->  结束不一定要使用回车！！
		String str = br.readLine();//每次读取一行   以回车(换行)作为标识位
		System.out.println("输入的信息为----："+str);
	}
}
