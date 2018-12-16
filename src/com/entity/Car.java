package com.entity;


/**
 * @version 时间：2018年6月9日 上午9:54:44
 *
 */
public class Car {
	private Users user;
	private String brand;
	public Car() {
		super();
	}
	public Car(Users user, String brand) {
		super();
		this.user = user;
		this.brand = brand;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [user=" + user + ", brand=" + brand + "]";
	}
	
}
