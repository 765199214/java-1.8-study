package leiku.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMD5 {
	
	public static void main(String[] args) {
		//System.out.println(md5("201811221707001"));;
		//System.out.println(md5("0C-B2-B7-69-0D-D3"));
		System.out.println("");
	}
	
	public static String md5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				//System.out.println(i);
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			str = buf.toString();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return str;
	}
}
