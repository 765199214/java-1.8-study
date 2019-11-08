package cn.接口的设计模式.代理设计模式;
//真正救人的实现类(但门是关的  需要先开门---->使用代理人来解决)
public class RealSubject implements ISubject {
	@Override
	public void save() {
		System.out.println("在屋内救人！！");

	}

}
