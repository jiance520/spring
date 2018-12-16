package com.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.*;

public class RoundInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {

        System.out.println("-------------������ǿ");
		System.out.println("-----ִ��ǰ");
        Method mm = arg0.getMethod();
		System.out.println("������:"+mm.getName());

        Object obj = arg0.proceed();//ִ�з���
         
        System.out.println("-----ִ�к�");
        System.out.println(" ����ֵ:"+obj);
		return obj;
	}
}
