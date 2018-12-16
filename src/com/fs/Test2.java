package com.fs;

import java.lang.reflect.Constructor;

import com.entity.Users;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception{
		String os = "com.entity.Users";
		//spring接收字符串类名，来生成单例对象，就是这里的反射。但是反射生成的对象需要用原类名转型。也是通过反射来给属性赋值。
		Class cs = Class.forName(os);
		cs.getDeclaredConstructor();
		Constructor[] carr = cs.getDeclaredConstructors();//反射取构造法,可以用来生成对象，所有的框架都会用到反射。
		System.out.println(carr[0]);
		System.out.println(carr[1]);
		
		//反射，用构造法
		Constructor c2 = cs.getDeclaredConstructor(String.class,int.class,String.class);
		System.out.println(c2);
		//生成对象
		Users u2 = (Users)c2.newInstance("小明",18,"男");
		System.out.println(u2);
	}
}
