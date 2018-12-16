package com.entity;
/**
 * @version 时间：2018年6月9日 上午9:33:09
 *
 */
public class House {
	private Users u2;
	private String hname;
	
	public House() {
		super();
	}
	
	public House(Users u2, String hname) {
		super();
		this.u2 = u2;
		this.hname = hname;
	}

	public Users getU2() {
		return u2;
	}
	public void setU2(Users u2) {
		this.u2 = u2;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	@Override
	public String toString() {
		return "House [u2=" + u2 + ", hname=" + hname + "]";
	}
	
}
