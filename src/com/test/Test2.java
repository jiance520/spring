package com.test;

import org.springframework.context.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Users;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test2 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Users u2 = (Users)ctx.getBean("user");
		System.out.println(u2);
		Users u3 = (Users)ctx.getBean("user");
		System.out.println(u3);
	}
}
