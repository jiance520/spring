package com.dl;


/**
 * @version 时间：2018年6月11日 上午9:34:07
 *
 */
public class Emp {
	public void listen(ISay boss){
		boss.say();
		System.out.println("---员工听讲");
	}
}
