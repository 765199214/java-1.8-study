package io.file;

import java.io.File;
import java.io.IOException;

/**
 * 当文件存在某个文件夹下时   (目录)
 * @author 76519
 *
 */
public class TestDemo2 {
	public static void main(String[] args) throws Exception {
		//获取指定文件夹下的某个文件对象
		File file = new File("E:"+File.separator+"javaTest"+File.separator+"hello.java");
		//System.out.println(""+File.separator);//    \
		System.out.println(file.getParent());
		//file.getParentFile()  获取父文件对象  (可以是一个父目录  也可以是多个   一句给定的pathname自动判断)
		if(!file.getParentFile().exists()) {
			System.out.println("父目录不存在，需要创建父文件夹");
			//file.getParentFile().mkdir();   //只能创建单级的父目录文件
			//创建文件夹
			file.getParentFile().mkdirs();//根据给定的file路径   中的参数值    创建多个分级父目录(推荐使用)
		}
		
		if(!file.exists()) {
			System.out.println("文件不存在  执行创建");
			//创建文件
			file.createNewFile();
		}else {
			System.out.println("文件存在，执行删除操作");
			file.delete();
		}
	}
}
