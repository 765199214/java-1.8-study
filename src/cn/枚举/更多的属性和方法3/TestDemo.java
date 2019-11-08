package cn.枚举.更多的属性和方法3;

//注意此处的 “类” 的修饰词
enum Color{
	//如果定义有很多内容  枚举对象必须写在第一行
	//类中无无参构造  就必须加入无参构造   不然这里这么写是报错的
	//RED,GREEN,BLUE;
	
	RED("红色"),GREEN("绿色"),BLUE("蓝色");
	
	private String title;
	
	//构造方法  枚举就是多例设计   多例设计的原则就是构造方法私有化
	private Color(String title) {
		this.title = title;
	}
	
	public String toString() {//覆写Object类中的方法
		return this.title;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		System.out.println(Color.RED);
	}

}
