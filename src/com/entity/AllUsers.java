package com.entity;
/**
 * @version 时间：2018年6月29日 上午10:55:57
 *
 */
public class AllUsers {
	private String str;
	private Users user;
	public AllUsers() {
		super();
	}
	public AllUsers(String str, Users user) {
		super();
		this.str = str;
		this.user = user;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "AllUsers [str=" + str + ", user=" + user + "]";
	}
	
}
