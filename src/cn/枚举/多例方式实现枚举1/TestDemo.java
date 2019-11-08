package cn.枚举.多例方式实现枚举1;

/**
 * 以多例形式 定义一个 颜色的 三基色 类
 * 
 * @author Administrator
 *
 */
class Color {
	private static final Color RED = new Color("RED");
	private static final Color GREEN = new Color("GREEN");
	private static final Color BLUE = new Color("BLUE");

	private String title;

	// 1.多例的构造方法私有化
	private Color(String title) {
		this.title = title;
	}

	public String toString() {
		return this.title;
	}

	// 2.有静态的多个返回类实例化对象的方法
	public static Color getInstance(int ch) {
		switch (ch) {
		case 0:
			return RED;
		case 1:
			return GREEN;
		case 2:
			return BLUE;
		default:
			return null;
		}
	}
}

public class TestDemo {

	public static void main(String[] args) {
		System.out.println(Color.getInstance(0));
	}

}
