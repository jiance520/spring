package com.fs;


import java.lang.reflect.*;

import com.entity.Users;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test3 {
	public static void main(String[] args) throws Exception{
		String os = "com.entity.Users";
		//spring接收字符串类名，来生成单例对象，就是这里的反射。但是反射生成的对象需要用原类名转型。也是通过反射来给属性赋值。
		Class cs = Class.forName(os);	
		//反射，用构造法
//		Constructor  c2 = cs.getDeclaredConstructor();
		Constructor  c2 = cs.getDeclaredConstructor(String.class,int.class,String.class);
//		System.out.println(c2);
//		
//		//反射,生成对象
		Users u2 = (Users)c2.newInstance("小明",18,"男");
//		System.out.println(u2);
//		
		//反射,通过方法名和方法的参数先获取方法对象
//		Method m2 = cs.getDeclaredMethod("setName",String.class);
//		System.out.println(m2);
//		
//		m2.invoke(u2,"张飞");
//		System.out.println(u2);
//		
//		//反射，调用属性
		Field f2 = cs.getDeclaredField("name");
//		System.out.println(f2);
//		
//		//反射调用私有的方法属性
		f2.setAccessible(true);
		f2.set(u2, "刘备");
		System.out.println(u2);
	}
}
