package leiku.number.bigNum;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bigA = new BigInteger("4");
		BigInteger bigB = new BigInteger("2");
		
		System.out.println("加运算："+bigA.add(bigB));
		System.out.println("减运算："+bigA.subtract(bigB));
		System.out.println("乘运算："+bigA.multiply(bigB));
		System.out.println("除运算："+bigA.divide(bigB));
	}
}
