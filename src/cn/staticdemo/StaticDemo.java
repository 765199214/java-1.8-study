package cn.staticdemo;

public class StaticDemo {
	private String name;
	private static int count= 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StaticDemo(String name) {
		this.name = name;
	}
	//无参构造  
	public StaticDemo() {
		//默认给name赋值
		this("count "+count++);
	}
	
}
