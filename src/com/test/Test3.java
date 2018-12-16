package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.House;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test3 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		House h2 = (House)ctx.getBean("house");
		System.out.println(h2);
	}
}
