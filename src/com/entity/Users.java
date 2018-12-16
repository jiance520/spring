package com.entity;
/**
 * @version 时间：2018年6月9日 上午9:02:37
 *
 */
public class Users {
	private String name;
	private int age;
	private String sex;
	
	public Users(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Users() {
		super();
	}
	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		String ss = super.toString();
		return "Users [name=" + name + ", age=" + age + ", sex=" + sex + "]"+"\n address"+ss;
	}
	
}
