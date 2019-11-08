package io.file;

import java.io.File;

/**
 * 操作目录  如  E盘
 * @author 76519
 *
 */
public class TestDemo4 {
	public static void main(String[] args) {
		//文件路径E:  和  "E:"+File.separator  有区别
		File file = new File("E:"+File.separator);
		if(file.exists() && file.isDirectory()) {//不是指定的某个目录   E:\
			//listFiles()  -->E:\新建文件夹
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				//完整路径名
				System.out.println(files[i]);
			}
			System.out.println("-----------华丽的分割线-----------");
			//list()   -->新建文件夹
			String[] filelocations = file.list();
			for (int i = 0; i < files.length; i++) {
				//文件名
				System.out.println(filelocations[i]);
			}
		}
	}
}
