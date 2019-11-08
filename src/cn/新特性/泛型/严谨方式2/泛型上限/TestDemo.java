package cn.新特性.泛型.严谨方式2.泛型上限;


class Message<T extends Number> {
	private T node;

	public T getNode() {
		return node;
	}

	public void setNode(T node) {
		this.node = node;
	}

}

public class TestDemo {

	public static void main(String[] args) {
		Message<Integer> message2 = new Message<Integer>();
		message2.setNode(99);
		fun(message2);
		funUp(message2);
	}
	// 不设置类型时 默认采用的Object类型进行处理
	/*
	 * public static void fun(Message msg) { System.out.println(msg.getNode()); }
	 */

	// 为了解决上述问题 这里使用通配符 实现 ----- ? 描述的是可以接受任意类型，但是不确定类型 所以无法修改
	public static void fun(Message<?> msg) {
		// msg.setNode("6666");//不确定类型 导致出错
		System.out.println(msg.getNode());
	}

	// 泛型上限(接收number  或者  number的子类)
	public static void funUp(Message<? extends Number> msg) {
		// msg.setNode("6666");//不确定类型 导致出错
		System.out.println(msg.getNode());
	}
}
