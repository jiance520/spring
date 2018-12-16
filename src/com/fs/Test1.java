package com.fs;

import com.entity.Users;

/**
 * @version 时间：2018年6月9日 上午9:04:20
 *
 */
public class Test1 {
	public static void main(String[] args) throws Exception{
		Users u2 = new Users();
		
		String os = "com.entity.Users";
		//spring接收字符串类名，来生成单例对象，就是这里的反射。但是反射生成的对象需要用原类名转型。也是通过反射来给属性赋值。
		Object obj = Class.forName(os).newInstance();// 反射生成对象
		
		if(obj instanceof Users){
			Users u3 = (Users)obj;
			System.out.println(" u3 = "+u3);
		}

	}
}
