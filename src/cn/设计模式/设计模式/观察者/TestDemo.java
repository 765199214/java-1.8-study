package cn.设计模式.设计模式.观察者;

import java.util.Observable;
import java.util.Observer;
//这些是所有的观察者(实现Observer接口)
class Persion implements Observer{
	//一旦你关注的事情发生了改变(Observable被观察的对象   Object新的内容 )
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof House) {
			//如果现在发现House这个被观察者改变了
			if(arg instanceof Double) {
				System.out.println("【人们关注的房子】房价上涨，新价格："+arg);
			}
		}
	}
	
}
//这些是被观察者(继承Observable类)
class House extends Observable{
	private Double price;
	public House(Double price) {
		this.price = price;
	}
	public void setPrice(Double price) {
		if(price > this.price) {//价格上涨
			super.setChanged();//现在被关注的内容改变了  ---- 设置通知
			super.notifyObservers(price);//唤醒所有的观察者
		}
		this.price = price;
	}
	
	
}
public class TestDemo {
	public static void main(String[] args) {
		Persion perA = new Persion();
		Persion perB = new Persion();
		Persion perC = new Persion();
		
		//设置房子的均价
		House house = new House(8000.00);
		//绑定观察者-----必须手动设置
		house.addObserver(perA);
		house.addObserver(perB);
		house.addObserver(perC);
		
		//house.setPrice(7.00);
		house.setPrice(10000.00);
	}

}
