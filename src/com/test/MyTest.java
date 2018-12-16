package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Car;

/**
 * @version 时间：2018年6月28日 下午9:14:21
 *
 */
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testapplicationContext.xml");
//		构造注入值
//		AllUsers au = (AllUsers)ac.getBean("allUser");
//		System.out.println(au);
//		使用P命名空间注入值
//		TestService ss = (TestService)ac.getBean("testService");
//		System.out.println(ss);
//		set注入不同类型的值
//		TestEntity te = (TestEntity)ac.getBean("testEntity");
//		te.showvalue();
		Car car = (Car)ac.getBean("car");
		System.out.println(car);
	}	
}
