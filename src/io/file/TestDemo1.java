package io.file;

import java.io.File;
/**
 * 根目录下  直接进行  文件的创建和删除
 * @author 76519
 *
 */
public class TestDemo1 {
	public static void main(String[] args) throws Exception {
		//定义要操作的文件路径(windows和unix的符号不同)  ----  不同操作系统的文件分隔符  由  jvm  决定
		File file = new File("E:"+File.separator+"hello.txt");
		
		if(!file.exists()) {
			System.out.println("文件不存在   进行创建！");
			//创建新文件
			file.createNewFile();
		}else {
			System.out.println("文件存在   进行删除");
			file.delete();
		}
		
	}
}
