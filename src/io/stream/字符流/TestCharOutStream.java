package io.stream.字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流     字符适合处理中文(只在处理中文时考虑)
 * @author 76519
 *
 */
public class TestCharOutStream {
	public static void main(String[] args) throws Exception {
		File file = new File("E:"+File.separator+"helloread.txt");
		//如果文件在文件夹中
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		String msg = "世界和平！\r\n";
		//是否进行内容的写入并追加在最后
		Writer writer = new FileWriter(file, true);
		writer.write(msg);
		writer.close();
		
		//如果没有close操作   字节流的输出  可以将数据内容写入到磁盘的文件中；但字符流的数据并不会写入到磁盘的文件中----再缓存里
		//close的操作会默认将缓存清空
		//所以如果没有close操作，需要强制清空缓存，强制将缓存中的数据写入磁盘中的文件中
		//writer.flush();//强制情况缓冲内容，所有内容都要求输出(某些特定的要求  不能关闭流的情况)
	}
}
