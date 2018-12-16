package com.dl;


/**
 * @version 时间：2018年6月11日 上午9:41:10
 *
 */
public class Radio implements ISay{
	private ISay boss;
	public Radio(ISay boss){
		this.boss = boss;
	}
	public void say(){
		boss.say();
		System.out.println("---录音");
	}
}
