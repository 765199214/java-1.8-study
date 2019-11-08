package com.object;

public class TestDemo {

	public static void main(String[] args) {
		//user类中不覆写object的toString()
		String result = "hello"+new User("香蕉",123456);
		System.out.println(result);//hellocom.object.User@7852e922
		
		//覆写toString()后    ---->   helloUser [username=香蕉, age=123456]
		
		
		System.out.println(new User("香蕉",123456).hashCode());
	}

}
