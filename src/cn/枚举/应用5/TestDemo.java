package cn.枚举.应用5;

enum Sex{
	MAN("男"),WOMEN("女");
	private String title;
	private Sex(String title) {
		this.title = title;
	}
	public String toString() {
		return this.title;
	}
}

//人类
class Persion{
	private String username;
	private int age;
	private Sex sex;
	
	public Persion(String name,int age,Sex sex) {
		this.username = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Persion [username=" + username + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}

public class TestDemo {
	public static void main(String[] args) {
		Persion p = new Persion("香蕉", 20, Sex.MAN);
		System.out.println(p.toString());
	}

}
