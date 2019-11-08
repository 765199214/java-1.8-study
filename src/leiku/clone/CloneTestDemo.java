package leiku.clone;
/**
 * 对象克隆    克隆的是某个对象   不是某个类(自己参照运行结果理解)
 * @author 76519
 *
 */
class Persion implements Cloneable{  //必须实现此接口
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*@Override
	public String toString() {
		return "Persion [name=" + name + ", age=" + age + "]";
	}*/
	
	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//protected  修饰的方法    允许不同包的子类访问   非子类不可访问
	//clone()是object类的方法  protected  persion不是object的子类  所以无法直接调用
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();//父类负责克隆
	}
}
public class CloneTestDemo {
	public static void main(String[] args) throws Exception {
		Persion persionA = new Persion("张三",10);
		Persion persionB = (Persion) persionA.clone();
		persionB.setAge(20);
		System.out.println(persionA);//Persion [name=张三, age=10]
		System.out.println(persionB);//Persion [name=张三, age=20]
		//要被克隆的类  必须要实现Cloneable  接口    否则Exception in thread "main" java.lang.CloneNotSupportedException: leiku.clone.Persion
	}
}
