package cn.新特性.泛型.普通方式1;
//设置坐标(有int  double  string等类型)
public class Point {
	//使用x和y分别代表经纬度信息
	private Object x;
	private Object y;
	
	public Object getX() {
		return x;
	}
	public void setX(Object x) {
		this.x = x;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object y) {
		this.y = y;
	}
	
}
