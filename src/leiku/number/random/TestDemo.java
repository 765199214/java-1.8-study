package leiku.number.random;

import java.util.Random;

public class TestDemo {

	public static void main(String[] args) {
		String s = "66";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			// 100表示最大值 数据范围为0~99
			System.out.print(random.nextInt(100) + "、");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt() + "、");
		}
	}

}
