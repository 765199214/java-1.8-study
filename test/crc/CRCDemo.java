package crc;

public class CRCDemo {

	/**
	 * crc 校验代码
	 * 
	 * @param bufData
	 *            byte类型的数组数据
	 * @param bufLen
	 *            byte类型的数组数据的长度
	 * @return 计算后的校验码
	 */
/*	public static String crc_chk(byte[] bufData, int bufLen) {
		int reg_crc = 0xffff ;
		for (int i = 0; i < bufLen; i++) {
			reg_crc ^= ((int) bufData[i] & 0xff);
			//reg_crc ^= bufData[i];
			for (int j = 0; j < 8; j++) {
				if ((reg_crc & 0x0001) != 0) {
					//reg_crc = (reg_crc >> 1) ^ 0x0000a001;
					reg_crc >>= 1;
					reg_crc ^= 0xa001;
				} else {
					//reg_crc = reg_crc >> 1;
					reg_crc >>=1;
				}
			}
		}
		System.out.println("---->"+reg_crc);
		return Integer.toHexString(reg_crc);
	}*/
	public static String crc_chk(byte[] bufData, int bufLen) {
		int reg_crc = 0xffff;
		for (int i = 0; i < bufLen; i++) {
			reg_crc ^= ((int) bufData[i] & 0xff);
			for (int j = 0; j < 8; j++) {
				if ((reg_crc & 0x01) != 0) {
					reg_crc = (reg_crc >> 1) ^ 0xa001;
				} else {
					reg_crc = reg_crc >> 1;
				}
			}
		}
		return Integer.toHexString(reg_crc);
	}

	public static byte[] HexString2Bytes(String src) {
		byte[] ret = new byte[src.length() / 2];
		byte[] tmp = src.getBytes();
		for (int i = 0; i < tmp.length / 2; i++) {
			ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
		}
		return ret;
	}

	public static byte uniteBytes(byte src0, byte src1) {
		byte _b0 = Byte.decode("0x" + new String(new byte[] { src0 })).byteValue();
		_b0 = (byte) (_b0 << 4);
		byte _b1 = Byte.decode("0x" + new String(new byte[] { src1 })).byteValue();
		byte ret = (byte) (_b0 ^ _b1);
		return ret;
	}
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if(src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if(hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}


	public static void main(String[] args) {
		String ss = "000130622356000009002804003064";
		//byte[] bb = { (byte) 0xAB, 0x0b, 0x07, 0x01, 0x14, 0x02, 0x67, 0x01, 0x05, 0x01 };
		//System.out.println(crc_chk(bb, bb.length));
		// AB 0D 09 01 14 02 67 01 86 69 71 03
		//byte[] cc = { (byte) 0xab, 0x0d, 0x09, 0x01, 0x14, 0x02, 0x67, 0x01, (byte) 0x86, 0x69, 0x71, 0x03 };
		//System.out.println(crc_chk(cc, cc.length));
		
		ss = "AB0B0700700707040101";
		byte[] dd = HexString2Bytes(ss);
//		for (int i = 0; i < dd.length; i++) {
//			System.out.println(Integer.toHexString(dd[i]));
//		}
		//System.out.println(bytesToHexString(dd));
		System.out.println(crc_chk(dd, dd.length));
	}
}
