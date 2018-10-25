package com.ssh.ascept;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @title ������
 * @function ������ӡҵ�񷽷�ִ��
 * @author jiege
 *
 */
@Aspect
@Component
public class Ascept {
	 @Around(value = "execution(* com.ssh.serviceimpl.ServiceDaoImpl.*(..))")
	public Object log(ProceedingJoinPoint joinPoint)throws Throwable {
		   System.out.println("start--->"+joinPoint.getSignature().getName());
			Object object = joinPoint.proceed();
			System.out.println("end---->"+joinPoint.getSignature().getName());
			return object;
		   
	   }
}
