package leiku.uuid;

import java.util.UUID;

public class UIIDTestDemo {
	public static void main(String[] args) {
		//uuid  根据当前地址和时间戳   自动生成一个几乎不会重复的字符串
		
		//根据当前地址和时间戳    去的一个内容
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		
		System.out.println(uuid.toString().replaceAll("-", ""));
		
		//用处：
		//1.id的生成
		//2.文件上传时  作为文件名称的定义   避免文件名称的重复导致问题
	}

}
