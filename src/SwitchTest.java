
public class SwitchTest {
	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		switch (a) {
			case 1:
				b = 1;
				break;
			case 2:
				b = 2;
				break;
			default:
				break;
		}
		//break跳出的只是switch的判断
		System.out.println(b);
	}
}
