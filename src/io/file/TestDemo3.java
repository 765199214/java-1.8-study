package io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyMath{
	
	public static double round(double num,int scale) {
		//11.22333    1122   11.22  
		return Math.round(num*Math.pow(10, scale)) / Math.pow(10, scale);
	}
}
/**
 * 读取文件信息
 * @author 76519
 *
 */
public class TestDemo3 {
	public static void main(String[] args) {
		//System.out.println(Math.pow(10, 3));//1000
		//E:\java0801\javaDemo\data
		File file = new File("E:"+File.separator+"java0801"
				+File.separator+"javaDemo"+File.separator+"data"+File.separator+"14.png");
		//file.isFile()  判断路径是否是文件
		//file.isDirectory()  判断路径是否是目录(不指定具体的文件路径时)
		if(file.exists() && file.isFile()) {//读取文件信息  必须要求  文件存在  且是文件
			System.out.println("文件大小："
					+MyMath.round((file.length()/(double)1024), 2)+"KB");
			
			System.out.println("最后一次修改日期："
					+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(file.lastModified())));
		}
	}
}
