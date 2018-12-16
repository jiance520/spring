package com.test;

import com.entity.Users;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test1 {
	public static void main(String[] args) throws Exception{
		Users u2 = new Users();
		u2.setName("tom");//参数放到对象里面就是注入
		System.out.println(u2);
	}
}
