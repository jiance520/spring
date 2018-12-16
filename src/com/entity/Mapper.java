package com.entity;
/**
 * @version 时间：2018年6月29日 上午11:18:30
 *
 */
public class Mapper {
	private String str;
	public Mapper() {
		super();
	}	
	public Mapper(String str) {
		super();
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "Mapper [str=" + str + "]";
	}
}
