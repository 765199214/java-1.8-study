package vip.jdk8新特性.stream;
class UserDemo1{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public UserDemo1(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserDemo1() {
		super();
	}
	@Override
	public String toString() {
		return "UserDemo1 [name=" + name + ", age=" + age + "]";
	}
	
	
}