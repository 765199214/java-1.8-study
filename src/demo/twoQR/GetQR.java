package demo.twoQR;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.filechooser.FileSystemView;

public class GetQR {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		String qrName = "1000000088.png";
		//String filePath = "C:\\Users\\Administrator\\Desktop\\gif\\qrTest";
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com=fsv.getHomeDirectory();    //这便是读取桌面路径的方法了
		String filePath = com.getPath();
		System.out.println("获取的路径："+filePath);
		filePath +=File.separator+ qrName;
		System.out.println("获取的路径："+filePath);
		
		//文本内容
		String md5Str = MD5.md5("1000000088");
		//生成二维码图片信息
		TwoDimensionCode.encoderQRCode(md5Str, filePath, "png");
		
	}
}
