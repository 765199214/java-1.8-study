package leiku.base64;

import java.util.Base64;

public class Base64TestDemo {
	public static void main(String[] args) {
		String msg = "000000";//明文
		System.out.println(msg.getBytes());
		//加密操作
		byte[] emsg = Base64.getEncoder().encode(msg.getBytes());
		System.out.println("加密后的数据："+new String(emsg));
		//解密
		byte[] dmsg = Base64.getDecoder().decode(emsg);
		System.out.println("解密后的数据："+new String(dmsg));
	}
}
