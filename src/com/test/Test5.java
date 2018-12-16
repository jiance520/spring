package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.IPrint;

/**
 * @version 时间：2018年6月9日 上午10:47:56
 *
 */
public class Test5 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPrint pt = (IPrint)ctx.getBean("print");
		pt.print();
	}
}
