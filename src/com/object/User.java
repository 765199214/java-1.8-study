package com.object;

public class User extends Object{
	private String username;
	private int age;
	public User(String username, int age) {
		this.username = username;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	
}
