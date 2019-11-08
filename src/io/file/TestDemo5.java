package io.file;

import java.io.File;

/**
 * 列出指定磁盘下的所有文件信息(文件夹 嵌套 文件夹 采取递归)
 * 
 * @author 76519
 *
 */
public class TestDemo5 {
	public static void main(String[] args) {
		new Thread(()->{
			File file = new File("D:"+File.separator);
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			//放在主线程   导致线程阻塞
			listDir(file);
		}).start();
		System.out.println("开始进行文件扫描。。。。");
	}
	
	public static void listDir(File file) {
		//如果是目录   则继续迭代
		if(file.isDirectory()) {//如果列出的文件夹中的某个信息还是文件夹   这里代表的是路径  不是具体的某个文件
			File[] files = file.listFiles();
			//为了防止  某些系统文件打不开   空指针的问题
			if(files != null) {
				for (int i = 0; i < files.length; i++) {
					listDir(files[i]);
				}
			}
		}else {
			//所有的打印信息   全部是文件  不存在文件夹了
			System.out.println(file);
		}
	}
}
