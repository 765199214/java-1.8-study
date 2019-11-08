package io.printStream;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/**
 * 打印流的基本理解
 * @author 76519
 *
 */
class PrintUtil{
	//定义一个outputStream
	private OutputStream outputStream;
	//创建构造方法   由外部决定引用的是其哪个子类
	public PrintUtil(OutputStream outputStream) {
		this.outputStream = outputStream;
	}
	//打印的方式
	public void print(String str) {
		try {//核心方法只有一个
			outputStream.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//换行打印
	public void println(String str) {
		this.print(str +"\r\n");
	}
	//打印int类型
	public void print(int num) {
		this.print(String.valueOf(num));
	}
	public void println(int num) {
		this.println(String.valueOf(num));
	}
	//打印double类型
	public void print(double data) {
		this.print(String.valueOf(data));
	}
	public void println(double data) {
		this.println(String.valueOf(data));
	}
	
	//关闭流的操作
	public void close() {
		if(outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class TestDemo {
	public static void main(String[] args) throws Exception {
		String path = new File("").getCanonicalPath();
		path += File.separator+"src"+File.separator+"io"+File.separator+"printStream"+File.separator;
		System.out.println("项目工程地质：  "+path+"data.txt");
		PrintUtil printUtil = new PrintUtil(new FileOutputStream(new File(path+"data.txt")));
		
		//同一个FileOutputStream对象   所以  不是覆盖  是  追加 ---个人理解
		printUtil.print("姓名：");
		printUtil.println("香蕉不拿拿");
		
		printUtil.close();
	}
}
