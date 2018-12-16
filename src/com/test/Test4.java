package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Car;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test4 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Car c1 = (Car)ctx.getBean("car1");
//		System.out.println(c1);
		Car c2 = (Car)ctx.getBean("car2");
		System.out.println(c2);
	}
}
