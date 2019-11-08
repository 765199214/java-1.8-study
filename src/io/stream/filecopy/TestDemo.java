package io.stream.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 大文件的拷贝  两种方式时间对比
 * 
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		// 创建两个独立的线程 分别测试
		new Thread(() -> {
			String path1 = "E:" + File.separator + "download" + File.separator + "SecureCRT_6.5.3.490_XiaZaiBa.exe";
			String path2 = "E:" + File.separator + "wanwan" + File.separator + "demo1" + File.separator
					+ "SecureCRT_6.5.3.490_XiaZaiBa.exe";
			try {
				copyOne(path1, path2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		new Thread(() -> {
			String path1 = "E:" + File.separator + "download" + File.separator + "SecureCRT_6.5.3.490_XiaZaiBa.exe";
			String path2 = "E:" + File.separator + "wanwan" + File.separator + "demo2" + File.separator
					+ "SecureCRT_6.5.3.490_XiaZaiBa.exe";
			try {
				copyTwo(path1, path2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}

	/**
	 * 文件拷贝方式一
	 * 
	 * @param onePath
	 * @param twoPath
	 * @throws Exception
	 */
	public static void copyOne(String onePath, String twoPath) throws Exception {
		File fileOne = new File(onePath);
		File fileTwo = new File(twoPath);
		if (!fileOne.getParentFile().exists()) {
			fileOne.getParentFile().mkdirs();
		}
		if (!fileTwo.getParentFile().exists()) {
			fileTwo.getParentFile().mkdirs();
		}
		// 首先需要将磁盘中某个文件内容读取到内存中
		InputStream inputStream = new FileInputStream(fileOne);
		// 读取到的文件资源 写入到新的磁盘的某个文件中
		OutputStream outputStream = new FileOutputStream(fileTwo);
		// 方式一的读取
		long startTime = System.currentTimeMillis();
		// 每次读取一个字节的文件
		int len = 0;
		while ((len = inputStream.read()) != -1) {
			// 将读取到的 一个字节文件 从内存中 放入磁盘中
			outputStream.write(len);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方式一总共花费时间：" + (endTime - startTime));
		inputStream.close();
		outputStream.close();
	}

	/**
	 * 文件拷贝方式二
	 * 
	 * @param onePath
	 * @param twoPath
	 * @throws Exception
	 */
	public static void copyTwo(String onePath, String twoPath) throws Exception {
		File fileOne = new File(onePath);
		File fileTwo = new File(twoPath);
		if (!fileOne.getParentFile().exists()) {
			fileOne.getParentFile().mkdirs();
		}
		if (!fileTwo.getParentFile().exists()) {
			fileTwo.getParentFile().mkdirs();
		}
		// 首先需要将磁盘中某个文件内容读取到内存中
		InputStream inputStream = new FileInputStream(fileOne);
		// 读取到的文件资源 写入到新的磁盘的某个文件中
		OutputStream outputStream = new FileOutputStream(fileTwo);
		// 方式一的读取
		long startTime = System.currentTimeMillis();
		// 创建一片独立的载体 每次多读取指定长度的数据 存在车厢里运输
		byte[] bytes = new byte[1024];
		// 每次读取一个字节的文件
		int len = 0;
		while ((len = inputStream.read(bytes)) != -1) {
			// 将读取到的 一个字节文件 从内存中 放入磁盘中
			outputStream.write(bytes, 0, len);
			//outputStream.flush();
		}
		long endTime = System.currentTimeMillis();
		// new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(endTime -
		// startTime))
		System.out.println("方式二总共花费时间：" + (endTime - startTime));
		inputStream.close();
		outputStream.close();
	}
}
