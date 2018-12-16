package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class UserInterceptor {

	public void before(JoinPoint point){
		System.out.println("-----֮ǰ");
		
		point.getArgs();//����
		
		String name = point.getSignature().getName();//������
		System.out.println(" name = "+name);
	}
	
	public void after (JoinPoint point,Object result){
		System.out.println("-----֮��");
		
		String name = point.getSignature().getName();//������
		System.out.println(" name = "+name);
		
		System.out.println(" ����ֵ:"+result);
	}
	
	public Object round(ProceedingJoinPoint point){
		System.out.println("----����ǰ");
		
		Object obj =null;
		
		try {
			obj = point.proceed();
			
			System.out.println("----���ƺ�");
			System.out.println("ProceedingJoinPoint"+point);
			System.out.println(" ����ֵ:"+obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		   return obj;
	}
}
