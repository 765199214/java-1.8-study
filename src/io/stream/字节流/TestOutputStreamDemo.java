package io.stream.字节流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1.根据文件路径  创建File对象
		File file = new File("E:"+File.separator+"hello.txt");
		//安全起见   ----    避免异常
		if(!file.getParentFile().exists()) {//必须保证父目录的存在
			file.getParentFile().mkdirs();//不存在  则创建父目录
		}
		//2.根据字节流或字符流的子类  实例化父类对象     意味着只能进行文件处理
		//OutputStream os = new FileOutputStream(file);//文件内容的覆盖
			//如果需要进行文件内容的追加，不是覆盖
		OutputStream os = new FileOutputStream(file,true);//文件内容的追加
		//3.数据的读写操作   这里是向文件中  写数据
		//String msg = "hello java";
			//如果需要对文件进行加入并换行操作    单独的 \n不会去进行换行操作
		String msg = "hello.java\r\n";
		//msg.getBytes()  只是说明是内存中的数据信息   需要将内存中的数据信息写入到磁盘中去所以使用的是out
		os.write(msg.getBytes());
		//4.关闭流   避免资源的消耗
		os.close();
		
		//注：  inputStream和outStream是针对内存而言的    读到内存中使用的in   从内存中拿出来放到磁盘是out
	}
}
