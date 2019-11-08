package cn.接口的设计模式.工厂模式;

public class Factory {
	//此时为什么使用static  ---->Factory产生一个实例化对象无意义！！
	public static IFruit getInstance(String className) {
		if("apple".equals(className)) {
			return new Apple();
		}else {
			return null;
		}
	}
}
