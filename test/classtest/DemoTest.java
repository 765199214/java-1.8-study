package classtest;
class Demo{
	public int x;
	public int y;
	
	void print(){
		System.out.println("x="+x+" y="+y);
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.x = 10;
		demo.y = 100;
		demo.print();
	}
}
