package cn.枚举.枚举实现接口4;

interface IColor{
	public String getColor();
}
enum Color implements IColor{
	//如果定义有很多内容  枚举对象必须写在第一行
	//RED,GREEN,BLUE;//类中无无参构造  就必须加入无参构造   不然这里这么写是报错的
	
	RED("红色"),GREEN("绿色"),BLUE("蓝色");
	
	private String title;
	
	//构造方法  枚举就是多例设计   多例设计的原则就是构造方法私有化
	private Color(String title) {
		this.title = title;
	}
	public String toString() {//覆写Object类中的方法
		return this.title;
	}
	@Override
	public String getColor() {
		return this.title;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		System.out.println(Color.BLUE);//有toString()才打印“蓝色”，否则就是BLUE
		IColor ic = Color.RED;
		System.out.println(ic.getColor());
	}

}
