package cn.设计模式.接口的设计模式.代理设计模式;

public class TestDemo {

	public static void main(String[] args) {
		ISubject iSubject= new ProxySubject(new RealSubject());
		//1.此处的save()是代理类中覆写父类的方法
		//2.ProxySubject类中save方法中包含的另外一个save则是new RealSubject()通过ProxySubject的有参构造使用的RealSubject中的save
		iSubject.save();
	}

}
