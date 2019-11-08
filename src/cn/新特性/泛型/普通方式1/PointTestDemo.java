package cn.新特性.泛型.普通方式1;

public class PointTestDemo {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(30);
		int x = (Integer)p.getX();
		int y = (Integer)p.getY();
		System.out.println("x="+x+",y="+y);
		
		Point p1 = new Point();
		p1.setX(10.2);
		p1.setY(30.1);
		
		Point p2 = new Point();
		p2.setX("东经30°");
		p2.setY("北纬31°");
	}
}
