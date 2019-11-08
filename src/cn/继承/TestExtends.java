package cn.继承;

public class TestExtends {
	public static void main(String[] args) {
		Students students = new Students();
		students.setUsername("xiangjiao");
		students.setAge(10);
		students.setSchool("banana");
		System.out.println(students.getAge());
	}
}
