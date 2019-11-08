package cn.接口的设计模式.代理设计模式;
//代理实现类
public class ProxySubject implements ISubject {
	//真正的操作  (多态  )   TestDemo中的父类变量  指向的其实是RealSubject对象
	private ISubject subject;
	//构造方法
	public ProxySubject (ISubject subject) {
		this.subject = subject;
	}
	public void beforeSave() {
		System.out.println("1.破门而入！！");
	}
	public void afterSave() {
		System.out.println("2.给予表彰！！");
	}
	
	//代理的具体实现顺序
	@Override
	public void save() {
		this.beforeSave();
		//调用真实的业务
		//在testDemo中   实例化ProxySubject时  传递有参构造时的参数为   RealSubject
		//所以此处使用this.subject  实际上是父类接口的方法，被RealSubject覆写的方法！！
		this.subject.save();
		this.afterSave();
	}

}
