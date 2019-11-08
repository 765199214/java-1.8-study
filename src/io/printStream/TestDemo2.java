package io.printStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 装饰设计模式： 核心依旧还是某个类的一个功能，但是为了得到更好的操作效果，让其支持的功能更多
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) throws Exception {
		String path = new File("").getCanonicalPath();
		path += File.separator+"src"+File.separator+"io"+File.separator+"printStream"+File.separator;
		System.out.println("项目工程地质：  "+path+"data.txt");
		
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(path+"data.txt")));
	
		printWriter.print("姓名：");
		printWriter.println("香蕉不拿拿");
		
		//不写close  数据还是在内存中
		printWriter.close();
		
		//注意   ：  不能做2进制的输出
	}
}
